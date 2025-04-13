package org.jsoup.nodes;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class DocumentType extends LeafNode {
    public DocumentType(String str, String str2, String str3) {
        Validate.m34694g(str);
        Validate.m34694g(str2);
        Validate.m34694g(str3);
        mo34784d("name", str);
        mo34784d("publicId", str2);
        mo34784d("systemId", str3);
        if (!StringUtil.m34702d(mo34783c("publicId"))) {
            mo34784d("pubSysKey", "PUBLIC");
        } else if (!StringUtil.m34702d(mo34783c("systemId"))) {
            mo34784d("pubSysKey", "SYSTEM");
        }
    }

    /* renamed from: H */
    public void m34747H(String str) {
        if (str != null) {
            mo34784d("pubSysKey", str);
        }
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: r */
    public String mo34733r() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: u */
    public void mo34734u(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
        if (this.f69006c > 0 && outputSettings.f68968f) {
            appendable.append('\n');
        }
        if (outputSettings.f68971i != Document.OutputSettings.Syntax.html || (!StringUtil.m34702d(mo34783c("publicId"))) || (!StringUtil.m34702d(mo34783c("systemId")))) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (!StringUtil.m34702d(mo34783c("name"))) {
            appendable.append(" ").append(mo34783c("name"));
        }
        if (!StringUtil.m34702d(mo34783c("pubSysKey"))) {
            appendable.append(" ").append(mo34783c("pubSysKey"));
        }
        if (!StringUtil.m34702d(mo34783c("publicId"))) {
            appendable.append(" \"").append(mo34783c("publicId")).append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        if (!StringUtil.m34702d(mo34783c("systemId"))) {
            appendable.append(" \"").append(mo34783c("systemId")).append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        appendable.append('>');
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: v */
    public void mo34735v(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
    }
}
