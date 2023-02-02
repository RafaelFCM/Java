algoritmo "Gols"
var
   SP, Santos, Gols: inteiro
inicio
      Escreval ("-------------------")
      Escreval ("      PARTIDA      ")
      Escreval ("    SP vs Santos   ")
      Escreval ("-------------------")
      Escreva ("Quantos gols o SP fez? ")
      Leia (SP)
      Escreva ("Quantos gols o Santos fez? ")
      Leia (Santos)
      Gols <- Abs(SP - Santos)
      Escreval ("Foram " , Gols , " gols de diferença ")
      Escolha Gols
              Caso 0
                   Escreva ("Empate")
              Caso 1, 2, 3
                   Escreva ("Partida normal")
              Caso 4, 5, 6
                   Escreva ("Goleada")
      FimEscolha
fimalgoritmo