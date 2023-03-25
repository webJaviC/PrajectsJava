
package liconex;


public class Auto extends Vehiculo {
    protected int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String Patente, String Marca, int Cilindrada) {
        super(Patente, Marca, Cilindrada);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
   
}
