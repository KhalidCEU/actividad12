package dominio;

import java.util.ArrayList;

public class BandaMusica {
    private String nombre;
    private ArrayList<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<Actuacion>();
    }

    public String getName(String nombre) {
        return this.nombre;
    }
    public void annadirActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName(nombre).toUpperCase())
            .append("\n\n");

        for (Actuacion a : actuaciones) {
            sb.append(a.toString())
                .append('\n');
        }
        return sb.toString();
    }
}
