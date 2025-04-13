package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.q1 */
/* loaded from: classes3.dex */
public final class C5614q1 {

    /* renamed from: a */
    @NonNull
    private final uj1 f53888a;

    /* renamed from: b */
    @NonNull
    private final C6007x5 f53889b;

    /* renamed from: d */
    @NonNull
    private final C5357kt f53891d;

    /* renamed from: c */
    @NonNull
    private final C5227if f53890c = new C5227if();

    /* renamed from: e */
    @NonNull
    private final hv0 f53892e = new hv0();

    /* renamed from: f */
    @NonNull
    private final g61 f53893f = new g61();

    /* renamed from: g */
    @NonNull
    private final m71 f53894g = new m71();

    public C5614q1(@NonNull uj1 uj1Var, @NonNull C5357kt c5357kt) {
        this.f53888a = uj1Var;
        this.f53891d = c5357kt;
        this.f53889b = new C6007x5(uj1Var);
    }

    @Nullable
    /* renamed from: a */
    public final C5519o1 m27594a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f53888a);
        xmlPullParser.require(2, null, "AdBreak");
        String attributeValue = xmlPullParser.getAttributeValue(null, "breakId");
        Objects.requireNonNull(this.f53892e);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "repeatAfter");
        if (!TextUtils.isEmpty(attributeValue2)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                simpleDateFormat.parse(attributeValue2).getTime();
                simpleDateFormat.parse("00:00:00").getTime();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
        Objects.requireNonNull(this.f53893f);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "timeOffset");
        e61 m25209b = !TextUtils.isEmpty(attributeValue3) ? hh1.m25209b(attributeValue3) : null;
        Objects.requireNonNull(this.f53890c);
        List arrayList = new ArrayList();
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "breakType");
            if (!TextUtils.isEmpty(attributeValue4)) {
                arrayList = Arrays.asList(attributeValue4.split(","));
            }
        } catch (Exception e3) {
            n60.m26808a(e3, e3.getMessage(), new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        C5958w5 c5958w5 = null;
        while (true) {
            Objects.requireNonNull(this.f53888a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f53888a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("AdSource".equals(name)) {
                    c5958w5 = this.f53889b.m29665a(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f53891d.m26254a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    hashMap.putAll(this.f53894g.m26586a(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f53888a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
        if (c5958w5 == null || m25209b == null || arrayList.isEmpty()) {
            return null;
        }
        return hh1.m25207a(c5958w5, attributeValue, m25209b, arrayList, hashMap);
    }
}
