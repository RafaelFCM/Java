algoritmo "Aproveitamento escolar"
var
   P1, P2, T, L, M: real
   N: caractere
inicio
      Escreva ("Nome do aluno: ")
      Leia (N)
      Escreva ("Nota prova mensal: ")
      Leia (P1)
      Escreva ("Nota prova bimestral: ")
      Leia (P2)
      Escreva ("Nota trabalho: ")
      Leia (T)
      Escreva ("Nota li??o: ")
      Leia (L)
      M <- ((P1*2) + (P2*3) + (T*2) + L) / 8
      Escreval ("M?dia: " , M)
      Se (M < 5) entao
         Escreva ("Nota: F")
      Senao
           Se (M >= 5) e (M < 5.9) entao
              Escreva ("Nota: E")
           Senao
                Se (M >= 5.9) e (M < 6.9) entao
                   Escreva ("Nota: D")
                Senao
                     Se (M >= 6.9) e (M < 7.9) entao
                        Escreva ("Nota: C")
                     Senao
                          Se (M >= 7.9) e (M < 8.9) entao
                             Escreva ("Nota: B")
                          Senao
                               Escreva ("Nota: A")
                          FimSe
                     FimSe
                FimSe
           FimSe
      FimSe
fimalgoritmo