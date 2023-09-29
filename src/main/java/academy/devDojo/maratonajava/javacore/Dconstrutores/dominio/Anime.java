package academy.devDojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private String studio;

    public  Anime(String nome,String genero,String tipo,int episodios){  //Não se pode mais criar um objeto sem passar um nome// OBS:O construtor é executado antes que qualquer método que tem na classe // COnstrutor não tem void
        this(); //a chamada de outro consultor tem que ser feita na primeira linha apenas
        this.nome= nome;
        this.tipo= tipo;
        this.episodios= episodios;
        this.genero= genero;
       // init(nome,genero,tipo,episodios);

    }
    public  Anime(String nome,String genero,String tipo,int episodios,String studio){
       // this(nome,tipo,episodios,genero);
          this(nome,genero,tipo,episodios);
        this.nome= nome;
        this.tipo= tipo;
        this.episodios= episodios;
        this.genero= genero;
        this.studio=studio;
        // init(nome,genero,tipo,episodios);

    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.studio);

    }
    //public void setGenero(String genero){
      //  this.genero=genero;
   // }
   // public String getGenero(){
    //    return this.genero;
    //}
   // public void setNome(String nome){   ////////////////////////////////////////////////////
     //   this.nome= nome;
    //}
    //public String getNome(){
     //   return this.nome;
    //}
  //  public void setTipo(String tipo){
   //     this.tipo = tipo;
    }

    //public String getTipo(){
     //   return this.tipo;
  //  }

   // public void setEpisodios(int episodios){
        //this.episodios = episodios;
   // }
    //public int getEpisodios(){
   //     return this.episodios;
   // }

