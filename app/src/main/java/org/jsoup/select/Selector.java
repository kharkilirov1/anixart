package org.jsoup.select;

import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;

/* loaded from: classes3.dex */
public class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static Elements m34978a(String str, Element element) {
        Validate.m34692e(str);
        Evaluator m34968j = QueryParser.m34968j(str);
        Validate.m34694g(m34968j);
        Elements elements = new Elements();
        NodeTraversor.m34967a(new Collector.Accumulator(element, elements, m34968j), element);
        return elements;
    }

    @Nullable
    /* renamed from: b */
    public static Element m34979b(String str, Element element) {
        Validate.m34692e(str);
        return new Collector.FirstFinder(QueryParser.m34968j(str)).m34959a(element, element);
    }
}
