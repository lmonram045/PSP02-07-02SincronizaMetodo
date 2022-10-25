package sincroniza_metodo;

/**
 * Clase que simula el funcionamiento de un servidor web
 * que atiende a varios clientes
 *
 * @author LMR, a partir de un ejemplo de ICMG
 */
public class ServidorWeb {
    private int numClientes; // número de clientes atendidos

    public ServidorWeb() {
        numClientes = 0;
    }

    /**
     * Método sincronizado que atiende a un cliente (monitor)
     */
    public synchronized void atiendeCliente() {
        numClientes++;
        System.out.println("Atendiendo al cliente " + numClientes);
    }
}
