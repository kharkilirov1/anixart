package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class e11 implements tj1<C5091ft> {

    /* renamed from: a */
    @NonNull
    private final uj1 f49779a;

    public e11(@NonNull uj1 uj1Var) {
        this.f49779a = uj1Var;
    }

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5091ft mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f49779a);
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        Objects.requireNonNull(this.f49779a);
        String m29036c = uj1.m29036c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(m29036c)) {
            return null;
        }
        return C5400lj.m26474a(attributeValue, m29036c);
    }
}
