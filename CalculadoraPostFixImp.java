public class CalculadoraPostFixImp implements CalculadoraPostFix{
    public CalculadoraPostFixImp(){
    }
    Stack<Integer> pila = new VectorStack<>();

    public int evaluar(String exp){
        for(int i=0; i<exp.length(); i++){
            String c = String.valueOf(exp.charAt(i));
            if(c.equals(" ")){
                continue;}else
            if(esOperador(c)){
                int b = pila.pop();
                int a = pila.pop();
                pila.push(aplicarOperacion(a, b, c));
            }else{
            pila.push(Integer.parseInt(c));
            }
        }
        return pila.pop();
    }

    private boolean esOperador(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int aplicarOperacion(int a, int b, String op){
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": 
            if (b == 0) {
                throw new ArithmeticException("División por cero");
            }
            return a / b;
        default:
            throw new IllegalArgumentException("Operador inválido");
    }
    }
}
