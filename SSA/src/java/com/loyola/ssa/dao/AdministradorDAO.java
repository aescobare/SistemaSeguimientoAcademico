package com.loyola.ssa.dao;

import java.util.ArrayList;
import com.loyola.ssa.entities.Administrador;
import java.util.ArrayList;
import java.sql.*;
import com.loyola.ssa.ConexionDB.DBconexion;
public interface AdministradorDAO {
    public ArrayList<Administrador>getAll();
    public Administrador getAdministrador(Integer id_administrador);
    public void RegistrarID_admin(Administrador administrador);
    public void RegistrarFecha_creacion(Administrador administrador);
    
    
    
    /**public void RegistrarID_admin(Administrador administrador){
    DBconexion conexion=new DBconexion();
    try{
    Statement estatuto=conexion.getConnection().createStatement();
    estatuto.executeUpdate("INSERT INTO administrador VALUES ('"+administrador.getId_administrador()+"','"+administrador.getFecha_creacion()+"')");
    JOptionPane.showMessageDialog(null,"se registro correctamente","Informacio",JOptionPane.INFORMATION_MESSAGE);
    estatuto.close();
    conexion.desconectar();}
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"no se registro");
    }
    }*/
    
}
