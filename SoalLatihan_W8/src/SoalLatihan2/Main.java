package SoalLatihan2;

class Kendaraan {
    Kendaraan(){
        System.out.println("konstruktor kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    Mobil(){
        super();
        System.out.println("konstruktor mobil dipanggil");
    }
}

public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
    }
}