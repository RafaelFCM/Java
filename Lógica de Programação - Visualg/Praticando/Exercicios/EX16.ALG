algoritmo "semnome"
var
   cigarrosDia, diasVidaPerdido, anosFumados, diasFumados, minutosVidaPerdido, cigarrosTotaisFumados: real
inicio
      Escreva ("Qual a quantidade de cigarros fumados por dias? ")
      Leia (cigarrosDia)
      Escreva ("H? quantos anos voc? fuma? ")
      Leia (anosFumados)
      diasFumados <- anosFumados * 365
      cigarrosTotaisFumados <- diasFumados * cigarrosDia
      Escreval ("Sabendo que um ano tem 365 dias, voc? j? fumou ", diasFumados, " dias")
      Escreval ("Sabendo que 10 min de vida s?o perdidos por cigarro fumado")
      minutosVidaPerdido <- cigarrosTotaisFumados * 10
      Escreval ("Ent?o voc? j? perdeu ", minutosVidaPerdido , " minutos de vida")
      diasVidaPerdido <- minutosVidaPerdido / 1440
      Escreva ("Ent?o voc? j? perdeu ", diasVidaPerdido:6:2 , " dias de vida")
fimalgoritmo