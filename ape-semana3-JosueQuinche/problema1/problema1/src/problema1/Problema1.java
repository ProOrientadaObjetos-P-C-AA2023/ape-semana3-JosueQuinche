
package problema1;
public class Problema1 {}
class Terreno{
    private double costoTerreno;
    private double acnhoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;
    public Terreno(){ }
    public Terreno(double acnhoTerreno, double largoTerreno, double valorMetroCuadrado){
        this.acnhoTerreno = acnhoTerreno;
        this.largoTerreno = largoTerreno;
        this.valorMetroCuadrado = valorMetroCuadrado;

        
    }
    public void setAnchoTerreno(double anchoTerreno){
        this.acnhoTerreno = anchoTerreno;
    }
    public void setLargoTerreno(double largoTerreno){
        this.largoTerreno = largoTerreno; 
    }
    public void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public double getcostoTerreno(){
        return costoTerreno;
    }
    public double getacnhoTerreno(){
        return acnhoTerreno;
    }
    public double getlargoTerreno(){
        return largoTerreno;
    }
    public double getareaTerreno(){
        return areaTerreno;
    }
    public double getvalorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    public void calcularAreaTerreno(){
        this.areaTerreno = largoTerreno * acnhoTerreno;
    }    
    public void calcularCostoTerreno(){
        this.costoTerreno = valorMetroCuadrado * areaTerreno;
    }

    
    

}

