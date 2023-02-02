algoritmo "semnome"
var
   l, c, somaDP, maior3c: inteiro
   produto2l: real
   mat: vetor[1..4, 1..4] de inteiro
inicio
      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                escreva ("Digite o valor da posição [", l, ",", c, "]: ")
                leia (mat[l,c])
           fimpara
      fimpara
      
      limpatela

      somaDP <- 0
      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                se (l = c) entao
                   somaDP <- somaDP + mat[l,c]
                fimse
           fimpara
      fimpara

      escreval ()

      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                escreva (mat[l,c]:4)
           fimpara
           escreval ()
      fimpara

      produto2l <- 1
      para c <- 1 ate 4 faca
           produto2l <- produto2l * mat[2,c]
      fimpara

      maior3c <- 1
      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                se ((c = 3) e (mat[l,c] > maior3c)) entao
                   maior3c <- mat[l,c]
                fimse
           fimpara
      fimpara

      escreval ()
      
      escreval ("Soma dos valores da diagonal principal: ", somaDP)
      escreval ("Produto dos valores da 2º linha: ", produto2l)
      escreval ("O maior valor da 3º coluna: ", maior3c)
fimalgoritmo