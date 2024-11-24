package dominio.musicos;

import dominio.Participante;

public abstract class Musico extends Participante {
    private String instrumento;

    public Musico(String nombre, String instrumento) {
        super(nombre, instrumento);
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return this.instrumento;
    }
}
