import java.util.Comparator;
import java.util.stream.Stream;

public class ExpressionsMatter
{

    public static void expressionsMatter(int a, int b, int c)
    {
        int result = Stream.of((a * (b + c)), (a * b * c), (a + b * c),(a * b + c), ((a + b) * c)).max(Comparator.naturalOrder()).get();
        System.err.println(result);
    }

}
