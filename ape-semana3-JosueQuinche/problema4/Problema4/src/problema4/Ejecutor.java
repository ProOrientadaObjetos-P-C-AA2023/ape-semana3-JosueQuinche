package problema4;
public class Ejecutor {
    public static void main(String[] args) {
        EquipoCelular equipoCelular = new EquipoCelular("Android",6.2,500.0,19.0,"AA:BB:CC:DD:EE:FF","1234567890");
        equipoCelular.CalcularCostoFinal();
        System.out.println("Nombre del Sistema Operativo: " +equipoCelular.getSistemaOperativo());
        System.out.println("Tamaño del Dispositivo electrónico: " + equipoCelular.getTamañoPantalla());
        System.out.println("El Costo Inicial es de: " + equipoCelular.getCostoInicial());
        System.out.println("El Costo Final es de: " + equipoCelular.getCostoFinal());
        System.out.println("El porcentaje Inicial del IVA es de: " + equipoCelular.getIvaPorcentajeInicial());
        System.out.println("El porcentaje del IVA es: " + equipoCelular.getIvaPorcentaje());
        System.out.println("La direccion MAC del dispositivo es: "+ equipoCelular.getDireccionMac());
        System.out.println("La informacion IMEI del dispositivo es: "+ equipoCelular.getInformacionIMEI());
        equipoCelular.setSistemaOperativo("IOS");
        equipoCelular.setTamañoPantalla(5.8);
        equipoCelular.setCostoInicial(650);
        equipoCelular.setIvaPorcentaje(16);
        equipoCelular.setDireccionMac("11:22:33:44:55:66");
        equipoCelular.setInformacionIMEI("0987654321");
        double costoFinal = equipoCelular.CalcularCostoFinal();
        System.out.println("\n");
        System.out.println("Costo Final del Dispositivo electronico es de: $" + costoFinal);
    }
}
