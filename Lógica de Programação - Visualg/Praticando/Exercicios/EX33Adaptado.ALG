algoritmo "semnome"
var
   sal, anos, valorCasa, valorPrestacao, maxPrestacao, meses: real
inicio
      Escreva ("Qual o valor da casa? ")
      Leia (valorCasa)
      Escreva ("Qual o salário do comprador? ")
      Leia (sal)
      maxPrestacao <- (30/100) * sal
      meses <- valorCasa / maxPrestacao
      anos <- meses / 12
      Escreval ("Vai pagar em ", int(anos) , " anos")
      Escreva ("O valor da prestação mensal é ", maxPrestacao)
fimalgoritmo