algoritmo "semnome"
var
   primeiroTermo, razao, soma, somaTotal, proxTermo: real
   C: inteiro
inicio
      Escreva ("Digite o primeiro termo de uma PA: ")
      Leia (primeiroTermo)
      Escreva ("Digite a razão da PA: ")
      Leia (razao)
      Escreva (primeiroTermo)
      proxTermo <- primeiroTermo + razao
      Escreva (proxTermo)
      Para C <- 1 ate 8 faca
      proxTermo <- proxTermo + razao
      Escreva (proxTermo)
      soma <- soma + proxTermo
      FimPara
      somaTotal <- soma + primeiroTermo
      Escreval (" ")
      Escreva ("Soma dos 10 primeiros termos da PA é ", somaTotal)
fimalgoritmo