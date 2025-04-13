package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ya1 {

    /* renamed from: a */
    @NonNull
    private final uj1 f56786a = new uj1();

    /* renamed from: b */
    @NonNull
    private final ga1 f56787b;

    public ya1(@NonNull Context context) {
        this.f56787b = new ga1(context);
    }

    @Nullable
    /* renamed from: a */
    public final ca1 m29912a(@NonNull String str) throws XmlPullParserException, IOException, JSONException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        Objects.requireNonNull(this.f56786a);
        newPullParser.require(2, null, "VAST");
        return this.f56787b.m24833a(newPullParser);
    }
}
