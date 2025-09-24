<?php
require_once "Elektronik.php";

class Lampu extends Elektronik {
    private $bentuk;
    private $warna;
    private $tipe;

    public function __construct($kodeProduk, $nama, $stok, $merk, $daya, $harga, $bentuk, $warna, $tipe) {
        parent::__construct($kodeProduk, $nama, $stok, $merk, $daya, $harga);
        $this->bentuk = $bentuk;
        $this->warna = $warna;
        $this->tipe = $tipe;
    }

    public function add() {
        echo "Menambahkan Lampu: {$this->nama}, Merk: {$this->merk}, Harga: {$this->harga}\n";
    }

    public static function createFromInput() {
        $kode = readline("Masukkan kode produk: ");
        $nama = readline("Masukkan nama produk: ");
        $stok = (int) readline("Masukkan stok: ");
        $merk = readline("Masukkan merk: ");
        $daya = readline("Masukkan daya: ");
        $harga = (float) readline("Masukkan harga: ");
        $bentuk = readline("Masukkan bentuk: ");
        $warna = readline("Masukkan warna: ");
        $tipe = readline("Masukkan tipe: ");
        return new Lampu($kode, $nama, $stok, $merk, $daya, $harga, $bentuk, $warna, $tipe);
    }
}
?>
