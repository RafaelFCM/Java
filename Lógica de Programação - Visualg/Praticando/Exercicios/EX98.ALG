algoritmo "semnome"
var
   N1, N2, S, SS, C: inteiro
funcao superSomador(var A, B: inteiro): inteiro
inicio
C <- A - 1
S <- 0
Repita
C <- C + 1
S <- S + C
Ate (C = B)
Retorne (S)
fimfuncao

inicio
      escreva ("Digite um numero: ")
      leia (N1)
      escreva ("Digite outro numero: ")
      leia (N2)
      SS <- superSomador(N1, N2)
      escreva ("A soma de todos os valores no intervalo entre ", N1, " e ", N2, " é ", SS)
fimalgoritmo