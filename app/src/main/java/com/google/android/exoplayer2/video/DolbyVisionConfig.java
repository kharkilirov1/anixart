package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class DolbyVisionConfig {

    /* renamed from: a */
    public final String f14789a;

    public DolbyVisionConfig(int i2, int i3, String str) {
        this.f14789a = str;
    }

    @Nullable
    /* renamed from: a */
    public static DolbyVisionConfig m7776a(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.m7636G(2);
        int m7657u = parsableByteArray.m7657u();
        int i2 = m7657u >> 1;
        int m7657u2 = ((parsableByteArray.m7657u() >> 3) & 31) | ((m7657u & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = m7657u2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(m7657u2);
        return new DolbyVisionConfig(i2, m7657u2, sb.toString());
    }
}
