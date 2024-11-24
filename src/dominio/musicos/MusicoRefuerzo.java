package dominio.musicos;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    private BigDecimal cantidadDinero;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidadDinero) {
        super(nombre, instrumento);
        this.cantidadDinero = cantidadDinero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
            .append(", ")
            .append(String.format("%.2f €", this.cantidadDinero));

        return sb.toString();
    }
}
