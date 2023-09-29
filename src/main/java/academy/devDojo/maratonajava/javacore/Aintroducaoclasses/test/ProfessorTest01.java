package academy.devDojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devDojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 35;
        professor.sexo = 'M';
        professor.nome = "kaisser";
        System.out.println("Nome: "+professor.nome + " Idade: " + professor.idade + " Sexo " + professor.sexo);


    }
}
