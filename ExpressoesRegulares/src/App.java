import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Início do programa");
        Pattern myPattern = Pattern.compile("feira");
        Matcher myMatcher = myPattern.matcher("sexta-feira");
        System.out.println(myMatcher.find());

        System.out.println("Início do programa");
        Pattern myPattern2 = Pattern.compile("[a-z 0-9 \\- \\. \\_ ]+ @ ([a-z 0-9 \\- \\_]+ \\.)+ [a-z]{2,4}", Pattern.COMMENTS);
        Matcher myMatcher2 = myPattern2.matcher("oliveiraguilherme591@gmail.com");
        System.out.println(myMatcher2.matches());
    }
}