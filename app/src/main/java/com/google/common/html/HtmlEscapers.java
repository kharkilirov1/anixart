package com.google.common.html;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escapers;

@GwtCompatible
/* loaded from: classes.dex */
public final class HtmlEscapers {
    static {
        Escapers.Builder builder = new Escapers.Builder(null);
        builder.m11977a(JsonFactory.DEFAULT_QUOTE_CHAR, "&quot;");
        builder.m11977a('\'', "&#39;");
        builder.m11977a('&', "&amp;");
        builder.m11977a('<', "&lt;");
        builder.m11977a('>', "&gt;");
        builder.m11978b();
    }
}
