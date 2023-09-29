package academy.devDojo.maratonajava.javacore.Gassociacao.test;

import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {

    public static void main(String[] args) {
        Local local=new Local("Manoel Rosendo de Lima");
        Aluno aluno= new Aluno("Ricardo",19);
        Aluno aluno2= new Aluno("VItor",19);
        Professor professor= new Professor("Diego","História");
        Aluno[] alunosParaSeminario={aluno,aluno2};
        Seminario seminario = new Seminario("A macaca Branca",alunosParaSeminario,local);
        Seminario[] seminariosDisponiveis={seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }


}
