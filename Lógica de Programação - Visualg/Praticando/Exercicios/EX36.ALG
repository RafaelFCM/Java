algoritmo "semnome"
var
   dia, mes, pontos, dinheiro: real
inicio
      Escreva ("Quantas horas de atividade voc? faz por dia? ")
      Leia (dia)
      mes <- dia * 30
      Escreval ("Voc? fez ", mes , " horas de atividade no m?s ")
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
      Escreval ("Voc? obteve ", pontos , " pontos ")
      dinheiro <- pontos * (5/100)
      Escreva ("Voc? obteve ", dinheiro , " reais ")
fimalgoritmo