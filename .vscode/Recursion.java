public class Recursion {
    /*
     * 1. Modele e implemente um método recursivo que calcule o fatorial de um
     * número n passado como parâmetro.
     * 
     * MODELAGEM DESCRITIVA --------------------------------------------------
     * ASSINATURA:
     * int fatorial(int n) --> retorna o fatorial de n
     * 
     * CASOS DE ERRO:
     * n < 0 --> erro, pois fatorial de número negativo não existe
     * 
     * CASOS DE PARADA:
     * n == 0 --> fatorial de 0 é 1
     * n == 1 --> fatorial de 1 é 1
     * 
     * CASOS DE RECURSÃO:
     * fatorial(n) = n * fatorial(n-1)
     */
    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número negativo não tem fatorial");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    /*
     * 2. Modele e implemente um método recursivo que calcule o somatório de um
     * número n (passado como parâmetro) até 0.
     * 
     * MODELAGEM DESCRITIVA --------------------------------------------------
     * ASSINATURA:
     * int soma(int n) --> retorna a soma dos números de 1 a n
     * 
     * CASOS DE ERRO:
     * não existe --> posso calcular o somatorio de qualquer número
     * 
     * CASOS DE PARADA:
     * n == 0 --> soma de 0 é 0
     * 
     * CASOS DE RECURSÃO:
     * se n > 0 --> soma(n) = n + soma(n-1)
     * se n < 0 --> soma(n) = n + soma(n+1)
     */
    public static int soma(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return n + soma(n-1);
        } else {
            return n + soma(n+1);
        }
    }

    /*
     * 3. Modele e implemente um método recursivo que calcule o n-ésimo número da
     * sequência de fibonacci.
     * 
     * MODELAGEM DESCRITIVA --------------------------------------------------
     * ASSINATURA:
     * int fibonacci(int n) --> retorna o n-ésimo número da sequência de fibonacci
     * 
     * CASOS DE ERRO:
     * n < 0 --> erro, pois não existe n-ésimo número negativo da sequência de
     * fibonacci
     * 
     * CASOS DE PARADA:
     * n == 0 --> fibonacci(0) = n
     * n == 1 --> fibonacci(1) = n
     * 
     * CASOS DE RECURSÃO:
     * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Não existe n-ésimo número negativo da sequência de fibonacci");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*
     * 4. Modele e implemente um método recursivo que calcule o somatório dos
     * números inteiros entre os números k e j, passados como parâmetro.
     * 
     * MODELAGEM DESCRITIVA --------------------------------------------------
     * ASSINATURA:
     * int soma(int k, int j) --> retorna a soma dos números de k a j
     * 
     * CASOS DE ERRO:
     * não existe --> posso calcular o somatório de qualquer intervalo de números
     * 
     * CASOS DE PARADA:
     * k == j --> soma(k, j) = j
     * 
     * CASOS DE RECURSÃO:
     * se k < j --> soma(k, j) = j + soma(k, j-1)
     * se k > j --> soma(k, j) = j + soma(k, j+1)
     */

    public static int soma(int k, int j) {
        if (k == j) {
            return j;
        }
        if (k < j) {
            return j + soma(k, j-1);
        } else {
            return j + soma(k, j+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("fatorial(5): " + fatorial(5)); 
        System.out.println("soma(5): " + soma(5)); 
        System.out.println("fibonacci(5): " + fibonacci(5)); 
        System.out.println("soma(1, 5): " + soma(1, 5)); 
    }
}