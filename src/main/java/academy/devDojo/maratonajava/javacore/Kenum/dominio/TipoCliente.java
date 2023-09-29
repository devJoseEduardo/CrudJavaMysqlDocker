package academy.devDojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {// É uma enumeraçao, um tipo especial de classe// todos os atributos que nos vamos criar è constante
    PESSOA_FISICA(1, "Pessoa Física"),      //Sâo como se fossem constantes, static e final
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int VALOR;
    private String nomeRelatorio;
    private String valorDesconto;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
