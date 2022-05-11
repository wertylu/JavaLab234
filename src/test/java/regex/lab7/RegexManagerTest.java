package regex.lab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexManagerTest {


    @Test
    void removeWordsWithMoreVowels() {
        RegexManager r = new RegexManager("src/main/resources/Files/text");
        String expected = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been\n" +
                "the industry's standard dummy text ever since the 1500s,when\n" +
                "an unknown printer took galley of type and scrambled it to make \n" +
                "type specimen book. It has survived not only five centuries,\n" +
                "but also the leap into electronic typesetting, remaining essentially\n" +
                "unchanged. It was popularised in the 1960s with the of Letraset\n" +
                "sheets containing Lorem Ipsum passages, and more recently with desktop\n" +
                "publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n";
        String actual = r.removeWordsWithMoreVowels();
        assertEquals(expected, actual);

    }
    @Test
    void removeThings() {
        RegexManager r = new RegexManager("src/main/resources/Files/dymmyText");
        String expected = "kkkk askjfdkasjflkjaslfaslfasfasdsddddd gg sas\n";
        String actual = r.removeWordsWithMoreVowels();
        assertEquals(expected, actual);

    }
}