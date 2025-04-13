import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();

        int pilihan;
        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK tertinggi");
            System.out.println("Pilih : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch(pilihan){
                case 1:
                    System.out.println("Masukkan NIM : ");
                    String nim = scanner.nextLine();
                    System.out.println("Masukkan Nama : ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan Prodi : ");
                    String prodi = scanner.nextLine();
                    System.out.println("Masukkan IPK : ");
                    double IPK = scanner.nextDouble();
                    scanner.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, IPK);
                    manajemen.tambahMahasiswa(mhs);
                    System.out.println("data berhasil ditambahkan!\n");
                    break;


                case 2:
                    System.out.println("Daftar Mahasiswa: ");
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.TampilkanIPKTertinggi();
                    break;
                
                case 4:
                    System.out.println("terimakasih");
                    break;

                default:
                    System.out.println("pilihan tidak valid!");
            }
        } while (pilihan != 4);

        scanner.close();
    }
    
}
