algoritmo "EmprestimoComJurosEParcelas"
var
   A, B, C, D: real
inicio
      Escreva ("Qual a quantia a ser emprestada? ")
      Leia (A)
      Escreval ("O juros é de 20% e pode parcelar em até 48 vezes ")
      B <- A*1.2
      Escreval ("O valor total com juros é de", B , " reais" )
      Escreva ("Quer parcelar em quantas vezes? ")
      Leia (C)
      D <- B/C
      Escreva ("O valor de cada parcela é ", D:7:2 , " reais ")
fimalgoritmo