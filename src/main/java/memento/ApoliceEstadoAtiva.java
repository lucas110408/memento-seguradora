package memento;

public class ApoliceEstadoAtiva implements ApoliceEstado {

    private ApoliceEstadoAtiva() {};
    private static ApoliceEstadoAtiva instance = new ApoliceEstadoAtiva();
    public static ApoliceEstadoAtiva getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ativa";
    }

}
