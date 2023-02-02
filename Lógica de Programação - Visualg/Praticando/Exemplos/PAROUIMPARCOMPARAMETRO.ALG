algoritmo "ParOuImparComParametro"
var
   A: inteiro
   C: inteiro
Procedimento ParOuImpar (V: inteiro)
inicio
      Escreval ("Digite um numero: " )
      Leia (A)
      Se (A % 2 = 0) entao
         Escreval (V = "Par")
         Senao
              Escreval (V = "Impar")
      FimSe
FimProcedimento

inicio
      Para C <- 1 ate 3 faca
      ParOuImpar (A)
      FimPara
fimalgoritmo