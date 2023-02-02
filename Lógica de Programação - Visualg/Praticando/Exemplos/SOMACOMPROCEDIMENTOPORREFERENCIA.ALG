algoritmo "SomaComProcedimentoPorReferencia"
var
   X, Y: inteiro
   
Procedimento Soma (var A, B: inteiro)
Inicio
      A <- A + 1
      B <- B + 2
      Escreval ("Valor de A =", A)
      Escreval ("Valor de B =", B)
      Escreval ("Valor de A + B =", A + B)
FimProcedimento

inicio
      X <- 4
      Y <- 8
      Soma (X, Y)
      Escreval ("Valor de X =", X)
      Escreva ("Valor de Y =", Y)
fimalgoritmo

//21:18