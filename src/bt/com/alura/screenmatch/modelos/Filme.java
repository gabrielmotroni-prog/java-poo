package bt.com.alura.screenmatch.modelos;

import bt.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
    //
}
