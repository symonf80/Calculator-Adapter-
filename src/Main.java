public class Main {
    public static void main(String[] args) {
        calculation();
    }

    public static void calculation() {
        Ints instCalc = new IntsCalculator();
        System.out.println("Результаты вычислений: " + '\n' +
                "Суммирование: " + instCalc.sum(2, 2) + '\n' +
                "Умножение: " + instCalc.mult(10, 22) + '\n' +
                "Возведение в степень: " + instCalc.pow(2, 10));
    }

}
