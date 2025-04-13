package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class ga1 {

    /* renamed from: a */
    @NonNull
    private final uj1 f50540a = new uj1();

    /* renamed from: b */
    @NonNull
    private final pc1 f50541b;

    public ga1(@NonNull Context context) {
        this.f50541b = new pc1(context);
    }

    @Nullable
    /* renamed from: a */
    public final ca1 m24833a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f50540a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f50540a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f50540a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Ad".equals(xmlPullParser.getName())) {
                    pb1 m27308a = this.f50541b.m27308a(xmlPullParser);
                    if (m27308a != null) {
                        arrayList.add(m27308a);
                    }
                } else {
                    Objects.requireNonNull(this.f50540a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new ca1(attributeValue, arrayList);
    }
}
