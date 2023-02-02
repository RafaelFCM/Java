algoritmo "semnome"
var
   tipoCarro: caractere
   diasAluguel: real
   kmPercorrido: real
   aluguel: real
   pagamento: real
   valorPorKm: real

inicio
      Escreva ("Qual tipo de carro foi alugado (popular ou luxo)? ")
      Leia (tipoCarro)
      Escreva ("Quantos dias de aluguel? ")
      Leia (diasAluguel)
      Escreva ("Quantos Km foram percorridos? ")
      Leia (kmPercorrido)
      Se (tipoCarro = "popular") entao
         aluguel <- 90
         Senao
              Se (tipoCarro = "luxo") entao
                 aluguel <- 150
              FimSe
      FimSe
      Se ((tipoCarro = "popular") e (kmPercorrido <= 100)) entao
         valorPorKm = 0.2
      Senao
           Se ((tipoCarro = "popular") e (kmPercorrido > 100)) entao
                 valorPorKm = 0.1
           Senao
                Se ((tipoCarro = "luxo") e (kmPercorrido <= 200)) entao
                       valorPorKm = 0.3
                Senao
                     Se ((tipoCarro = "luxo") e (kmPercorrido > 200)) entao
                                 valorPorKm = 0.25
                     FimSe
                FimSe
           FimSe
      FimSe
      
      pagamento <- aluguel + kmPercorrido * valorPorKm
      Escreva ("Valor a ser pago: ", pagamento)
      
fimalgoritmo