package pattern;

public class PatternData {
    String startPattern = "";
    String endPattern = "";
    String regex = "";

    public PatternData(String startPattern, String endPattern, String regex) {
        this.startPattern = startPattern;
        this.endPattern = endPattern;
        this.regex = regex;
    }
    public String getStartPattern() {
        return startPattern;
    }
    public String getEndPattern() {
        return endPattern;
    }
    public String getRegex() {
        return regex;
    }
}
