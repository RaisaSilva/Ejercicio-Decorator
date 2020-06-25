package decorator.MyDecorator;

public class Client {

    public static void main (String [] sada){
        CuentaBanco cuentaBasica = new CuentaBasica("Miguel", 2300.0);

        cuentaBasica = new BancaInternet(cuentaBasica,true);
        cuentaBasica = new Promocion(cuentaBasica);
        cuentaBasica = new Seguro(cuentaBasica);

        cuentaBasica.showData();



    }

}
