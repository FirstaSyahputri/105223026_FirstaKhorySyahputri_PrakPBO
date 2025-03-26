public class Pelanggan {
    String idPelanggan, nama, email;
    double saldo;

    Pelanggan(String idPelanggan, String nama, String email, double saldo){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    void tampilkanInfoPelanggan(){
        System.out.println("ID pelanggan : " + idPelanggan);
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("Saldo : Rp. " + String.format("%,.4f", saldo));
        System.out.println();
    }

    void topUpSaldo(double jumlah){
        saldo += jumlah;
        System.out.println("berhasil menambahkan saldo");
    }

    boolean kurangiSaldo(double jumlah){
        if(saldo >= jumlah){
            saldo -= jumlah;
            return true;
        }else{
            System.out.println("saldo tidak mencukupi");
            return false;
        }
    }
}
