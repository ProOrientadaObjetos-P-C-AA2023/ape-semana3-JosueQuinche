

package problema2;
public class Problema2 {}
class EquivalenteHora{
    private int dias;
    private int horas;
    private int minutos;
    private int segundos;
    
    public EquivalenteHora(int horas){
        this.horas = horas;  
    }
        public int getDias(){
        return dias;
    }  
    public int getHoras(){
        return horas;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }    
    public void CalcularEquivalente(){
        minutos = horas *60;
        segundos = horas *3600;
        dias = horas /24;       
    }
      public String toString(){
        return String.format("LA Equivalenceia en Horas es: \n"
                                 + "\nDia: %.2f"
                                + "\nHoras: %.2f"
                                + "\nMinutos: %.2f"
                                + "\nSegundos: %.2f"    
                                ,this.getDias()
                                ,this.getHoras()
                                ,this.getMinutos()
                                ,this.getSegundos()                                 
                                );

        }
      }
    

