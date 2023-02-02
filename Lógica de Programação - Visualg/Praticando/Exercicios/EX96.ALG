algoritmo "semnome"
var
   N1, N2: inteiro
   N3, M: real
funcao media(var A, B: inteiro): real
inicio
N3 <- (A + B)/2
Retorne N3
fimfuncao

inicio
      escreva ("Digite primeira nota: ")
      leia (N1)
      escreva ("Digite segunda nota: ")
      leia (N2)
      M <- media(N1, N2)
      escreva (M)
      // pode tanto colocar o N3 como o M no final, como resposta
fimalgoritmo