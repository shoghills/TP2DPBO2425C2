from produk import Produk

class Elektronik(Produk):
    def __init__(self, kode_produk, nama, stok, merk, daya, harga):
        super().__init__(kode_produk, nama, stok)
        self.merk = merk
        self.daya = daya
        self.harga = harga

