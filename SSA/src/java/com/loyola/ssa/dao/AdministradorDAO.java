package com.loyola.ssa.DAO;
import com.loyola.ssa.entities.Administrador;
import java.sql.SQLException;
import java.util.List;


public interface  AdministradorDAO {
    List<Administrador>listarAdministrador()throws SQLException;
    void insertar_administrador(Administrador administrador)throws SQLException;
    void actualizar_administrador(Administrador administrador)throws SQLException;
    void eliminar_administrador(Administrador administrador)throws SQLException;
}
