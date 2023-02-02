algoritmo "semnome"
var
   n1, n2, n3: inteiro
inicio
      escreva ("Digite um valor: ")
      leia (n1)
      escreva ("Digite um valor: ")
      leia (n2)
      escreva ("Digite um valor: ")
      leia (n3)
      se (n1 > n2) e (n2 > n3) entao
         escreva (n1, "... ", n2, "... ", n3)
      senao
           se (n1 > n3) e (n3 > n2) entao
              escreva (n1, "... ", n3, "... ", n2)
           senao
                se (n2 > n1) e (n1 > n3) entao
                   escreva (n2, "... ", n1, "... ", n3)
                senao
                     se (n2 > n3) e (n3 > n1) entao
                        escreva (n2, "... ", n3, "... ", n1)
                     senao
                          se (n3 > n1) e (n1 > n2) entao
                             escreva (n3, "... ", n1, "... ", n2)
                          senao
                               se (n3 > n2) e (n2 > n1) entao
                                  escreva (n3, "... ", n2, "... ", n1)
                               fimse
                          fimse
                     fimse
                fimse
           fimse
      fimse
fimalgoritmo
