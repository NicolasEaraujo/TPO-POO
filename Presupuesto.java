package TPo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Presupuesto {
    public LocalDate periodoInicio;
    public LocalDate periodoFinal;
    public Map<String, Double> limites;

    public Presupuesto(LocalDate periodoInicio, LocalDate periodoFinal) {
        this.periodoInicio = periodoInicio;
        this.periodoFinal = periodoFinal;
        this.limites = new HashMap<>();
    }
    public LocalDate getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(LocalDate periodoFinal) {
        this.periodoFinal = periodoFinal;
    }
    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }
    public void setPeriodoInicio(LocalDate periodoInicio) {
        this.periodoInicio = periodoInicio;
    }
    public Map<String, Double> getLimites() {
        return limites;
    }
    public void setLimites(Map<String, Double> limites) {
        this.limites = limites;
    }
    public void eliminarLimites(String categoria){
        limites.remove(categoria);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

