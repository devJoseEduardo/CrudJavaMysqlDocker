package academy.devDojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
private String nome;
private int idade;  // Quando finalizar adiciono esse campo
private Seminario seminario;
   /* public void imprime(){
        System.out.println(this.nome);
        if(seminario!=null){
            System.out.println(seminario.getTitulo());
        }
    }*/

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade=idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
