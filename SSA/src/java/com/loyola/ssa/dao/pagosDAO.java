package com.loyola.ssa.dao;

import java.util.ArrayList;
import com.loyola.ssa.entities.pagos;
import java.util.ArrayList;
import java.sql.*;
import com.loyola.ssa.ConexionDB.DBconexion;
public interface pagosDAO {
    public ArrayList<pagos>getAll();
    public pagos getpagos(Integer id_pago);
    public void RegistrarId_pagos(pagos pagos);
    public void EditarId_pagos(pagos pagos);
    public void EliminarId_pagos(pagos pagos);
    public void RegistrarId_estudiante(pagos pagos);
    public void EditarId_estudiante(pagos pagos);
     public void EliminarId_estudiante(pagos pagos);
    public void RegistrarId_carrera(pagos pagos);
    public void EditarId_carrera(pagos pagos);
     public void EliminarId_carrera(pagos pagos);
    public void RegistrarFecha_pago(pagos pagos);
    public void EditarFecha_pago(pagos pagos);
     public void EliminarFecha_pago(pagos pagos);
    public void RegistrarTipo_pago(pagos pagos);
    public void EditarTipo_pago(pagos pagos);
     public void EliminarTipo_pago(pagos pagos);
    public void RegistrarMonto_Pago(pagos pagos);
    public void EditarMonto_Pago(pagos pagos);
     public void EliminarMonto_Pago(pagos pagos);
    public void RegistrarDescripcion_Pago(pagos pagos);
    public void EditarDescripcion_Pago(pagos pagos);
     public void EliminarDescripcion_Pago(pagos pagos);
}
