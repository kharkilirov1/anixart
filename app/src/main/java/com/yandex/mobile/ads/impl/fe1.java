package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class fe1 implements tj1<ee1> {

    /* renamed from: a */
    @NonNull
    private final uj1 f50233a = new uj1();

    @Override // com.yandex.mobile.ads.impl.tj1
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ee1 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f50233a);
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f50233a);
            if (!(xmlPullParser.next() != 3)) {
                return new ee1(str, arrayList);
            }
            Objects.requireNonNull(this.f50233a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    Objects.requireNonNull(this.f50233a);
                    String m29036c = uj1.m29036c(xmlPullParser);
                    if (!TextUtils.isEmpty(m29036c)) {
                        str = m29036c;
                    }
                } else if ("ClickTracking".equals(name)) {
                    Objects.requireNonNull(this.f50233a);
                    String m29036c2 = uj1.m29036c(xmlPullParser);
                    if (!TextUtils.isEmpty(m29036c2)) {
                        arrayList.add(m29036c2);
                    }
                } else {
                    Objects.requireNonNull(this.f50233a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
