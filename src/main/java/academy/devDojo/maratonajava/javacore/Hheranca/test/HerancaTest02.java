package academy.devDojo.maratonajava.javacore.Hheranca.test;

import academy.devDojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0- Bloco de inicialização estático da Super classe é executado  quando a JVM carregar a classe pai
    //1- Bloco de inicialização estático da Sub classe é executado  quando a JVM carregar a classe filha
    //2- Alocado espaco em memória pro objeto da SuperClasse
    //3- Cada atributo de Superclasse é criado e inicializado com valores defalt ou o que for passado
    //4-Bloco de inicialização da Superclasse é ececutado na ordem em que aparece
    //5-Construtor é ecrcutado da Superclasse
    //6- Alocado espaco em memória pro objeto da SubClasse
    //7- Cada atributo de Subclasse é criado e inicializado com valores defalt ou o que for passado
    //8-Bloco de inicialização da Subclasse é ececutado na ordem em que aparece
    //9-Construtor é ecrcutado da Subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João vinicios");
    }
}
