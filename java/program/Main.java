// public class Main {
//     public static void main(String[] args) {
//         Lampu[] lampuList = {
//             new Lampu("L001", "Lampu LED", 50, "Philips", "10W", 50000, "Bulat", "Putih", "LED"),
//             new Lampu("L002", "Lampu Bohlam", 30, "Osram", "15W", 40000, "Lonjong", "Kuning", "Bohlam"),
//             new Lampu("L003", "Lampu Hemat Energi", 25, "Panasonic", "8W", 60000, "Spiral", "Putih", "CFL"),
//             new Lampu("L004", "Lampu Meja", 15, "Samsung", "5W", 70000, "Mini", "Hitam", "Desk"),
//             new Lampu("L005", "Lampu Gantung", 10, "LG", "12W", 90000, "Bulat", "Silver", "Chandelier")
//         };

//         System.out.println("=== Data Awal ===");
//         for (Lampu l : lampuList) l.add();

//         System.out.println("\n=== Tambah Lampu Baru ===");
//         Lampu baru = Lampu.createFromInput();
//         baru.add();
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lampu> lampuList = new ArrayList<>();
        lampuList.add(new Lampu("L001", "Lampu LED", 50, "Philips", "7W", 50000, "Bulat", "Putih", "LED"));
        lampuList.add(new Lampu("L002", "Lampu Bohlam", 20, "Osram", "10W", 40000, "Bulat", "Kuning", "Bohlam"));
        lampuList.add(new Lampu("L003", "Lampu Energi", 15, "Panasonic", "12W", 60000, "Spiral", "Putih", "Hemat Energi"));
        lampuList.add(new Lampu("L004", "Lampu Meja", 10, "Samsung", "5W", 70000, "Kotak", "Hitam", "Meja"));
        lampuList.add(new Lampu("L005", "Lampu Gantung", 5, "LG", "15W", 90000, "Panjang", "Putih", "Gantung"));

        tampilkan(lampuList);

        System.out.println("\nTambah Lampu Baru:");
        Lampu baru = Lampu.createFromInput();
        lampuList.add(baru);

        System.out.println("\nData setelah ditambah:");
        tampilkan(lampuList);
    }

    static void tampilkan(ArrayList<Lampu> list) {
        System.out.printf("%-5s %-15s %-10s %-8s %-10s %-6s %-10s %-10s %-15s%n",
                "Kode","Nama","Merk","Daya","Harga","Stok","Bentuk","Warna","Tipe");
        for (Lampu l : list) {
            System.out.printf("%-5s %-15s %-10s %-8s %-10.0f %-6d %-10s %-10s %-15s%n",
                    l.getKodeProduk(), l.getNama(), l.getMerk(), l.getDaya(),
                    l.getHarga(), l.getStok(), l.getBentuk(), l.getWarna(), l.getTipe());
        }
    }
}

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Produk> daftarProduk = new ArrayList<>();

//         // Tambah produk
//         daftarProduk.add(new Lampu("Lampu LED", 50000, "2 Tahun", "10 Watt"));
//         daftarProduk.add(new Elektronik("TV Samsung", 3500000, "5 Tahun", "220 Watt"));

//         // Header tabel
//         System.out.printf("+----------------+------------+------------+------------+%n");
//         System.out.printf("| %-14s | %-10s | %-10s | %-10s |%n", "Nama", "Harga", "Garansi", "Daya");
//         System.out.printf("+----------------+------------+------------+------------+%n");

//         // Isi tabel
//         for (Produk p : daftarProduk) {
//             System.out.printf("| %-14s | %-10d | %-10s | %-10s |%n",
//                     p.getNama(),
//                     p.getHarga(),
//                     p.getGaransi(),
//                     p.getDaya());
//         }

//         // Footer tabel
//         System.out.printf("+----------------+------------+------------+------------+%n");
//     }
// }





