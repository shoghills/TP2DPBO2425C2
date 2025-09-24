from produk import Produk

class Elektronik(Produk):
    def __init__(self, kode_produk, nama, stok, merk, daya, harga):
        super().__init__(kode_produk, nama, stok)
        self.merk = merk
        self.daya = daya
        self.harga = harga

    def get_merk(self):
        return self.merk
    
    def get_daya(self):
        return self.daya

    def get_harga(self):
        return self.harga
