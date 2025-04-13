package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.pb1;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class pc1 {

    /* renamed from: a */
    @NonNull
    private final Context f53536a;

    /* renamed from: c */
    @NonNull
    private final s20 f53538c;

    /* renamed from: d */
    @NonNull
    private final oj1 f53539d;

    /* renamed from: b */
    @NonNull
    private final uj1 f53537b = new uj1();

    /* renamed from: e */
    @NonNull
    private final m01 f53540e = new m01();

    /* renamed from: f */
    @NonNull
    private final r41 f53541f = new r41();

    public pc1(@NonNull Context context) {
        this.f53536a = context.getApplicationContext();
        this.f53538c = new s20(new zb1(context));
        this.f53539d = new oj1(context);
    }

    @Nullable
    /* renamed from: a */
    public final pb1 m27308a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        String m27833a = this.f53541f.m27833a(xmlPullParser);
        Integer m26554a = this.f53540e.m26554a(xmlPullParser);
        Objects.requireNonNull(this.f53537b);
        pb1 pb1Var = null;
        xmlPullParser.require(2, null, "Ad");
        while (true) {
            Objects.requireNonNull(this.f53537b);
            if (!(xmlPullParser.next() != 3)) {
                return pb1Var;
            }
            Objects.requireNonNull(this.f53537b);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("InLine".equals(name)) {
                    pb1.C5585a c5585a = new pb1.C5585a(this.f53536a, false);
                    c5585a.m27303d(m27833a);
                    c5585a.m27298a(m26554a);
                    pb1Var = this.f53538c.m28048a(xmlPullParser, c5585a);
                } else if ("Wrapper".equals(name)) {
                    pb1.C5585a c5585a2 = new pb1.C5585a(this.f53536a, true);
                    c5585a2.m27303d(m27833a);
                    c5585a2.m27298a(m26554a);
                    pb1Var = this.f53539d.m27087a(xmlPullParser, c5585a2);
                } else {
                    Objects.requireNonNull(this.f53537b);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
