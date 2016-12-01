
package inscripcion;


public class inscripcion1 {
 
    private String   Id_inscripcion;
    private String  Fecha_inscripcion;
    private String   Id_estudiante;
    private String   Id_carrera;
    private String   Tipo_inscripcion;
   

    public void setId_inscripcion(String Id_inscripcion) {
        this.Id_inscripcion = Id_inscripcion;
    }

    public void setFecha_inscripcion(String Fecha_inscripcion) {
        this.Fecha_inscripcion = Fecha_inscripcion;
    }

    public void setId_estudiante(String Id_estudiante) {
        this.Id_estudiante = Id_estudiante;
    }

    public void setId_carrera(String Id_carrera) {
        this.Id_carrera = Id_carrera;
    }

    public void setTipo_inscripcion(String Tipo_inscripcion) {
        this.Tipo_inscripcion = Tipo_inscripcion;
    }

    public String getId_inscripcion() {
        return Id_inscripcion;
    }
      public String getFecha_inscripcion() {
        return Fecha_inscripcion;
    }

    public String getId_estudiante() {
        return Id_estudiante;
    }

    public String getId_carrera() {
        return Id_carrera;
    }

    public String getTipo_inscripcion() {
        return Tipo_inscripcion;
    }
    
}
