algoritmo "semnome"
var
   sal, anos, valorCasa, valorPrestacao, maxPrestacao, meses: real
inicio
      Escreva ("Qual o valor da casa? ")
      Leia (valorCasa)
      Escreva ("Qual o salário do comprador? ")
      Leia (sal)
      Escreva ("Em quantos anos pretende pagar? ")
      Leia (anos)
      meses <- anos * 12
      valorPrestacao <- valorCasa / meses
      maxPrestacao <- sal * (30/100)
      Se (valorPrestacao > maxPrestacao) entao
         Escreval ("Empréstimo negado")
      Senao
           Se (valorPrestacao <= maxPrestacao) entao
              Escreval ("Empréstimo aceito")
           FimSe
      FimSe
      Escreva ("O valor da prestação mensal é ", valorPrestacao)
fimalgoritmo