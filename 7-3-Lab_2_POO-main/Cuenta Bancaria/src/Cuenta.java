public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private Double interes;
    private Double saldo;
   
   

    public Cuenta(){ }

    
    public Cuenta(String nombreCliente, String numeroCuenta, Double interes, Double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public Double getInteres() {
        return interes;
    }


    public void setInteres(Double interes) {
        this.interes = interes;
    }


    public Double getSaldo() {
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(Double cantidad){
        if(cantidad>0){
            this.saldo += cantidad;
            return true;
        }
        return false;
    }




    

}
