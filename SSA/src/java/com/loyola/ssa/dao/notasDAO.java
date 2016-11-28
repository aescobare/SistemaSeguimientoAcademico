package com.loyola.ssa.dao;

import java.util.ArrayList;
import com.loyola.ssa.entities.notas;
import java.util.ArrayList;
import java.sql.*;
import com.loyola.ssa.ConexionDB.DBconexion;
public interface notasDAO {
    public ArrayList<notas>getAll();
    public notas getnotas(Integer id_nota);
    public void Registrarid_nota(notas notas);
    public void Registrarid_estudiante(notas notas);
    public void Registrarid_valor(notas notas);
    public void Registrarfecha(notas notas);
    public void Registrarid_docente(notas notas);
    public void Registrarid_usuario(notas notas);
}