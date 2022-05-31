public class Mudanca {

    private Conteudo objeto;

    public void setObjeto(Conteudo objeto) {
        this.objeto = objeto;
    }

    public String getObjeto() {
        if (this.objeto == null) {
            throw new NullPointerException("Mudança sem objeto");
        }
        return this.objeto.getConteudo();
    }
}
