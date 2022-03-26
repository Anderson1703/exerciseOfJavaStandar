package com.ADNcompany.Departamentos;

public abstract class Departamento {
    public String nombre;
    public int clave;
    public int diasDeDerechoAvaciones;
    abstract void managerVacations(int antiguedad);
}

