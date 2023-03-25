
package liconex;

import java.time.LocalDate;


public class ExamenMoto extends  Examen {
    private Circuito primerCircuito;
    private Circuito segundoCircuito;
    private Moto moto;   

    public ExamenMoto(Circuito primerCircuito, Circuito segundoCircuito, Moto moto, String fechaExamen, Persona persona) {
        super(fechaExamen, persona);
        this.primerCircuito = primerCircuito;
        this.segundoCircuito = segundoCircuito;
        this.moto = moto;
    }
    

    public Circuito getPrimerCircuito() {
        return primerCircuito;
    }

    public void setPrimerCircuito(Circuito primerCircuito) {
        this.primerCircuito = primerCircuito;
    }

    public Circuito getSegundoCircuito() {
        return segundoCircuito;
    }

    public void setSegundoCircuito(Circuito segundoCircuito) {
        this.segundoCircuito = segundoCircuito;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
    
    @Override
    public String toString() {
        return  "Datos de examen de moto según dni: " +  this.persona.dni + "\n" 
                + "Nombre completo del usuario evaluado: " + this.persona.nombreCompleto +  "\n" 
                + "Fecha del examen: " + this.fechaExamen +  "\n" 
                
                + "Datos del moto \n" 
                + "Patente: "  + moto.patente + "\n" 
                + "marca: "  + moto.marca + "\n" 
                + "Cilindrada: "  + moto.cilindrada + "\n" 
                + "Posee los dos espejos: "  + moto.tieneDosEspejos + "\n" 
             
                + "Resultados del primer circuito \n" 
                + "Duración del circuito en minutos: " + primerCircuito.duración + "minutos" + "\n" 
                + "Faltas realizadas durante el circuito: " +primerCircuito.faltasRealizadas + "\n"
                
                + "Resultados del segundo circuito\n" 
                + "Duración del circuito en minutos: " + segundoCircuito.duración +  "minutos" + "\n" 
                + "Faltas realizadas durante el circuito: " +segundoCircuito.faltasRealizadas + "\n"
              
                + "Está aprobado: " + "\n" + this.examenAprobado 
                ;
    }

    

    @Override
    protected void circuitoAprobado() {
        int faltasTotales = primerCircuito.faltasRealizadas + segundoCircuito.faltasRealizadas ;
        int tiempoPromedio = primerCircuito.duración + segundoCircuito.duración ;

        this.examenAprobado = faltasTotales < 5 && tiempoPromedio < 20;
    }

    @Override
    protected Boolean isExamenAuto() {
        return false;
    }

    @Override
    protected Boolean isExamenMoto() {
        return true;
    }

}
