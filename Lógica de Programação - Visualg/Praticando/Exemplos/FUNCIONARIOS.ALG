algoritmo "Funcionarios"
var
   nome: caractere
   sal, Nsal: real
   dep: inteiro
inicio
      Escreva ("Nome do funcion?rio: ")
      Leia (nome)
      Escreva ("Sal?rio do funcion?rio: ")
      Leia (sal)
      Escreva ("Quantas pessoas dependem desse sal?rio? ")
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
      Escreval ("Novo sal?rio ser? de: " , Nsal)
fimalgoritmo