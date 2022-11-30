public class Aluno {
    String nome;

    public Aluno (){

    }

    public Aluno (String nome){
      setNome(nome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome ;
    }
    
    void listar(){
        System.out.println("\nNome: " + this.nome);
    }
    
}
