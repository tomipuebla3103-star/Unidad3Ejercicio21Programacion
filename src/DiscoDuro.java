public class DiscoDuro implements DispositivoAlmacenamiento {
    private String datos = "";
    private int capacidadMaxima;
    private int velocidadTransferencia;

    public DiscoDuro(int capacidadMaxima, int velocidadTransferencia) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadTransferencia = velocidadTransferencia;
    }

    @Override
    public void escribirDatos(String datos) {
        if (this.datos.length() + datos.length() <= capacidadMaxima) {
            this.datos += datos;
            System.out.println("Datos escritos en el disco duro.");
        } else {
            System.out.println("Error: capacidad maxima superada.");
        }
    }

    @Override
    public String leerDatos() {
        return datos;
    }
}
