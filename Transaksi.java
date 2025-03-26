public class Transaksi {
    String idTransaksi;
    Pelanggan pelanggan;
    Produk produk;
    int jumlahBeli;
    double totalHarga;

    Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli){
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.harga * jumlahBeli;
    }

    void prosesTransaksi(){
        if(produk.kurangiStok(jumlahBeli) && pelanggan.kurangiSaldo(totalHarga)){
            System.out.println("transaksi berhasil");
            tampilkanDetailTransaksi();
        }else{
            System.out.println("transaksi gagal");
        }
    }

    void tampilkanDetailTransaksi(){
        System.out.println("ID transaksi : " + idTransaksi);
        pelanggan.tampilkanInfoPelanggan();
        produk.tampilkanInfoProduk();
        System.out.println("jumlah beli : " + jumlahBeli);
        System.out.println("total harga : Rp. " + String.format ("%,.4f" + totalHarga));
        System.out.println();
    }
}
