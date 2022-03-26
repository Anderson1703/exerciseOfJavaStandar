package com.ADNcompany.Departamentos;

public class Logistica extends Departamento {
    public Logistica(int antigueda){
        this.nombre="Logistica";
        this.clave=1234;
        managerVacations(antigueda);
    }



    @Override
    public void managerVacations(int antiguedad) {
        if (antiguedad<=1){
            this.diasDeDerechoAvaciones = 7;
        }
        else if (antiguedad <= 5){
            this.diasDeDerechoAvaciones = 14;
        }
        else {
            this.diasDeDerechoAvaciones = 21;
        }
    }
}
