package md1;

public class Hasil {
    public void hasil (String nama, int nilai) {
       char hasil = 0;
        if (nilai<=60){
        hasil = 'E';
        }
        else if (nilai<=70&&nilai>60){
        hasil = 'D';
        }
        else if (nilai<=74&&nilai>70){
        hasil = 'c';
        }
        else if (nilai<=80&&nilai>74){
        hasil = 'C';
        }
        else if (nilai<=90&&nilai>80){
        hasil = 'B';
        }
        else if (nilai<=100&&nilai>90){
        hasil = 'A';
        }
        
        switch(hasil){
            case 'A' :
                System.out.println("NILAI ANDA A");
                System.out.println("ANDA LULUS");
                break;
            case 'B':
                System.out.println("NILAI ANDA B");
                System.out.println("ANDA LULUS");
                break;
            case 'C':
                System.out.println("NILAI ANDA C");
                System.out.println("ANDA LULUS");
                break;
            case 'c':
                System.out.println("NILAI ANDA C");
                System.out.println("ANDA TIDAK LULUS");
                break;
            case 'D':
                System.out.println("NILAI ANDA D");
                System.out.println("ANDA TIDAK LULUS");
                break;
            case 'E':
                System.out.println("NILAI ANDA E");
                System.out.println("ANDA TIDAK LULUS");
                break;
            default:
                System.out.println(" tidak dikenal oleh sistem");
        } 
    }
}
