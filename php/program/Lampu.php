<?php
require_once "Elektronik.php";

class Lampu extends Elektronik {
    private $bentuk;
    private $warna;
    private $tipe;
    private $gambar;

    public function __construct($kodeProduk, $nama, $stok, $merk, $daya, $harga, $bentuk, $warna, $tipe, $gambar) {
        parent::__construct($kodeProduk, $nama, $stok, $merk, $daya, $harga);
        $this->bentuk = $bentuk;
        $this->warna = $warna;
        $this->tipe = $tipe;
        $this->gambar = $gambar; // nama file gambar
    }

    public function getData() {
        return [
            "kodeProduk" => $this->kodeProduk,
            "nama" => $this->nama,
            "stok" => $this->stok,
            "merk" => $this->merk,
            "daya" => $this->daya,
            "harga" => $this->harga,
            "bentuk" => $this->bentuk,
            "warna" => $this->warna,
            "tipe" => $this->tipe,
            "gambar" => $this->gambar
        ];
    }
}
