package padroescomportamentais.visitor;

public interface VisitorSeguranca {
    String exibirArquivo(Arquivo arquivo);
    String exibirUsuario(Usuario usuario);
    String exibirLog(LogSistema log);
}