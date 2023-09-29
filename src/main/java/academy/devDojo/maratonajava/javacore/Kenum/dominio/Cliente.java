package academy.devDojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;//Associação
    private TipoPgamento tipoPgamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPgamento tipoPgamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPgamento = tipoPgamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getVALOR() +
                ", tipoPgamento=" + tipoPgamento +
                '}';
    }
}
