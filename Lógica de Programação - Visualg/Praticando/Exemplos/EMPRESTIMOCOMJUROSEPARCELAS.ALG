algoritmo "EmprestimoComJurosEParcelas"
var
   A, B, C, D: real
inicio
      Escreva ("Qual a quantia a ser emprestada? ")
      Leia (A)
      Escreval ("O juros ? de 20% e pode parcelar em at? 48 vezes ")
      B <- A*1.2
      Escreval ("O valor total com juros ? de", B , " reais" )
      Escreva ("Quer parcelar em quantas vezes? ")
      Leia (C)
      D <- B/C
      Escreva ("O valor de cada parcela ? ", D:7:2 , " reais ")
fimalgoritmo