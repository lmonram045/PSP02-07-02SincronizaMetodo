package sincroniza_metodo;


public class HiloTerminal extends Thread {

    private ServidorWeb servidor; // Recurso compartido

    /**
     * Constructor de la clase HiloTerminal
     * @param servidor Servidor web
     */
    public HiloTerminal(ServidorWeb servidor) {
        this.servidor = servidor;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            servidor.atiendeCliente();
            this.yield();
        }
    }

}

