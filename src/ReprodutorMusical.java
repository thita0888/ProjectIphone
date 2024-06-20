package aplicacoes.Iphone;

public class ReprodutorMusical {
    private String musica;
    private String album;
    private String lista;

    public ReprodutorMusical(String musica, String album, String lista) {
        this.musica = musica;
        this.album = album;
        this.lista = lista;
    }

    public String getMusica() {
        return musica;
    }

    public String getAlbum() {
        return album;
    }

    public String getLista() {
        return lista;
    }

    public void tocarMusica() {
        System.out.println("Tocando: " + musica + " // " + album);
    }

    public void pausarMusica() {
        System.out.println("Música pausada...");
    }

    public void selecaoArtista() {
        System.out.println("Álbuns...");
        System.out.println("Playlists...");
        System.out.println("Música selecionada: " + musica);
    }
}
