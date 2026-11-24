package memento;

public class ApoliceEstadoCancelada implements ApoliceEstado {

    private ApoliceEstadoCancelada() {};
    private static ApoliceEstadoCancelada instance = new ApoliceEstadoCancelada();
    public static ApoliceEstadoCancelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelada";
    }

}
