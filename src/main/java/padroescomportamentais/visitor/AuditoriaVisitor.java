package padroescomportamentais.visitor;

public class AuditoriaVisitor implements VisitorSeguranca {

    public String exibirArquivo(Arquivo arquivo) {
        return "Arquivo{" +
                "nome='" + arquivo.getNome() + '\'' +
                ", hash='" + arquivo.getHash() + '\'' +
                '}';
    }

    public String exibirUsuario(Usuario usuario) {
        return "Usuario{" +
                "login='" + usuario.getLogin() + '\'' +
                ", nivelAcesso='" + usuario.getNivelAcesso() + '\'' +
                ", bloqueado=" + usuario.isBloqueado() +
                '}';
    }

    public String exibirLog(LogSistema log) {
        return "LogSistema{" +
                "codigo=" + log.getCodigo() +
                ", evento='" + log.getEvento() + '\'' +
                ", ipOrigem='" + log.getIpOrigem() + '\'' +
                '}';
    }
}