package tema4.profesor;

import tema4.televisor.Electrodomestico;

public class Profesor {
    private String dniProfesor;
    private String nombre;
    private String apellidos;
    private int edad;
    protected float nomina;
    public enum asignaturas{BBDD, MARCAS,PROGRAMACION,ENTORNOS, INTERFACES}
    private final asignaturas modulo;

    public Profesor(String dniProfesor, String nombre, String apellidos,int edad, asignaturas modulo, float nomina) {
        this.dniProfesor = dniProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad=edad;
        this.modulo = modulo;
        this.nomina = nomina;

    }

    public void importeNomina(float paramSueldoBase, float paramComplementos){
        nomina = paramSueldoBase+paramComplementos-paramComplementos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "dniProfesor='" + dniProfesor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", nomina=" + nomina +
                ", modulo=" + modulo +
                '}';
    }

    public float importeNomina(float paramSueldoBase, float paramComplementos, float paramDeducciones){
        nomina=paramSueldoBase+paramComplementos-paramDeducciones;
        return nomina;
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales;
        Profesor otroProf=(Profesor) obj;
        if (this.nomina==otroProf.nomina)
            iguales=true;
        else
            iguales=false;
        return iguales;
    }
}
