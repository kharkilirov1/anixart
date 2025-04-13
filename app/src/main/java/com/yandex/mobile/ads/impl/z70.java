package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5083fl;
import com.yandex.mobile.ads.impl.y11;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class z70 {

    /* renamed from: a */
    @NonNull
    private final uj1 f57064a = new uj1();

    /* renamed from: d */
    @NonNull
    private final z11 f57067d = new z11();

    /* renamed from: f */
    @NonNull
    private final sj1<z00> f57069f = new sj1<>(new a10(), "Icons", "Icon");

    /* renamed from: e */
    @NonNull
    private final sj1<jb0> f57068e = new sj1<>(new mb0(), "MediaFiles", "MediaFile");

    /* renamed from: g */
    @NonNull
    private final sj1<j71> f57070g = new sj1<>(new l71(), "TrackingEvents", "Tracking");

    /* renamed from: b */
    @NonNull
    private final fe1 f57065b = new fe1();

    /* renamed from: c */
    @NonNull
    private final C5878uq f57066c = new C5878uq();

    /* renamed from: a */
    public final void m30067a(@NonNull XmlPullParser xmlPullParser, @NonNull C5083fl.a aVar) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f57064a);
        xmlPullParser.require(2, null, "Linear");
        Objects.requireNonNull(this.f57067d);
        String attributeValue = xmlPullParser.getAttributeValue(null, "skipoffset");
        aVar.m24628a(!TextUtils.isEmpty(attributeValue) ? new y11.C6051a(attributeValue).m29846a() : null);
        while (true) {
            Objects.requireNonNull(this.f57064a);
            if (!(xmlPullParser.next() != 3)) {
                return;
            }
            Objects.requireNonNull(this.f57064a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Duration".equals(name)) {
                    aVar.m24627a(this.f57066c.m29095a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    Iterator it = this.f57070g.mo22361a(xmlPullParser).iterator();
                    while (it.hasNext()) {
                        aVar.m24634a((j71) it.next());
                    }
                } else if ("MediaFiles".equals(name)) {
                    aVar.m24635b(this.f57068e.mo22361a(xmlPullParser));
                } else if ("VideoClicks".equals(name)) {
                    ee1 mo22361a = this.f57065b.mo22361a(xmlPullParser);
                    aVar.m24629a(mo22361a.m24133a());
                    Iterator<String> it2 = mo22361a.m24134b().iterator();
                    while (it2.hasNext()) {
                        aVar.m24634a(new j71("clickTracking", it2.next(), null));
                    }
                } else if ("Icons".equals(name)) {
                    aVar.m24631a((List) this.f57069f.mo22361a(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f57064a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
