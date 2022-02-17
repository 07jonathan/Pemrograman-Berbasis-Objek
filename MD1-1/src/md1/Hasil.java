package md1;

public class Hasil {
    public void hasil (String nama, int nilai, int jumlah) {
       
        int hasil = nilai*jumlah/jumlah;
       
        if (hasil<=70){
        ;
            System.out.println("Anda Tidak Lulus");
        }
        else if (hasil>=70){
            System.out.println("Anda Lulus");
        }
    }
}
