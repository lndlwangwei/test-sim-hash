package com.iwangwei.testsimhash.utils;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.springframework.util.StringUtils;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TokenUtils {

    public static List<String> getTokens(String text) {
        List<String> result = new ArrayList<>();
        //创建分词对象
        Analyzer anal = new IKAnalyzer(true);
        StringReader reader = new StringReader(text);
        //分词
        TokenStream ts = null;
        try {
            ts = anal.tokenStream("", reader);
            CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
            //遍历分词数据
            while (ts.incrementToken()) {
                String word = term.toString();
                result.add(word);
            }
            reader.close();
        } catch (Exception e) {
            // do nothing
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getTokens("我是中国人"));
    }
}
