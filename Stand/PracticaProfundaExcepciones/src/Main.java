import java.io.IOException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int valor = array[5]; // Acceso a un índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            // Imprime la pila de llamadas para entender dónde se produjo la excepción
            e.printStackTrace();
        }
    }
}
