package com.google.android.exoplayer2.p009ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.Cue;
import java.util.Objects;

/* loaded from: classes.dex */
final class SubtitleViewUtils {
    /* renamed from: a */
    public static void m7413a(Cue.Builder builder) {
        builder.f13464k = -3.4028235E38f;
        builder.f13463j = Integer.MIN_VALUE;
        CharSequence charSequence = builder.f13454a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                builder.f13454a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = builder.f13454a;
            Objects.requireNonNull(charSequence2);
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public static float m7414b(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }
}
