package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.Nullable;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Selector;

/* loaded from: classes3.dex */
public class Document extends Element {

    /* renamed from: k */
    public OutputSettings f68960k;

    /* renamed from: l */
    public Parser f68961l;

    /* renamed from: m */
    public QuirksMode f68962m;

    /* renamed from: n */
    public boolean f68963n;

    public static class OutputSettings implements Cloneable {

        /* renamed from: e */
        @Nullable
        public Entities.CoreCharset f68967e;

        /* renamed from: b */
        public Entities.EscapeMode f68964b = Entities.EscapeMode.base;

        /* renamed from: c */
        public Charset f68965c = DataUtil.f68895b;

        /* renamed from: d */
        public final ThreadLocal<CharsetEncoder> f68966d = new ThreadLocal<>();

        /* renamed from: f */
        public boolean f68968f = true;

        /* renamed from: g */
        public int f68969g = 1;

        /* renamed from: h */
        public int f68970h = 30;

        /* renamed from: i */
        public Syntax f68971i = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                String name = this.f68965c.name();
                Objects.requireNonNull(outputSettings);
                outputSettings.f68965c = Charset.forName(name);
                outputSettings.f68964b = Entities.EscapeMode.valueOf(this.f68964b.name());
                return outputSettings;
            } catch (CloneNotSupportedException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: b */
        public CharsetEncoder m34746b() {
            CharsetEncoder newEncoder = this.f68965c.newEncoder();
            this.f68966d.set(newEncoder);
            String name = newEncoder.charset().name();
            this.f68967e = name.equals("US-ASCII") ? Entities.CoreCharset.ascii : name.startsWith("UTF-") ? Entities.CoreCharset.utf : Entities.CoreCharset.fallback;
            return newEncoder;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.m34892a("#root", ParseSettings.f69118c), str, null);
        this.f68960k = new OutputSettings();
        this.f68962m = QuirksMode.noQuirks;
        this.f68963n = false;
        this.f68961l = Parser.m34889a();
    }

    /* renamed from: Y */
    public Element m34740Y() {
        Element m34743c0 = m34743c0();
        for (Element element : m34743c0.m34755J()) {
            if ("body".equals(element.f68981e.f69133c) || "frameset".equals(element.f68981e.f69133c)) {
                return element;
            }
        }
        return m34743c0.m34754G("body");
    }

    /* renamed from: Z */
    public void m34741Z(Charset charset) {
        Element element;
        this.f68963n = true;
        OutputSettings outputSettings = this.f68960k;
        outputSettings.f68965c = charset;
        OutputSettings.Syntax syntax = outputSettings.f68971i;
        if (syntax == OutputSettings.Syntax.html) {
            Element m34979b = Selector.m34979b("meta[charset]", this);
            if (m34979b != null) {
                m34979b.mo34784d("charset", this.f68960k.f68965c.displayName());
            } else {
                Element m34743c0 = m34743c0();
                Iterator<Element> it = m34743c0.m34755J().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        element = new Element(Tag.m34892a("head", NodeUtils.m34795a(m34743c0).f69124c), m34743c0.mo34768f(), null);
                        m34743c0.m34762S(element);
                        break;
                    } else {
                        element = it.next();
                        if (element.f68981e.f69133c.equals("head")) {
                            break;
                        }
                    }
                }
                element.m34754G("meta").mo34784d("charset", this.f68960k.f68965c.displayName());
            }
            Iterator<Element> it2 = Selector.m34978a("meta[name=charset]", this).iterator();
            while (it2.hasNext()) {
                it2.next().m34794z();
            }
            return;
        }
        if (syntax == OutputSettings.Syntax.xml) {
            Node node = mo34772m().get(0);
            if (!(node instanceof XmlDeclaration)) {
                XmlDeclaration xmlDeclaration = new XmlDeclaration("xml", false);
                xmlDeclaration.mo34784d("version", "1.0");
                xmlDeclaration.mo34784d("encoding", this.f68960k.f68965c.displayName());
                m34762S(xmlDeclaration);
                return;
            }
            XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
            if (xmlDeclaration2.m34780F().equals("xml")) {
                xmlDeclaration2.mo34784d("encoding", this.f68960k.f68965c.displayName());
                if (xmlDeclaration2.mo34785n("version")) {
                    xmlDeclaration2.mo34784d("version", "1.0");
                    return;
                }
                return;
            }
            XmlDeclaration xmlDeclaration3 = new XmlDeclaration("xml", false);
            xmlDeclaration3.mo34784d("version", "1.0");
            xmlDeclaration3.mo34784d("encoding", this.f68960k.f68965c.displayName());
            m34762S(xmlDeclaration3);
        }
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: a0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Document mo34732j() {
        Document document = (Document) super.mo34732j();
        document.f68960k = this.f68960k.clone();
        return document;
    }

    /* renamed from: c0 */
    public final Element m34743c0() {
        for (Element element : m34755J()) {
            if (element.f68981e.f69133c.equals("html")) {
                return element;
            }
        }
        return m34754G("html");
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#document";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: s */
    public String mo34744s() {
        StringBuilder m34700b = StringUtil.m34700b();
        int size = this.f68983g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f68983g.get(i2).m34791t(m34700b);
        }
        String m34705g = StringUtil.m34705g(m34700b);
        Document m34792w = m34792w();
        if (m34792w == null) {
            m34792w = new Document("");
        }
        return m34792w.f68960k.f68968f ? m34705g.trim() : m34705g;
    }
}
