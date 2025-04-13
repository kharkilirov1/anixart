package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.models.p026ad.JavaScriptResource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class fb1 implements tj1<ab1> {

    /* renamed from: a */
    @NonNull
    private final uj1 f50196a = new uj1();

    /* renamed from: b */
    @NonNull
    private final a70 f50197b = new a70();

    /* renamed from: c */
    @NonNull
    private final eb1 f50198c = new eb1();

    /* renamed from: d */
    @NonNull
    private final m71 f50199d = new m71();

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: a */
    public final ab1 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f50196a);
        xmlPullParser.require(2, null, "Verification");
        Objects.requireNonNull(this.f50196a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap hashMap = new HashMap();
        JavaScriptResource javaScriptResource = null;
        String str = null;
        while (true) {
            Objects.requireNonNull(this.f50196a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f50196a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    javaScriptResource = this.f50197b.m22392a(xmlPullParser);
                } else if ("VerificationParameters".equals(name)) {
                    str = this.f50198c.m24091a(xmlPullParser);
                } else if ("TrackingEvents".equals(name)) {
                    hashMap = this.f50199d.m26586a(xmlPullParser);
                } else {
                    Objects.requireNonNull(this.f50196a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new ab1(attributeValue, javaScriptResource, str, hashMap);
    }
}
