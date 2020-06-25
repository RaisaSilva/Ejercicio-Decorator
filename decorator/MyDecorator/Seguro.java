package decorator.MyDecorator;

public class Seguro extends Decorator {
    private double descontarMonto;

    public Seguro(CuentaBanco componente, double descontarMonto) {
        super(componente);
        this.descontarMonto = descontarMonto;
    }

    public Seguro(CuentaBanco cuentaBasica) {
        super(cuentaBasica);
    }

    public void setMonto(Double monto) {
        super.setMonto(monto);
        System.out.println("Utilizando Tools");
    }

    public void showData(){
        System.out.println("Función seguro");
        System.out.println("Se desconto: "+descontarMonto+"");
        super.setMonto(super.getMonto()-descontarMonto);
        super.showData();
    }

}
