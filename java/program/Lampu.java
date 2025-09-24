import java.util.Scanner;

public class Lampu extends Elektronik {
    private String bentuk;
    private String warna;
    private String tipe;

    public Lampu(String kodeProduk, String nama, int stok, String merk, String daya, double harga,
                 String bentuk, String warna, String tipe) {
        super(kodeProduk, nama, stok, merk, daya, harga);
        this.bentuk = bentuk;
        this.warna = warna;
        this.tipe = tipe;
    }

    public void add() {
        System.out.println("Menambahkan Lampu: " + nama + ", Merk: " + merk + ", Harga: " + harga);
    }

    public static Lampu createFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode produk: ");
        String kode = sc.nextLine();
        System.out.print("Masukkan nama produk: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan stok: ");
        int stok = sc.nextInt(); sc.nextLine();
        System.out.print("Masukkan merk: ");
        String merk = sc.nextLine();
        System.out.print("Masukkan daya: ");
        String daya = sc.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = sc.nextDouble(); sc.nextLine();
        System.out.print("Masukkan bentuk: ");
        String bentuk = sc.nextLine();
        System.out.print("Masukkan warna: ");
        String warna = sc.nextLine();
        System.out.print("Masukkan tipe: ");
        String tipe = sc.nextLine();
        return new Lampu(kode, nama, stok, merk, daya, harga, bentuk, warna, tipe);
    }
}
