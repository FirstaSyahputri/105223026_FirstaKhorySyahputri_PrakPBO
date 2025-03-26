public class Produk {

    String kodeProduk, namaProduk;
    double harga;
    int stok;

    Produk(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilkanInfoProduk(){
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : Rp." + String.format("%,.4f", harga));
        System.out.println("Stok : " + stok);
        System.out.println();
    }

    boolean kurangiStok(int jumlah){
        if(stok >= jumlah){
            stok -= jumlah;
            return true;
        }else{
            System.out.println("stok tidak mencukupi");
            return false;
        }
    }
}
