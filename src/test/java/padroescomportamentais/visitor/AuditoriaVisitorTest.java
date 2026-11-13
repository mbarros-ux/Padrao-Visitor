package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuditoriaVisitorTest {

    @Test
    void deveExibirArquivo() {
        Arquivo arquivo = new Arquivo();
        arquivo.setNome("config.sys");
        arquivo.setHash("a1b2c3d4");

        AuditoriaVisitor visitor = new AuditoriaVisitor();

        assertEquals("Arquivo{nome='config.sys', hash='a1b2c3d4'}", visitor.exibirArquivo(arquivo));
    }

    @Test
    void deveExibirUsuario() {
        Usuario usuario = new Usuario();
        usuario.setLogin("admin");
        usuario.setNivelAcesso("ROOT");
        usuario.setBloqueado(false);

        AuditoriaVisitor visitor = new AuditoriaVisitor();

        assertEquals("Usuario{login='admin', nivelAcesso='ROOT', bloqueado=false}", visitor.exibirUsuario(usuario));
    }

    @Test
    void deveExibirLog() {
        LogSistema log = new LogSistema();
        log.setCodigo(99);
        log.setEvento("TENTATIVA_LOGIN");
        log.setIpOrigem("192.168.1.50");

        AuditoriaVisitor visitor = new AuditoriaVisitor();

        assertEquals("LogSistema{codigo=99, evento='TENTATIVA_LOGIN', ipOrigem='192.168.1.50'}", visitor.exibirLog(log));
    }
}