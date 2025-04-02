package librarySystem;

import java.util.ArrayList;

public class Perpustakaan{
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();

        public void tambahBuku(Buku buku){
            koleksiBuku.add(buku);
            System.out.println("\n Buku " + buku.getJudul() + " berhasil ditambahkan ke perpustakaan");
        }

        public void tampilkanBuku(){
            System.out.println("daftar buku di perpustakaan");
            if(koleksiBuku.isEmpty()){
                System.out.println("tidak ada buku dalam perpusatakaan");
                return;
            }
            for(int i = 0; i < koleksiBuku.size(); i++){
                Buku buku = koleksiBuku.get(i);
                String status = buku.isStatusDipinjam() ? "(dipinjam)" : "(tersedia)";
                System.out.println((i + 1) + ". " + buku.getJudul() + " " + status);
            }
        }

        public Buku getBuku(int index){
            if(index >= 0 && index < koleksiBuku.size()){
                return koleksiBuku.get(index);
            }

            return null;
        }
    }
