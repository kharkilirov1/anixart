package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.x5 */
/* loaded from: classes3.dex */
final class C6007x5 {

    /* renamed from: a */
    @NonNull
    private final uj1 f56368a;

    /* renamed from: b */
    @NonNull
    private final C4905c6 f56369b;

    public C6007x5(@NonNull uj1 uj1Var) {
        this.f56368a = uj1Var;
        this.f56369b = new C4905c6(uj1Var);
    }

    @Nullable
    /* renamed from: a */
    public final C5958w5 m29665a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f56368a);
        C5958w5 c5958w5 = null;
        xmlPullParser.require(2, null, "AdSource");
        Objects.requireNonNull(this.f56368a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        Objects.requireNonNull(this.f56368a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        while (true) {
            Objects.requireNonNull(this.f56368a);
            if (!(xmlPullParser.next() != 3)) {
                return c5958w5;
            }
            Objects.requireNonNull(this.f56368a);
            if (xmlPullParser.getEventType() == 2) {
                if ("AdTagURI".equals(xmlPullParser.getName())) {
                    C4842b6 m23026a = this.f56369b.m23026a(xmlPullParser);
                    if (m23026a != null) {
                        c5958w5 = hh1.m25208a(m23026a, attributeValue3);
                    }
                } else {
                    Objects.requireNonNull(this.f56368a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
