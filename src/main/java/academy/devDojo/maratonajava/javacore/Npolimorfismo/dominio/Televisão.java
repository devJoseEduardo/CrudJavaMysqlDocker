package academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisão extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisão(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisãoo");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
