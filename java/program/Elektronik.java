public class Elektronik extends Produk {
    protected String merk;
    protected String daya;
    protected double harga;

    public Elektronik(String kodeProduk, String nama, int stok, String merk, String daya, double harga) {
        super(kodeProduk, nama, stok);
        this.merk = merk;
        this.daya = daya;
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }
    public String getDaya() {
        return daya;
    }
    public double getHarga() {
        return harga;
    }
}
