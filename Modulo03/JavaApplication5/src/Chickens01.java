//Exercicio Egg 1 - PT1  

public class Chickens01 {
    public static void main(String[] args) {
        // Cenário 1: eggsPerChicken = 5, chickenCount = 3
        int eggsPerChicken1 = 5;
        int chickenCount1 = 3;

        // Cenário 2: eggsPerChicken = 4, chickenCount = 8
        int eggsPerChicken2 = 4;
        int chickenCount2 = 8;

        // Calculando os ovos coletados em cada cenário
        int totalEggs1 = calculateTotalEggs(eggsPerChicken1, chickenCount1);
        int totalEggs2 = calculateTotalEggs(eggsPerChicken2, chickenCount2);

        // Imprimindo os resultados
        System.out.println("Cenário 1: Total de ovos = " + totalEggs1);
        System.out.println("Cenário 2: Total de ovos = " + totalEggs2);
    }

    public static int calculateTotalEggs(int eggsPerChicken, int chickenCount) {
        // Segunda-feira
        int totalEggs = chickenCount * eggsPerChicken;

        // Terça-feira: uma galinha a mais
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;

        // Quarta-feira: metade das galinhas é comida
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        return totalEggs;
    }
}
