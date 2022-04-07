package milk.lab3.iot;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
public List<MilkProduct> sortByPrice (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        return  milkbox.stream().sorted(Comparator.comparingDouble(MilkProduct::getPriceInUahPerUnit)).collect(Collectors.toList());
    }
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getPriceInUahPerUnit).reversed()).collect(Collectors.toList());
}
public List<MilkProduct> sortByOrigin (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin)).collect(Collectors.toList());
    }
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin).reversed()).collect(Collectors.toList());
}
}
