package com.loyola.ssa.ConexionDB;
import java.sql.*;
public class DBconexion {

    //////parametros de conexion con mysql/////
    static String db="dbadministrador";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+db;
    Connection connection=null;
    
    
   /**constructor de DBconexion*/
    public DBconexion() {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           connection=DriverManager.getConnection(url,login,password);
           if(connection!=null)
           {
               System.out.println("conexion a la base de datos "+db+"OK");
           }
        }
        catch(SQLException e){
        System.out.println(e);}
        catch(ClassNotFoundException e)
        {System.out.println(e);}
        catch(Exception e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
    return connection;}
public void desconectar(){
connection=null;}    
}
