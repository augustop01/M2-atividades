package m1s02.ex_04;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("01", "Ventilador", 3, 15.0);
        System.out.println("------------------");
        System.out.printf("Atualmente, temos %d unidades do produto de nº.%s, %s, cada uma no valor de R$%.1f, resultando numa fatura de: R$%.1f.\n", fatura.getQuantidade(), fatura.getNumero(), fatura.getDescricao(), fatura.getPrecoPorUn(), fatura.getValorFatura());

        fatura.setQuantidade(-1);
        System.out.println("------------------");
        System.out.printf("Atualmente, temos %d unidades do produto de nº.%s, %s, cada uma no valor de R$%.1f, resultando numa fatura de: R$%.1f.\n", fatura.getQuantidade(), fatura.getNumero(), fatura.getDescricao(), fatura.getPrecoPorUn(), fatura.getValorFatura());

        fatura.setPrecoPorUn(-5.0);
        fatura.setQuantidade(8);
        System.out.println("------------------");
        System.out.printf("Atualmente, temos %d unidades do produto de nº.%s, %s, cada uma no valor de R$%.1f, resultando numa fatura de: R$%.1f.\n", fatura.getQuantidade(), fatura.getNumero(), fatura.getDescricao(), fatura.getPrecoPorUn(), fatura.getValorFatura());
        System.out.println("------------------");
    }
}
