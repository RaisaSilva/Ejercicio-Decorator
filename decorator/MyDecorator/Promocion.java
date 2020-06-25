package decorator.MyDecorator;

import java.util.Random;

public class Promocion extends Decorator {

    public Promocion(CuentaBanco componente) {
        super(componente);
    }

    public int getRandom(){
        int min=1;
        int max=100;
        Random random = new Random();
        int numRand =  random.nextInt(max-min)+min;
        return numRand;
    }

    public void setMonto(Double monto) {

        super.setMonto(monto);
        System.out.println("Utilizando Plugins");
    }
    public void showData() {
        super.showData();
        boolean ganador= getRandom()%2==0;

        if (ganador) {
            super.setMonto(super.getMonto() * 2);
        }
        System.out.println("Ganador de la promoción"+ganador);
        System.out.println("Monto actual:"+super.getMonto());

    }

}
