package service;

import kursusonline.model.Instruktur;
import kursusonline.model.Peserta;
import kursusonline.model.Materi;
import kursusonline.model.Kursus;
import kursusonline.model.Sertifikat;
import java.util.ArrayList;
import java.util.List;

public class KursusService {
    private List<Kursus> daftarKursus = new ArrayList<>();

    public void tambahKursus(Kursus k) {
        daftarKursus.add(k);
    }

    public void tampilkanSemuaKursus() {
        for (Kursus k : daftarKursus) {
            k.tampilkanDetailKursus();
        }
    }

    public Kursus cariKursusBerdasarkanKode(String kode) {
        for (Kursus k : daftarKursus) {
            if (k.getKode().equals(kode)) {
                return k;
            }
        }
        return null;
    }

    public void tambahPesertaKeKursus(String kodeKursus, Peserta peserta) {
        Kursus kursus = cariKursusBerdasarkanKode(kodeKursus);
        if (kursus != null) {
            kursus.tambahPeserta(peserta);
        } else {
            System.out.println("Kursus tidak ditemukan: " + kodeKursus);
        }
    }
}