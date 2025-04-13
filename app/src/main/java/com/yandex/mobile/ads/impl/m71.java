package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class m71 {

    /* renamed from: a */
    @NonNull
    private final uj1 f52590a = new uj1();

    /* renamed from: b */
    @NonNull
    private final l71 f52591b = new l71();

    @NonNull
    /* renamed from: a */
    public final HashMap m26586a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f52590a);
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            Objects.requireNonNull(this.f52590a);
            if (!(xmlPullParser.next() != 3)) {
                return hashMap;
            }
            Objects.requireNonNull(this.f52590a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    j71 mo22361a = this.f52591b.mo22361a(xmlPullParser);
                    if (mo22361a != null) {
                        String m25813a = mo22361a.m25813a();
                        String m25815c = mo22361a.m25815c();
                        if (!hashMap.containsKey(m25813a)) {
                            hashMap.put(m25813a, new ArrayList());
                        }
                        ((List) hashMap.get(m25813a)).add(m25815c);
                    }
                } else {
                    Objects.requireNonNull(this.f52590a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
