package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.C5238il;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.jl */
/* loaded from: classes3.dex */
public final class C5289jl {

    /* renamed from: d */
    @NonNull
    private final y70 f51638d;

    /* renamed from: c */
    @NonNull
    private final sj1<j71> f51637c = m25902b();

    /* renamed from: b */
    @NonNull
    private final C5191hl<FalseClick> f51636b = m25901a();

    /* renamed from: a */
    @NonNull
    private final uj1 f51635a = new uj1();

    public C5289jl(@NonNull Context context) {
        this.f51638d = new y70(new C5012eb(context));
    }

    @NonNull
    /* renamed from: b */
    private static sj1 m25902b() {
        return new sj1(new l71(), "CreativeExtension", "Tracking");
    }

    @NonNull
    /* renamed from: a */
    public final C5238il m25903a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f51635a);
        xmlPullParser.require(2, null, "CreativeExtensions");
        C5238il.a aVar = new C5238il.a();
        while (true) {
            Objects.requireNonNull(this.f51635a);
            if (!(xmlPullParser.next() != 3)) {
                return new C5238il(aVar);
            }
            Objects.requireNonNull(this.f51635a);
            if (xmlPullParser.getEventType() == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if ("false_click".equals(attributeValue)) {
                        aVar.m25563a(this.f51636b.mo22361a(xmlPullParser));
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        aVar.m25565a(this.f51637c.mo22361a(xmlPullParser));
                    } else if ("yandex_linear_creative_info".equals(attributeValue)) {
                        aVar.m25564a(this.f51638d.m29868a(xmlPullParser));
                    } else {
                        Objects.requireNonNull(this.f51635a);
                        uj1.m29037d(xmlPullParser);
                    }
                } else {
                    Objects.requireNonNull(this.f51635a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private static C5191hl m25901a() {
        return new C5191hl(new C5817tt());
    }
}
