from elektronik import Elektronik

class Lampu(Elektronik):
    def __init__(self, kode_produk, nama, stok, merk, daya, harga, bentuk, warna, tipe):
        super().__init__(kode_produk, nama, stok, merk, daya, harga)
        self.bentuk = bentuk
        self.warna = warna
        self.tipe = tipe

    def add(self):
        print(f"Menambahkan Lampu: {self.nama}, Merk: {self.merk}, Harga: {self.harga}")

    @staticmethod
    def create_from_input():
        kode = input("Masukkan kode produk: ")
        nama = input("Masukkan nama produk: ")
        stok = int(input("Masukkan stok: "))
        merk = input("Masukkan merk: ")
        daya = input("Masukkan daya: ")
        harga = float(input("Masukkan harga: "))
        bentuk = input("Masukkan bentuk: ")
        warna = input("Masukkan warna: ")
        tipe = input("Masukkan tipe: ")
        return Lampu(kode, nama, stok, merk, daya, harga, bentuk, warna, tipe)
