package TPo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GestorDatos {
    public List<Transaccion> transacciones;
    public List<Categoria> categorias;
    public Presupuesto presupuestoActual;

    public GestorDatos() {
        this.transacciones = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.presupuestoActual = null;
    }
    public void agregarTransaccion(Transaccion transaccion) {
        this.transacciones.add(transaccion);
    }
    public boolean eliminarTransaccion(Transaccion transaccion) {
        return this.transacciones.remove(transaccion);
    }
    public List<Transaccion> listarTransacciones(){
        return new ArrayList<>(this.transacciones);
    }
    public List<Transaccion> filtrarTransaccionesPorFecha(LocalDate inicio, LocalDate fin){
        return this.transacciones.stream().filter (t -> !t.getFecha().isBefore(inicio)
                && t.getFecha().isAfter(fin)).collect(Collectors.toList());

    }
    public List<Transaccion> filtrarTransaccionesPorCategoria(String categoria){
        return this.transacciones.stream().filter (t -> t.getCategoria().equalsIgnoreCase(categoria)).collect(Collectors.toList());
    }
    public double calcularTotalIngresos(LocalDate inicio, LocalDate fin){

    }
}
