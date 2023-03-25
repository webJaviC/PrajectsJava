
package liconex;


public class Moto extends Vehiculo   {
    protected int tieneDosEspejos;

    public Moto(int tieneDosEspejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.tieneDosEspejos = tieneDosEspejos;
    }

    public int isTieneDosEspejos() {
        return tieneDosEspejos;
    }

    public void setTieneDosEspejos(int tieneDosEspejos) {
        this.tieneDosEspejos = tieneDosEspejos;
    }

  
}
