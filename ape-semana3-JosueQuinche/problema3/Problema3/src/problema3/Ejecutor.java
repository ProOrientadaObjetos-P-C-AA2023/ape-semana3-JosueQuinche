package problema3;
public class Ejecutor {
    public static void main(String[] args) {
        InstitucionEducativa institucionequivalente = new InstitucionEducativa("UTPL","Particular",29000,1700,80,1500);
        institucionequivalente.CalcularPresupuesto();
        System.out.println("Nombre de la institucion: " + institucionequivalente.getNombre());
        System.out.println("Tipo de institucion: "+ institucionequivalente.getTipo());    
        System.out.println("Numero de Alumnos: "+ institucionequivalente.getNumAlumnos());
        System.out.println("Numero de docentes: "+ institucionequivalente.getNumDocentes());
        System.out.println("Numero de Sedes: " + institucionequivalente.getNumSede());
        System.out.println("Gastos por Estudiante: $ "+institucionequivalente.getGastosPorEstudiante());
        System.out.println("Presupuesto del estudiante: $"+ institucionequivalente.getPresupuesto());
        institucionequivalente.setGastosPorEstudiante(20000);
        System.out.println("\n");
        System.out.println("Nuevo gasto proyectado para el estudinate es de: $"+ institucionequivalente.getGastosPorEstudiante());
        System.out.println("Nuevo Presupuesto es de: $"+ institucionequivalente.getPresupuesto());
        
    }
    
}
