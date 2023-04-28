
package problema4;
public class Problema4 {}
class EquipoCelular{
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private String direccionMac;
    private String informacionIMEI;
    
    public EquipoCelular(String sistemaOperativo, double tamañoPantalla,double costoInicial
                        ,double ivaPorcentaje, String direccionMac, String informacionIMEI){
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
  
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setTamañoPantalla(double tamañoPantalla ){
        this.tamañoPantalla = tamañoPantalla;
    }
    public void setCostoFinal(double costoInicial){
        this.costoInicial = costoInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje){
        this.ivaPorcentaje = ivaPorcentaje;
    }
    public void setDireccionMac(String direccionMac){
        this.direccionMac = direccionMac;
    }
    public void setInformacionIMEI(String informacionIMEI){
        this.informacionIMEI = informacionIMEI;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    public double getTamañoPantalla(){
        return tamañoPantalla;
    }
    public double getCostoFinal(){
        return costoInicial;
    }
    public double getIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public String getDireccionMac (){
        return direccionMac;
    }
    public String getInformacionIMEI(){
        return informacionIMEI;
    }
    public double getCalcularCostoFinal(){
        return costoInicial +(costoInicial * ivaPorcentaje /100);
    }
    
    
    
}
