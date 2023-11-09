package m1s04.ex_05.org.devinhouse.superherois.cli;

public enum Options {
    CADASTRAR_HEROI(1),
    CADASTRAR_VILAO(2),
    LISTAR(3),
    SAIR(4);

    public Integer option;

    private Options(Integer option){
        this.option = option;
    }

    public static Options aplicarSelecao(Integer option){
        for (Options selected : Options.values()){
            if (option == selected.option){
                return selected;
            }
        }
        return null;
        }
    public Integer getOpcao(){
        return this.option;
    }
}
