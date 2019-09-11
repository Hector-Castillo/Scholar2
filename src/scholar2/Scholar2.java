/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar2;

import java.util.Scanner;

public class Scholar2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado1 =new Empleado();
        empleado1.nombre = "Hector Rafael";
        empleado1.apellidos = "Castillo Molinares";
        empleado1.genero = "Masculino";
        empleado1.fecha_nacimiento = "24/03/2002";
        empleado1.nacionalidad = "Colombiana";
        empleado1.identificación = "1129526720";
        empleado1.telefono = "123456789";
        empleado1.profesion = "ingeniero";
        empleado1.dirección = "carrera.25#26-03";
        empleado1.correo_electronico = "example@gmail.com";
        empleado1.Calcular_Edad();
        
        System.out.println("Nombre:"+ empleado1.nombre + empleado1.apellidos);
        System.out.println("Genero:"+ empleado1.genero);
        System.out.println("Fecha de nacimiento:"+ empleado1.fecha_nacimiento);
        System.out.println("Nacionalidad:"+ empleado1.nacionalidad);
        System.out.println("Su documeto de identificacion es:"+ empleado1.identificación);
        System.out.println("Telefono:"+ empleado1.telefono);
        System.out.println("Direccion"+ empleado1.dirección);
        System.out.println("Correo electronico:"+ empleado1.correo_electronico);
        System.out.println("Fecha de nacimiento"+ empleado1.fecha_nacimiento);
        System.out.println("Su edad actual es:"+ empleado1.Calcular_Edad());
        
        Estudiante estudiante1 =new Estudiante();
        estudiante1.nombre = "Hector Rafael";
        estudiante1.apellidos = "Castillo Molinares";
        System.out.println("El estudiante se llama:"+ estudiante1.nombre + estudiante1.apellidos);
        
       Scanner lectura =new Scanner (System.in);
       int edad, año_nacimiento, año_actual;
        System.out.println("ingrese el año de nacimiento");
        año_nacimiento =lectura.nextInt();
        System.out.println("ingrese el año actual");
        año_actual =lectura.nextInt();
        edad=año_actual-año_nacimiento;
        System.out.println("la edad es:"+edad);
              
        
        
    }
    
}
