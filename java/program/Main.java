public class Main {
    public static void main(String[] args) {
        Lampu[] lampuList = {
            new Lampu("L001", "Lampu LED", 50, "Philips", "10W", 50000, "Bulat", "Putih", "LED"),
            new Lampu("L002", "Lampu Bohlam", 30, "Osram", "15W", 40000, "Lonjong", "Kuning", "Bohlam"),
            new Lampu("L003", "Lampu Hemat Energi", 25, "Panasonic", "8W", 60000, "Spiral", "Putih", "CFL"),
            new Lampu("L004", "Lampu Meja", 15, "Samsung", "5W", 70000, "Mini", "Hitam", "Desk"),
            new Lampu("L005", "Lampu Gantung", 10, "LG", "12W", 90000, "Bulat", "Silver", "Chandelier")
        };

        System.out.println("=== Data Awal ===");
        for (Lampu l : lampuList) l.add();

        System.out.println("\n=== Tambah Lampu Baru ===");
        Lampu baru = Lampu.createFromInput();
        baru.add();
    }
}
