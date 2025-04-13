package com.google.common.xml;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escapers;

@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public class XmlEscapers {
    static {
        Escapers.Builder builder = new Escapers.Builder(null);
        builder.f21665b = (char) 0;
        builder.f21666c = (char) 65533;
        builder.f21667d = "�";
        for (char c2 = 0; c2 <= 31; c2 = (char) (c2 + 1)) {
            if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                builder.m11977a(c2, "�");
            }
        }
        builder.m11977a('&', "&amp;");
        builder.m11977a('<', "&lt;");
        builder.m11977a('>', "&gt;");
        builder.m11978b();
        builder.m11977a('\'', "&apos;");
        builder.m11977a(JsonFactory.DEFAULT_QUOTE_CHAR, "&quot;");
        builder.m11978b();
        builder.m11977a('\t', "&#x9;");
        builder.m11977a('\n', "&#xA;");
        builder.m11977a('\r', "&#xD;");
        builder.m11978b();
    }
}
