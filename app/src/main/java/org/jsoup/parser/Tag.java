package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

/* loaded from: classes3.dex */
public class Tag implements Cloneable {

    /* renamed from: k */
    public static final Map<String, Tag> f69125k = new HashMap();

    /* renamed from: l */
    public static final String[] f69126l = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};

    /* renamed from: m */
    public static final String[] f69127m = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: n */
    public static final String[] f69128n = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: o */
    public static final String[] f69129o = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: p */
    public static final String[] f69130p = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: q */
    public static final String[] f69131q = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: b */
    public String f69132b;

    /* renamed from: c */
    public String f69133c;

    /* renamed from: d */
    public boolean f69134d = true;

    /* renamed from: e */
    public boolean f69135e = true;

    /* renamed from: f */
    public boolean f69136f = false;

    /* renamed from: g */
    public boolean f69137g = false;

    /* renamed from: h */
    public boolean f69138h = false;

    /* renamed from: i */
    public boolean f69139i = false;

    /* renamed from: j */
    public boolean f69140j = false;

    static {
        for (String str : new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"}) {
            Tag tag = new Tag(str);
            ((HashMap) f69125k).put(tag.f69132b, tag);
        }
        for (String str2 : f69126l) {
            Tag tag2 = new Tag(str2);
            tag2.f69134d = false;
            tag2.f69135e = false;
            ((HashMap) f69125k).put(tag2.f69132b, tag2);
        }
        for (String str3 : f69127m) {
            Tag tag3 = (Tag) ((HashMap) f69125k).get(str3);
            Validate.m34694g(tag3);
            tag3.f69136f = true;
        }
        for (String str4 : f69128n) {
            Tag tag4 = (Tag) ((HashMap) f69125k).get(str4);
            Validate.m34694g(tag4);
            tag4.f69135e = false;
        }
        for (String str5 : f69129o) {
            Tag tag5 = (Tag) ((HashMap) f69125k).get(str5);
            Validate.m34694g(tag5);
            tag5.f69138h = true;
        }
        for (String str6 : f69130p) {
            Tag tag6 = (Tag) ((HashMap) f69125k).get(str6);
            Validate.m34694g(tag6);
            tag6.f69139i = true;
        }
        for (String str7 : f69131q) {
            Tag tag7 = (Tag) ((HashMap) f69125k).get(str7);
            Validate.m34694g(tag7);
            tag7.f69140j = true;
        }
    }

    public Tag(String str) {
        this.f69132b = str;
        this.f69133c = Normalizer.m34697a(str);
    }

    /* renamed from: a */
    public static Tag m34892a(String str, ParseSettings parseSettings) {
        Validate.m34694g(str);
        HashMap hashMap = (HashMap) f69125k;
        Tag tag = (Tag) hashMap.get(str);
        if (tag != null) {
            return tag;
        }
        String m34888c = parseSettings.m34888c(str);
        Validate.m34692e(m34888c);
        String m34697a = Normalizer.m34697a(m34888c);
        Tag tag2 = (Tag) hashMap.get(m34697a);
        if (tag2 == null) {
            Tag tag3 = new Tag(m34888c);
            tag3.f69134d = false;
            return tag3;
        }
        if (!parseSettings.f69120a || m34888c.equals(m34697a)) {
            return tag2;
        }
        try {
            Tag tag4 = (Tag) super.clone();
            tag4.f69132b = m34888c;
            return tag4;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.f69132b.equals(tag.f69132b) && this.f69136f == tag.f69136f && this.f69135e == tag.f69135e && this.f69134d == tag.f69134d && this.f69138h == tag.f69138h && this.f69137g == tag.f69137g && this.f69139i == tag.f69139i && this.f69140j == tag.f69140j;
    }

    public int hashCode() {
        return (((((((((((((this.f69132b.hashCode() * 31) + (this.f69134d ? 1 : 0)) * 31) + (this.f69135e ? 1 : 0)) * 31) + (this.f69136f ? 1 : 0)) * 31) + (this.f69137g ? 1 : 0)) * 31) + (this.f69138h ? 1 : 0)) * 31) + (this.f69139i ? 1 : 0)) * 31) + (this.f69140j ? 1 : 0);
    }

    public String toString() {
        return this.f69132b;
    }
}
