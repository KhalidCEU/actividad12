package dominio.musicos;

public class MusicoSocio extends Musico {
    private int idSocio;

    public MusicoSocio(String nombre, String instrumento, int idSocio) {
        super(nombre, instrumento);
        this.idSocio = idSocio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getNombre() + ", ")
            .append(getRol() + ", ")
            .append(getInstrumento() + ", ")
            .append("numero de socio: " + this.idSocio);

        return sb.toString();
    }
}
