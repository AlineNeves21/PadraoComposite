import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MudancaTest {

    @Test
    void deveRetornarObjetoMudanca() {
        Caixa caixa1 = new Caixa("Cozinha");

        Caixa caixa2 = new Caixa("Quarto");
        Itens itens21 = new Itens("Roupas", 25);
        caixa2.addConteudo(itens21);

        Caixa caixa3 = new Caixa("Escritório");
        Itens itens31 = new Itens("Livros darkside", 20);
        Itens itens32 = new Itens("Livros demais editoras", 7);
        caixa3.addConteudo(itens31);
        caixa3.addConteudo(itens32);

        Caixa objeto = new Caixa("Casa");
        objeto.addConteudo(caixa1);
        objeto.addConteudo(caixa2);
        objeto.addConteudo(caixa3);

        Mudanca mudanca = new Mudanca();
        mudanca.setObjeto(objeto);

        assertEquals("Caixa: Casa\n" +
                "Caixa: Cozinha\n" +
                "Caixa: Quarto\n" +
                "Itens: Roupas - quantidade: 25\n" +
                "Caixa: Escritório\n" +
                "Itens: Livros darkside - quantidade: 20\n" +
                "Itens: Livros demais editoras - quantidade: 7\n", mudanca.getObjeto());
    }

    @Test
    void deveRetornarExecacaoMudancaSemObjeto() {
        try {
            Mudanca mudanca = new Mudanca();
            mudanca.getObjeto();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Mudança sem objeto", e.getMessage());
        }
    }
}
