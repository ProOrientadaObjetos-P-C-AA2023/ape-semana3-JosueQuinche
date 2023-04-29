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
    public void setNumAlumnos(int numAlumnos){
        this.numAlumnos = numAlumnos;
    }
    public void setNumDocentes(int numDocentes){
        this.numDocentes = numDocentes;
    }
    public void setNumSedes(int numSedes){
         this.numSedes = numSedes;
    }
    public void setGastosPorEstudiante(double gastosPorEstudiantes){
        this.gastosPorEstudinate = gastosPorEstudiantes;
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
    public void CalcularPresupuesto(){
        this.presupuesto = numAlumnos * gastosPorEstudinate;
    }
    public String toString(){
        return String.format("ADMINISTRACION DE INSTITUCIONES EDUCATIVAS: \n"
                            + "\nNombre: "
                            + "\nTipo: "
                            + "\nNuemero de alumnos son: %.2t"
                            + "\nNumero de Docentes son: %2.t"
                            + "\nNumero de sedes son: %.2t"
                            + "\nEl gasto por estudiante es: "
                            + "\nEl presupuesto es: "
                            ,this.nombre
                            ,this.tipo        
                            ,this.numAlumnos
                            ,this.numDocentes
                            ,this.numSedes
                            ,this.gastosPorEstudinate
                            ,this.presupuesto
        );
    }                   
}
