
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            System.err.println("Erro ao tentar analisar o valor: " + e.getMessage());
        }

        if (valor != null) {
            System.out.println("Valor analisado: " + valor);
        } else {
            System.out.println("Nenhum valor analisado.");
        }
    }
}