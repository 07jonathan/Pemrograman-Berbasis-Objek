package Entity;

public abstract class UserEntityAbstract {
    protected int id;
    protected String nama;
    public UserEntityAbstract(){
        
    }
    
    public UserEntityAbstract(String nama){
        this.nama = nama;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
