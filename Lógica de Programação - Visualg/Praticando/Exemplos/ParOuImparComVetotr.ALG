algoritmo "semnome"
var
   v: vetor[1..7] de inteiro
   c, totalPar, totalImpar: inteiro
inicio
      para c <- 1 ate 7 faca
           escreva ("Digite o, ", c, "º valor: ")
           leia (v[c])
           se (v[c] % 2 = 0) entao
              totalPar <- totalPar + 1
           senao
                totalImpar <- totalImpar + 1
           fimse
      fimpara
      
      para c <- 1 ate 7 faca
           se (v[c] % 2 = 0) entao
             escreval ("O ", c, "º valor é par")
           senao
                escreval ("O ", c, "º valor é impar")
           fimse
      fimpara
      
      escreval ("O totalo de pares foi: ", totalPar)
      escreva ("O totalo de impares foi: ", totalImpar)
fimalgoritmo