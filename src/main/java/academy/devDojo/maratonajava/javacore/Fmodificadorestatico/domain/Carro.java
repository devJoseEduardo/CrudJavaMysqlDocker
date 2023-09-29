package academy.devDojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite=250;//O modificadodr de acesso vai fazer o atributo pertenccer a classe
                                                   //E todos objetos vão cmpartilhar o emo valor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){// O metodo imprime é um metodod nâo estatico e consequentemente tem que ter um espaco em memÓRIa alocado para elee
        System.out.println("---------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);//Aqui podemos usar this, porque se o metodo imprime esta sendo chamado é certeza absoluta que a  insstancia tera que ter sido feita, até porque não faz sentido  pedir pra imprimir um valor que não foi instanciado
        System.out.println("Velocidade Limite: "+Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){//NO  metodo estatico não usamos this porque existe a possibilidade de não termos o objeto criado em meemòria
    Carro.velocidadeLimite=velocidadeLimite;                       // O this faz referência a instância,como existe a possibilidade de ela não existir, os temos um erro , se utilizada
    }//Não usamos this, porqeu não temos certeza de que ele terá sido instanciado
    // Você não pode acessar nehuma variável não estatica dentro do metodo estatico,
    // Até porque os objetos sempre vâo ser criados depois dos valores estaticos serem nivializados,
    // porém o contrário é possìvel
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;//O java sempre vai dar priorisade para a variável de menor ercorpo
                                //Com o escorpo mais próximo da que você esta utilizando
                                // No metodo statc acima o objeto recebeo um valor digitado pelo usar
                                // por meio do argumento que foi passado ao chamar setVelocidadeLimite
    }                          // Sendo assim, não preciso colocar Carro.velocidadeLimite
    //                         Isso tmb porque não existe nenhuma  variavel com escorpo local,  sobescrevendo a variávlel VelicidadeLimite
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelicidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelicidadeLimite(double velicidadeLimite) {
        this.velocidadeLimite = velicidadeLimite;
    }
}
