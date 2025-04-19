package library.main;

import library.model.Book;
import library.model.Member;
import java.util.ArrayList;
import java.util.Scanner;


public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addBook(){
        System.out.println("Judul Buku : ");
        String title = input.nextLine();
        System.out.println("Penulis : ");
        String author = input.nextLine();
        System.out.println("Tahun Terbit : ");
        int yearPublished = input.nextInt();
        input.nextLine();

        Book book = new Book(title, author, yearPublished);
        books.add(book);
        System.out.println("buku berhasil ditambahkan\n");
    }

    public void addMember(){
        System.out.println("Nama Anggota : ");
        String nama = input.nextLine();
        System.out.println("ID Anggota : ");
        String memberId = input.nextLine();

        Member member = new Member(nama, memberId);
        members.add(member);
        System.out.println("anggota berhasil ditambahkan");
    }

    public void displayBook(){
        System.out.println("==== Daftar Buku ====");
        for(Book book : books){
            System.out.println("Judul : " + book.getTitle());
            System.out.println("Penulis : " + book.getAuthor());
            System.out.println("Tahun terbit : " + book.getYearPublished());
            System.out.println("==========================");
        }
    }

    public void displayMember(){
        System.out.println("==== Daftar Member ====");
        for(Member member : members){
            System.out.println("Nama : " + member.getNama());
            System.out.println("ID anggota : " + member.getMemberId());
            System.out.println("=========================");
        }
    }

    public void menu(){
        int choice;
        do {
            System.out.println("====== Manajemen Sistem Perpustakaan ======");
            System.out.println("1. Tambah Buku ");
            System.out.println("2. Tambah Anggota ");
            System.out.println("3. Lihat daftar Buku ");
            System.out.println("4. Lihat Daftar Anggota ");
            System.out.println("5. Keluar ");
            System.out.println("Pilih Menu : ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    displayBook();
                    break;
                case 4:
                    displayMember();
                case 5:
                    System.out.println("terima kasih");
                    break;
                case 6:
                    System.out.println("pilihan tidak valid");
            }
        }while (choice != 5);
    }

    public static void main(String [] args ){
        LibrarySystem system = new LibrarySystem();
        system.menu();
    }
    
}
