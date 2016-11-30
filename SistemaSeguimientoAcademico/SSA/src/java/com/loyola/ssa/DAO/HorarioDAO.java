
package com.loyola.ssa.DAO;

import java.util.ArrayList;
import com.loyola.ssa.entities.horario;
import java.util.ArrayList;
import java.sql.*;
import com.loyola.ssa.ConexionDB.DBconexion;
public interface HorarioDAO {
    
    public ArrayList<horario>getAll();
    public horario gethorario(Integer Id_horario);
    public void RegistrarId_horario(horario horario);
    public void EditarId_horario(horario horario);
    public void EliminarId_horario(horario horario);
    public void Registrarhorario_inicio(horario horario);
    public void Editarhorario_inicio(horario horario);
    public void Eliminarhorario_inicio(horario horario);
    public void Registrarhora_fin(horario horario);
    public void Editarhora_fin(horario horario);
    public void Eliminarhora_fin(horario horario);
    public void Registrarturno(horario horario);
    public void Editarturno(horario horario);
    public void Elimarturno(horario horario);
    public void Registrardia(horario horario);
    public void Editardia(horario horario);
    public void Eliminardia(horario horario);
}
