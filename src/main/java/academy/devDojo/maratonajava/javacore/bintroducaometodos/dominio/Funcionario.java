package academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio;


public class Funcionario {
    private String nome;
    private int idade;

    private double[] salarios;
    private double media;
    private double soma;

    //public void somaVarArgs(double...salarios){


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null)
            return;

            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        imprimeMediaESoma();

    }

    public void imprimeMediaESoma() {
        if(salarios == null) {
            return;
        }
          for (double num : salarios)
              soma+= num;
          media = soma / salarios.length;

        System.out.println(soma + "   Soma dos saláios");
        System.out.println(media + "   Média  dos salários");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }





   // wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public double getSoma() {
        return soma;
    }
}
