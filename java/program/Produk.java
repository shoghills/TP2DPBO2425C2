public class Produk {
    protected String kodeProduk;
    protected String nama;
    protected int stok;

    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }
    // public class Produk {
    // String nama;
    // int harga;

    // public Produk(String nama, int harga) {
    //     this.nama = nama;
    //     this.harga = harga;
    // }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }
    public int getStok() {
        return stok;
    }   
    public String getNama() {
        return nama;
    }
}


