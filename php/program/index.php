<?php
require_once "Lampu.php";

// daftar lampu default
$lampuList = [
    new Lampu("L001", "Lampu LED", 50, "Philips", "10W", 50000, "Bulat", "Putih", "LED", "LED.jpeg"),
    new Lampu("L002", "Lampu Bohlam", 30, "Osram", "15W", 40000, "Lonjong", "Kuning", "Bohlam", "Bohlam.jpeg"),
    new Lampu("L003", "Lampu Hemat Energi", 25, "Panasonic", "8W", 60000, "Spiral", "Putih", "CFL", "Hemat Energi.jpeg"),
    new Lampu("L004", "Lampu Meja", 15, "Samsung", "5W", 70000, "Mini", "Hitam", "Desk", "Meja.jpeg"),
    new Lampu("L005", "Lampu Gantung", 10, "LG", "12W", 90000, "Bulat", "Silver", "Chandelier", "Gantung.jpeg")
];

// kalau form disubmit
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $gambar = null;
    if (!empty($_FILES["gambar"]["name"])) {
        $targetDir = "images/";
        $targetFile = $targetDir . basename($_FILES["gambar"]["name"]);
        move_uploaded_file($_FILES["gambar"]["tmp_name"], $targetFile);
        $gambar = basename($_FILES["gambar"]["name"]);
    }

    $lampuBaru = new Lampu(
        $_POST["kodeProduk"],
        $_POST["nama"],
        $_POST["stok"],
        $_POST["merk"],
        $_POST["daya"],
        $_POST["harga"],
        $_POST["bentuk"],
        $_POST["warna"],
        $_POST["tipe"],
        $gambar
    );
    $lampuList[] = $lampuBaru;
}
?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <title>Toko Elektronik - Lampu</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; background: #f5f5f5; }
        table { width: 100%; border-collapse: collapse; margin-bottom: 30px; background: #fff; }
        th, td { border: 1px solid #ccc; padding: 10px; text-align: center; }
        th { background: #333; color: #fff; }
        img { width: 80px; height: auto; border-radius: 5px; }
        form { background: #fff; padding: 20px; border-radius: 8px; }
        input, button { padding: 8px; margin: 5px 0; width: 100%; }
        button { background: #28a745; color: white; border: none; cursor: pointer; }
        button:hover { background: #218838; }
    </style>
</head>
<body>
    <h1>Daftar Lampu Toko Elektronik</h1>

    <table>
        <tr>
            <th>Kode</th><th>Nama</th><th>Stok</th><th>Merk</th><th>Daya</th>
            <th>Harga</th><th>Bentuk</th><th>Warna</th><th>Tipe</th><th>Gambar</th>
        </tr>
        <?php foreach ($lampuList as $lampu): 
            $data = $lampu->getData(); ?>
            <tr>
                <td><?= $data["kodeProduk"] ?></td>
                <td><?= $data["nama"] ?></td>
                <td><?= $data["stok"] ?></td>
                <td><?= $data["merk"] ?></td>
                <td><?= $data["daya"] ?></td>
                <td>Rp <?= number_format($data["harga"],0,',','.') ?></td>
                <td><?= $data["bentuk"] ?></td>
                <td><?= $data["warna"] ?></td>
                <td><?= $data["tipe"] ?></td>
                <td>
                    <?php if ($data["gambar"]): ?>
                        <img src="images/<?= $data["gambar"] ?>" alt="<?= $data["nama"] ?>">
                    <?php else: ?>
                        <span style="color:gray;">(Tidak ada gambar)</span>
                    <?php endif; ?>
                </td>
            </tr>
        <?php endforeach; ?>
    </table>

    <h2>Tambah Lampu Baru</h2>
    <form method="post" enctype="multipart/form-data">
        <input type="text" name="kodeProduk" placeholder="Kode Produk" required>
        <input type="text" name="nama" placeholder="Nama Produk" required>
        <input type="number" name="stok" placeholder="Stok" required>
        <input type="text" name="merk" placeholder="Merk" required>
        <input type="text" name="daya" placeholder="Daya (misal 10W)" required>
        <input type="number" name="harga" placeholder="Harga" required>
        <input type="text" name="bentuk" placeholder="Bentuk" required>
        <input type="text" name="warna" placeholder="Warna" required>
        <input type="text" name="tipe" placeholder="Tipe" required>
        <input type="file" name="gambar" accept="image/*">
        <button type="submit">Tambah Lampu</button>
    </form>
</body>
</html>
