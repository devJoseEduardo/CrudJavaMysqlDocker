package academy.devDojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    public Seminario(String titulo,Local local) {//Com o construtor só é possivel a criação de um seminario com  o tìtulo e o Local
        this.titulo = titulo;
        this.local=local;
    }// Construtor

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println(this.titulo);
        if(alunos==null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
