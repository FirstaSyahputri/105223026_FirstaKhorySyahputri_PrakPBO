class Kendaraan { //super class / parent class
    String Merk = "Toyota";

    Kendaraan(){
        System.out.println("ini constructor parent");
    }

    void jalan(){
        System.out.println("kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan {//sub class / child class
    String Merk = "BMW";

    Mobil(){
        System.out.println("ini constructor child");
    }

    void printInfo(){
        System.out.println("merk mobil child " + Merk);
        System.out.println("merk mobil parent" + super.Merk);
        jalan();
    }
    void klakson(String Merk){
        System.out.println("Mobil " + super.Merk + " klakson");
    }
}

public class Main {
    public static void main(String[] args){
        Mobil jazz = new Mobil();
        //jazz jalan
        jazz.printInfo();
        jazz.klakson("BMW");
        System.out.println(jazz.Merk);
    }
}
