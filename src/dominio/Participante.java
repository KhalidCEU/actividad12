package dominio;

public abstract class Participante {
    private String nombre;
    private String rol;

    public Participante(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRol() {
        return this.rol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getNombre() + ", " + getRol());

        return sb.toString();
    }
}
