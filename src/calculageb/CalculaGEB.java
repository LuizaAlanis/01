package calculageb;
import java.util.Scanner;
public class CalculaGEB 
{

    public static void main(String[] args) 
    {
        int exit = 1 ;
        while (exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("informe seu sexo - 0(masculino); 1(feminino) : ");
            int s = sc.nextInt();
            System.out.println("agora informe a altura em cm: ");
            int alt = sc.nextInt();
            System.out.println("informe seu peso em kg: ");
            double pc = sc.nextInt();
            System.out.println("por fim, sua idade: ");
            int i = sc.nextInt();
            
            if (s==0)
            {
                double geb = 66.47 + (13.75 * pc) + (5 * alt) - (6.76 * i);
                System.out.println("o seu gasto energético basal é: "+geb);  
            }
            if (s==1)
            {
                double geb = 65.1 + (9.56 * pc) + (1.85 * alt) - (4.67 * i);
                System.out.println("o seu gasto energético basal é: "+geb);
            }
            else System.out.println("dado inválido!");
            
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }
}
