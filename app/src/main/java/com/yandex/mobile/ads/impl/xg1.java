package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class xg1 implements tj1<wg1> {

    /* renamed from: a */
    @NonNull
    private final uj1 f56471a = new uj1();

    @Override // com.yandex.mobile.ads.impl.tj1
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wg1 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f56471a);
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f56471a);
            if (!(xmlPullParser.next() != 3)) {
                return new wg1(arrayList);
            }
            Objects.requireNonNull(this.f56471a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    Objects.requireNonNull(this.f56471a);
                    arrayList.add(uj1.m29036c(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f56471a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
