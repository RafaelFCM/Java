algoritmo "semnome"
var
   valorHoraTrab, salMensal, valorDependentes, valorHorasExtras, salBruto, imposto, salLiq, gratificacao, salreceber: real
   dependentes, horasExtras, horasTrab: inteiro
inicio
      escreval ("Sal?rio m?nimo: 1212,00")
      escreva ("N?mero de horas trabalhadas: ")
      leia (horasTrab)
      escreva ("Quantos dependentes possui? ")
      leia (dependentes)
      escreva ("N?mero de horas extras trabalhadas: ")
      leia (horasExtras)
      escreval ("===================================================")
      valorHoraTrab <- (1/5) * 1212
      escreval ("Valor hora: ", valorHoraTrab)
      salMensal <- horasTrab * valorHoraTrab
      escreval ("Sal?rio mensal: ", salMensal)
      valorDependentes <- 32 * dependentes
      escreval ("Valor dos dependentes: ", valorDependentes)
      valorHorasExtras <- horasExtras * (valorHoraTrab * (150/100))
      escreval ("Valor horas extras: ", valorHorasExtras)
      salBruto <- salMensal + valorDependentes + valorHorasExtras
      escreval ("Valor sal?rio bruto: ", salBruto)
      se (salBruto < 1500) entao
         imposto <- 0
      senao
           se (salBruto >= 1500) e (salBruto <= 2500) entao
              imposto <- salBruto * (10/100)
           senao
                    imposto <- salBruto * (20/100)
           fimse
      fimse
      escreval ("Valor do imposto: ", imposto)
      salLiq <- salBruto - imposto
      escreval ("Sal?rio l?qudo: ", salLiq)
      se (salLiq <= 1650) entao
         gratificacao <- 225
      senao
           gratificacao <- 185
      fimse
      escreval ("Valor da gratifica??o: ", gratificacao)
      salReceber <- salLiq + gratificacao
      escreva ("Sal?rio a receber: ", salReceber)
fimalgoritmo
