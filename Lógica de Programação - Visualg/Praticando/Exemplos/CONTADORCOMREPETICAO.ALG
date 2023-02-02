algoritmo "ContadorComRepeticao"
var
   Resp, Cont, N, R: inteiro
inicio
      Escreva ("Escolha um número: ")
      Leia (Resp)
      Cont <- 0
      Repita
          R <- Resp * Cont
          EscrevaL (Resp , " x " , Cont , " = " , R)
          Cont <- Cont + 1
      Ate (Cont > 10)
fimalgoritmo