package sapxeptheomasinhvien;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop,mail;

    public SinhVien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return ma +" " + ten +" " + lop +" " + mail;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }
}
