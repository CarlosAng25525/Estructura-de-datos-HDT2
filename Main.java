public class Main {
    public static void main(String[] args) {
        CalculadoraPostFix calc = new CalculadoraPostFixImp();
        System.out.println(calc.evaluar("1 2 + 4 * 3 +"));

    }
}
