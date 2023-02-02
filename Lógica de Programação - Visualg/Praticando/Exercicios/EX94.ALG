algoritmo "semnome"
var
   N1, T1, T2, T3, Cont: inteiro
procedimento fibonacci(A, B, C, D: inteiro)
inicio
Para Cont <- 3 ate D passo 1 faca
C <- A+B
A <- B
B <- C
Escreva (C, " >>")
FimPara
fimprocedimento

inicio
      escreva ("Digite o numero de termos de fibonacci que quer que apareça: ")
      leia (N1)
      escreva ("Fibonacci (", N1, "): ")
      T1 <- 0
      escreva (T1, " >>")
      T2 <- 1
      escreva (T2, " >>")
      fibonacci(T1, T2, T3, N1)
      escreva (" FIM")
fimalgoritmo