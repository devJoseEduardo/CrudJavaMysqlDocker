package academy.devDojo.maratonajava.javacore.Dconstrutores.test;


import academy.devDojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime=new Anime("EDU JAVA","ação","tv",323,"Production IG");
       // Anime anime2=new Anime();
        //anime.init("Pokemonzito","M","tv",1002);
       // anime.init("pokemonzito 2","Ação","tv",1002);
        anime.imprime();
       // anime2.imprime();

    }
}
