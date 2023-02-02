algoritmo "semnome"
var
   L, C: real
   A: real
   D: logico
inicio
      Escreva ("Qual a largura do terreno retangular? ")
      Leia (L)
      Escreva ("Qual o comprimento do terreno retangular? ")
      Leia (C)
      A <- L * C
      Escreval ("A área em metro quadrados é: ", A)
      Se (A<100) entao
         Escreva ("TERRENO POPULAR")
         Senao
              Se ((A>=100) e (A<=500)) entao
                   Escreva ("TERRENO MASTER")
                   Senao
                        Se (A>500) entao
                            Escreva ("TERRENO VIP")
                        FimSe
              FimSe
      FimSe
fimalgoritmo