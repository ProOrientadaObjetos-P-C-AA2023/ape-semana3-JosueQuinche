

package problema2;
public class Problema2 {}
class EquivalenteHora{
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public EquivalenteHora(int horas){
        this.horas = horas;  
    }

    public int gethoras(){
        return horas;
    }
    public int getminutos(){
        return minutos;
    }
    public int getsegundos(){
        return segundos;
    }
    public int getdias(){
        return dias;
    }      
    public void calcularEquivalente(){
        minutos = horas *60;
        segundos = horas *3600;
        dias = horas /24;       
    }

}
    

