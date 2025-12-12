/* Crie uma classe Musica com atributos titulo, artista, anoLancamento,
avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar
a música e calcular a média de avaliações. */

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    void exibeFicha() {

        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numAvaliacoes);

    }

    void avalia(double nota) {

        avaliacao += nota;
        numAvaliacoes++;

    }

    double exibeMedia() {

        return avaliacao / numAvaliacoes;
    }

}
