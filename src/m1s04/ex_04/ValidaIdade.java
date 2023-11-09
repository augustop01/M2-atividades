package m1s04.ex_04;

public class ValidaIdade {
    public static Integer validaIdade(Integer idade){
        if (idade <= 0 || idade > 100){
            throw new ExceptionIdade("A aplicação aceita somente idades entre (e incluindo) 1 e 100 anos.");
        }
        return idade;
    }
}
