package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;
import java.util.Objects;

/* loaded from: classes.dex */
final class SsaDialogueFormat {

    /* renamed from: a */
    public final int f13684a;

    /* renamed from: b */
    public final int f13685b;

    /* renamed from: c */
    public final int f13686c;

    /* renamed from: d */
    public final int f13687d;

    /* renamed from: e */
    public final int f13688e;

    public SsaDialogueFormat(int i2, int i3, int i4, int i5, int i6) {
        this.f13684a = i2;
        this.f13685b = i3;
        this.f13686c = i4;
        this.f13687d = i5;
        this.f13688e = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: a */
    public static SsaDialogueFormat m7235a(String str) {
        char c2;
        Assertions.m7513a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String m11123c = Ascii.m11123c(split[i6].trim());
            Objects.requireNonNull(m11123c);
            switch (m11123c.hashCode()) {
                case 100571:
                    if (m11123c.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556653:
                    if (m11123c.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (m11123c.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (m11123c.equals("style")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                i3 = i6;
            } else if (c2 == 1) {
                i5 = i6;
            } else if (c2 == 2) {
                i2 = i6;
            } else if (c2 == 3) {
                i4 = i6;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i2, i3, i4, i5, split.length);
    }
}
