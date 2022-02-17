package Model;
import Entity.SiswaEntity;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;

public class SiswaModel {
    private String sql;
    public Connection conn = KoneksiDb.getconection();
    
    public ArrayList<SiswaEntity> getview(){
        ArrayList<SiswaEntity> arraylistSiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * from siswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                SiswaEntity siswaEntity = new SiswaEntity();
                siswaEntity.setId(rs.getInt("id"));
                siswaEntity.setNama(rs.getString("nama"));
                siswaEntity.setKelas(rs.getString("kelas"));
                
                arraylistSiswa.add(siswaEntity);
                
            }
        }catch(SQLException e){
        System.out.println(e);
        }
        return arraylistSiswa;
    }
    
    public ArrayList<SiswaEntity> getinsert(String nama, int kelas) {
         ArrayList<SiswaEntity> arraylistSiswa = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            // query simpan
            String sql = "INSERT INTO siswa (nama, kelas) VALUE('%s', '%d')";
            sql = String.format(sql, nama, kelas);

            // simpan buku
            stat.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arraylistSiswa;
     }
    
    
    
     public ArrayList<SiswaEntity> getupdate( int id, String nama, int kelas) {
         ArrayList<SiswaEntity> arraylistSiswa = new ArrayList<>();
    
    try {
            Statement stat = conn.createStatement();
            // query update
            String sql = "UPDATE siswa SET nama='%s', kelas='%d' WHERE id=%d";
            sql = String.format(sql, nama, kelas, id);

            // update data buku
            stat.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return arraylistSiswa;
     }

     
     
      public ArrayList<SiswaEntity> getdelete(int id) {
         ArrayList<SiswaEntity> arraylistSiswa = new ArrayList<>();
    
     try {
           Statement stat = conn.createStatement();
            // buat query hapus
            String sql = String.format("DELETE FROM siswa WHERE id=%d", id);

            // hapus data
            stat.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
     return arraylistSiswa;
      }
    
}
