public class Main {
    public static void main(String[] args){
        Produk produk1 = new Produk("01", "laptop", 10000000, 10);
        Produk produk2 = new Produk("02", "Mouse", 50000, 30);
        Pelanggan pelanggan1 = new Pelanggan("P01", "ahmad", "@ahmd.gmail.com", 20000000);

        System.out.println("==== Daftar Produk ====");
        produk1.tampilkanInfoProduk();
        produk2.tampilkanInfoProduk();

        System.out.println("==== transaksi pembelian ====");
        Transaksi transaksi1 =  new Transaksi("0001", pelanggan1, produk1, 1);
        transaksi1.prosesTransaksi();
    }
}
