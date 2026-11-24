package memento;

public class ApoliceEstadoRecusada implements ApoliceEstado {

    private ApoliceEstadoRecusada() {};
    private static ApoliceEstadoRecusada instance = new ApoliceEstadoRecusada();
    public static ApoliceEstadoRecusada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Recusada";
    }

}
