algoritmo "CentroDeDoações"
var
   D, valor: inteiro
inicio
      Escreval ("-----------------------------------")
      Escreval ("CENTRO DE DOAÇÕES PRA CACHORROS MANCOS")
      Escreval ("-----------------------------------")
      Escreval ("Se bem-vindo ao centro de doações" )
      Escreval ("Selecione a quantia que deseja doar")
      Escreval ("[1] Para doar 10 reais")
      Escreval ("[2] Para doar 20 reais")
      Escreval ("[3] Para doar 30 reais")
      Escreval ("[4] Para doar uma outra quantia qualquer")
      Escreval ("[5] Para cancelar")
      Leia (D)
      Escolha D
              Caso 1
                   Valor <- 10
              Caso 2
                   Valor <- 20
              Caso 3
                   Valor <- 30
              Caso 4
                   Escreva ("Insira a quantia que deseja doar: ")
                   Leia (Valor)
              Caso 5
                   Valor <- 0
      FimEscolha
      Escreval ("-----------------------------------")
      Escreval ("      NOSSOS MANCOS AGRADECEM      ")
      Escreval ("-----------------------------------")
fimalgoritmo