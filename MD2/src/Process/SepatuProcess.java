package Process;

import Entity.DetailSepatuEntity;
import Entity.GudangEntity;
import Jenis.*;
import java.util.Scanner;

public class SepatuProcess implements Interface {
    private static Scanner input = new Scanner(System.in);
    private static DetailSepatuEntity[] detailsepatu = new DetailSepatuEntity[100];
    private static GudangEntity[] gudang = new GudangEntity[100];
    public static JenisKets kets = new JenisKets();
    public static JenisResmi resmi = new JenisResmi();
    public static JenisSporty sporty = new JenisSporty();
    public static int jumSepatu = 0;
    //digunakan utk mengakses variabel yg tdk dpt diakses dari luar kelas
    
    public DetailSepatuEntity[] getDetailSepatu() {
        return detailsepatu;
    }
    
    public GudangEntity[] getGudang() {
        return gudang;
    }
    
    public void insert (String merk, int stok, String warna, String jenis) {
        detailsepatu[jumSepatu] = new DetailSepatuEntity(merk, stok, warna, jenis);
    }
    
    public void insert(DetailSepatuEntity sepatuEntity, String kodeInventory) {
        gudang[jumSepatu] = new GudangEntity(sepatuEntity, kodeInventory);
        jumSepatu = jumSepatu + 1;
    }
    
    @Override //utk membuat ulang method pada subclass/class anak
    //menapilkan data peserta sesuai dgn data yg tersimpan dipesertaEntity
    public void view() {
        if (jumSepatu == 0) {
            System.out.println("Belum ada peserta terdaftar");
        } else {
            for (int i = 0; i < jumSepatu; i++) {
                System.out.println("==============================================");
                System.out.println("Kode Iventory : " + gudang[i].getKodeInventory());
                System.out.println("==============================================");
                System.out.println("Merk : " + detailsepatu[i].getMerk() + 
                        "\n Stok : " + detailsepatu[i].getStok() + 
                        "\n Warna : " + detailsepatu[i].getWarna()+ 
                        "\n Jenis Sepatu : " + detailsepatu[i].getJenis());
                System.out.println("==============================================");
            }
        }
    }
    //memperbarui data peserta dgn kodePeserta yg dimasukan
    public void update(String search) {
        int cari = 0;
        do {
            if (cari == jumSepatu) {
                System.err.print("Tidak ada data");
                break;
            } else if (gudang[cari].getKodeInventory().equals(search)) {
                int pilEdit;
                do {
                    System.out.println("Pilih  data yang ingin diubah : ");
                    System.out.println("1. Lihat Inventory");
                    System.out.println("2. Merk");
                    System.out.println("3, Warna");
                    System.out.println("4. Stok");
                    System.out.println("5. Jenis Sepatu");
                    System.out.println("0. Exit");
                    
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1) {
                        System.out.println("==============================================");
                        System.out.println("Kode Inventory : " + gudang[cari].getKodeInventory());
                        System.out.println("==============================================");
                        System.out.println("Merk : " + detailsepatu[cari].getMerk() + 
                                "\n Stok : " + detailsepatu[cari].getStok() +
                                "\n Warna : " + detailsepatu[cari].getWarna() +
                                "\n Jenis Sepatu : "+ detailsepatu[cari].getJenis());
                        System.out.println("==============================================");
                    } else if (pilEdit == 2) {
                        System.out.print("Ubah Merk : ");
                        String editMerk = input.nextLine();
                        detailsepatu[cari].setMerk(editMerk);;
                    } else if (pilEdit == 3) {
                        System.out.print("Ubah Warna Sepatu : ");
                        String editWarna = input.nextLine();
                        detailsepatu[cari].setWarna(editWarna);
                    }else if (pilEdit == 4) {
                        System.out.print("Ubah Stok : ");
                        int editStok = input.nextInt();
                        detailsepatu[cari].setStok(editStok);
                    } else if (pilEdit == 5) {
                        System.out.println("Pilih Lomba : ");
                            kets.jenis();
                            resmi.jenis();
                            sporty.jenis();
                        int editStok = input.nextInt();
                        detailsepatu[cari].setStok(editStok);
                    }
                } while (pilEdit != 0);
                break;
                } else {
                cari = cari + 1;
            }
        } while (true);
    }
    //utk memindah data peserta sesuai dgn kodepeserta yg dimasukan dan tersimpan dlm pesertaentity,terdaftarentity
    public void delete(String search) {
        input.nextLine();
        int cari = 0;
        do {
            if (cari == jumSepatu) {
                System.err.println( " Tidak Ada Data!");
                break;
            } else if (gudang[cari].getKodeInventory().equals(search)) {
                if (cari == jumSepatu -1) {
                    jumSepatu = jumSepatu - 1;
                } else {
                    for (int i = cari; i < jumSepatu; i++) {
                        gudang[i] = gudang[i + 1];
                        detailsepatu[i] = detailsepatu[i + 1];
                    }
                    jumSepatu = jumSepatu - 1;
                }
                break;
            } else {
                cari = cari + 1;
            }
        } while(true);
    }
}
