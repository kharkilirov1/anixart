package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.z00;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class a10 implements tj1<z00> {

    /* renamed from: a */
    @NonNull
    private final uj1 f48292a = new uj1();

    @Override // com.yandex.mobile.ads.impl.tj1
    @NonNull
    /* renamed from: a */
    public final z00 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        Objects.requireNonNull(this.f48292a);
        int i2 = 2;
        xmlPullParser.require(2, null, "Icon");
        z00.C6100a c6100a = new z00.C6100a();
        Objects.requireNonNull(this.f48292a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        Objects.requireNonNull(this.f48292a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        Objects.requireNonNull(this.f48292a);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        Objects.requireNonNull(this.f48292a);
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        Objects.requireNonNull(this.f48292a);
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        Objects.requireNonNull(this.f48292a);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        Objects.requireNonNull(this.f48292a);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "offset");
        Objects.requireNonNull(this.f48292a);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            Objects.requireNonNull(this.f48292a);
            boolean z = true;
            if (!(xmlPullParser.next() != 3)) {
                return c6100a.m30028f(attributeValue).m30025c(attributeValue2).m30032j(attributeValue3).m30026d(attributeValue4).m30031i(attributeValue5).m30022a(attributeValue6).m30027e(attributeValue7).m30024b(attributeValue8).m30023a();
            }
            Objects.requireNonNull(this.f48292a);
            if (xmlPullParser.getEventType() == i2) {
                String name = xmlPullParser.getName();
                Iterator it = Arrays.asList(z00.EnumC6101b.values()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((z00.EnumC6101b) it.next()).f57009a.equals(name)) {
                        break;
                    }
                }
                if (z) {
                    Objects.requireNonNull(this.f48292a);
                    c6100a.m30029g(name).m30030h(uj1.m29036c(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f48292a);
                    uj1.m29037d(xmlPullParser);
                }
                i2 = 2;
            }
        }
    }
}
