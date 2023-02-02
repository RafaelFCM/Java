algoritmo "semnome"
var
   valorHoraTrab, salMensal, valorDependentes, valorHorasExtras, salBruto, imposto, salLiq, gratificacao, salreceber: real
   dependentes, horasExtras, horasTrab: inteiro
inicio
      escreval ("Salário mínimo: 1212,00")
      escreva ("Número de horas trabalhadas: ")
      leia (horasTrab)
      escreva ("Quantos dependentes possui? ")
      leia (dependentes)
      escreva ("Número de horas extras trabalhadas: ")
      leia (horasExtras)
      escreval ("===================================================")
      valorHoraTrab <- (1/5) * 1212
      escreval ("Valor hora: ", valorHoraTrab)
      salMensal <- horasTrab * valorHoraTrab
      escreval ("Salário mensal: ", salMensal)
      valorDependentes <- 32 * dependentes
      escreval ("Valor dos dependentes: ", valorDependentes)
      valorHorasExtras <- horasExtras * (valorHoraTrab * (150/100))
      escreval ("Valor horas extras: ", valorHorasExtras)
      salBruto <- salMensal + valorDependentes + valorHorasExtras
      escreval ("Valor salário bruto: ", salBruto)
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
      escreval ("Salário líqudo: ", salLiq)
      se (salLiq <= 1650) entao
         gratificacao <- 225
      senao
           gratificacao <- 185
      fimse
      escreval ("Valor da gratificação: ", gratificacao)
      salReceber <- salLiq + gratificacao
      escreva ("Salário a receber: ", salReceber)
fimalgoritmo
