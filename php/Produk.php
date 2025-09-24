<?php
class Produk {
    protected $kodeProduk;
    protected $nama;
    protected $stok;

    public function __construct($kodeProduk, $nama, $stok) {
        $this->kodeProduk = $kodeProduk;
        $this->nama = $nama;
        $this->stok = $stok;
    }
}
?>
