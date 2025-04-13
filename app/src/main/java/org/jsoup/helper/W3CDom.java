package org.jsoup.helper;

import javax.xml.parsers.DocumentBuilderFactory;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public class W3CDom {

    public static class W3CBuilder implements NodeVisitor {

        /* renamed from: b */
        public Node f68930b;

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: a */
        public void mo15596a(org.jsoup.nodes.Node node, int i2) {
            throw null;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: b */
        public void mo15597b(org.jsoup.nodes.Node node, int i2) {
            if ((node instanceof Element) && (this.f68930b.getParentNode() instanceof org.w3c.dom.Element)) {
                this.f68930b = this.f68930b.getParentNode();
            }
            throw null;
        }
    }

    public W3CDom() {
        DocumentBuilderFactory.newInstance().setNamespaceAware(true);
    }
}
