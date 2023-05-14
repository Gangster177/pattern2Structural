package homework.task1;

public class Tasks1Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(5)
//                        .addOperand(15)
//                        .calculate(Calculator.Operation.MULT)
//                        .result()
//        );

        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 7));
        System.out.println(calc.mult(0, 22));
        System.out.println(calc.pow(2, 3));
    }
}
