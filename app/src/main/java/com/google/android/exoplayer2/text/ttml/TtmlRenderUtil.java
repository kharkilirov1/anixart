package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes.dex */
final class TtmlRenderUtil {
    @Nullable
    /* renamed from: a */
    public static TtmlStyle m7264a(@Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, Map<String, TtmlStyle> map) {
        int i2 = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i2 < length) {
                    ttmlStyle2.m7265a(map.get(strArr[i2]));
                    i2++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ttmlStyle.m7265a(map.get(strArr[0]));
                return ttmlStyle;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    ttmlStyle.m7265a(map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return ttmlStyle;
    }
}
