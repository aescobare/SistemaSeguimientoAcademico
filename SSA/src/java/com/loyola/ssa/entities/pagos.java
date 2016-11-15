
package com.loyola.ssa.entities;

import java.util.Date;
 
public class pagos {
    private String   id_pago;
    private String   cod_estudiante;
    private String   id_carrera;
    private Date   fecha_pago;
    private String   tipo_pago;
    private float   monto_pago;
    private String   descripcion_pago;

    public void setId_pago(String id_pago) {
        this.id_pago = id_pago;
    }

    public void setCod_estudiante(String cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

    public void setId_carrera(String id_carrera) {
        this.id_carrera = id_carrera;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public void setMonto_pago(float monto_pago) {
        this.monto_pago = monto_pago;
    }

    public void setDescripcion_pago(String descripcion_pago) {
        this.descripcion_pago = descripcion_pago;
    }

    public String getId_pago() {
        return id_pago;
    }

    public String getCod_estudiante() {
        return cod_estudiante;
    }

    public String getId_carrera() {
        return id_carrera;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public float getMonto_pago() {
        return monto_pago;
    }

    public String getDescripcion_pago() {
        return descripcion_pago;
    }
    
}
