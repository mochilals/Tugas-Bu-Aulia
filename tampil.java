package tugasbuaul;

public class tampil {
    public static void main(String[] args) {
        apartemen a = new apartemen();
        kosan k = new kosan();
        System.out.println("DATA APARTEMEN");
        a.tampilkanlokasi();
        a.tampilkanukuran(150,8);
        System.out.println("DATA KOSAN");
        k.tampilkanNama("mangliawan");
        k.jumlahKamar(5,5);

    }
    
}
