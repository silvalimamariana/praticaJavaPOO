public class principalCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "Corsa";
        carro.anoLancamento = 1994;
        carro.cor = "Vermelho";

        carro.exibeFicha();
        System.out.println("Possui a idade: " + carro.idadeCarro() + ".");

    }
}
