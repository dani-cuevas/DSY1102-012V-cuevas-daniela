public class Main {

    public static void main(String[] args) {

        BicicletaElectrica electrica = new BicicletaElectrica(
                "BIC-E01",
                2023,
                22.5,
                60,
                false
        );

        BicicletaMontanya montanya = new BicicletaMontanya(
                "BIC-M01",
                2021,
                13.5,
                2
        );

        System.out.println(electrica);
        System.out.println("Costo electrica: $" +
                electrica.calcularCostoMantencion());

        System.out.println();

        System.out.println(montanya);
        System.out.println("Costo montaña: $" +
                montanya.calcularCostoMantencion());

        System.out.println();

        System.out.println(
                "Garantia activa: " +
                        electrica.tieneGarantiaExtendidaActiva()
        );

        electrica.activarGarantiaExtendida();

        System.out.println(
                "Garantia activa despues de activarla: " +
                        electrica.tieneGarantiaExtendidaActiva()
        );
    }
}
