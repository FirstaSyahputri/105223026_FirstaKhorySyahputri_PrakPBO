package library.model;

public class Member {
    private String nama;
    private String memberId;

    public Member(String nama, String memberId){
        this.nama = nama;
        this.memberId = memberId;
    }

    public String getNama(){
        return nama;
    }

    public String getMemberId(){
        return memberId;
    }
    

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setMemberId(String memberId){
        this.memberId = memberId;
    }
}
