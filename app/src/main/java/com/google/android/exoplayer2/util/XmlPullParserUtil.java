package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class XmlPullParserUtil {
    @Nullable
    /* renamed from: a */
    public static String m7758a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m7759b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static boolean m7760c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: d */
    public static boolean m7761d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m7760c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
