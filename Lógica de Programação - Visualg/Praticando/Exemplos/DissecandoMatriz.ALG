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

procedimento matrizCompleta ()
inicio
    para l <- 1 ate 4 faca
         para c <- 1 ate 4 faca
              escreva (mat[l,c]:4)
         fimpara
         escreval ()
    fimpara
fimprocedimento

procedimento diagonalPrincipal ()
var
   t: inteiro
inicio
   para l <- 1 ate 4 faca
        escreval (mat[l,l]:4)
        para t <- 1 ate l faca
             escreva ("  ")
        fimpara
   fimpara
   escreval ()
fimprocedimento

procedimento trianguloSuperior ()
var
   t: inteiro
inicio
      para l <- 1 ate 3 faca
         escreva ("    ")
         para c <- l+1 ate 4 faca
             escreva(mat[l,c]:4)
         fimPara
         escreval ()
         para t <- 1 ate l faca
             escreva ("    ")
         fimPara
      fimPara
      escreval ()
fimprocedimento

procedimento trianguloInferior ()
var
   t: inteiro
inicio
      para l <- 2 ate 4 faca
         escreva ("    ")
         para c <- l ate 1 faca
             escreva(mat[l,c]:4)
         fimPara
         escreval ()
         para t <- 1 ate l faca
             escreva ("    ")
         fimPara
      fimPara
      escreval ()
fimprocedimento


limpatela
   repita
      escreval ("==============")
      escreval ("Menu de opções")
      escreval ("==============")
      escreval ("[1] Mostrar a matriz completa")
      escreval ("[2] Mostrar a diagonal principal")
      escreval ("[3] Mostrar o triangulo superior")
      escreval ("[4] Mostrar o triangulo inferior")
      escreval ("[5] Sair")
      escreva ("=======Opção: ")
      aleatorio off
      leia (resp)

      limpatela
      
         escolha resp
             caso 1
                  matrizCompleta ()
             caso 2
                  diagonalPrincipal ()
             caso 3
                  trianguloSuperior ()
             caso 4
                  trianguloInferior ()
             caso 5
                  escreva ("Encerrado")
         fimescolha
   ate (resp = 5)
fimalgoritmo