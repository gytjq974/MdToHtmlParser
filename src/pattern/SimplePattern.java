package pattern;

import java.util.HashMap;

public class SimplePattern {
    static final public String[] PATTERN_KEY = { "H1", "H2", "H3", "H4", "H5", "H6", "P"};

    private final HashMap<String, PatternData> pattern;

    private final String patternType;

    public SimplePattern(String type) {
        patternType = type.toLowerCase();
        switch (patternType) {
            case "md":
                pattern = new MdPattern().getPattern();
                break;
            case "html":
                pattern = new HtmlPattern().getPattern();
                break;
            default:
                pattern = null;
                break;
        }
    }

    public HashMap<String, PatternData> getPattern () {
        return pattern;
    }

    public String getPatternType () {
        return patternType;
    }
}
