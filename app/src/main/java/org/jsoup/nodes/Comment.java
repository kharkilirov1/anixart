package org.jsoup.nodes;

import java.io.IOException;
import javax.annotation.Nullable;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class Comment extends LeafNode {
    public Comment(String str) {
        this.f69003e = str;
    }

    /* renamed from: J */
    public static boolean m34736J(String str) {
        return str.length() > 1 && (str.startsWith("!") || str.startsWith("?"));
    }

    @Nullable
    /* renamed from: H */
    public XmlDeclaration m34737H() {
        String m34780F = m34780F();
        String substring = m34780F.substring(1, m34780F.length() - 1);
        if (m34736J(substring)) {
            return null;
        }
        String m16m = C0000a.m16m("<", substring, ">");
        Parser m34889a = Parser.m34889a();
        m34889a.f69124c = ParseSettings.f69119d;
        Document m34891c = m34889a.m34891c(m16m, mo34768f());
        if (m34891c.m34740Y().m34756K().size() <= 0) {
            return null;
        }
        Element element = m34891c.m34740Y().m34755J().get(0);
        XmlDeclaration xmlDeclaration = new XmlDeclaration(NodeUtils.m34795a(m34891c).f69124c.m34888c(element.f68981e.f69132b), m34780F.startsWith("!"));
        xmlDeclaration.mo34767e().m34718a(element.mo34767e());
        return xmlDeclaration;
    }

    /* renamed from: I */
    public boolean m34738I() {
        return m34736J(m34780F());
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Object mo34732j() throws CloneNotSupportedException {
        return (Comment) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: j */
    public Node mo34732j() {
        return (Comment) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#comment";
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return mo34744s();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.f68968f && this.f69006c == 0) {
            Node node = this.f69005b;
            if ((node instanceof Element) && ((Element) node).f68981e.f69135e) {
                m34789p(appendable, i2, outputSettings);
            }
        }
        appendable.append("<!--").append(m34780F()).append("-->");
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
    }
}
