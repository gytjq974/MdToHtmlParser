package pattern;

import java.util.HashMap;

public class HtmlPattern {
    static private HashMap<String, PatternData> htmlPattern;

    HtmlPattern () {
        htmlPattern = new HashMap<>();
        htmlPattern.put("H1", new PatternData("<h1>","</h1>",""));
        htmlPattern.put("H2", new PatternData("<h2>","</h2>",""));
        htmlPattern.put("H3", new PatternData("<h3>","</h3>",""));
        htmlPattern.put("H4", new PatternData("<h4>","</h4>",""));
        htmlPattern.put("H5", new PatternData("<h5>","</h5>",""));
        htmlPattern.put("H6", new PatternData("<h6>","</h6>",""));
        htmlPattern.put("P", new PatternData("<p>","</p>",""));

    }

    public HashMap<String, PatternData> getPattern() {
        return htmlPattern;
    }
}
