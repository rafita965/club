/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsbuttom;

import java.util.Calendar;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Agustín Salinas
 */
public class SpinnerMonth extends JSpinner{
    public SpinnerMonth(){
        // Obtener la fecha actual
        Calendar calendar = Calendar.getInstance();

        // Avanzar al siguiente mes
        calendar.add(Calendar.MONTH, 1);
        Calendar minCalendar = calendar;
        minCalendar.set(Calendar.DAY_OF_MONTH, 1);  // Primer día del mes proximo
        minCalendar.set(Calendar.HOUR_OF_DAY, 0);   // Hora 00:00
        minCalendar.set(Calendar.MINUTE, 0);
        minCalendar.set(Calendar.SECOND, 0);
        minCalendar.set(Calendar.MILLISECOND, 0);

        // Crear el modelo de spinner con fecha, incrementando por meses
        SpinnerDateModel spinnerModel = new SpinnerDateModel(calendar.getTime(), minCalendar.getTime(), null, Calendar.MONTH);
        this.setModel(spinnerModel);
        ((JSpinner.DefaultEditor) this.getEditor()).getTextField().setEditable(false);

        // Configurar el formato de la fecha en el spinner (MM/yyyy)
        this.setEditor(new JSpinner.DateEditor(this, "MM/yyyy"));
    }
}