import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random random = new Random();
        long[] numeros = new long[30000];
        for (int i = 0; i < numeros.length; i++) {
            int rnd = random.nextInt(1000);
            numeros[i] = rnd;
        }

        long tempoInicial = System.currentTimeMillis();
        System.out.println("Bubble Sort com " + numeros.length + " numeros");
        bubbleSort(numeros);
        //print(numeros);

        long tempoFinal = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
    }

    public static long[] bubbleSort(long numeros[]) {
        long aux = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                long temp = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = temp;
                aux++;
            }
        }
        if (aux != 0)
            bubbleSort(numeros);
        return numeros;
    }

    public static void print(long numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
