package br.com.s2it.core;

import br.com.s2it.controller.NumeroController;
import br.com.s2it.entity.Numero;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Numero valorA = new Numero();
        Numero valorB = new Numero();
        NumeroController numeroController = new NumeroController();
        Integer valor = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Infome o valor de A: ");
         valor = s.nextInt();
         valorA.setValor(valor.toString());

        System.out.println("Infome o valor de B: ");
        valor = s.nextInt();
        valorB.setValor(valor.toString());

        int valorC = numeroController.regraEnfileiramentoEntreAeB(valorA, valorB);

        System.out.println("Valor de C: " + valorC);

    }

}
