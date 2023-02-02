algoritmo "Funcionarios"
var
   nome: caractere
   sal, Nsal: real
   dep: inteiro
inicio
      Escreva ("Nome do funcionário: ")
      Leia (nome)
      Escreva ("Salário do funcionário: ")
      Leia (sal)
      Escreva ("Quantas pessoas dependem desse salário? ")
      Leia (dep)
      Escolha (dep)
              Caso 0
                   Nsal <- sal * 1.05
              Caso 1, 2
                   Nsal <- sal * 1.15
              Caso 3
                   Nsal <- sal * 1.28
              Caso 4
                   Nsal <- sal * 1.4
              Outrocaso
                   Nsal <- sal * 1.6
      Fimescolha
      Escreval ("Novo salário será de: " , Nsal)
fimalgoritmo