package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.kt */
/* loaded from: classes3.dex */
public final class C5357kt {

    /* renamed from: a */
    @NonNull
    private final uj1 f52143a;

    /* renamed from: b */
    @NonNull
    private final e11 f52144b;

    public C5357kt(@NonNull uj1 uj1Var) {
        this.f52143a = uj1Var;
        this.f52144b = new e11(uj1Var);
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m26254a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f52143a);
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f52143a);
            if (!(xmlPullParser.next() != 3)) {
                return arrayList;
            }
            Objects.requireNonNull(this.f52143a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    C5091ft mo22361a = this.f52144b.mo22361a(xmlPullParser);
                    if (mo22361a != null) {
                        arrayList.add(mo22361a);
                    }
                } else {
                    Objects.requireNonNull(this.f52143a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
