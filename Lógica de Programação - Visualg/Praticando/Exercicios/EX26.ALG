algoritmo "semnome"
var
   N1, N2: inteiro
inicio
      Escreva ("Digite um n?mero inteiro: ")
      Leia (N1)
      Escreva ("Digite outro n?mero inteiro: ")
      Leia (N2)
      Se (N1>N2) entao
         Escreva ("O primeiro valor ? o maior ")
         Senao
              Se (N1<N2) entao
                 Escreva ("O segundo valor ? o maior ")
                 Senao
                      Se (N1=N2) entao
                         Escreva ("N?o existe valor maior, os dois s?o iguais ")
                      FimSe
              FimSe
      FimSe
fimalgoritmo
