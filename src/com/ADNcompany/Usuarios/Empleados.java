package com.ADNcompany.Usuarios;

public class Empleados extends Usuario {
    public Empleados(String nombre, String apellido, int edad, String email, String telefono, int sueldo, String departamento,int antiguedad) {
        super(nombre, apellido, edad, email, telefono, sueldo, departamento,antiguedad);
        this.rol="Empleado";
    }

}
