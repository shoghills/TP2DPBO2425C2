#include "Elektronik.cpp"
#include <iostream>
using namespace std;

class Lampu : public Elektronik {
private:
    string bentuk;
    string warna;
    string tipe;

public:
    Lampu(string kodeProduk, string nama, int stok, string merk, string daya, double harga,
          string bentuk, string warna, string tipe)
        : Elektronik(kodeProduk, nama, stok, merk, daya, harga) {
        this->bentuk = bentuk;
        this->warna = warna;
        this->tipe = tipe;
    }

    void add() {
        cout << "Menambahkan Lampu: " << nama
             << ", Merk: " << merk
             << ", Harga: " << harga << endl;
    }

    static Lampu createFromInput() {
        string kode, nama, merk, daya, bentuk, warna, tipe;
        int stok;
        double harga;

        cout << "Masukkan kode produk: ";
        cin >> kode;
        cout << "Masukkan nama produk: ";
        cin.ignore();
        getline(cin, nama);
        cout << "Masukkan stok: ";
        cin >> stok;
        cout << "Masukkan merk: ";
        cin >> merk;
        cout << "Masukkan daya: ";
        cin >> daya;
        cout << "Masukkan harga: ";
        cin >> harga;
        cout << "Masukkan bentuk: ";
        cin >> bentuk;
        cout << "Masukkan warna: ";
        cin >> warna;
        cout << "Masukkan tipe: ";
        cin >> tipe;

        return Lampu(kode, nama, stok, merk, daya, harga, bentuk, warna, tipe);
    }
};
