import java.util.Scanner;

public class Ex06 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe a area a: ");
            int a = sc.nextInt();
            System.out.print("Informe a area b: ");
            int b = sc.nextInt();
            System.out.print("Informe a base c: ");
            int c = sc.nextInt();
            System.out.println(trianguloValido(a,b,c));

        }
        public static boolean triangulo(int a, int b, int c){
            return a + b > c && a + c > b && c + b > a;
        }
        public static double calculoTriangulo(int a, int b, int c){
            int p = (a + b + c)/2;
            return Math.sqrt(p * (p - a)*(p - b)* (p - c));
        }
        public static String trianguloValido(int a, int b, int c){

            String triangulo = String.valueOf(calculoTriangulo(a, b, c));
            if(triangulo(a, b, c)){
                return triangulo;
            }
            return "Não é tringulo";
        }
    }

