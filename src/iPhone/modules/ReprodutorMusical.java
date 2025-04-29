package iPhone.modules;

public class ReprodutorMusical {
    private boolean tocando = false;
    private String musica = "Nokia 2000";

    public void tocar() {
        if (!tocando) {
            tocando = true;
            System.out.println("Tocando " + musica);
        } else
            System.out.println("Já está tocando musica");
    }

    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Pausado");
        } else
            System.out.println("Não existe musica sendo reporduzida");
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Musica " + this.musica + " selecionada.");
        tocar();
    }
}
