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
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class Writer {
    //1000-7
    private Writer() {
        throw new UnsupportedOperationException("Utility class error");
    }
    public static void writeToCSV(final List<MilkProduct> milkbox) throws IOException {
        String separator = System.getProperty("line.separator");
        try (FileWriter writer = new FileWriter("result.csv", StandardCharsets.UTF_8)) {
            String previousClassName = "";

            for (MilkProduct box: milkbox) {
                if (!box.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(separator);
                    writer.write(box.getHeaders());
                    writer.write(separator);
                    previousClassName = box.getClass().getSimpleName();
                }
                writer.write(box.toCSV());
                writer.write(separator);
            }
        }
    }
}
