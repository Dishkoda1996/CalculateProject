public class CalculateLauncher {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = calc.getInt();
        char operation = calc.getOperation();
        int num2 = calc.getInt();
        calc.ending(num1, num2, operation);
    }
}
