package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Xml;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import com.yandex.mobile.ads.video.parser.vmap.configurator.C6274a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class jh1 {

    /* renamed from: a */
    @NonNull
    private final C5614q1 f51612a;

    /* renamed from: b */
    @NonNull
    private final C5357kt f51613b;

    /* renamed from: c */
    @NonNull
    private final uj1 f51614c;

    /* renamed from: d */
    @NonNull
    private final C6102z1 f51615d;

    /* renamed from: e */
    @NonNull
    private final C6274a f51616e;

    public jh1() {
        uj1 uj1Var = new uj1();
        this.f51614c = uj1Var;
        C5357kt c5357kt = new C5357kt(uj1Var);
        this.f51613b = c5357kt;
        this.f51612a = new C5614q1(uj1Var, c5357kt);
        this.f51615d = new C6102z1();
        this.f51616e = new C6274a();
    }

    @NonNull
    /* renamed from: a */
    public final gh1 m25890a(@NonNull String str) throws IOException, XmlPullParserException, ih1, JSONException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        Objects.requireNonNull(this.f51614c);
        newPullParser.require(2, null, "VMAP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String attributeValue = newPullParser.getAttributeValue(null, "version");
        while (true) {
            Objects.requireNonNull(this.f51614c);
            if (!(newPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f51614c);
            if (newPullParser.getEventType() == 2) {
                String name = newPullParser.getName();
                if ("AdBreak".equals(name)) {
                    C5519o1 m27594a = this.f51612a.m27594a(newPullParser);
                    if (m27594a != null) {
                        arrayList.add(m27594a);
                    }
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f51613b.m26254a(newPullParser));
                } else {
                    Objects.requireNonNull(this.f51614c);
                    uj1.m29037d(newPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            throw new ih1();
        }
        Objects.requireNonNull(this.f51616e);
        AdBreakParameters m30777a = C6274a.m30777a(arrayList2);
        Objects.requireNonNull(this.f51615d);
        C6102z1.m30033a(arrayList, m30777a);
        return hh1.m25206a(arrayList);
    }
}
