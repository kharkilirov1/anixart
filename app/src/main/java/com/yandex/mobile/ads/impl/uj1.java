package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class uj1 {
    /* renamed from: a */
    public static boolean m29034a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return xmlPullParser.next() != 3;
    }

    /* renamed from: b */
    public static boolean m29035b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    @NonNull
    /* renamed from: c */
    public static String m29036c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str;
        if (xmlPullParser.next() == 4) {
            str = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            str = "";
        }
        return str.trim();
    }

    /* renamed from: d */
    public static void m29037d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i2 = 1;
        while (i2 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* renamed from: a */
    public static void m29033a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, null, str);
    }
}
