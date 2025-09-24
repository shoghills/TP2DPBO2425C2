// #include "Lampu.cpp"

// int main() {
//     Lampu lampuList[] = {
//         Lampu("L001", "Lampu LED", 50, "Philips", "10W", 50000, "Bulat", "Putih", "LED"),
//         Lampu("L002", "Lampu Bohlam", 30, "Osram", "15W", 40000, "Lonjong", "Kuning", "Bohlam"),
//         Lampu("L003", "Lampu Hemat Energi", 25, "Panasonic", "8W", 60000, "Spiral", "Putih", "CFL"),
//         Lampu("L004", "Lampu Meja", 15, "Samsung", "5W", 70000, "Mini", "Hitam", "Desk"),
//         Lampu("L005", "Lampu Gantung", 10, "LG", "12W", 90000, "Bulat", "Silver", "Chandelier")
//     };

//     cout << "=== Data Awal ===" << endl;
//     for (Lampu &l : lampuList) l.add();

//     cout << "\n=== Tambah Lampu Baru ===" << endl;
//     Lampu baru = Lampu::createFromInput();
//     baru.add();

//     return 0;
// }
#include "Lampu.cpp"
#include <vector>
#include <iomanip>
using namespace std;

vector<Lampu> lampuList;

void tampilkan() {
    cout << left << setw(6) << "Kode" << setw(15) << "Nama" << setw(10) << "Merk"
         << setw(8) << "Daya" << setw(10) << "Harga" << setw(6) << "Stok"
         << setw(10) << "Bentuk" << setw(10) << "Warna" << setw(15) << "Tipe" << endl;

    for (auto &l : lampuList) {
        cout << left << setw(6) << l.getKodeProduk()
             << setw(15) << l.getNama()
             << setw(10) << l.getMerk()
             << setw(8) << l.getDaya()
             << setw(10) << l.getHarga()
             << setw(6) << l.getStok()
             << setw(10) << l.getBentuk()
             << setw(10) << l.getWarna()
             << setw(15) << l.getTipe() << endl;
    }
}

int main() {
    lampuList.push_back(Lampu("L001", "Lampu LED", 50, "Philips", "7W", 50000, "Bulat", "Putih", "LED"));
    lampuList.push_back(Lampu("L002", "Lampu Bohlam", 20, "Osram", "10W", 40000, "Bulat", "Kuning", "Bohlam"));
    lampuList.push_back(Lampu("L003", "Lampu Energi", 15, "Panasonic", "12W", 60000, "Spiral", "Putih", "Hemat Energi"));
    lampuList.push_back(Lampu("L004", "Lampu Meja", 10, "Samsung", "5W", 70000, "Kotak", "Hitam", "Meja"));
    lampuList.push_back(Lampu("L005", "Lampu Gantung", 5, "LG", "15W", 90000, "Panjang", "Putih", "Gantung"));

    tampilkan();

    cout << "\nTambah Lampu Baru:\n";
    Lampu baru = Lampu::createFromInput();
    lampuList.push_back(baru);

    cout << "\nData setelah ditambah:\n";
    tampilkan();
}

