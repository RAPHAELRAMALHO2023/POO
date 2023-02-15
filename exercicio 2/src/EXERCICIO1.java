import java.util.Scanner;

public class EXERCICIO1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a velocidade media (unidade km/h)");
        int velocidade = ler.nextInt();
        System.out.println("Entre com o tempo gasto (unidade h)");
        int tempo = ler.nextInt();
        System.out.println("Entre com o consumo (unidade L/km)");
        int consumo = ler.nextInt();
        float combustivel = (velocidade * tempo ) / consumo;
        System.out.print("Gasto de Combustivel na viagem " + combustivel + " L");
    }
}
