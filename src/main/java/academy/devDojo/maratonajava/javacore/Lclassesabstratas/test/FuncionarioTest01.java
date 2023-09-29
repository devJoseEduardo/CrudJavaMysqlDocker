package academy.devDojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devDojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devDojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devDojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("henry", 6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("José Eduardo", 27000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
