#include "Produk.cpp"
#include <string>
using namespace std;

class Elektronik : public Produk {
protected:
    string merk;
    string daya;
    double harga;

public:
    Elektronik(string kodeProduk, string nama, int stok, string merk, string daya, double harga)
        : Produk(kodeProduk, nama, stok) {
        this->merk = merk;
        this->daya = daya;
        this->harga = harga;
    }

    string getMerk() { return merk; }
    string getDaya() { return daya; }
    double getHarga() { return harga; }

};
