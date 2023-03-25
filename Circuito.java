
package liconex;


public class Circuito {
    protected int duración;
    protected int faltasRealizadas;

    public Circuito(int duración, int faltasRealizadas) {
        this.duración = duración;
        this.faltasRealizadas = faltasRealizadas;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public int getFaltasRealizadas() {
        return faltasRealizadas;
    }

    public void setFaltasRealizadas(int faltasRealizadas) {
        this.faltasRealizadas = faltasRealizadas;
    }

 
  
}
