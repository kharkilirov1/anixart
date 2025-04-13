package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5083fl;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.ml */
/* loaded from: classes3.dex */
final class C5448ml implements tj1<C5083fl> {

    /* renamed from: a */
    @NonNull
    private final uj1 f52701a = new uj1();

    /* renamed from: b */
    @NonNull
    private final z70 f52702b = new z70();

    /* renamed from: c */
    @NonNull
    private final C5289jl f52703c;

    public C5448ml(@NonNull Context context) {
        this.f52703c = new C5289jl(context);
    }

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: a */
    public final C5083fl mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f52701a);
        xmlPullParser.require(2, null, "Creative");
        Objects.requireNonNull(this.f52701a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        C5083fl.a aVar = new C5083fl.a();
        aVar.m24636b(attributeValue);
        boolean z = false;
        while (true) {
            Objects.requireNonNull(this.f52701a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f52701a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Linear".equals(name)) {
                    this.f52702b.m30067a(xmlPullParser, aVar);
                    z = true;
                } else if ("CreativeExtensions".equals(name)) {
                    aVar.m24633a(this.f52703c.m25903a(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f52701a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
        if (z) {
            return aVar.m24632a();
        }
        return null;
    }
}
