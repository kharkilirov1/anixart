package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class eb1 {

    /* renamed from: a */
    @NonNull
    private final uj1 f49900a = new uj1();

    @Nullable
    /* renamed from: a */
    public final String m24091a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f49900a);
        xmlPullParser.require(2, null, "VerificationParameters");
        Objects.requireNonNull(this.f49900a);
        String m29036c = uj1.m29036c(xmlPullParser);
        if (TextUtils.isEmpty(m29036c)) {
            return null;
        }
        return m29036c;
    }
}
