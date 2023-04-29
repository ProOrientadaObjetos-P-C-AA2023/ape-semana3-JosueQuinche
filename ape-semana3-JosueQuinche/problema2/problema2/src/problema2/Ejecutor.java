
package problema2;


public class Ejecutor {
    public static void main(String[] args) {
        int horas = 72;
        EquivalenteHora equivalenteHora = new EquivalenteHora(horas);       
        
        equivalenteHora.getDias();
        equivalenteHora.getHoras();
        equivalenteHora.getSegundos();
        equivalenteHora.CalcularEquivalente();
        System.out.println("\n");
        
       
        
        
        System.out.println(horas+" Horas equivalen a:");
        System.out.println(equivalenteHora.getMinutos()+" minutos.");
        System.out.println(equivalenteHora.getSegundos()+" segundos.");
        System.out.println(equivalenteHora.getDias()+" días.");
        
    }
    
}
