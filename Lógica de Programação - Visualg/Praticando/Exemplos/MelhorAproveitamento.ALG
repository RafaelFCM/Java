algoritmo "semnome"
var
   A: inteiro
   N1, N2, N3, N4: caractere
   Nota1, Nota2, Nota3, Nota4: real
inicio
      Escreval ("----------------")
      Escreval ("    Escolinha   ")
      Escreval ("----------------")
      Escreva ("Quantos alunos tem na turma? ")
      Leia (A)
      Escolha (A)
              Caso 1
                   Escreval ("Aluno 1")
                   Escreva ("Nome do aluno: ")
                   Leia (N1)
                   Escreva ("Nota de " , N1 , ":")
                   Leia (Nota1)
              Caso 2
                   Escreval ("Aluno 1")
                   Escreva ("Nome do aluno: ")
                   Leia (N1)
                   Escreva ("Nota de " , N1 , ":")
                   Leia (Nota1)
                   Escreval ("Aluno 2")
                   Escreva ("Nome do aluno: ")
                   Leia (N2)
                   Escreva ("Nota de " , N2 , ":")
                   Leia (Nota2)
              Caso 3
                   Escreval ("Aluno 1")
                   Escreva ("Nome do aluno: ")
                   Leia (N1)
                   Escreva ("Nota de " , N1 , ":")
                   Leia (Nota1)
                   Escreval ("Aluno 2")
                   Escreva ("Nome do aluno: ")
                   Leia (N2)
                   Escreva ("Nota de " , N2 , ":")
                   Leia (Nota2)
                   Escreval ("Aluno 3")
                   Escreva ("Nome do aluno: ")
                   Leia (N3)
                   Escreva ("Nota de " , N3 , ":")
                   Leia (Nota3)
              Caso 4
                   Escreval ("Aluno 1")
                   Escreva ("Nome do aluno: ")
                   Leia (N1)
                   Escreva ("Nota de " , N1 , ":")
                   Leia (Nota1)
                   Escreval ("Aluno 2")
                   Escreva ("Nome do aluno: ")
                   Leia (N2)
                   Escreva ("Nota de " , N2 , ":")
                   Leia (Nota2)
                   Escreval ("Aluno 3")
                   Escreva ("Nome do aluno: ")
                   Leia (N3)
                   Escreva ("Nota de " , N3 , ":")
                   Leia (Nota3)
                   Escreval ("Aluno 4")
                   Escreva ("Nome do aluno: ")
                   Leia (N4)
                   Escreva ("Nota de " , N4 , ":")
                   Leia (Nota4)
      FimEscolha
      Se (Nota1 > Nota2) e (Nota1 > Nota3) e (Nota1 > Nota4) entao
            Escreva ("A melhor aproveitamento foi de " , N1 , "com a nota" , Nota1)
      Senao
           Se (Nota2 > Nota1) e (Nota2 > Nota3) e (Nota2 > Nota4) entao
              Escreva ("A melhor aproveitamento foi de " , N2 , "com a nota" , Nota2)
           Senao
                Se (Nota3 > Nota2) e (Nota3 > Nota1) e (Nota3 > Nota4) entao
                   Escreva ("A melhor aproveitamento foi de " , N3 , "com a nota" , Nota3)
                Senao
                     Se (Nota4 > Nota2) e (Nota4 > Nota3) e (Nota4 > Nota1) entao
                        Escreva ("O melhor aproveitamento foi de " , N4 , " com a nota " , Nota4)
                     FimSe
                FimSe
           FimSe
      FimSe
fimalgoritmo