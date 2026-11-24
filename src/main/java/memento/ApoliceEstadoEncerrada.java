package memento;

public class ApoliceEstadoEncerrada implements ApoliceEstado {

    private ApoliceEstadoEncerrada() {};
    private static ApoliceEstadoEncerrada instance = new ApoliceEstadoEncerrada();
    public static ApoliceEstadoEncerrada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Encerrada";
    }

}
