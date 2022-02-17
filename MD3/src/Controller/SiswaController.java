package Controller;
import Entity.SiswaEntity;
import java.util.ArrayList;

public class SiswaController {
    public ArrayList<SiswaEntity> getDataSiswa(){
        return AllObjectModel.siswaModel.getview();
    }
    public ArrayList<SiswaEntity> insert(String nama, int kelas){
        return AllObjectModel.siswaModel.getinsert(nama,kelas);
    }
    public ArrayList<SiswaEntity> update(int id, String nama, int kelas){
        return AllObjectModel.siswaModel.getupdate(id,nama,kelas);
    }
    public ArrayList<SiswaEntity> delete(int id){
        return AllObjectModel.siswaModel.getdelete(id);
    }
}
