algoritmo "semnome"
var
   sal, anos, valorCasa, valorPrestacao, maxPrestacao, meses: real
inicio
      Escreva ("Qual o valor da casa? ")
      Leia (valorCasa)
      Escreva ("Qual o sal?rio do comprador? ")
      Leia (sal)
      Escreva ("Em quantos anos pretende pagar? ")
      Leia (anos)
      meses <- anos * 12
      valorPrestacao <- valorCasa / meses
      maxPrestacao <- sal * (30/100)
      Se (valorPrestacao > maxPrestacao) entao
         Escreval ("Empr?stimo negado")
      Senao
           Se (valorPrestacao <= maxPrestacao) entao
              Escreval ("Empr?stimo aceito")
           FimSe
      FimSe
      Escreva ("O valor da presta??o mensal ? ", valorPrestacao)
fimalgoritmo