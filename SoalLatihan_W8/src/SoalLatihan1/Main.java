package SoalLatihan1;

class Hewan {
    String suara = "suara hewan";
}

class Kucing extends Hewan {
    String suara = "meong";

    void tampilkanSuara(){
        System.out.println("suara milik kelas kucing : " + this.suara);
        System.out.println("suara milik kelas hewan : " + super.suara);
    }
}

public class Main {
    public static void main(String[] args){
        Kucing kucing = new Kucing();
        kucing.tampilkanSuara();
    }
}
