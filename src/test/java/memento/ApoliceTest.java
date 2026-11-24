package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApoliceTest {

    @Test
    void deveArmazenarEstados() {
        Apolice apolice = new Apolice();
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertEquals(2, apolice.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Apolice apolice = new Apolice();
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        apolice.restauraEstado(0);
        assertEquals(ApoliceEstadoEmAnalise.getInstance(), apolice.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Apolice apolice = new Apolice();
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        apolice.restauraEstado(2);
        assertEquals(ApoliceEstadoSuspensa.getInstance(), apolice.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Apolice apolice = new Apolice();
            apolice.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
