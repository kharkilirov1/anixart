package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class TextNode extends LeafNode {
    public TextNode(String str) {
        this.f69003e = str;
    }

    /* renamed from: K */
    public static boolean m34796K(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: H */
    public TextNode mo34732j() {
        return (TextNode) super.mo34732j();
    }

    /* renamed from: I */
    public String m34797I() {
        return m34780F();
    }

    /* renamed from: J */
    public boolean m34798J() {
        return StringUtil.m34702d(m34780F());
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#text";
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return mo34744s();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        boolean z;
        boolean z2;
        boolean z3 = outputSettings.f68968f;
        Node node = this.f69005b;
        Element element = node instanceof Element ? (Element) node : null;
        boolean z4 = true;
        boolean z5 = z3 && !Element.m34751T(node);
        if (z5) {
            boolean z6 = (this.f69006c == 0 && element != null && element.f68981e.f69134d) || (this.f69005b instanceof Document);
            boolean z7 = m34790q() == null && element != null && element.f68981e.f69134d;
            Node m34790q = m34790q();
            if ((!(m34790q instanceof Element) || !((Element) m34790q).m34764V(outputSettings)) && (!(m34790q instanceof TextNode) || !((TextNode) m34790q).m34798J())) {
                z4 = false;
            }
            if (z4 && m34798J()) {
                return;
            }
            if (this.f69006c == 0 && element != null && element.f68981e.f69135e && !m34798J()) {
                m34789p(appendable, i2, outputSettings);
            }
            z = z6;
            z2 = z7;
        } else {
            z = false;
            z2 = false;
        }
        Entities.m34776b(appendable, m34780F(), outputSettings, false, z5, z, z2);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
    }
}
