import java.util.List;

public class registro {
    Integer numeroRegistro;
    List<documentos>documentos;

    public registro(Integer numeroRegistro, List<documentos> documentos) {
        this.numeroRegistro = numeroRegistro;
        this.documentos = documentos;
    }
}
