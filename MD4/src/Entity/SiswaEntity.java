package Entity;

public class SiswaEntity extends UserEntityAbstract{
    private String kelas;
    
    public SiswaEntity(){};

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
}
