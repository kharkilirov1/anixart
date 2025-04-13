package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.pb1;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class s20 {

    /* renamed from: a */
    @NonNull
    private final zb1 f54483a;

    /* renamed from: b */
    @NonNull
    private final uj1 f54484b = new uj1();

    public s20(zb1 zb1Var) {
        this.f54483a = zb1Var;
    }

    @Nullable
    /* renamed from: a */
    public final pb1 m28048a(@NonNull XmlPullParser xmlPullParser, @NonNull pb1.C5585a c5585a) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f54484b);
        xmlPullParser.require(2, null, "InLine");
        while (true) {
            Objects.requireNonNull(this.f54484b);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f54484b);
            if (xmlPullParser.getEventType() == 2) {
                this.f54483a.m30144a(xmlPullParser, c5585a);
            }
        }
        pb1 m27297a = c5585a.m27297a();
        if (m27297a.m27266e().isEmpty()) {
            return null;
        }
        return m27297a;
    }
}
