package org.jsoup.select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* loaded from: classes3.dex */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    /* renamed from: a */
    public String m34963a(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.mo34785n(str)) {
                return next.mo34783c(str);
            }
        }
        return "";
    }

    /* renamed from: b */
    public String m34964b() {
        StringBuilder m34700b = StringUtil.m34700b();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (m34700b.length() != 0) {
                m34700b.append(" ");
            }
            m34700b.append(next.m34765W());
        }
        return StringUtil.m34705g(m34700b);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().mo34732j());
        }
        return elements;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder m34700b = StringUtil.m34700b();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (m34700b.length() != 0) {
                m34700b.append("\n");
            }
            m34700b.append(next.mo34744s());
        }
        return StringUtil.m34705g(m34700b);
    }

    public Elements(int i2) {
        super(i2);
    }

    public Elements(List<Element> list) {
        super(list);
    }
}
