
package problema2;


public class Ejecutor {
    public static void main(String[] args) {
        int horas = 48;
        EquivalenteHora eh = new EquivalenteHora(horas);       
        
        eh.getdias();
        eh.gethoras();
        eh.getsegundos();
        eh.calcularEquivalente();
       
        
        
        System.out.println(horas+" Horas equivalen a:");
        System.out.println(eh.getminutos()+" minutos.");
        System.out.println(eh.getsegundos()+" segundos.");
        System.out.println(eh.getdias()+" días.");
        
    }
    
}
