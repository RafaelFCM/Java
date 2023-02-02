algoritmo "semnome"
var
   N1, N2, N3, S: inteiro
funcao somador(var A, B: inteiro): inteiro
inicio
N3 <- A + B
Retorne N3
fimfuncao

inicio
      escreva ("Digite um numero: ")
      leia (N1)
      escreva ("Digite outro numero: ")
      leia (N2)
      S <- somador(N1, N2)
      escreva (N3)
fimalgoritmo