import kursusonline.model.Instruktur;
import kursusonline.model.Peserta;
import kursusonline.model.Materi;
import kursusonline.model.Kursus;
import kursusonline.model.Sertifikat;
import service.KursusService;

public class Main {
    public static void main(String[] args) {
        Instruktur instruktur1 = new Instruktur("I-001", "Pak Budi", "Java");
        Instruktur instruktur2 = new Instruktur("I-002", "Pak Ani", "Web Development");

        Kursus kursus1 = new Kursus("K001", "Pemrograman Java", instruktur1);
        Kursus kursus2 = new Kursus("K002", "Web Development", instruktur2);

        Peserta peserta1 = new Peserta("P-001", "Dina", "dina@gmail.com", "08123", "0812");
        Peserta peserta2 = new Peserta("P-002", "Rian", "rian@ymail.com", "08124","0813");
        Peserta peserta3 = new Peserta("P-003", "Lina", "lina@gmail.com", "08125","0814");

        Materi m1 = new Materi("Dasar Java", "Pengenalan Java", 90);
        Materi m2 = new Materi("OOP", "Konsep OOP", 120);
        Materi m3 = new Materi("HTML", "Dasar Web", 80);

        kursus1.tambahMateri(m1);
        kursus1.tambahMateri(m2);
        kursus2.tambahMateri(m3);

        KursusService service = new KursusService();
        service.tambahKursus(kursus1);
        service.tambahKursus(kursus2);

        service.tambahPesertaKeKursus("K001", peserta1);
        service.tambahPesertaKeKursus("K001", peserta2);
        service.tambahPesertaKeKursus("K002", peserta3);

        service.tampilkanSemuaKursus();
    }
}
