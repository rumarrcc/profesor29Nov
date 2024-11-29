package tema4.profesor;

public class ProfesorTitular extends Profesor {
    private int anyosAntiguedad;

    public ProfesorTitular(String dniProfesor, String nombre, String apellidos, int edad, asignaturas modulo, float nomina, int anyosAntiguedad) {
        super(dniProfesor, nombre, apellidos, edad, modulo, nomina);
        this.anyosAntiguedad = anyosAntiguedad;
    }

    public void importeNomina(float paramSueldoBase, float paramComplementos) {
        super.importeNomina(paramSueldoBase, paramComplementos, anyosAntiguedad*10);
    }



    @Override
    public String toString() {
        return "ProfesorTitular{" +
                "anyosAntiguedad=" + anyosAntiguedad +super.toString()+
                ", nomina=" + nomina +
                '}';
    }
}
