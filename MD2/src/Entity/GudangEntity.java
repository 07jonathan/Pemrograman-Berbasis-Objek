package Entity;

public class GudangEntity {
    private DetailSepatuEntity sepatuEntity;
    private int indexJenis;
    private String kodeInventory;
    
    public GudangEntity(DetailSepatuEntity sepatuEntity, String kodeInventory){
        this.sepatuEntity = sepatuEntity;
        this.kodeInventory = kodeInventory;
    }
    
    public DetailSepatuEntity getSepatuEntity(){
        return sepatuEntity;
    }
    
    public void setSepatuEntity(DetailSepatuEntity sepatuEntity){
        this.sepatuEntity = sepatuEntity;
    }
    
    public String getKodeInventory(){
        return kodeInventory;
    }
    
    public void setKodeInventory(String kodeInventory){
        this.kodeInventory = kodeInventory;
    }
}