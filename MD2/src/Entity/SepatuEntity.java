package Entity;

public class SepatuEntity{
    protected String merk, jenis;
    protected int stok;
    
    public SepatuEntity(String merk, String jenis, int stok){
        this.merk = merk;
        this.stok = stok;
        this.jenis = jenis;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public int getStok(){
        return this.stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
     public String getJenis(){
        return this.jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
}
