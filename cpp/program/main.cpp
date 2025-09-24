#include "Lampu.cpp"

int main() {
    Lampu lampuList[] = {
        Lampu("L001", "Lampu LED", 50, "Philips", "10W", 50000, "Bulat", "Putih", "LED"),
        Lampu("L002", "Lampu Bohlam", 30, "Osram", "15W", 40000, "Lonjong", "Kuning", "Bohlam"),
        Lampu("L003", "Lampu Hemat Energi", 25, "Panasonic", "8W", 60000, "Spiral", "Putih", "CFL"),
        Lampu("L004", "Lampu Meja", 15, "Samsung", "5W", 70000, "Mini", "Hitam", "Desk"),
        Lampu("L005", "Lampu Gantung", 10, "LG", "12W", 90000, "Bulat", "Silver", "Chandelier")
    };

    cout << "=== Data Awal ===" << endl;
    for (Lampu &l : lampuList) l.add();

    cout << "\n=== Tambah Lampu Baru ===" << endl;
    Lampu baru = Lampu::createFromInput();
    baru.add();

    return 0;
}
