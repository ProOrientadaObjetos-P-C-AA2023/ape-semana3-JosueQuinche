package problema1;
public class Ejecutor {
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(35.0,201.0,98.0);
        terreno1.CalcularAreaTerreno();
        terreno1.CalcularCostoTerreno();
        System.out.println(terreno1);
        double acnhoTerreno = 18.0;
        double largoTerreno = 250.0;
        double valorMetroCuadrado = 100.0;
        terreno1.setAnchoTerreno(acnhoTerreno);
        terreno1.setLargoTerreno(largoTerreno);
        terreno1.setValorMetroCuadrado(valorMetroCuadrado);
        terreno1.CalcularAreaTerreno();
        terreno1.CalcularCostoTerreno();
        System.out.println("\n");
        System.out.println("El terreno tiene un ancho de: " + terreno1.getAnchoTerreno()+
                " metros y n largo de "+ terreno1.getLargoTerreno()+ " metros.");
        System.out.println("El valor del metro cuadrado es de: " + terreno1.getValorMetroCuadrado()+
                " dolares.");
        System.out.println("El área del terreno es de: " + terreno1.getAreaTerreno() + " m².");
        System.out.println("El costo del terreno es de: " + terreno1.getCostoTerreno() + " dolares.");                
    }
    
    
}
