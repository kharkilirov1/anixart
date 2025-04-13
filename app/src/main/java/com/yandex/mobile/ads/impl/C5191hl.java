package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.hl */
/* loaded from: classes3.dex */
public final class C5191hl<T> implements tj1<T> {

    /* renamed from: a */
    @NonNull
    private final uj1 f50964a = new uj1();

    /* renamed from: b */
    @NonNull
    private final tj1<T> f50965b;

    public C5191hl(@NonNull C5817tt c5817tt) {
        this.f50965b = c5817tt;
    }

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: a */
    public final T mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f50964a);
        T t = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            Objects.requireNonNull(this.f50964a);
            if (!(xmlPullParser.next() != 3)) {
                return t;
            }
            Objects.requireNonNull(this.f50964a);
            if (xmlPullParser.getEventType() == 2) {
                t = this.f50965b.mo22361a(xmlPullParser);
            }
        }
    }
}
