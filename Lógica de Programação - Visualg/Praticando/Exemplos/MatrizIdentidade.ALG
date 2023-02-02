algoritmo "semnome"
var
   m: vetor[1..3, 1..3] de inteiro
   linha, coluna: inteiro
inicio
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 3 faca
           se (linha = coluna) entao
              m[linha, coluna] <- 1
           senao
                m[linha, coluna] <- 0
           fimse
           fimpara
      fimpara
      
      limpatela
      
      escreval ("=================")
      escreval ("MATRIZ IDENTIDADE")
      escreval ("=================")
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 3 faca
                escreva (m[linha, coluna]:4)
           fimpara
           escreval ()
      fimpara
      

fimalgoritmo