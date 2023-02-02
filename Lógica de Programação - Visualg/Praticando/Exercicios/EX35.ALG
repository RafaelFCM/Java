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
      Se ((aluguel = 90) e (kmPercorrido <= 100)) entao
         valorPorKm <- 2/10
      Senao
           Se ((aluguel = 90) e (kmPercorrido > 100)) entao
                 valorPorKm <- 1/10
           Senao
                Se ((aluguel = 150) e (kmPercorrido <= 200)) entao
                       valorPorKm <- 3/10
                Senao
                     Se ((aluguel = 150) e (kmPercorrido > 200)) entao
                                 valorPorKm <- 25/100
                     FimSe
                FimSe
           FimSe
      FimSe
      
      pagamento <- aluguel + kmPercorrido * valorPorKm
      Escreva ("Valor a ser pago: ", pagamento)
      
fimalgoritmo