
/**
 * Clase para probar Envio 
 * 
 * @author -  Adrián Las
 */
public class TestEnvio
{
    /**
     *  main
     */
    public static void main(String[] args){
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40, 60, 40);
        Envio envio1 = new Envio();
        envio1.addPaquete(paquete1);
        envio1.addPaquete(paquete2);
        envio1.print();
        System.out.println("-------------------------------------");
        
        Dimension dimension3 = new Dimension(50, 50, 70);
        Paquete paquete3 = new Paquete(dimension3, 13);
        envio1.addPaquete(paquete3);
        envio1.print();
        System.out.println("-------------------------------------");
        
        envio1.addPaquete(paquete2.obtenerCopia());
    }
}
