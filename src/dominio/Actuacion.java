package dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Actuacion {
    private LocalDate fecha;
    private ArrayList<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<Participante>();
    };

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void annadirParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Fecha de actuacion: ")
            .append(getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))
            .append('\n');

        for (Participante p : participantes) {
            sb.append(p.toString())
                .append('\n');
        }

        return sb.toString();
    }
}
