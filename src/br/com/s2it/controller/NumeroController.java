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
//- O primeiro número de C é o primeiro número de A;
//        - O segundo número de C é o primeiro número de B;
//        - O terceiro número de C é o segundo número de A;
//        - O quarto número de C é o segundo número de B;
//        Assim sucessivamente...
//        - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
//        dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
//        - Caso C seja maior que 1.000.000, retornar -1