algoritmo "semnome"
var
   l, c, num, resp: inteiro
   mat: vetor[1..4, 1..4] de inteiro
inicio
      para l <- 1 ate 4 faca
           para c <- 1 ate 4 faca
                escreva ("Digite o valor para posição [", l, ", ", c, "]: ")
                leia (mat[l,c])
           fimpara
      fimpara
      
      limpatela
      


      
      
      escreval ("==============")
      escreval ("Menu de opções")
      escreval ("==============")
      escreval ("[1] Mostrar a matriz completa")
      escreval ("[2] Mostrar a diagonal principal")
      escreval ("[3] Mostrar o triangulo superior")
      escreval ("[4] Mostrar o triangulo inferior")
      escreval ("[5] Sair")
      escreva ("Opção: ")
      aleatorio off
      leia (resp)
      escolha resp
             caso 1
                  para l <- 1 ate 4 faca
                       para c <- 1 ate 4 faca
                            escreva (mat[l,c]:4)
                       fimpara
                       escreval ()
                  fimpara
             caso 2
                  para l <- 1 ate 4 faca
                       para c <- 1 ate 4 faca
                       se (l=c) entao
                            escreva (mat[l,c]:6)
                       fimse
                       fimpara
                  fimpara
             caso3
                 para l <- 1 ate 4 faca
                       para c <- 1 ate 4 faca
                       se ((l=1) e (c=2)) ou ((l=1) e (c=3)) ou ((l=1) e (c=4)) ou ((l=2) e (c=3)) ou ((l=2) e (c=4)) ou ((l=3) e (c=4)) entao
                            escreva (mat[l,c]:6)
                       fimse
                       fimpara
                  fimpara
             caso4
             
             caso5
                  fimalgoritmo
      fimescolha
fimalgoritmo

