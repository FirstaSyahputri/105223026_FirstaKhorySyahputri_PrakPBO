package PostTest1;

class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = " Gedung Sekolah ABC ";

    void tampilkanInfo(){
        System.out.println("Nama dari subclass : " + this.nama);
        System.out.println("Nama dari superclass : " + super.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        GedungSekolah sekolah = new GedungSekolah();
        sekolah.tampilkanInfo();
    }
}