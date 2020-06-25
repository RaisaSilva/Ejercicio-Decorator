package decorator.MyDecorator;

public class CuentaBasica implements CuentaBanco {

    private String nombrePropietario;
    private Double monto;

    public CuentaBasica(String nombrePropietario, Double monto) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public Double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public void showData() {
        System.out.println("Nombre del propietario: "+nombrePropietario);
        System.out.println("Monto actual del propietario "+nombrePropietario+": "+monto);


    }


}
