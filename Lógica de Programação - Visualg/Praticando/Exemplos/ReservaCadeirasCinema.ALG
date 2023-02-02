algoritmo "semnome"
var
   cadeira: inteiro
   cad: vetor[1..10] de caractere
   resp: caractere
   C: inteiro
   
procedimento mostrarFileira()
var

inicio
      para C <- 1 ate 10 faca
           se (cad[C]="") entao
              escreva ("[ B ", C, " ]")
           senao
                escreva ("[ --- ]")
           fimse
      fimpara
      escreval ()
      escreval ("--------------------------------------------------------------------------------")
fimprocedimento
   
inicio
   repita
         limpatela
         mostrarFileira()
         escreva ("Reservar a cadeira B: ")
         leia (cadeira)
         se (cad[cadeira]="") entao
            cad[cadeira] <- "X"
            escreval ("Cadeira ", cadeira, " reservada!")
         senao
              escrevaL("Lugar ocupado!")
         fimSe
          escreva ("Quer reservar outra cadeira [S/N]? ")
          leia (resp)
   ate (resp = "N")
   para C <- 1 ate 10 faca
       se (cad[C]="X") entao
          escreval ("Cadeiras reservadas: B", C)
       fimse
   fimpara

fimalgoritmo