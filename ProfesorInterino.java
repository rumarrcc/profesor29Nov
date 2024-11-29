package tema4.profesor;
import java.util.Calendar;

public class ProfesorInterino extends Profesor{

    private Calendar fecha;
    public ProfesorInterino(String dniProfesor, String nombre, String apellidos, int edad, asignaturas modulo, float nomina, Calendar fecha) {
        super(dniProfesor, nombre, apellidos, edad, modulo, nomina);
        this.fecha = fecha;
    }

    public void importeNomina(float paramSueldoBase, float paramComplementos) {
        super.importeNomina(paramSueldoBase, paramComplementos,100f);
    }

    public String toString() {
        return super.toString()+"ProfesorInterino{" +
                "fechaInicioInterinidad=" + fecha.getTime() +
                "}";
    }
}
