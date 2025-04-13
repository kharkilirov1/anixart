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
final class zb1 {

    /* renamed from: b */
    @NonNull
    private final sj1<C5083fl> f57111b;

    /* renamed from: a */
    @NonNull
    private final uj1 f57110a = new uj1();

    /* renamed from: d */
    @NonNull
    private final xg1 f57113d = new xg1();

    /* renamed from: e */
    @NonNull
    private final dc1 f57114e = new dc1();

    /* renamed from: c */
    @NonNull
    private final sj1<ab1> f57112c = new sj1<>(new fb1(), "AdVerifications", "Verification");

    public zb1(@NonNull Context context) {
        this.f57111b = new sj1<>(new C5448ml(context), "Creatives", "Creative");
    }

    /* renamed from: a */
    public final void m30144a(@NonNull XmlPullParser xmlPullParser, @NonNull pb1.C5585a c5585a) throws IOException, XmlPullParserException, JSONException {
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27299a("impression", uj1.m29036c(xmlPullParser));
            return;
        }
        if ("ViewableImpression".equals(name)) {
            c5585a.m27294a(this.f57113d.mo22361a(xmlPullParser));
            return;
        }
        if ("Error".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27299a("error", uj1.m29036c(xmlPullParser));
            return;
        }
        if ("Survey".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27304e(uj1.m29036c(xmlPullParser));
            return;
        }
        if ("Description".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27302c(uj1.m29036c(xmlPullParser));
            return;
        }
        if ("AdTitle".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27300b(uj1.m29036c(xmlPullParser));
            return;
        }
        if ("AdSystem".equals(name)) {
            Objects.requireNonNull(this.f57110a);
            c5585a.m27295a(uj1.m29036c(xmlPullParser));
            return;
        }
        if ("Creatives".equals(name)) {
            c5585a.m27301b(this.f57111b.mo22361a(xmlPullParser));
            return;
        }
        if ("AdVerifications".equals(name)) {
            c5585a.m27296a(this.f57112c.mo22361a(xmlPullParser));
        } else if ("Extensions".equals(name)) {
            c5585a.m27292a(this.f57114e.m23869a(xmlPullParser));
        } else {
            Objects.requireNonNull(this.f57110a);
            uj1.m29037d(xmlPullParser);
        }
    }
}
