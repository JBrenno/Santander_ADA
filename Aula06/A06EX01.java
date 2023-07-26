import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class A06EX01 {

        public static void main(String[] args) {

            System.out.println(valorProdutoFinal(250.10, Estado.MG) == 267.607); //7%
            System.out.println(valorProdutoFinal(250.10, Estado.RJ) == 287.615); //15%
            System.out.println(valorProdutoFinal(250.10, Estado.SP) == 280.112); //12%
        }

        public static double valorProdutoFinal(double valorProduto, Estado estado) {
            double taxaImposto = 0.0;

            switch(estado){
                case RJ:
                    taxaImposto = 0.15;
                    break;
                case MG:
                    taxaImposto = 0.07;
                    break;
                case SP:
                    taxaImposto = 0.12;
                    break;
                default:
                    System.out.print("Estado não reconhecido");
                    break;

            }
            double valorFinal = valorProduto * (1 + taxaImposto);
            return arredondar(valorFinal);
        }

        public static double arredondar(double numero) {
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
            DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
            return Double.parseDouble(decimalFormat.format(numero));
        }

}

enum Estado{
    MG,
    RJ,
    SP

}


