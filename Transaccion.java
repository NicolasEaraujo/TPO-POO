package TPo;

import java.time.LocalDate;

public class Transaccion {
    public LocalDate fecha;
    public String descripcion;
    public Double monto;
    public String tipo;
    public String categoria;
    public String metodoDePago;
    public String nota;

    public Transaccion(LocalDate fecha, Double monto, String tipo, String categoria, String metodoDePago, String nota) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
        this.metodoDePago = metodoDePago;
        this.nota = nota;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        if (monto>=0){
            this.monto = monto;
        }else{
            System.out.println("Monto invalido");
        }
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getMetodoDePago() {
        return metodoDePago;
    }
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    public String toString() {
        return "fecha:" + fecha + ", descripción: " + descripcion + ", monto: " + monto + ", tipo: " + tipo +
                ", categoria: " + categoria + ", metodoDePago: " + metodoDePago + ", nota: " + nota;


    }
}
