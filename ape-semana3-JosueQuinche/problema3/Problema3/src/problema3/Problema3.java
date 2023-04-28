
package problema3;

public class Problema3 {}
class InstitucionEducativa{
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosPorEstudinate;
    private double presupuesto;
    
    public InstitucionEducativa(String nombre,String tipo, int numAlumnos,int numDocentes,int numSedes,double gastosPorEstudinate){
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosPorEstudinate = gastosPorEstudinate;
        this.presupuesto = numAlumnos * gastosPorEstudinate;      
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setnumAlumnos(int numAlumnos){
        this.numAlumnos = numAlumnos;
    }
    public void setnumDocentes(int numDocentes){
        this.numDocentes = numDocentes;
    }
    public void setnumSedes(int numSedes){
         this.numSedes = numSedes;
    }
    public void setGastosPorEstudiante(double gastosPorEstudiantes){
        
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getNumAlumnos(){
        return numAlumnos;
    }
    public int getNumDocentes(){
        return numDocentes;
    }
    public int getNumSede(){
        return numSedes;
    }
    public double getGastosPorEstudiante(){
        return gastosPorEstudinate;
    }
    public double getPresupuesto(){
        return presupuesto;
    }
}
