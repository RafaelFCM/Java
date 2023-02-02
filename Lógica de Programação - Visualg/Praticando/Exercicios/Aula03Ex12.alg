algoritmo "semnome"
var
   nome, classe, tarifa: caractere
   dias, quilometragem: inteiro
   valorDia, valorLoca, valorFinal, desconto: real
inicio
      escreva ("Nome do Cliente: ")
      leia (nome)
      escreval ("Classe: ")
      escreval ("A = Economico ")
      escreval ("F = Intermediario: ")
      escreval ("H = Executivo: ")
      escreva ("Sua opção: ")
      leia (classe)
      escreva ("Quantos dias de aluguel: ")
      leia (dias)
      escreval ("Tarifa: ")
      escreval ("TC = Tarifa Controlada ")
      escreval ("TL = Tarifa Livre ")
      escreva ("Sua opção: ")
      leia (tarifa)
      escreval ()
      escreval ("------------------------LOCALIZA-----------------------")
      escreval ()
      escreval ("Cliente: ", nome)
      escreval ("Quantidade de dias alugados: ", dias)
      escreval ("Classe: ", classe)
      se (tarifa = "TC") entao
         escreva ("Qual a quilometragem? ")
         leia (quilometragem)
      fimse
      se (tarifa = "TC") e (classe = "A") entao
         valorDia <- (399/10) + (46/100) * quilometragem
         valorLoca <- dias * valorDia
      senao
           se (tarifa = "TC") e (classe = "F") entao
              valorDia <- (959/10) + (90/100) * quilometragem
              valorLoca <- dias * valorDia
           senao
                se (tarifa = "TC") e (classe = "H") entao
                   valorDia <- (1579/100) + (150/100) * quilometragem
                   valorLoca <- dias * valorDia
                senao
                     se (tarifa = "TL") e (classe = "A") entao
                        valorDia <- 999/10
                        valorLoca <- dias * valorDia
                     senao
                          se (tarifa = "TL") e (classe = "F") entao
                             valorDia <- 1789/10
                             valorLoca <- dias * valorDia
                          senao
                               se (tarifa = "TL") e (classe = "H") entao
                                  valorDia <- 294
                                  valorLoca <- dias * valorDia
                               fimse
                          fimse
                     fimse
                fimse
           fimse
      fimse
      escreval ("Valor da locação: ", valorLoca)
      se (classe = "A") e (dias > 10) entao
         desconto <- 5/100
      senao
           se (classe = "F") e (dias > 7) entao
              desconto <- 8/100
           senao
                se (classe = "H") e (dias > 5) entao
                   desconto <- 10/100
                fimse
           fimse
      fimse
      escreval ("Valor do desconto: ", desconto)
      valorFinal <- valorLoca - valorLoca * desconto
      escreva ("Valor final da locação: ", valorFinal)
fimalgoritmo
