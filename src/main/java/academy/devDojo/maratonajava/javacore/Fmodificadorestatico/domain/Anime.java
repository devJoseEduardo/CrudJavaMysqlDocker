package academy.devDojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;

    private static int[] episodios;
    //0- Bloco de inicialização estático é executado  quando a JVM carregar a classe e todos os atributos métodos estaticos tambem são carregados
    //1- Alocando espaco em memória pro objeto
    //2- Cada atributo de classe é criado e inicializado com valores defalt ou o que for passado
    //3-Bloco de inicialização é ececutado
    //4-Construtor é ecrcutado

    static {  // O static fara que o bloco de inicialização seja executado apenaz uma vez// Podemos chamar metodods estaticos dntro de blocos estaticos
        System.out.println("Dentro do bloco de inicialização de instância estatico");
        episodios  = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]=i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização de instância estatico 22222");
    }
    static {
        System.out.println("Dentro do bloco de inicialização de instância estatico 33333333");
    }
    {
        System.out.println("Dentro do bloco de inicialização de instância Não estatico ");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio:Anime.episodios){//Nome da classe ponto atributo estatico

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
