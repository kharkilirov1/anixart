package org.jsoup.parser;

import javax.annotation.Nullable;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

/* loaded from: classes3.dex */
public class ParseSettings {

    /* renamed from: c */
    public static final ParseSettings f69118c = new ParseSettings(false, false);

    /* renamed from: d */
    public static final ParseSettings f69119d = new ParseSettings(true, true);

    /* renamed from: a */
    public final boolean f69120a;

    /* renamed from: b */
    public final boolean f69121b;

    public ParseSettings(boolean z, boolean z2) {
        this.f69120a = z;
        this.f69121b = z2;
    }

    /* renamed from: a */
    public static String m34886a(String str) {
        return Normalizer.m34697a(str.trim());
    }

    @Nullable
    /* renamed from: b */
    public Attributes m34887b(@Nullable Attributes attributes) {
        if (attributes != null && !this.f69121b) {
            for (int i2 = 0; i2 < attributes.f68952b; i2++) {
                String[] strArr = attributes.f68953c;
                strArr[i2] = Normalizer.m34697a(strArr[i2]);
            }
        }
        return attributes;
    }

    /* renamed from: c */
    public String m34888c(String str) {
        String trim = str.trim();
        return !this.f69120a ? Normalizer.m34697a(trim) : trim;
    }
}
