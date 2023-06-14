package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public class YateDeLujo extends Barco{
    private Integer CV;
    private Integer Camarote;

    public YateDeLujo() {
    }

    public YateDeLujo(Integer CV, Integer Camarote, Integer Matricula, Integer MetrosEslora, Year AñoFabricacion) {
        super(Matricula, MetrosEslora, AñoFabricacion);
        this.CV = CV;
        this.Camarote = Camarote;
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    public Integer getCamarote() {
        return Camarote;
    }

    public void setCamarote(Integer Camarote) {
        this.Camarote = Camarote;
    }
    
    public YateDeLujo CrearYateDeLujo(){
        int cv = (int)(Math.random()*1000)+1;
        int cam = (int)(Math.random()*6)+1;
        int m = (int)(Math.random()*5000)+1;
        int me = (int)(Math.random()*50)+1;
        Year af = Year.of((int)(Math.random()*23)+2000);
        
        return new YateDeLujo(cv, cam, m, me, af);
    }

    @Override
    public String toString() {
        return "YateDeLujo{"+ super.toString() + "CV=" + CV + ", Camarote=" + Camarote + '}';
    }
    
    
}
