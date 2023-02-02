algoritmo "semnome"
var
   dia, mes, pontos, dinheiro: real
inicio
      Escreva ("Quantas horas de atividade você faz por dia? ")
      Leia (dia)
      mes <- dia * 30
      Escreval ("Você fez ", mes , " horas de atividade no mês ")
      Se (mes <= 10) entao
         pontos <- 2 * mes
      Senao
           Se ((mes > 10) e (mes <= 20)) entao
              pontos <- 5 * mes
           Senao
                Se (mes > 20) entao
                   pontos <- 10 * mes
                FimSe
           FimSe
      FimSe
      Escreval ("Você obteve ", pontos , " pontos ")
      dinheiro <- pontos * (5/100)
      Escreva ("Você obteve ", dinheiro , " reais ")
fimalgoritmo