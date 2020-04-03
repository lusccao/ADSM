package ex62;


    public static int separa (int vet [], int ini, int fim)
    {
      int c = vet [ ini ], i = ini + 1, j = fim, aux;
      while ( i<=j ) {
         while (i <= fim && vet [ i ] <= c)
         i++;
         while (c < vet [ j ])
         j--;
       if (i < j){
         aux = vet [ i ];
         vet [ i ] = vet [ j ];
         vet [ j ] = aux;
         i++;
         j--;
         }
       }
      vet [ ini ] = vet [ j ];
      vet [ j ] = c;
      return j;
    }
    
   public static void quickSort (int vet [ ], int ini, int fim)
   {
      int j;
      if (ini < fim) {
      // separa a partir do primeiro
      j = separa (vet, ini, fim);
      // ordena a primeira parte
      quickSort (vet, ini, j-1);
      // ordena a segunda parte
      quickSort (vet, j+1, fim);
       }
   }
}