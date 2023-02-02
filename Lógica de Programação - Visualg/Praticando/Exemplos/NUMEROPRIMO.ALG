algoritmo "NumeroPrimo"
var
   N, C, Divisiveis: inteiro
inicio
      Escreva ("Qual número deseja descobrir se é primo ou não? ")
      Leia (N)
      C <- 1
      Divisiveis <- 0
      Repita
            Escreva (C)
            Se (N % C = 0) entao
               Divisiveis <- Divisiveis + 1
            FimSe
            C <- C + 1
      Ate (C > N)
      Escreval (" ")
      Escreval ("O numero " , N , " é divisivel por " , Divisiveis , " numeros ")
      Se (Divisiveis = 2) entao
         Escreva ("Numero " , N , " é primo")
      Senao
           Escreva ("Numero " , N , " não é primo")
      FimSe
fimalgoritmo