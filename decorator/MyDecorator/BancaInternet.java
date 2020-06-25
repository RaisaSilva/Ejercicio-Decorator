package decorator.MyDecorator;

public class BancaInternet extends Decorator {
    private boolean enable;

    public BancaInternet(CuentaBanco componente, boolean enable) {
        super(componente);
        this.enable = enable;
    }

    public void setMonto(Double monto) {

        super.setMonto(monto);
        System.out.println("Monto por banca de internet: "+monto);
    }

}
