//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir
// a ficha técnica e calcular a idade do carro.

public class Carro {

    String modelo;
    int anoLancamento;
    String cor;

    void exibeFicha() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Cor do carro: " + cor);

    }

    int idadeCarro() {

        return 2025 - anoLancamento;

    }

}
