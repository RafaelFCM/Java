algoritmo "semnome"
var
   cigarrosDia, diasVidaPerdido, anosFumados, diasFumados, minutosVidaPerdido, cigarrosTotaisFumados: real
inicio
      Escreva ("Qual a quantidade de cigarros fumados por dias? ")
      Leia (cigarrosDia)
      Escreva ("Há quantos anos você fuma? ")
      Leia (anosFumados)
      diasFumados <- anosFumados * 365
      cigarrosTotaisFumados <- diasFumados * cigarrosDia
      Escreval ("Sabendo que um ano tem 365 dias, você já fumou ", diasFumados, " dias")
      Escreval ("Sabendo que 10 min de vida são perdidos por cigarro fumado")
      minutosVidaPerdido <- cigarrosTotaisFumados * 10
      Escreval ("Então você já perdeu ", minutosVidaPerdido , " minutos de vida")
      diasVidaPerdido <- minutosVidaPerdido / 1440
      Escreva ("Então você já perdeu ", diasVidaPerdido:6:2 , " dias de vida")
fimalgoritmo