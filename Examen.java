
package liconex;

import java.time.LocalDate;

public abstract class Examen {
    protected String  fechaExamen;
    protected Persona persona;
    protected Vehiculo vehiculo;
    protected Boolean examenAprobado;
    
   
    public Examen(String fechaExamen, Persona persona) {
        this.fechaExamen = fechaExamen;
        this.persona = persona;
    }

    public String getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(String fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Boolean getExamenAprobado() {
        return examenAprobado;
    }

    public void setExamenAprobado(Boolean examenAprobado) {
        this.examenAprobado = examenAprobado;
    }
    
    
    protected abstract void circuitoAprobado();
    protected abstract Boolean isExamenAuto();
    protected abstract Boolean isExamenMoto();

}
