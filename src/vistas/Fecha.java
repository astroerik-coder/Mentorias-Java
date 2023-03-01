package vistas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author nitro
 */
public class Fecha{

   Calendar fecha = new GregorianCalendar();
    String anho = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    String fechaCompleta = anho + "-" + mes + "-" + dia;

    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    String horaCompleta = hora + ":" + minuto;

    
}
