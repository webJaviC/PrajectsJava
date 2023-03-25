
package liconex;

import java.time.LocalDate;


public class ExamenAuto extends Examen {
        private Circuito circuitoAuto;
        private Auto auto;

    public ExamenAuto(Circuito circuitoAuto, Auto auto, String FechaExamen, Persona persona) {
        super(FechaExamen, persona);
        this.circuitoAuto = circuitoAuto;
        this.auto = auto;
    }

    public Circuito getCircuitoAuto() {
        return circuitoAuto;
    }

    public void setCircuitoAuto(Circuito circuitoAuto) {
        this.circuitoAuto = circuitoAuto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
               

    @Override
    protected void circuitoAprobado() {
    }

        @Override
    protected Boolean isExamenAuto() {
        return true;
    }

    @Override
    protected Boolean isExamenMoto() {
        return false;
    }   
    
        
    @Override
    public String toString() {
        return  "Datos de examen de auto según dni: " +  this.persona.dni + "\n" 
                + "Nombre completo del usuario evaluado: " + this.persona.nombreCompleto +  "\n" 
                + "Nombre completo del usuario evaluado: " + this.persona.fechaNacimiento +  "\n"
                
                + "Datos del auto:\n" 
                + "Patente: "  + auto.patente + "\n" 
                + "Marca: "  + auto.marca + "\n" 
                + "Cilindrada: "  + auto.cilindrada + "\n" 
                + "Numero de puertas: "  + auto.cantidadDePuertas + "\n" 

                
                + "Resultados del circuito: \n" 
                + "Duración del circuito en minutos: " + circuitoAuto.duración + "\n" 
                + "Faltas realizadas durante el circuito: " +circuitoAuto.faltasRealizadas + "\n"
              
                + "Está aprobado: " + "\n" + this.examenAprobado 
                 
                ;
    }

}
