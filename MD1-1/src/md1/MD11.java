package md1;

import java.util.Scanner;

public class MD11 {
    private static Hasil hasil = new Hasil();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nama;
        int nilai, jumlah;
        for (int i = 0; i<5; i++){
            
        
        System.out.print("Masukkan Nama: ");
        nama = scan.next();    
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        jumlah = scan.nextInt();
        System.out.print( "Masukkan Nilai: ");
        nilai = scan.nextInt();
        hasil.hasil(nama, nilai, jumlah);
        
        }
    }
}
