
/**
 *  Representa una dimensión
 *  
 *  @author -  Adrián Las
 */
public class Dimension  
{
    private double alto; //cm
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo){
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto(){
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho(){
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo(){
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia(){
        Dimension copia = new Dimension(alto, largo, ancho);
        return copia;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString(){
        String lineaFormateada = String.format("%20s%10.2f(cm)\n", "Alto:", alto);
        lineaFormateada += String.format("%20s%10.2f(cm)\n", "Ancho:", ancho);
        lineaFormateada += String.format("%20s%10.2f(cm)\n", "Largo:", largo);
        return lineaFormateada;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print(){
        System.out.println(this.toString());
    }
}
