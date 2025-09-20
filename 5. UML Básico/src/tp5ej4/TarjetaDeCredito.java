//PROGRAMACION II
//ALUMNO:LEPKA AGUSTIN
//COMISION: 13
package tp5ej4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; //Asociacion bidireccional
    private Banco banco; //Agregacion

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    //Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    //Getter que devuelve todos los datos de la tarjeta
    public String getDatosTarjeta() {
        return "Número: " + numero + "\n" +
               "Fecha de Vencimiento: " + fechaVencimiento + "\n" +
               "Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")\n" +
               "Banco: " + banco.getNombre() + " - CUIT: " + banco.getCuit();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito numero:" + numero + ", fechaVencimiento:" + fechaVencimiento + ", banco:" + banco;
    }
}
