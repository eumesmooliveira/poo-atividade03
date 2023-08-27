import java.time.LocalDate;
import uniderp.*;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno c1 = new Aluno();
        c1.setCodigo(1);
        c1.setNome("Felipe");
        c1.setEndereco("Avenida Ceara, 1550");
        c1.setTelefone("992600582");
        c1.setDataNascimento(LocalDate.of(1990, 8, 26)); // Corrigido mês e ano
        c1.setRg("123456789");
        c1.setCpf("98765432132");
        c1.setDataInsercao(LocalDate.now());

        
    }
}
