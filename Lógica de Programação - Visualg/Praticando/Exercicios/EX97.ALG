algoritmo "semnome"
var
   N1, N2, N3: inteiro
   M, resp: caractere
funcao Maior(var A, B, C: inteiro): caractere
inicio
Se ((A>B) e (A>C)) entao
   escreva ("O primeiro numero é maior")
Senao
     Se ((A<B) e (C<B)) entao
        escreva ("O segundo numero é maior")
     Senao
          Se ((C>A) e (C>B)) entao
          escreva ("O terceiro numero é maior")
          Senao
               escreva ("Os 3 numeros são iguais")
          FimSe
     FimSe
FimSe
fimfuncao

inicio
      escreva ("Digite um numero: ")
      leia (N1)
      escreva ("Digite outro numero: ")
      leia (N2)
      escreva ("Digite outro numero: ")
      leia (N3)
      M <- Maior(N1, N2, N3)
fimalgoritmo