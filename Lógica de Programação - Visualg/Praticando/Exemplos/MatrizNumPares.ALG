algoritmo "semnome"
var
   m: vetor[1..3, 1..3] de inteiro
   linha, coluna, totalPar: inteiro
inicio
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 3 faca
           escreva ("Digite valores para posição [", linha, ", ", coluna, "]:")
           leia (m[linha, coluna])
           fimpara
      fimpara

      limpatela

      escreval ("================")
      escreval ("MATRIZ")
      escreval ("================")
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 3 faca
                escreva (m[linha, coluna]:4)
           fimpara
           escreval ()
      fimpara

      escreval ()
      escreval ("=========================")
      escreval ("Números pares da matriz")
      escreval ("=========================")
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 3 faca
                se (m[linha, coluna] % 2 = 0) entao
                   totalPar <- totalPar + 1
                   escreva ("[", linha, ", ", coluna, "] = PAR")
                fimse
           fimpara
           escreval ()
      fimpara
      escreva ("Total de números pares são: ", totalPar)
fimalgoritmo