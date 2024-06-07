import java.util.function.LongUnaryOperator;

public class Operator {

    public static LongUnaryOperator unaryOperator = number -> number % 2 == 0?number + 2: number + 1;
}