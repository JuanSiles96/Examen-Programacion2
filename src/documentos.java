public class documentos {
 String titulo;
 String url;
 tema tema;
 index index;
    public documentos(String titulo, String url, tema tema, index index) {
        this.titulo = titulo;
        this.url = url;
        this.tema = tema;
        this.index = index;
    }

    private class tema {
    }
}
