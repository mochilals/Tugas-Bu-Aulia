package tugasbuaul;

import java.util.Scanner;

public class kosan {
    Scanner scan = new Scanner(System.in);
    public void tampilkanNama(String mangliawan){
        System.out.println("Saya ngekos di : "+mangliawan);
    }

    public void jumlahKamar(int kamar, int jumlahKamar){
        int total = kamar * jumlahKamar;
        System.out.println("jumlahKamar :"+total);
    }
}
