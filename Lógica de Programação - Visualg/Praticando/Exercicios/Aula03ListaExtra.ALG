algoritmo "semnome"
var
   opcao, sal: inteiro
   imposto, novoSal: real
inicio
      escreva ("Qual o seu salário atual? ")
      leia (sal)
      escreval ("Menu de Opções:")
      escreval ("1. Imposto")
      escreval ("2. Novo salário")
      escreval ("3. Classificação")
      escreva ("Digite a opção desejada: ")
      leia (opcao)
      escreval ("============================")
      escolha opcao
              caso 1
                   se (sal < 1000) entao
                      imposto <- sal * 0.7
                   senao
                        se ((sal >= 1000) e (sal < 1850)) entao
                           imposto <- sal * 0.12
                        senao
                             imposto <- sal * 0.15
                        fimse
                   fimse
                   escreva ("O imposto sobre seu salário é: ", imposto)
              caso 2
                   se (sal < 900) entao
                      novoSal <- sal * 1.05
                   senao
                        se ((sal >= 900) e (sal < 1600)) entao
                           novoSal <- sal * 1.07
                        senao
                             se ((sal >= 1600) e (sal < 2000)) entao
                                novoSal <- sal * 1.09
                             senao
                                  novoSal <- sal * 1.12
                             fimse
                        fimse
                   fimse
                   escreva ("Seu novo salário é: ", novoSal)
              caso 3
                   se (sal <= 1550) entao
                      escreva ("Mal remunerado")
                   senao
                        escreva ("Bem remunerado")
                   fimse
      fimescolha

fimalgoritmo