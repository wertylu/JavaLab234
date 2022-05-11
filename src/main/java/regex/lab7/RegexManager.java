/**
 * @author @liosyk
 * Project name: JavaLab234
 * Package name: regex.lab7
 * Class: RegexManager
 **/

package regex.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Data;

@Data
public class RegexManager {
private final String path;
public RegexManager(String path){
    this.path = path;
}
    private String getTextFromFile() {
        File file = new File(path);
        String text = null;

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder result = new StringBuilder();
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }

            text = result.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }
    public String removeWordsWithMoreVowels() {
        String txt = getTextFromFile();
        StringBuilder stringbuilder = new StringBuilder(txt);
        Pattern pattern = Pattern.compile("(?i)\\b[a-z]+\\b");
        Matcher matcher = pattern.matcher(stringbuilder);
        return matcher.replaceAll(m -> {
            int vowels = m.group().replaceAll("(?i)[^aeiou]", "").length();
            if (vowels > m.group().length()-vowels) {
                return "";
            }
            else return m.group();
        }).trim().replaceAll(" +", " ").strip().concat("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegexManager that = (RegexManager) o;
        return Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }


}
