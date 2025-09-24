class Produk:
    def __init__(self, kode_produk, nama, stok):
        self.kode_produk = kode_produk
        self.nama = nama
        self.stok = stok

    def get_kode_produk(self):
        return self.kode_produk
    
    def get_nama(self):
        return self.nama
    
    def get_stok(self):
        return self.stok