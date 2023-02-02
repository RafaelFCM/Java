algoritmo "Fatorial"
var
   N, Cont, F: inteiro
   R: caractere
inicio
      Repita
      Escreval ("Digite um número: ")
      Leia (N)
      Cont <- N
      F <- 1
              Repita
              F <- F * Cont
              Cont <- Cont - 1
              Ate (Cont < 1)
      Escreval ("Fatorial de " , N , " é " , F)
      Escreval ("Quer continuar? (S/N)")
      Leia (R)
      Ate (R = "N")
fimalgoritmo