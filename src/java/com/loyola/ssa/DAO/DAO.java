
package com.loyola.ssa.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {
    
    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public void Conectar() throws Exception{
        try{
         Class.forName("com.mysql.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","gualberto");
         
        }catch(ClassNotFoundException | SQLException e){
            throw e;
                    
        }
           
    }
    
    public void Cerrar() throws Exception{
        try{
        if (cn!=null){
                if(cn.isClosed() ==false){
                    cn.close();
                }
        }
         } catch(SQLException e){
          throw e;  
        } 
    }
}
