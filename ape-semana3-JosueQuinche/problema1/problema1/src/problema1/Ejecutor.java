
package problema1;

public class Ejecutor {
    public static void main(String[] args) {
        Terreno T = new Terreno();
        double acnhoTerreno = 10.0;
        double largoTerreno = 20.0;
        double valorMetroCuadrado = 100.0;
        
        T.setAnchoTerreno(acnhoTerreno);
        T.setLargoTerreno(largoTerreno);
        T.setValorMetroCuadrado(valorMetroCuadrado);
        T.calcularAreaTerreno();
        T.calcularCostoTerreno();
        
        System.out.println("El terreno tiene un ancho de: " + T.getacnhoTerreno()+
                " metros y n largo de "+ T.getlargoTerreno()+ " metros.");
        System.out.println("El valor del metro cuadrado es de: " + T.getvalorMetroCuadrado()+
                " dolares.");
        System.out.println("El área del terreno es de: " + T.getareaTerreno() + " metros cuadrados.");
        System.out.println("El costo del terreno es de: " + T.getcostoTerreno() + " dolares.");
                
    }
    
}
