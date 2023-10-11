package m1s02.ex_01;

public class TesteData {
    public static void main(String[] args) {
        Data data = new Data(21, 7, 1997);

        data.exibirData();
        data.setDia(15);
        data.setMes(3);
        data.setAno(2023);
        System.out.println("Dia " + data.getDia());
        System.out.println("Mês " + data.getMes());
        System.out.println("Ano " + data.getAno());
        data.exibirData();
    }
}
