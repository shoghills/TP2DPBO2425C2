#include <string>
using namespace std;

class Produk {
protected:
    string kodeProduk;
    string nama;
    int stok;

public:
    Produk(string kodeProduk, string nama, int stok) {
        this->kodeProduk = kodeProduk;
        this->nama = nama;
        this->stok = stok;
    }
    string getKodeProduk() { return kodeProduk; }
    string getNama() { return nama; }
    int getStok() { return stok; }

};
