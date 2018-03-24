/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darázsi Márk
 */
public class DB {
    final String user = "tanulo";
    final String pass = "tanulo";
    String dbUrl = "jdbc:mysql://localhost:3306/szotar"
                 + "?useUnicode=true&characterEncoding=UTF-8";
    
    public void beolvas(JTable tbl, String s) {
        final DefaultTableModel tm = (DefaultTableModel)tbl.getModel();
        
        try (Connection kapcs = DriverManager.getConnection(dbUrl, user, pass);
                PreparedStatement parancs = kapcs.prepareStatement(s);
                ResultSet eredmeny = parancs.executeQuery()) {
            tm.setRowCount(0);
            while (eredmeny.next()) {
                Object sor[] = {
                    eredmeny.getInt("szoID"),
                    eredmeny.getString("lecke"),
                    eredmeny.getString("angol"),
                    eredmeny.getString("magyar")
                };
                tm.addRow(sor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(1);
        }
    }
}
