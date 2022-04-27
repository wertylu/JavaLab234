package milk.manager.iot;

import milk.products.iot.MilkProduct;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
public List<MilkProduct> sortByPrice (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        System.out.println("----------in increasing order by price----------\n");
        return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getPriceInUahPerUnit))
                .collect(Collectors.toList());
    }
    System.out.println("----------in decreasing order by price----------\n");
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getPriceInUahPerUnit).reversed()).collect(Collectors.toList());
}
public List<MilkProduct> sortByOrigin (List<MilkProduct> milkbox, boolean descendingOrder){
    if(!descendingOrder){
        System.out.println("----------in increasing order by origin----------\n");
        return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin)).collect(Collectors.toList());
    }
    System.out.println("----------in decreasing order by origin----------\n");
    return  milkbox.stream().sorted(Comparator.comparing(MilkProduct::getOrigin).reversed()).collect(Collectors.toList());

}
public List<MilkProduct> searchByHomeMadeBoolean (List<MilkProduct> milk){
    System.out.println("----------Here are products that are made at home----------\n");
    return milk.stream().filter(MilkProduct::getHomeMade).collect(Collectors.toList());
}
}
