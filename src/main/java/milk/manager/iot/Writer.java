/**
 * @author @liosyk
 * Project name: JavaLab234
 * Package name: milk.manager.iot
 * Class: Writer
 **/

package milk.manager.iot;

import milk.products.iot.MilkProduct;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    //1000-7
    public static void writeToCSV(List<MilkProduct> milkbox) throws IOException {
        try(FileWriter writer = new FileWriter("C:\\Users\\alfez\\Desktop\\java repos\\Java2\\JavaLab234\\src\\main\\resources\\META-INF\\result.csv"))
        {
            String previousClassName = "";

            for(MilkProduct box: milkbox){
                if(!box.getClass().getSimpleName().equals(previousClassName)){
                    writer.write(box.getHeaders());
                    writer.write("\r\n");
                    previousClassName = box.getClass().getSimpleName();
                }
                writer.write(box.toCSV());
                writer.write("\r\n");
            }
        }
    }

}
