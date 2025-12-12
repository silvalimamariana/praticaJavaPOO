public class principalMusica {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "My Color";
        minhaMusica.artista = "Lucky Cyan";
        minhaMusica.anoLancamento = 2025;

        minhaMusica.avalia(8);
        minhaMusica.avalia(7);
        minhaMusica.avalia(10);

        minhaMusica.exibeFicha();
        System.out.println("Possui média de avaliações de " + minhaMusica.exibeMedia());

    }

}
