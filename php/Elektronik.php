<?php
require_once "Produk.php";

class Elektronik extends Produk {
    protected $merk;
    protected $daya;
    protected $harga;

    public function __construct($kodeProduk, $nama, $stok, $merk, $daya, $harga) {
        parent::__construct($kodeProduk, $nama, $stok);
        $this->merk = $merk;
        $this->daya = $daya;
        $this->harga = $harga;
    }
}
?>
