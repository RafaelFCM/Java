algoritmo "ContarNegativos"
var
C, N, TotN: inteiro
inicio
      C <- 0
      TotN <- 0
      Repita
            Escreva ("Digite um n?mero: ")
            Leia (N)
            Se (N < 0) entao
               TotN <- TotN + 1
            FimSe
            C <- C + 1
      Ate (C > 5)
      Escreva ("S?o " , TotN , " n?meros negativos")
fimalgoritmo