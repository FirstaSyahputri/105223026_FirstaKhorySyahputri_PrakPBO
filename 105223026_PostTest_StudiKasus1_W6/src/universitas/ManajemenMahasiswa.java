package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {

    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa(){
        daftarMahasiswa = new ArrayList<>();
    }

        public void tambahMahasiswa(Mahasiswa m){
            daftarMahasiswa.add(m);
        }

        public void tampilkanSemua(){
            if(daftarMahasiswa.isEmpty()){
                System.out.println("belum ada data mahasiswa");
                return;
            }

            for(Mahasiswa m : daftarMahasiswa){
                m.tampilkanData();
                System.out.println();
            }
        }

        public void TampilkanIPKTertinggi(){
            if(daftarMahasiswa.isEmpty()){
                System.out.println("tidak ada data mahasiswa");
                return;
            }

            Mahasiswa tertinggi = daftarMahasiswa.get(0);
            for(Mahasiswa m : daftarMahasiswa){
                if(m.getIPK() > tertinggi.getIPK()){
                    tertinggi = m;
                }
            }

            System.out.println("Mahasiswa dengan IPK tertinggi : ");
            tertinggi.tampilkanData();
        }
    
}
