package org.jsoup.nodes;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;

/* loaded from: classes3.dex */
final class NodeUtils {
    /* renamed from: a */
    public static Parser m34795a(Node node) {
        Parser parser;
        Document m34792w = node.m34792w();
        return (m34792w == null || (parser = m34792w.f68961l) == null) ? new Parser(new HtmlTreeBuilder()) : parser;
    }
}
