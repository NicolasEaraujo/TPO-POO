package TPo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    public LocalDate fechaEvento;
    public String descripcionEvento;
    public LocalTime horaEvento;

    public EventoPersonal(LocalDate fechaEvento, String descripcionEvento, LocalTime horaEvento) {
        this.fechaEvento = fechaEvento;
        this.descripcionEvento = descripcionEvento;
        this.horaEvento = horaEvento;
    }
    public LocalTime getHoraEvento() {
        return horaEvento;
    }
    public void setHoraEvento(LocalTime horaEvento) {
        this.horaEvento = horaEvento;
    }
    public LocalDate getFechaEvento() {
        return fechaEvento;
    }
    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
    public String getDescripcionEvento() {
        return descripcionEvento;
    }
    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

}
