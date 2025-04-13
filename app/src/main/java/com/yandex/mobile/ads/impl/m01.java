package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class m01 {

    /* renamed from: a */
    @NonNull
    private final uj1 f52558a = new uj1();

    @Nullable
    /* renamed from: a */
    public final Integer m26554a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Integer num;
        Objects.requireNonNull(this.f52558a);
        xmlPullParser.require(2, null, "Ad");
        try {
            num = Integer.valueOf(xmlPullParser.getAttributeValue(null, "sequence"));
        } catch (NumberFormatException e2) {
            n60.m26808a(e2, e2.toString(), new Object[0]);
            num = null;
        }
        if (num == null || num.intValue() >= 0) {
            return num;
        }
        return null;
    }
}
