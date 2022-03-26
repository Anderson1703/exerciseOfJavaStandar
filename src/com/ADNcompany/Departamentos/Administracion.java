package com.ADNcompany.Departamentos;

public class Administracion extends Departamento {
    public Administracion(int antigueda){
        this.nombre="Administracion";
        this.clave=5678;
        managerVacations(antigueda);
    }

    @Override
    public void managerVacations(int antiguedad) {
        if (antiguedad<=1){
            this.diasDeDerechoAvaciones= 10;
        }
        else if (antiguedad <= 5){
            this.diasDeDerechoAvaciones= 20;
        }
        else {
            this.diasDeDerechoAvaciones= 30;
        }
    }
}
