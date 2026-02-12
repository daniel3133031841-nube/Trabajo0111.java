/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo01;

import javax.swing.JOptionPane;

/**
 *
 * @author danielhernandez
 */
public class Trabajo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio5();
       
    }
    public static void ejercicio1(){
       
    double n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
    double n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
    double n3=Double.parseDouble(JOptionPane.showInputDialog("ingrese el tercer numero "));
    double n4=Double.parseDouble(JOptionPane.showInputDialog("ingrese el cuarto numero"));
    double n5=Double.parseDouble(JOptionPane.showInputDialog("ingrese el quinto numero"));
    
    double r1=(n1+n2+n3+n4+n5)/5;
    
    JOptionPane.showMessageDialog(null, "el promedio de los 5 numeros digitados es de: "+r1);
    
        
        
    }
    
    public static void ejercicio2() {
        
        double n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota obtenida en los parciales"));
        double n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota obtenida en los quizes"));
        double n3=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota obtenida en el trabajo final"));
        
        
        double r1=(((n1*0.55)+(n2*0.3)+(n3*0.15)));
        
        JOptionPane.showMessageDialog(null,"la nota final obtenida en la materia es de: "+r1);
    
        
        
    }
 
    public static void ejercicio3() {
        
        String n1=JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL EMPLEADO");
        int n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de horas trabajadas"));
        double n3=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de cada hora trabajada"));
        
        double r1=n2*n3;
        
        JOptionPane.showMessageDialog(null, "el trabajador: " +n1+ "  obtuvo un sueldo de: "+r1);
        
        
    }
    
    public static void ejercicio4() {
        
        
        double n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero"));
        
        
        
        if (n1%2==0){
            
            JOptionPane.showMessageDialog(null,"el numero "+n1+" ingresado es PAR");
    }
        
        else {
            
            JOptionPane.showMessageDialog(null, "el numero ingresado"+n1+" es IMPAR");
        
        }
        
        }
        
        
    public static void ejercicio5() {
        
        double n1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        double  n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
        double  n3=Double.parseDouble(JOptionPane.showInputDialog("ingrese el tercer  numero"));
        
        if (n1==n2+n3){
            
            JOptionPane.showMessageDialog(null,"el numero"+n1+" es la suma de los numeros DOS y TRES:");
        }
        
        if (n2==n1+n3){
            
        JOptionPane.showMessageDialog(null,"el numero"+n2+" es la suma de los numeros UNO y TRES");
                
        }
        
        if (n3==n1+n2){
            
            JOptionPane.showMessageDialog(null, "el numero"+n3+" es la suma del numero UNO y DOS");
        }
        
        else {
            
            JOptionPane.showMessageDialog(null, "los numeros ingresados no corresponden a las suma de uno de ellos");
        }
        
    }
        
        
    }
    

