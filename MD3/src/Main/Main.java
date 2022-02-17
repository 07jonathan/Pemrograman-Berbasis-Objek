package Main;
import Controller.SiswaController;
import Entity.SiswaEntity;
import java.util.Scanner;

public class Main {
     private static Scanner input = new Scanner(System.in);
     public static SiswaController siswa = new SiswaController();
    public static void main (String[] args) {
        int pil;
        
        do {
            System.out.println("1. Create Data Siswa");
            System.out.println("2. Update Data Siswa");
            System.out.println("3. Lihat Data Siswa");
            System.out.println("4. Hapus Data Siswa");
            System.out.println("0. Log Out");
            System.out.print("Pilih: ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    insert();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    delete();
                    break;
            }
        } while (pil != 0);
    }
    
    
    static void insert(){
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Kelas: ");
        int kelas = input.nextInt();
        System.out.println("");
        siswa.insert(nama, kelas);
    }
    
    static void show(){
        for(SiswaEntity siswaEntities : siswa.getDataSiswa()){
            System.out.println("--------------------");
            System.out.println("id = "+siswaEntities.getId());
            System.out.println("nama = "+siswaEntities.getNama());
            System.out.println("Npm = "+siswaEntities.getKelas());
            System.out.println("");
        }
    }
    
    static void update(){
            // ambil input dari user
            show();
            int id, kelas;
            String nama;
    
            System.out.print("ID yang mau diedit: ");
            id = input.nextInt();
            input.nextLine();
            System.out.print("Nama: ");
             nama = input.nextLine();
            System.out.print("Kelas: ");
            kelas = input.nextInt();        
           
            System.out.println("");
            siswa.update(id, nama, kelas);
    }
    
    
    static void delete(){
        // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int id = input.nextInt();
            siswa.delete(id);   
    }
}
