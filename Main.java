import librarySystem.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(new Buku("Bumi", " Tere  Liye", 2020));
        perpustakaan.tambahBuku(new Buku("Ali", " Tere Liye", 2024));
        perpustakaan.tambahBuku(new Buku("Aldebaran", " Tere Liye", 2024));

        User user1 = new User("Ali", "001");

        int pilihan;
        do {
            System.out.println("\n===== Sistem Manajemen Perpustakaan =====");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Tambah Buku");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    perpustakaan.tampilkanBuku();
                    break;

                case 2:
                    perpustakaan.tampilkanBuku();
                    System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                    int indexPinjam = scanner.nextInt() - 1;
                    Buku bukuPinjam = perpustakaan.getBuku(indexPinjam);
                    if (bukuPinjam != null) {
                        user1.pinjamBuku(bukuPinjam);
                    } else {
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;

                case 3:
                    perpustakaan.tampilkanBuku();
                    System.out.print("Pilih nomor buku yang ingin dikembalikan: ");
                    int indexKembali = scanner.nextInt() - 1;
                    Buku bukuKembali = perpustakaan.getBuku(indexKembali);
                    if (bukuKembali != null) {
                        user1.kembalikanBuku(bukuKembali);
                    } else {
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;
                

                case 4:
                    System.out.println("masukkan judul buku = ");
                    String judul = scanner.nextLine();
                    System.out.println("masukkan nama penulis = ");
                    String penulis = scanner.nextLine();
                    System.out.println("masukkan tahun terbit = ");
                    int tahunTerbit = scanner.nextInt();

                    Buku bukuBaru = new Buku(judul, penulis, tahunTerbit);
                    perpustakaan.tambahBuku(bukuBaru);
                    perpustakaan.tampilkanBuku();
                    break;
                    

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
