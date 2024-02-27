package pattern;

import java.util.HashMap;

public class MdPattern {
    static private HashMap<String, PatternData> mdPattern;
    MdPattern () {
        mdPattern = new HashMap<>();
        mdPattern.put("H1", new PatternData("# ","","^# "));
        mdPattern.put("H2", new PatternData("## ","","^## "));
        mdPattern.put("H3", new PatternData("### ","","^### "));
        mdPattern.put("H4", new PatternData("#### ","","^#### "));
        mdPattern.put("H5", new PatternData("##### ","","^##### "));
        mdPattern.put("H6", new PatternData("###### ","","^###### "));
        mdPattern.put("P", new PatternData("","","^(?!<)"));
    }

    public HashMap<String, PatternData> getPattern() {
        return mdPattern;
    }
}
