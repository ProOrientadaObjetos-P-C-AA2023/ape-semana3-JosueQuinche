package problema4;
public class Problema4 {}
class EquipoCelular{
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double costoFinal;
    private double ivaPorcentajeInicial;
    private double ivaPorcentaje;
    private String direccionMac;
    private String informacionIMEI;
    public EquipoCelular(String sistemaOperativo, double tamanioPantalla,double costoInicial,
                        double ivaPorcentaje, String direccionMac, String informacionIMEI){
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setTamañoPantalla(double tamanioPantalla ){
        this.tamanioPantalla = tamanioPantalla;
    }
    public void setCostoInicial(double costoInicial){
        this.costoInicial = costoInicial;
    }
    public void setCotoFinal(double costoFinal){
        this.costoFinal = costoFinal;
    }
    public void setIvaPorcentaje(double ivaPorcentaje){
        this.ivaPorcentaje = ivaPorcentaje;
    }
    public void setIvaPorcentajeInicial (double ivaPorcentajeInicial){
        this.ivaPorcentajeInicial = ivaPorcentajeInicial;
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
        return tamanioPantalla;
    }
    public double getCostoInicial(){
        return costoInicial;
    }
        public double getCostoFinal(){
        return costoFinal;
    }
    public double getIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public double getIvaPorcentajeInicial(){
        return ivaPorcentajeInicial;
    }
    public String getDireccionMac (){
        return direccionMac;
    }
    public String getInformacionIMEI(){
        return informacionIMEI;
    }
    public double CalcularCostoFinal(){
        return costoInicial +(costoInicial * ivaPorcentaje /100);
    }
    public String toString(){
        return String.format("CARACTERISTICAS DEL DISPOSITIVO ELECTRONICO: \n"
                            + "\nEl Sistema Operativo del Celular es: %.2f"
                            +" \nSu tamaño de pantalla es de: %.2f","pulgadas" 
                            +" \nSu Costo inicial es de: %.2f"
                            +" \nSu Costo Final es de:  %.2f"
                            +" \nEl iva del Celular tiene un porcentaje inicial de: %.2f"
                            +" \nEl iva del Celular tiene un porcentaje de:  %.2f"
                            +" \nCodigo de su direccion MAC : %.2f"
                            +" \nLa Informacion IMEI es: %.2f"
                            , this.sistemaOperativo
                            , this.tamanioPantalla
                            , this.costoInicial
                            , this.costoFinal
                            , this.ivaPorcentajeInicial
                            , this.ivaPorcentaje
                            , this.direccionMac
                            , this.informacionIMEI);
    }
}
