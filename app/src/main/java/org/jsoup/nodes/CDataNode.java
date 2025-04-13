package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class CDataNode extends TextNode {
    public CDataNode(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CDataNode mo34732j() {
        return (CDataNode) super.mo34732j();
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(m34780F());
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }
}
