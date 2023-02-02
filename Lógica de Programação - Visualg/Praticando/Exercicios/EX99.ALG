algoritmo "semnome"
var
   N1, N2: inteiro
   P: real

funcao potencia(var A, B: inteiro): real
var
Pote: real
inicio
Pote <- A ^ B
Retorne (Pote)
fimfuncao

inicio
      escreval ("==========================")
      escreval ("   P O T E N C I A Ç Ã O  ")
      escreval ("==========================")
      escreva ("Digite um numero para ser a base: ")
      leia (N1)
      escreva ("Digite outro numero para ser o expoente: ")
      leia (N2)
      P <- potencia(N1, N2)
      escreva ("O resultado é: ", P)
fimalgoritmo