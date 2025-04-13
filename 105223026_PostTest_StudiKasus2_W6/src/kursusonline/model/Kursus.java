package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<>();
        this.daftarMateri = new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public void tambahMateri(Materi m) {
        daftarMateri.add(m);
    }


    public void tambahPeserta(Peserta p) {
        if (!p.getEmail().endsWith("@gmail.com")) {
            System.out.println("Email peserta tidak valid! (" + p.getEmail() + ")");
            return;
        }
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getId().equals(p.getId())) {
                System.out.println("Peserta dengan ID sama sudah ada.");
                return;
            }
        }
        daftarPeserta.add(p);
    }

    public void tampilkanDetailKursus() {
        System.out.println("\n=== DETAIL KURSUS ===");
        System.out.println("Kode Kursus       : " + kode);
        System.out.println("Nama Kursus       : " + nama);
        System.out.println(instruktur);


        System.out.println("\n-- DAFTAR PESERTA --");
        for (Peserta p : daftarPeserta){
            System.out.println(" - " + p);
        }
        

        System.out.println("\n-- MATERI KURSUS --");
        for (Materi m : daftarMateri) {
            System.out.println(" - " + m);
        }
        System.out.println();
    }
}
