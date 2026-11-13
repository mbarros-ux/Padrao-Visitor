package padroescomportamentais.visitor;

public class LogSistema implements ElementoSeguranca {

    private int codigo;
    private String evento;
    private String ipOrigem;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }

    public String aceitar(VisitorSeguranca visitor) {
        return visitor.exibirLog(this);
    }
}