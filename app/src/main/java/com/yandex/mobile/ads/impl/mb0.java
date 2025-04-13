package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.jb0;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class mb0 implements tj1<jb0> {

    /* renamed from: a */
    @NonNull
    private final uj1 f52624a = new uj1();

    @Override // com.yandex.mobile.ads.impl.tj1
    @NonNull
    /* renamed from: a */
    public final jb0 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f52624a);
        xmlPullParser.require(2, null, "MediaFile");
        Objects.requireNonNull(this.f52624a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        Objects.requireNonNull(this.f52624a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        Objects.requireNonNull(this.f52624a);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        Objects.requireNonNull(this.f52624a);
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        Objects.requireNonNull(this.f52624a);
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "bitrate");
        Objects.requireNonNull(this.f52624a);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "id");
        Objects.requireNonNull(this.f52624a);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "codec");
        Objects.requireNonNull(this.f52624a);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "vmaf");
        Objects.requireNonNull(this.f52624a);
        String m29036c = uj1.m29036c(xmlPullParser);
        jb0.C5278a m25860h = new jb0.C5278a().m25856d(attributeValue6).m25854b(attributeValue).m25855c(attributeValue3).m25860h(attributeValue4);
        try {
            m25860h.f51575i = Integer.valueOf(attributeValue5).intValue();
        } catch (Exception unused) {
        }
        return m25860h.m25857e(attributeValue2).m25858f(m29036c).m25852a(attributeValue7).m25859g(attributeValue8).m25853a();
    }
}
