package com.ADNcompany.Usuarios;

class Supervisores extends Usuario {
    Supervisores(String nombre, String apellido, int edad, String email, String telefono, int sueldo,String departamento,int antiguedad) {
        super(nombre, apellido, edad, email, telefono, sueldo, departamento,antiguedad);
        this.rol="Administardor";
    }
}
