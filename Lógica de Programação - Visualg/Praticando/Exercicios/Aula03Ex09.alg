algoritmo "semnome"
var
   salB, salL, valorINSS, imposto: real
inicio
      escreva ("Digite seu salario bruto: ")
      leia (salB)
      se (salB <= 1212) entao
         valorINSS <- salB * (75/1000)
      senao
           se (salB > 1212) e (salB <= 2427) entao
              valorINSS <- salB * (9/100)
           senao
                se (salB > 2427) e (salB <= 3641) entao
                   valorINSS <- salB * (12/100)
                senao
                     se (salB > 3641) e (salB <= 7087) entao
                        valorINSS <- salB * (14/100)
                     senao
                        valorINSS <- 82838/100
                     fimse
                fimse
           fimse
      fimse
      escreval ("Valor do INSS é: ", valorINSS)
      salL <- salB - valorINSS
      escreval ("Salario liquido (com INSS) é: ", salL)
      se (salL <= 190398/100) entao
         escreva (salL)
      senao
           se (salL >= 190399/100) e (salL <= 282665/100) entao
              imposto <- salL * (75/1000) - 14280/100
           senao
                se (salL >= 282666/100) e (salL <= 375105/100) entao
                   imposto <- salL * (15/100) - 35480/100
                senao
                     se (salL >= 375106/100) e (salL <= 466468/100) entao
                        imposto <- salL * (225/1000) - 63613/100
                     senao
                          imposto <- salL * (275/1000) - 86936/100
                     fimse
                fimse
           fimse
      fimse
      escreval ("Imposto: ", imposto:6:2)
      escreva ("Salario liquido (com imposto) é: ", salL:6:2)
fimalgoritmo
