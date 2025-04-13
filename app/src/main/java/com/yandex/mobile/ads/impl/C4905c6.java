package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.c6 */
/* loaded from: classes3.dex */
final class C4905c6 {

    /* renamed from: a */
    @NonNull
    private final uj1 f49091a;

    public C4905c6(@NonNull uj1 uj1Var) {
        this.f49091a = uj1Var;
    }

    @Nullable
    /* renamed from: a */
    public final C4842b6 m23026a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f49091a);
        xmlPullParser.require(2, null, "AdTagURI");
        xmlPullParser.getAttributeValue(null, "templateType");
        Objects.requireNonNull(this.f49091a);
        String m29036c = uj1.m29036c(xmlPullParser);
        if (TextUtils.isEmpty(m29036c)) {
            return null;
        }
        return hh1.m25205a(m29036c);
    }
}
