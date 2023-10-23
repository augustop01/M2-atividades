package m1s03.ex_01;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Pedro", 2500.00f);

        funcionario2.aumentar(500f, 225f);

        System.out.println(funcionario1 + "\n" + funcionario2);
    }
}
