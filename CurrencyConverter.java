public class CurrencyConverter {
        
    import java.util.Scanner;

    public static void main(String[] args) {
        
     {
       scanner scanner = new scanner (System.in);
       System.out.println("Choose one of the following options");
       System.out.println("1) € to $");
       System.out.println("2) € to British Pound");
       System.out.println("3) € to AUD");
       
       Scanner sc;
    final int exchange = sc.nextInt();
       switch (exchange) {
            case 1: {
            System.out.println("Enter number of €");

            final double eu = sc.nextDouble();

            if (eu>=0){
                System.out.println(eu + "€ is " + eu*1.10 + "$. ");

            }

            else {
                System.out.println("Please insert positive number of €");

            }
            
        break;
            }
            case 2: {
            System.out.println("Enter number of €");

            final double eu = sc.nextDouble ();

            if (eu>=0){
                System.out.println(eu + "€ is " + eu*0.88 + "GBP. ");

            }

            else {
                System.out.println("Please insert positive number of €");

            }
        }

             break;
            case 3: {
            System.out.println("Enter number of €");

            final double eu = sc.nextDouble ();

            if (eu>=0) {
                System.out.println(eu + "€ is " + eu*1.64 + "AUD.");

            }
            else {
                System.out.println("Please insert positive number of €");
        }
           
       }
        break;  
    }
    sc.close();
        }
     }

    @Override
    public String toString() {
        return "CurrencyConverter []";
    }
    }
