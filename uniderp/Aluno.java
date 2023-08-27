package uniderp;

import java.time.LocalDate;

public class Aluno extends BasePessoa{

    public Aluno(){}

    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
    String cpf, LocalDate dataInsercao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    }
    
}
