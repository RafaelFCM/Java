algoritmo "semnome"
var
   salB, salL, valorINSS: real
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
      escreval ("Salario liquido é: ", salL)
fimalgoritmo
