package academy.devDojo.maratonajava.javacore.Kenum.test;

import academy.devDojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devDojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devDojo.maratonajava.javacore.Kenum.dominio.TipoPgamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("jonathas", TipoCliente.PESSOA_FISICA, TipoPgamento.DEBITO);
        Cliente cliente2 = new Cliente("Tomas",TipoCliente.PESSOA_JURIDICA, TipoPgamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPgamento.DEBITO.calcularDesconto(700));
        System.out.println(TipoPgamento.CREDITO.calcularDesconto(700));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 =TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
