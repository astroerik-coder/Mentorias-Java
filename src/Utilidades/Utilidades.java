/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitro
 */
public class Utilidades {
        
    public void limpiartabla(JTable tbl) {
        DefaultTableModel temp = (DefaultTableModel) tbl.getModel();
        int filas = tbl.getRowCount();
        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
    
    public java.util.Date stringToHour(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("HH:mm");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
