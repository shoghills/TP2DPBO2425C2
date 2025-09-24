from lampu import Lampu

# Data default
lampu_list = [
    Lampu("L001", "Lampu LED", 50, "Philips", "7W", 50000, "Bulat", "Putih", "LED"),
    Lampu("L002", "Lampu Bohlam", 20, "Osram", "10W", 40000, "Bulat", "Kuning", "Bohlam"),
    Lampu("L003", "Lampu Energi", 15, "Panasonic", "12W", 60000, "Spiral", "Putih", "Hemat Energi"),
    Lampu("L004", "Lampu Meja", 10, "Samsung", "5W", 70000, "Kotak", "Hitam", "Meja"),
    Lampu("L005", "Lampu Gantung", 5, "LG", "15W", 90000, "Panjang", "Putih", "Gantung"),
]

def tampilkan():
    # Header
    print(f"{'Kode':<6}{'Nama':<15}{'Merk':<12}{'Daya':<8}{'Harga':<10}{'Stok':<6}{'Bentuk':<10}{'Warna':<10}{'Tipe':<15}")
    print("-" * 90)
    # Data
    for l in lampu_list:
        print(f"{l.kode_produk:<6}{l.nama:<15}{l.merk:<12}{l.daya:<8}{l.harga:<10}{l.stok:<6}{l.bentuk:<10}{l.warna:<10}{l.tipe:<15}")

if __name__ == "__main__":
    tampilkan()
    print("\nTambah Lampu Baru:")
    baru = Lampu.create_from_input()
    lampu_list.append(baru)
    print("\nData setelah ditambah:")
    tampilkan()
