package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //int[] salarios = {3505,6200,9100};
        funcionario.setNome("DUDUZITO");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{12000,5500,3700});


          //  System.out.println(soma+"soma dos salarios");
           // System.out.println(div+"Media dos salários ");


        funcionario.imprime();
        System.out.println("Media"+funcionario.getMedia());

       // funcionario.somaVarArgs(funcionario.salarios);
       // funcionario.imprimeMediaESoma();

    }


}
