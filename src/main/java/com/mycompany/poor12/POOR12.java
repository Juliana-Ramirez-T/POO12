/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor12;

/**
 *
 * @author Juliana
 */
//EJERCICIO RESUELTO #12
import java.util.Scanner;
public class POOR12 {
    public static void main(String[] args) {
        String nom;
        int nht, het=0, hee8=0;
        double vhn, salario;
        System.out.println("Ingrese su nombre:"); //Ingreso de nombre
        Scanner entrada = new Scanner(System.in);
        nom = entrada.nextLine(); //Nombre
        
        System.out.println("Horas trabajadas:"); //Ingreso de nhoras trabajadas
        Scanner numero = new Scanner(System.in);
        nht = numero.nextInt(); //Horas
        
        System.out.println("Valor hora normal trabajada:"); //Ingreso valor hora  trabajada
        Scanner valor = new Scanner(System.in);
        vhn = valor.nextInt(); //Valor
        
        if (nht > 40) {
            het = nht - 40;
            if (het > 8){
                hee8 = het - 8;
                salario = 40 * vhn + 16 * vhn + hee8 * 3 * vhn;
            }
            else {
                salario = 40 * vhn + het * 2 * vhn;
            }
        }
        else {
            salario = nht * vhn;
        }
        
        System.out.println("El trabajador " + nom + " devengo: " + salario);
    }
}

