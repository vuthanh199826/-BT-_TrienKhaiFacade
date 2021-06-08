import java.util.List;

public class RandomListFacade {
    void printRandomList(){
        RandomList randomList=new RandomList();
        Fill listFilter=new Fill();
        Printer listPrinter=new Printer();
        List<Integer> numbers= randomList.generateList(10,0,10);
        listPrinter.print(numbers);
        System.out.println();
        List<Integer> oddNumbers= listFilter.filter(numbers);
        listPrinter.print(oddNumbers);
    }
}
