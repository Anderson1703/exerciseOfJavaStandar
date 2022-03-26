package com.ADNcompany.Departamentos;

public class ServicioAlCliente extends Departamento {
    public ServicioAlCliente(int antigueda){
        this.nombre="Servicio Al Cliente";
        this.clave=9012;
        managerVacations(antigueda);
    }



    @Override
    public void managerVacations(int antiguedad) {
        if (antiguedad<=1){
            this.diasDeDerechoAvaciones = 5;
        }
        else if (antiguedad <= 5){
            this.diasDeDerechoAvaciones = 10;
        }
        else {
            this.diasDeDerechoAvaciones = 15;
        }
    }
}
