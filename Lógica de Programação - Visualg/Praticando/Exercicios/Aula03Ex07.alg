algoritmo "semnome"
var
   valorTotal, pesoGramas, precoTotal, imposto, valorImposto: real
   pesoQuilo, codProduto, codPais, precoGramas: inteiro
inicio
      escreva ("Peso do produto em quilos: ")
      leia (pesoQuilo)
      pesoGramas <- pesoQuilo * 1000
      escreval ("Peso do produto em gramas: ", pesoGramas)
      escreval ("================================================")
      escreva ("Digite o codigo do produto: ")
      leia (codProduto)
      escolha codProduto
              caso 1 ate 4
                   precoGramas <- 15
              caso 5 ate 7
                   precoGramas <- 25
              caso 8 ate 10
                   precoGramas <- 35
      fimescolha
      precoTotal <- precoGramas * pesoGramas
      escreval ("O preço total do produto comprado é: ", precoTotal)
      escreval ("=================================================")
      escreva ("Digite o codigo do país: ")
      leia (codPais)
      escolha codPais
              caso 1
                   imposto <- 0
              caso 2
                   imposto <- (15/100)
              caso 3
                   imposto <- (25/100)
      fimescolha
      valorImposto <- precoTotal * imposto
      escreval ("Valor do imposto é: ", valorImposto)
      valorTotal <- precoTotal + valorImposto
      escreval ("Valor total do produto (com imposto) é: ", valorTotal)
fimalgoritmo
