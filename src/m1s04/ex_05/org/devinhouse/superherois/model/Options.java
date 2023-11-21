package m1s04.ex_05.org.devinhouse.superherois.model;

import m1s04.ex_05.org.devinhouse.superherois.exception.OpcaoInvalidaException;

public enum Options {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Options converter(Integer codigo) throws OpcaoInvalidaException {
        if (codigo == 0 || codigo > 4)
            throw new OpcaoInvalidaException("Opção inválida!");
        return Options.values()[codigo - 1];
    }
}
