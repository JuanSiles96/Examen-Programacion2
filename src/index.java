import java.util.Date;

public class terminos{
    Date fecha;
    Integer tamaño;
    Boolean hash;
    documento documento;
public void index(){}
    public terminos(Date fecha, Integer tamaño, Boolean hash, documento documento) {
        this.fecha = fecha;
        this.tamaño = tamaño;
        this.hash = hash;
        this.documento = documento;
    }
}
