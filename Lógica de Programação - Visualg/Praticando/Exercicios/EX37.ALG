algoritmo "semnome"
var
   salAtual, anosTrabalhados, porcentagem, salNovo: real
   genero: caractere
inicio
      Escreva ("Sal?rio atual: ")
      Leia (salAtual)
      Escreva ("Qual o g?nero do funcion?rio: [M/H] ")
      Leia (genero)
      Escreva ("Quantos anos esse funcion?rio trabalha na empresa: ")
      Leia (anosTrabalhados)
      Se ((genero = "M") e (anosTrabalhados < 15)) entao
         porcentagem <- 5/100
      Senao
           Se ((genero = "M") e (anosTrabalhados >= 15) e (anosTrabalhados <= 20)) entao
              porcentagem <- 12/100
           Senao
                Se ((genero = "M") e (anosTrabalhados > 20)) entao
                   porcentagem <- 23/100
                Senao
                     Se ((genero = "H") e (anosTrabalhados < 20)) entao
                        porcentagem <- 3/100
                     Senao
                          Se ((genero = "H") e (anosTrabalhados >= 20) e (anosTrabalhados <= 30)) entao
                             porcentagem <- 12/100
                          Senao
                               Se ((genero = "H") e (anosTrabalhados > 30)) entao
                                  porcentagem <- 23/100
                               FimSe
                          FimSe
                     FimSe
                FimSe
           FimSe
      FimSe
      salNovo <- salAtual + salAtual * porcentagem
      Escreva ("Novo sal?rio: ", salNovo )
fimalgoritmo