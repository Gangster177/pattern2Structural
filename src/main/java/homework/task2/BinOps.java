package homework.task2;

public class BinOps {
    public String sum(String a, String b) {
        int sumA = Integer.parseInt(a, 2);
        int sumB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(sumA + sumB);
    }

    public String mult(String a, String b) {
        int multA = Integer.parseInt(a, 2);
        int multB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(multA * multB);
    }
}