package padroescomportamentais.visitor;

public class Usuario implements ElementoSeguranca {
    private String login;
    private String nivelAcesso;
    private boolean bloqueado;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String aceitar(VisitorSeguranca visitor) {
        return visitor.exibirUsuario(this);
    }
}