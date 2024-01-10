package tugasbuaul;

public class apartemen {
    public static void main(String[] args) {
        apartemen a = new apartemen();
        kosan k = new kosan();
        a.tampilkanlokasi();
        a.tampilkanukuran(150,8);
        k.tampilkanNama("kosan");
        k.jumlahKamar(5,5);
    }

    public void tampilkanukuran (int panjang,int lebar){
        int luas = panjang*lebar;
        System.out.println("Ukuran Apart :"+luas);
    }

    public void tampilkanlokasi(){
        String alamat = "Malang";
        System.out.println("Lokasi Apart :"+alamat);
    }
    
}
