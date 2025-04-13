package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class DataNode extends LeafNode {
    public DataNode(String str) {
        this.f69003e = str;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Object mo34732j() throws CloneNotSupportedException {
        return (DataNode) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: j */
    public Node mo34732j() {
        return (DataNode) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#data";
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return mo34744s();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(m34780F());
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
    }
}
