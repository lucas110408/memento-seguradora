package memento;

import java.util.ArrayList;
import java.util.List;

public class Apolice {

    private ApoliceEstado estado;
    private List<ApoliceEstado> memento = new ArrayList<ApoliceEstado>();

    public ApoliceEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ApoliceEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ApoliceEstado> getEstados() {
        return this.memento;
    }
}
