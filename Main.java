import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        String nome;
        Disciplina novaDisciplina = new Disciplina();
        Aluno novoAluno = new Aluno();
        Scanner teclado;

        teclado = new Scanner(System.in);

        do {
            System.out.println(" Menu");
            System.out.println(" 0la!");
            System.out.println(" Escolha uma opcao");
            System.out.println(" 1 - Cadastrar aluno");
            System.out.println(" 2 - Listar alunos");
            System.out.println(" 0 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nNome: ");
                    nome = teclado.nextLine();

                    novoAluno = new Aluno(nome);

                    novaDisciplina.insereAluno(novoAluno);

                    break;

                case 2:
                novaDisciplina.listarAlunos();
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                     break;

                default:
                    System.out.println("\nOpcao invalida");
            }

        } while (opcao != 0);
    }
}