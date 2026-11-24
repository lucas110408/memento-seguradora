package memento;

public class ApoliceEstadoEmAnalise implements ApoliceEstado {

    private ApoliceEstadoEmAnalise() {};
    private static ApoliceEstadoEmAnalise instance = new ApoliceEstadoEmAnalise();
    public static ApoliceEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Análise";
    }

}
