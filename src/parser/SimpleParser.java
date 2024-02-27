package parser;

import pattern.PatternData;
import pattern.SimplePattern;
import utils.StringUtils;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleParser {
    static final String CRLF = "\r\n";
    public String parse (String sourceData, String sourceType, String targetType) {
        HashMap<String, PatternData> sourceTypePattern = new SimplePattern(sourceType).getPattern();
        HashMap<String, PatternData> targetTypePattern = new SimplePattern(targetType).getPattern();

        String convertedData = null;
        if (sourceType.equals("md") && targetType.equals("html")) {
            convertedData = parseMdToHtml(sourceData, sourceTypePattern, targetTypePattern);
        }

        return convertedData;
    }

    private static String parseMdToHtml(String markdownText, HashMap<String, PatternData> sourceTypePattern, HashMap<String, PatternData> targetTypePattern) {
        StringBuilder[] convertedHtmlList = StringUtils.toStringBuilderArray(markdownText.split(CRLF));

        for (StringBuilder html : convertedHtmlList) {
            if (html.length() <= 0) {continue;}
            System.out.println(html);
            for (String patternKey : SimplePattern.PATTERN_KEY) {
                PatternData mdPattern = sourceTypePattern.get(patternKey);
                Pattern ptn = Pattern.compile(mdPattern.getRegex());
                Matcher m = ptn.matcher(html);

                if (m.find()) {
                    PatternData HtmlPattern = targetTypePattern.get(patternKey);
                    String htmlStartTag = HtmlPattern.getStartPattern();
                    String htmlEndTag = HtmlPattern.getEndPattern();

                    html.replace(m.start(), mdPattern.getStartPattern().length(), "");
                    html.replace(m.start(),  0, htmlStartTag);
                    html.append(htmlEndTag).append(CRLF);
                }
            }
            System.out.println(html);
        }

        return StringUtils.mergeStringBuilderArray(convertedHtmlList);
    }

}
