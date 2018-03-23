package br.com.s2it.controller;

import br.com.s2it.entity.Numero;

public class NumeroController {

    public int regraEnfileiramentoEntreAeB(Numero valorA, Numero valorB){
        String valorC = "";
        int total = valorA.getValor().length() + valorB.getValor().length();

          for (int i = 0; i <= total; i++) {
              if (i < valorA.getValor().length()) {
                  valorC += valorA.getValor().charAt(i);
              }
              if (i < valorB.getValor().length()) {
                  valorC += valorB.getValor().charAt(i);
              }
          }

        return Integer.parseInt(valorC)  > 1000000 ? -1 : Integer.parseInt(valorC);
    }
}