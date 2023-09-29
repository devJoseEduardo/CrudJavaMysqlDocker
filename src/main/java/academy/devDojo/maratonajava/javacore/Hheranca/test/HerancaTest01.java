package academy.devDojo.maratonajava.javacore.Hheranca.test;

import academy.devDojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devDojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devDojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Eduardo Oliveira");

        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Fabricio fraga");
        funcionario.setCpf("245345453");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(27000);
        System.out.println("----------------");
        funcionario.imprime();





    }
}
