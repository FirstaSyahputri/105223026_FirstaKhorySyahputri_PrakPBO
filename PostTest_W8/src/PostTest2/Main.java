package PostTest2;

class Orang {
    Orang(){
        System.out.println("orang dibuat!");
    }
}

class Dosen extends Orang {
    Dosen(){
        super();
        System.out.println("dosen dibuat!");
    }
}

public class Main {
    public static void main(String[] args){
        Dosen dosenBaru = new Dosen();
    }
    
}