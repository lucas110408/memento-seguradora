package memento;

public class ApoliceEstadoSuspensa implements ApoliceEstado {

    private ApoliceEstadoSuspensa() {};
    private static ApoliceEstadoSuspensa instance = new ApoliceEstadoSuspensa();
    public static ApoliceEstadoSuspensa getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Suspensa";
    }

}
