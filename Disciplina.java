import java.util.ArrayList;


public class Disciplina {

    ArrayList<Aluno> listaDeAlunos;

    public Disciplina(){
        this.listaDeAlunos = new ArrayList<>();

    }

    void insereAluno(Aluno novoAluno){
        listaDeAlunos.add (novoAluno);
    }

    void listarAlunos (){
        System.out.println("\nLista de alunos");

        for ( Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.listar();
        }


    }
    
}
