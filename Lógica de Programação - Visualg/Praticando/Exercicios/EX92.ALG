algoritmo "semnome"
var
   N: inteiro
procedimento parimpar(A: inteiro)
var
B: logico
inicio
B <- A % 2 = 0
Se (B="VERDADEIRO") entao
   escreva ("PAR")
Senao
     escreva ("IMPAR")
FimSe
fimprocedimento
inicio
      escreva ("Digite um numero: ")
      leia (N)
      parimpar(N)
fimalgoritmo