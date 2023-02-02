algoritmo "semnome"
var
   N1, N2, N3: inteiro
procedimento contador(A, B, C: inteiro)
var
Cont: inteiro
inicio
Cont <- A-C
Repita
Cont <- Cont + C
Escreva (Cont, " >>")
Ate (Cont>B-C)
fimprocedimento

inicio
      escreva ("Digite o numero inicial da contagem: ")
      leia (N1)
      escreva ("Digite o numero final da contagem: ")
      leia (N2)
      escreva ("Digite o numero que adiciona na contagem: ")
      leia (N3)
      escreva ("Para os valores de início ", N1, ", de fim ", N2, ", e de incremento ", N3, " teremos ")
      contador(N1, N2, N3)
      Escreva (" FIM")
fimalgoritmo