public class projetoAltura {

    public static void main(String[] args) {
        int i = 0;
        double altura_joao = 134;
        double altura_pedro = 145;
        double crescimento_pedro = 2;
        double crescimento_joao = 2.5;

        while (altura_joao <= altura_pedro) {
            altura_joao += crescimento_joao;
            altura_pedro += crescimento_pedro;
            i++;
        }

        System.out.println("Quantos anos demorou para João ultrapassar Pedro? " + i);
    }
}