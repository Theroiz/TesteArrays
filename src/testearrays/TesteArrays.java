
package testearrays;

public class TesteArrays {

    public static void main(String[] args) {
        int[] arrayTeste = new int[10];
        
        for(int i=0; i < 10;i++)
        {
            arrayTeste[i] = i;
            System.out.println("O array "+i+" tem o valor "+arrayTeste[i]+" e o tamanho de "+arrayTeste.length);
            
        }
    }
    
}
