package padroescomportamentais.visitor;

public class Arquivo implements ElementoSeguranca {
    private String nome;
    private String hash;
    private boolean criptografado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isCriptografado() {
        return criptografado;
    }

    public void setCriptografado(boolean criptografado) {
        this.criptografado = criptografado;
    }

    public String aceitar(VisitorSeguranca visitor) {
        return visitor.exibirArquivo(this);
    }
}
