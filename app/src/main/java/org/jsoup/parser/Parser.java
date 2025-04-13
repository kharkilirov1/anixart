package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class Parser {

    /* renamed from: a */
    public TreeBuilder f69122a;

    /* renamed from: b */
    public ParseErrorList f69123b = new ParseErrorList(0, 0);

    /* renamed from: c */
    public ParseSettings f69124c;

    public Parser(TreeBuilder treeBuilder) {
        this.f69122a = treeBuilder;
        this.f69124c = treeBuilder.mo34852c();
    }

    /* renamed from: a */
    public static Parser m34889a() {
        return new Parser(new HtmlTreeBuilder());
    }

    /* renamed from: b */
    public Document m34890b(Reader reader, String str) {
        return this.f69122a.m34954e(reader, str, this);
    }

    /* renamed from: c */
    public Document m34891c(String str, String str2) {
        return this.f69122a.m34954e(new StringReader(str), str2, this);
    }
}
