package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.uq */
/* loaded from: classes3.dex */
final class C5878uq {

    /* renamed from: a */
    @NonNull
    private final uj1 f55615a = new uj1();

    /* renamed from: a */
    public final int m29095a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f55615a);
        xmlPullParser.require(2, null, "Duration");
        Objects.requireNonNull(this.f55615a);
        Long m30151a = zd1.m30151a(uj1.m29036c(xmlPullParser));
        if (m30151a != null) {
            return m30151a.intValue();
        }
        return 0;
    }
}
