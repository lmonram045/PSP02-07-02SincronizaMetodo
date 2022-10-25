package sincroniza_metodo;

/**
 * Clase principal que simula el funcionamiento de un servidor web
 * que atiende a varios clientes
 *
 * @author LMR, a partir de un ejemplo de ICMG
 */
public class Main {

    public static void main(String[] args) {
        ServidorWeb servidor = new ServidorWeb();
        HiloTerminal[] terminales = new HiloTerminal[10];
        for (int i = 0; i < terminales.length; i++) {
            terminales[i] = new HiloTerminal(servidor);
            terminales[i].start();
        }
    }
}

