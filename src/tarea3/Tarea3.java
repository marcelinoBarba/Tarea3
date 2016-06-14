/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author marcelino
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    Connection con = null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Docentes","root","123");
            System.out.println("conexcion establecida");
            JOptionPane.showMessageDialog(null,"conexion establecida");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("error de conexion "+e);
            JOptionPane.showMessageDialog(null,"erro de conexion" +e);
        }
        return con;
    }
    
    Connection con1 = null;
    public Connection conexion1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Students","root","123");
            System.out.println("conexcion establecida");
            JOptionPane.showMessageDialog(null,"conexion establecida");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("error de conexion "+e);
            JOptionPane.showMessageDialog(null,"erro de conexion" +e);
        }
        return con1;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Principal d = new Principal();
        d.show();
    }
    
}
