//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<DispositivoAlmacenamiento> dispositivos = new ArrayList<>();

    dispositivos.add(new DiscoDuro(100, 100));
    dispositivos.add(new UnidadSSD(200, 500));
    dispositivos.add(new MemoriaUSB(50, 50));

    for (DispositivoAlmacenamiento dispositivo : dispositivos) {
        dispositivo.escribirDatos("Hola mundo");
        System.out.println("Datos leidos: " + dispositivo.leerDatos());
        System.out.println("--------------------");
    }
}
