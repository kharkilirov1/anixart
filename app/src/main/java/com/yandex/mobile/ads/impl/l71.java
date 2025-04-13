package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.parser.offset.C6271a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class l71 implements tj1<j71> {

    /* renamed from: a */
    @NonNull
    private final uj1 f52278a = new uj1();

    /* renamed from: b */
    @NonNull
    private final C6271a f52279b = new C6271a(new HashSet(Arrays.asList(f61.values())));

    @Override // com.yandex.mobile.ads.impl.tj1
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j71 mo22361a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f52278a);
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        Objects.requireNonNull(this.f52278a);
        String m29036c = uj1.m29036c(xmlPullParser);
        boolean z = !TextUtils.isEmpty(attributeValue);
        boolean z2 = !TextUtils.isEmpty(m29036c);
        if (z && z2) {
            return new j71(attributeValue, m29036c, attributeValue2 != null ? this.f52279b.m30767a(attributeValue2) : null);
        }
        return null;
    }
}
