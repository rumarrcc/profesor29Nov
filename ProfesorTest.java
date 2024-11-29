package tema4.profesor;

import java.util.Calendar;

public class ProfesorTest{
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(2023, Calendar.DECEMBER, 1);
        ProfesorInterino profInt1 = new ProfesorInterino("45221887-K","Jose", "Hernandez Lopez",45, Profesor.asignaturas.BBDD, 1700, fecha);
        ProfesorInterino profInt2 = new ProfesorInterino("72332634-L","Andres", "Molto Parra",87, Profesor.asignaturas.ENTORNOS, 1850, fecha);
        ProfesorTitular profTit1 = new ProfesorTitular("73-K", "Juan", "Perez Perez", 32, Profesor.asignaturas.MARCAS, 2350, 5);
        ProfesorTitular profTit2 = new ProfesorTitular("88-L", "Alberto", "Centa Mota", 49, Profesor.asignaturas.PROGRAMACION, 2100, 10);

        profTit1.importeNomina(1000, 200);
        profTit2.importeNomina(2000, 200);
        profInt1.importeNomina(1150, 200);
        profInt2.importeNomina(1200, 250);

        System.out.println(profTit1.toString());
        System.out.println(profTit2.toString());
        System.out.println(profInt1.toString());
        System.out.println(profInt2.toString());


    }
}
