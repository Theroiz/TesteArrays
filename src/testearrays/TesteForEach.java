
package testearrays;

public class TesteForEach {
    public static void main(String[]args)
    {
        int i = 0;
        String[] nomes = {"heitor","mama","papa","anya"};
        for(String nome : nomes )
        {
        System.out.println("A variavel "+i+" armazena o nome "+nome);
        i++;
        }
    }
}