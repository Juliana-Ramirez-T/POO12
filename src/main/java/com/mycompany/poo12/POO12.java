/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo12;

/**
 *
 * @author Juliana
 */
//EJERCICIO PROPUESTO #12
public class POO12 {
    public static void main(String[] args) {
        double paga_hora = 5000, porcentaje = 12.5, salario_bruto, retencion, salario_neto;
        int horas = 48;
        salario_bruto = horas * paga_hora; //salario sin deducciones
        retencion = (salario_bruto * porcentaje)/100; //deduccion.
        salario_neto = salario_bruto - retencion; //salario con deduccion
        System.out.println("Salario bruto : " + salario_bruto);
        System.out.println("Retencion en la fuente : " + retencion);
        System.out.println("Salario neto : " + salario_neto);
    }
}

