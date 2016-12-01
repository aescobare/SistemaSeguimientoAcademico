package com.loyola.ssa.impDAO;

import com.loyola.ssa.DAO.AdministradorDAO;
import com.loyola.ssa.entities.Administrador;
import com.loyola.ssa.ConexionDB.DBconexion; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author CARMEN
 */
public class AdministradorDAOimp implements AdministradorDAO{
    
 
    @Override
 
    public List<Administrador>listarAdministrador()throws SQLException{
    List<Administrador>administradores= new ArrayList<>();
    DBconexion dbcon =new DBconexion();
    Connection con=null;
    Statement statement =null;
    String selectTableSQL="SELECT *FROM administrador";
    
    try{
     con=dbcon.getConnection(); 
     statement=con.createStatement();
     System.out.println(selectTableSQL);
     ResultSet rs=statement.executeQuery(selectTableSQL);
     while(rs.next()){
                 Integer id_Admin=rs.getInt("id_admin");
                 Integer id_Usuario=rs.getInt("id_usuario");
                 Integer ci_A=rs.getInt("ci");
                 String nombre_A=rs.getString("nombre");
                 String apellidos_A=rs.getString("apellidos");
                 String cargo_A=rs.getString("cargo");
                 Administrador administrador=new Administrador
                (id_Admin,id_Usuario, ci_A, nombre_A, apellidos_A,cargo_A);
                administradores.add(administrador);
     }
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        if(statement!=null)
        {
            System.out.println("error de conexion");
        }
        if(con!=null)
        {
            con.close();
        }
    }
    
    return administradores;
}
    
    
    
    @Override
    public void insertar_administrador(Administrador administrador)throws SQLException {
            
            DBconexion dbcon =new DBconexion();
            Connection con=null;
            PreparedStatement preparedStatement =null;
            String insertTableSQL="INSERT INTO administrador"+" (ci,nombre,apellidos,cargo) VALUES"
                    +"(?,?,?,?)";
                
            
            try 
            {
                con=dbcon.getConnection();
                preparedStatement =con.prepareStatement(insertTableSQL);
                preparedStatement.setInt(1, administrador.getCi_A()); 
                preparedStatement.setString(2, administrador.getNombre_A()); 
                preparedStatement.setString(3, administrador.getApellidos_A()); 
                preparedStatement.setString(4, administrador.getCargo_A()); 
                
                preparedStatement.executeUpdate();
            }catch(SQLException e)
            {
               e.printStackTrace(); 
            }
            finally
            {
                if(preparedStatement!=null)
                {
                    preparedStatement.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            }
    }


    @Override
    public void actualizar_administrador(Administrador administrador)throws SQLException {
            DBconexion dbcon =new DBconexion();
            Connection con=null;
            PreparedStatement preparedStatement =null;
            String insertTableSQL="UPDATE administrador SET"+" (ci=?,nombre=?,apellidos=?,cargo=?)WHERE id_admin=?";
            
                try 
            {
                con=dbcon.getConnection();
                preparedStatement =con.prepareStatement(insertTableSQL);
                preparedStatement.setInt(1, administrador.getCi_A()); 
                preparedStatement.setString(2, administrador.getNombre_A()); 
                preparedStatement.setString(3, administrador.getApellidos_A()); 
                preparedStatement.setString(4, administrador.getCargo_A()); 
                
                preparedStatement.executeUpdate();
            }catch(SQLException e)
            {
               e.printStackTrace(); 
            }
            finally
            {
                if(preparedStatement!=null)
                {
                    preparedStatement.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            }
    
    
    }
    
    
    
     @Override
    public void eliminar_administrador(Administrador administrador) throws SQLException {
    DBconexion dbcon =new DBconexion();
            Connection con=null;
            PreparedStatement preparedStatement =null;
            String insertTableSQL="DELETE FROM administrador WHERE id_admin=?";
            
                try 
            {
                con=dbcon.getConnection();
                preparedStatement =con.prepareStatement(insertTableSQL);
                preparedStatement.setInt(1, administrador.getId_Admin()); 
                
                preparedStatement.executeUpdate();
            }catch(SQLException e)
            {
               e.printStackTrace(); 
            }
            finally
            {
                if(preparedStatement!=null)
                {
                    preparedStatement.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            }
    
    
    }
    
    
    
        
    }
/*
    @Override
    public void actualizar_administrador(Administrador administrador) {
         Connection con=null;
            DBconexion ba =new DBconexion();
            con=ba.conectar();
            if(con!=null){
                
            
            try 
            {
                PreparedStatement st=con.prepareStatement("UPDATE administrador set id_usuario =?,ci =?,nombre =?,apellidos =? where id_administrador =?;");
                //st.setInt(1, administrador.getId_admin());
                st.setInt(1, administrador.getId_usuario());
                st.setInt(2, administrador.getCi());
                st.setString(3, "");
                st.setString(4, "");
                st.setInt(5, administrador.getId_admin());
                int rowsUpdated=st.executeUpdate();
                if(rowsUpdated>0){
                    System.out.println("Administrador Actualizado");
                }
                
                st.executeUpdate();
                st.close();
                con.close();}
            catch (SQLException e){
             e.printStackTrace();
            }
            }
    }

    @Override
    public void eliminar_administrador(Administrador administrador) {
               Connection con=null;
            DBconexion ba =new DBconexion();
            con=ba.conectar();
            if(con!=null){
                
            
            try 
            {
                PreparedStatement st=
                        con.prepareStatement("DELETE FROM administrador WHERE id_admin=?;");
                st.setInt(1, administrador.getId_admin());
                st.execute();
                st.close();
                con.close();}
            catch (SQLException e){
             e.printStackTrace();
            }
            }
                
     
    }*//////

    
   /* public ArrayList leer(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    //@Override
 /*
    public ArrayList <Administrador> getListar(Administrador admi){
    //Administrador admi; 
            Connection con=null;
            DBconexion ba =new DBconexion();
            con=ba.conectar();
            ArrayList<Administrador>listaAdministradores=new ArrayList<Administrador>();
            if(con!=null){
                
            
            try 
            {
                PreparedStatement st=con.prepareStatement("SELECT *FROM administrador;");
                ResultSet rs=st.executeQuery();
                while(rs.next()){
                 //admi=new Administrador();
                 admi.setId_admin(rs.getInt("id_admin"));
                 admi.setId_usuario(rs.getInt("id_admin"));
                 admi.setCi(rs.getInt("ci"));
                 admi.setNombre(rs.getString("nombre"));
                 admi.setApellidos(rs.getString("apellidos"));
                }
                st.close();
                con.close();}
            catch (SQLException e){
             e.printStackTrace();
            }
            }
            return listaAdministradores;
            }
            
            /*try {   
        PreparedStatement mostrar = cnn.getCnn().prepareStatement("SELECT * FROM administrador");   
        ResultSet res = mostrar.executeQuery();   
        while(res.next()){    
            Administrador administrador= new Administrador();    
            administrador.setId_admin(Integer.parseInt(res.getString("id_admin")));    
            administrador.setId_usuario(Integer.parseInt(res.getString("id_usuario")));    
            administrador.setCi(Integer.parseInt(res.getString("ci")));    
            administrador.setNombre(res.getString("nombre"));  
            administrador.setApellidos(res.getString("apellidos"));   
           
            miAdministrador.add(administrador);         
        } 
        res.close();         
        mostrar.close();          
        cnn.desconectar();     
    } catch (Exception e) 
    {    Logger.getLogger(AdministradorDAOimp.class.getName()).log(Level.SEVERE, null, ex);
        return miAdministrador; }

*/   

 
   
           


