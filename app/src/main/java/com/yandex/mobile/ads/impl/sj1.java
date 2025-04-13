package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class sj1<T> implements tj1<List<T>> {

    /* renamed from: a */
    @NonNull
    private final uj1 f54696a = new uj1();

    /* renamed from: b */
    @NonNull
    private final String f54697b;

    /* renamed from: c */
    @NonNull
    private final String f54698c;

    /* renamed from: d */
    @NonNull
    private final tj1<T> f54699d;

    public sj1(@NonNull tj1<T> tj1Var, @NonNull String str, @NonNull String str2) {
        this.f54699d = tj1Var;
        this.f54697b = str;
        this.f54698c = str2;
    }

    @Override // com.yandex.mobile.ads.impl.tj1
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        ArrayList arrayList = new ArrayList();
        uj1 uj1Var = this.f54696a;
        String str = this.f54697b;
        Objects.requireNonNull(uj1Var);
        xmlPullParser.require(2, null, str);
        while (true) {
            Objects.requireNonNull(this.f54696a);
            if (!(xmlPullParser.next() != 3)) {
                return arrayList;
            }
            Objects.requireNonNull(this.f54696a);
            if (xmlPullParser.getEventType() == 2) {
                if (this.f54698c.equals(xmlPullParser.getName())) {
                    T mo22361a = this.f54699d.mo22361a(xmlPullParser);
                    if (mo22361a != null) {
                        arrayList.add(mo22361a);
                    }
                } else {
                    Objects.requireNonNull(this.f54696a);
                    uj1.m29037d(xmlPullParser);
                }
            }
        }
    }
}
