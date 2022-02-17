package Main;

import Process.SepatuProcess;
import Entity.JenisSepatuEntity;
import Jenis.*;
import java.util.Scanner;

public class Main {
    
    private static Scanner input = new Scanner(System.in);
    private static SepatuProcess prosesSepatu = new SepatuProcess();
    public static JenisKets kets = new JenisKets();
    public static JenisResmi resmi = new JenisResmi();
    public static JenisSporty sporty = new JenisSporty();
            
    public static void main(String[] args) {
        loginPanitia();
    }
    
    static void loginPanitia() {
        int pil;
        
        do {
            System.out.println("Jumlah Sepatu : " + SepatuProcess.jumSepatu);
            System.out.println("1. Create Data Sepatu");
            System.out.println("2. Update Data Sepatu");
            System.out.println("3. Lihat Data Sepatu");
            System.out.println("4. Hapus Data Sepatu");
            System.out.println("0. Log Out");
            System.out.print("Pilih: ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil) {
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    prosesSepatu.view();
                    break;
                case 4:
                    delete();
                    break;
            }
        } while (pil != 0);
    }
    
    static void insertPeserta() {
        System.out.print("Input Merk : ");
        String merk = input.nextLine();
        System.out.print("Input Warna : ");
        String warna = input.nextLine();
        System.out.println("Jenis Sepatu : ");
        kets.jenis();
        resmi.jenis();
        sporty.jenis();
        System.out.print("Input Jenis : ");
        String jenis = input.nextLine();
        System.out.print("Input Stok : ");
        int stok = input.nextInt();
        prosesSepatu.insert(merk, stok, warna, jenis);
        insertJenis();
    }
    
    static void insertJenis() {
        System.out.print("Input Kode Inventory : ");
        String kodeInventory = input.next();
        prosesSepatu.insert(prosesSepatu.getDetailSepatu()[prosesSepatu.jumSepatu], kodeInventory);
    }
    static void update(){
    System.out.print("Masukan Kode Peserta yang mau di EDIT : ");
        String search = input.next();
        prosesSepatu.update(search);
    }
    
    static void delete(){
    System.out.print("Masukan Kode Inventory yang akan di HAPUS : ");
        String search = input.next();
        prosesSepatu.delete(search);
    }
}