algoritmo "semnome"
var
   salAtual, anosTrabalhados, porcentagem, salNovo: real
   genero: caractere
inicio
      Escreva ("Salário atual: ")
      Leia (salAtual)
      Escreva ("Qual o gênero do funcionário: [M/H] ")
      Leia (genero)
      Escreva ("Quantos anos esse funcionário trabalha na empresa: ")
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
      Escreva ("Novo salário: ", salNovo )
fimalgoritmo