package milk.lab3.iot;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
public List<MilkProduct> sortByPrice (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        System.out.println("in increasing order by price");
        return  milkbox.stream().sorted(Comparator.comparingDouble(MilkProduct::getPriceInUahPerUnit)).collect(Collectors.toList());
    }
    System.out.println("in decreasing order by price");
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getPriceInUahPerUnit).reversed()).collect(Collectors.toList());
}
public List<MilkProduct> sortByOrigin (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        System.out.println("in increasing order by origin");
        return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin)).collect(Collectors.toList());
    }
    System.out.println("in decreasing order by origin");
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin).reversed()).collect(Collectors.toList());

}
}
