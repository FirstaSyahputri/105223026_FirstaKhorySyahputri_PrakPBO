package kursusonline.model;

import java.util.ArrayList;

public class Peserta {

    private String id;
    private String nama;
    private String email;
    private String noHp;
    private String sertifikat;

    public Peserta(String id, String nama, String email, String noHp, String sertifikat){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.sertifikat = sertifikat;
    }

    public String getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }
    
    public String getNama(){
        return nama;
    }

    public String toString(){
        return nama + " - " + email;
    }

    public void tampilkan(){
        System.out.println("- " + nama + " | Email: " + email);
    }
}
