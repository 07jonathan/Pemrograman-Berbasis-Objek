package Entity;

public class DetailSepatuEntity extends SepatuEntity {
    private String warna;
    
    public DetailSepatuEntity( String merk, int stok, String warna, String jenis ){
        super(merk, jenis, stok);
        this.warna = warna;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
}    
