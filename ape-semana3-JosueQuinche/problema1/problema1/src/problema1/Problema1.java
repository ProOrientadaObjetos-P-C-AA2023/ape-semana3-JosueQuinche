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
    public double getCostoTerreno(){
        return costoTerreno;
    }
    public double getAnchoTerreno(){
        return acnhoTerreno;
    }
    public double getLargoTerreno(){
        return largoTerreno;
    }
    public double getAreaTerreno(){
        return areaTerreno;
    }
    public double getValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    public void CalcularAreaTerreno(){
        this.areaTerreno = largoTerreno * acnhoTerreno;
    }    
    public void CalcularCostoTerreno(){
        this.costoTerreno = valorMetroCuadrado * areaTerreno;
    }
    public String toString(){
        return String.format("SU TERRENO CON LOS SIGUIENTES PARAMETROS : \n"
                                + "\nAncho del terrreno: %.2f"
                                + "\nLargo del terreno: %.2f"
                                + "\nValor del Metro cuadrado: %.2f"    
                                + "\nArea del terreno: %.2f"
                                + "\nCosto del terreno: %.2f"
                                ,this.getAnchoTerreno()
                                ,this.getLargoTerreno()
                                ,this.getValorMetroCuadrado()
                                ,this.getAreaTerreno()
                                ,this.getCostoTerreno()                                    
                                );
    }
}

