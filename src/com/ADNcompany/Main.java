package com.ADNcompany;
import com.ADNcompany.Contrato.UsersCRUD;
import com.ADNcompany.Usuarios.Empleados;
import com.ADNcompany.Usuarios.Usuario;
import com.ADNcompany.portafolio.DatabaseOfUsers;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
   private static UsersCRUD database = new DatabaseOfUsers();
    public static void main(String[] args) {
	// write your code here
        Bienvenida();

    }

    public static void Bienvenida(){
        System.out.println("!Bienvenido!");
        System.out.println( "Qien eres: ");
        System.out.println("1: Supervisor  2: Empleado");
        verificarTipoDeUsuario(scanner.nextInt());
    }

    public static void verificarTipoDeUsuario(Integer typeUsuario){
        if (typeUsuario==1){
            System.out.println("Tus opciones son: ");
            System.out.println("1: Crear Empleados  2:Ver Empleados");
            verificarOpcionDeSupervisor(scanner.nextInt());
        }
        else if (typeUsuario==2){
            System.out.println("Tus opciones son: ");
            System.out.println("1: Ver derecho a vaciones");
            verificarOpcionDeEmpleado(scanner.nextInt());
        }
        else{
            System.out.println("Elige una opcion Correcta");
        }
    }

    public static void verificarOpcionDeSupervisor(Integer OpcionDeSupervisor){
        if (OpcionDeSupervisor==1){
            crearUsuario();
        }
        else if (OpcionDeSupervisor==2){
            System.out.println(database.toString());
        }
        else{
            System.out.println("Elige una opcion Correcta");
        }
    }

    public static void verificarOpcionDeEmpleado(Integer OpcionDeEmpleado){
        if (OpcionDeEmpleado==1){
            verUsuarios();
        }
        else{
            System.out.println("Elige una opcion Correcta");
        }
    }

    public static void crearUsuario(){
        System.out.println("Introduce el nombre del empleado");
        String nombre = scanner.next();
        System.out.println("Introduce el apellido del empleado");
        String apellido = scanner.next();
        System.out.println("Introduce la edad del empleado");
        int edad = scanner.nextInt();
        System.out.println("Introduce el email del empleado");
        String email = scanner.next();
        System.out.println("Introduce el telefono del empleado");
        String telefono = scanner.next();
        System.out.println("Introduce el sueldo del empleado");
        int sueldo = scanner.nextInt();
        System.out.println("Introduce el departamento al que pertenece el empleado");
        String departamento = scanner.next();
        System.out.println("Introduce en numero, la cantida de anos de antiguedad en la empresa de dicho empleado");
        int antiguedad = scanner.nextInt();
        Usuario usuario = new Empleados(nombre,apellido,edad, email,telefono,sueldo,departamento,antiguedad);
        database.saveUser(usuario);
        System.out.println("deseas terminar el programa? Presiona 1: para finalizar, 2: para ver usuario y 3: para ver usuario");
        int opcion = scanner.nextInt();
        if (opcion==2){
            verUsuarios();
        }else if (opcion==3){
            verDerechoAVacaciones(usuario);
        }
    }

    public static void verDerechoAVacaciones (Usuario usuario){
        System.out.println("El usuario " + usuario.nombre + " tiene derecho a " + usuario.vacaciones + " de vacaciones");
    }

    public static void verUsuarios (){
        System.out.println("opcion en desarrollo");
    }

}
