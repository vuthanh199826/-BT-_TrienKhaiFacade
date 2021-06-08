import java.util.ArrayList;
import java.util.List;

public class Fill {
    public List<Integer> filter(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                newList.add(number);
            }
        }
        return newList;
    }
}
