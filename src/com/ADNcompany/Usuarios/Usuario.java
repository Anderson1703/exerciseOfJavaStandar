package com.ADNcompany.Usuarios;
import com.ADNcompany.Departamentos.Administracion;
import com.ADNcompany.Departamentos.Departamento;
import com.ADNcompany.Departamentos.Logistica;
import com.ADNcompany.Departamentos.ServicioAlCliente;

public class Usuario {

    public int index;
    public  String nombre;
    public String  apellido;
    public int edad;
    public String email;
    public String telefono;
    public int sueldo;
    public String rol;
    public int antiguedad;
    public int vacaciones;
    Departamento departamento;

    Usuario(String nombre, String  apellido,int edad,String email,String telefono,int sueldo, String departamento,int antiguedad){
        this.index++;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.email=email;
        this.telefono=telefono;
        this.sueldo=sueldo;
        this.antiguedad=antiguedad;
        departamentManager(departamento);
    }

    private void  departamentManager(String departament){
            String UpperDepartament=departament.toUpperCase();
            switch (UpperDepartament)
            {
                case "ADMINISTRACION":
                    this.departamento= new Administracion(this.antiguedad);
                    break;

                case "LOGISTICA":
                    this.departamento= new Logistica(this.antiguedad);

                    break;
                case "ATENCION AL CLIENTE":
                    this.departamento= new ServicioAlCliente(this.antiguedad);
                    break;
                default:
                    System.out.println("No existe este departamento");
            }
            this.vacaciones=this.departamento.diasDeDerechoAvaciones;
    }


}

