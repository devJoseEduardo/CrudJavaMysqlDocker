package academy.devDojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;

    private int[] episodios;
    //1- Alocando espaco em memória pro objeto
    //2- Cada atributo de classe é criado e inicializado com valores defalt ou o que for passado
    //3-Bloco de inicialização é ececutado
    //4-Construtor é ecrcutado

    {  // Sera executado toda vez que você criar uma instancia desse objeto// É executado antes do contrutor//pode estar em qualquer lugar do código, mas é geralmente usado aqui
        System.out.println("Dentro do bloco de inicialização de instância");
        episodios  = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]=i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio:this.episodios){

            System.out.print(episodio +" ");

        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
