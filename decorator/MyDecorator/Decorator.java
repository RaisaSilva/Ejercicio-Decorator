package decorator.MyDecorator;

public class Decorator implements CuentaBanco {

    private CuentaBanco componente;

    public Decorator (CuentaBanco componente){
        this.componente=componente;
    }

    @Override
    public void setMonto(Double monto) {
        this.componente.setMonto(monto);
    }

    @Override
    public void showData() {
        componente.showData();
    }

    @Override
    public Double getMonto() {
        return null;
    }
}
