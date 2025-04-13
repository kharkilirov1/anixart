package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.tt */
/* loaded from: classes3.dex */
public final class C5817tt implements tj1<FalseClick> {

    /* renamed from: a */
    @NonNull
    private final uj1 f55196a = new uj1();

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: a */
    public final FalseClick mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Long valueOf;
        String m29036c;
        Objects.requireNonNull(this.f55196a);
        xmlPullParser.require(2, null, "FalseClick");
        Objects.requireNonNull(this.f55196a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        if (attributeValue != null) {
            try {
                valueOf = Long.valueOf(Long.parseLong(attributeValue));
            } catch (Exception unused) {
            }
            Objects.requireNonNull(this.f55196a);
            m29036c = uj1.m29036c(xmlPullParser);
            if (TextUtils.isEmpty(m29036c) && valueOf != null) {
                return new FalseClick(m29036c, valueOf.longValue());
            }
        }
        valueOf = null;
        Objects.requireNonNull(this.f55196a);
        m29036c = uj1.m29036c(xmlPullParser);
        return TextUtils.isEmpty(m29036c) ? null : null;
    }
}
