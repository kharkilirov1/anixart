package org.jsoup.nodes;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class XmlDeclaration extends LeafNode {

    /* renamed from: f */
    public final boolean f69016f;

    public XmlDeclaration(String str, boolean z) {
        Validate.m34694g(str);
        this.f69003e = str;
        this.f69016f = z;
    }

    /* renamed from: H */
    public String m34799H() {
        return m34780F();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Object mo34732j() throws CloneNotSupportedException {
        return (XmlDeclaration) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: j */
    public Node mo34732j() {
        return (XmlDeclaration) super.mo34732j();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return mo34744s();
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<").append(this.f69016f ? "!" : "?").append(m34780F());
        Iterator<Attribute> it = mo34767e().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String str = next.f68949b;
            String value = next.getValue();
            if (!str.equals("#declaration")) {
                appendable.append(' ');
                appendable.append(str);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    Entities.m34776b(appendable, value, outputSettings, true, false, false, false);
                    appendable.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                }
            }
        }
        appendable.append(this.f69016f ? "!" : "?").append(">");
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
    }
}
