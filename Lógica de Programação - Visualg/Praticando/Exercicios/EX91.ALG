algoritmo "semnome"
var
   N1, N2: inteiro
procedimento Maior(A, B: inteiro)
inicio
Se (A>B) entao
   escreva ("O primeiro numero é maior")
Senao
     Se (A<B) entao
        escreva ("O segundo numero é maior")
     Senao
          escreva ("Os numeros sao iguais")
     FimSe
FimSe
fimprocedimento

inicio
      escreva ("Digite um numero: ")
      leia (N1)
      escreva ("Digite outro numero: ")
      leia (N2)
      Maior(N1, N2)
fimalgoritmo