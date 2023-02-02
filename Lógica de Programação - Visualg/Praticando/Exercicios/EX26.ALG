algoritmo "semnome"
var
   N1, N2: inteiro
inicio
      Escreva ("Digite um número inteiro: ")
      Leia (N1)
      Escreva ("Digite outro número inteiro: ")
      Leia (N2)
      Se (N1>N2) entao
         Escreva ("O primeiro valor é o maior ")
         Senao
              Se (N1<N2) entao
                 Escreva ("O segundo valor é o maior ")
                 Senao
                      Se (N1=N2) entao
                         Escreva ("Não existe valor maior, os dois são iguais ")
                      FimSe
              FimSe
      FimSe
fimalgoritmo
