package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.models.p026ad.JavaScriptResource;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class a70 {

    /* renamed from: a */
    @NonNull
    private final uj1 f48324a = new uj1();

    @Nullable
    /* renamed from: a */
    public final JavaScriptResource m22392a(@NonNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Objects.requireNonNull(this.f48324a);
        xmlPullParser.require(2, null, "JavaScriptResource");
        Objects.requireNonNull(this.f48324a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
        Objects.requireNonNull(this.f48324a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "browserOptional");
        Boolean valueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        Objects.requireNonNull(this.f48324a);
        String m29036c = uj1.m29036c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || valueOf == null || TextUtils.isEmpty(m29036c)) {
            return null;
        }
        return new JavaScriptResource(attributeValue, m29036c, valueOf.booleanValue());
    }
}
