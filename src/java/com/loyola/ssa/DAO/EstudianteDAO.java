
package com.loyola.ssa.DAO;


import com.loyola.ssa.entities.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EstudianteDAO extends DAO{
    
    public void registrar(Estudiante est) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO estudiante (id_estudiante,cod_estudiante,id_usuario,tipo_estudiante)values(?,?,?,?)");
            st.setInt(1, est.getId_estudiante());
            st.setInt(2, est.getCod_estudiante());
            st.setInt(3, est.getId_usuario());
            st.setString(4, est.getTipo_estudiante());
            st.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
            
        }
        
    }

/*    public void registrar(com.loyola.ssa.Modelo.Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Estudiante> select(String select__from_estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } */

    public List<Estudiante> listar() throws Exception{
        
        List<Estudiante> lista;
        ResultSet rs;
        
        try {
        
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id_estudiante, cod_estudiante, id_usuario, tipo_estudiante FROM estudiante");
            rs = st.executeQuery();
            lista = new ArrayList();
            
            while(rs.next()){
                Estudiante est = new Estudiante();
                est.setId_estudiante(rs.getInt("id_estudiante"));
                est.setCod_estudiante(rs.getInt("cod_estudiante"));
                est.setId_usuario(rs.getInt("id_usuario"));
                est.setTipo_estudiante(rs.getString("tipo_estudiante"));
                
                lista.add(est);
            }
        } catch (Exception e){
            throw e;
        
        } finally{
            this.Cerrar();
        }
        return lista;
    }

    public Estudiante leerID(Estudiante est) throws Exception{
        Estudiante estu;
        ResultSet rs;
        
        try{
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT id_estudiante, cod_estudiante, id_usuario, tipo_estudiante FROM estudiante WHERE id_estudiante=?");
            st.setInt(1, est.getId_estudiante());
           // st.setInt(2, est.getCod_estudiante());
           // st.setInt(3, est.getId_usuario());
           // st.setString(4, est.getTipo_estudiante());
            rs=st.executeQuery();
            
            while(rs.next()){
                estu = new Estudiante();
                estu.setId_estudiante(rs.getInt("id_estudiante"));
                estu.setCod_estudiante(rs.getInt("cod_estudiante"));
                estu.setId_usuario(rs.getInt("id_usuario"));
                estu.setTipo_estudiante(rs.getString("tipo_estudiante"));
                
                
            }
        }catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
            
        }
        
        return est;
    
    }
    
     public void modificar(Estudiante est) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE  estudiante SET cod_estudiante=?, id_usuario=?, tipo_estudiante=? WHERE id_estudiante=?");
           
            st.setInt(1, est.getCod_estudiante());
            st.setInt(2, est.getId_usuario());
            st.setString(3, est.getTipo_estudiante());
            st.setInt(4, est.getId_estudiante());
            st.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
            
        }
        
    }
     
     public void eliminar(Estudiante est) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("DELETE  FROM estudiante  WHERE id_estudiante=?");
           
            //st.setInt(1, est.getCod_estudiante());
            //st.setInt(2, est.getId_usuario());
           // st.setString(3, est.getTipo_estudiante());
            st.setInt(1, est.getId_estudiante());
            st.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            this.Cerrar();
            
        }
        
    }

    public void registrar(com.loyola.ssa.Modelo.Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void modificar(com.loyola.ssa.Modelo.Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(com.loyola.ssa.Modelo.Estudiante est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public com.loyola.ssa.Modelo.Estudiante leerID(com.loyola.ssa.Modelo.Estudiante est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
