/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_io_u4;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vanes
 */
public class FormatoTiempo {
    
     // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Formatear la fecha y la hora por separado
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        String fechaFormateada = fechaActual.format(formatterFecha);
        String horaFormateada = horaActual.format(formatterHora);
    
    
    
}
