algoritmo "semnome"
var
   Angulo, A, B, C: Real
inicio
   Escreva ("Informe um ângulo: ")
   Leia (Angulo)
   A <- Abs(Sen(GraupRad(Angulo)))
   B <- Abs(Cos(GraupRad(Angulo)))
   C <- Abs(Tan(GraupRad(Angulo)))
   Escreva ("Sen é " , A , " Cos é ", B , " Tg é ", C)
fimalgoritmo