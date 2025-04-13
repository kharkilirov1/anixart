package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.pb1;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class oj1 {

    /* renamed from: b */
    @NonNull
    private final zb1 f53281b;

    /* renamed from: a */
    @NonNull
    private final uj1 f53280a = new uj1();

    /* renamed from: c */
    @NonNull
    private final mj1 f53282c = new mj1();

    public oj1(@NonNull Context context) {
        this.f53281b = new zb1(context);
    }

    @NonNull
    /* renamed from: a */
    public final pb1 m27087a(@NonNull XmlPullParser xmlPullParser, @NonNull pb1.C5585a c5585a) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f53280a);
        xmlPullParser.require(2, null, "Wrapper");
        Objects.requireNonNull(this.f53282c);
        c5585a.m27293a(new lj1(Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "allowMultipleAds")), Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "followAdditionalWrappers"))));
        while (true) {
            Objects.requireNonNull(this.f53280a);
            if (!(xmlPullParser.next() != 3)) {
                return c5585a.m27297a();
            }
            Objects.requireNonNull(this.f53280a);
            if (xmlPullParser.getEventType() == 2) {
                if ("VASTAdTagURI".equals(xmlPullParser.getName())) {
                    Objects.requireNonNull(this.f53280a);
                    c5585a.m27305f(uj1.m29036c(xmlPullParser));
                } else {
                    this.f53281b.m30144a(xmlPullParser, c5585a);
                }
            }
        }
    }
}
