package com.google.android.exoplayer2.decoder;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DecoderReuseEvaluation {

    /* renamed from: a */
    public final String f10613a;

    /* renamed from: b */
    public final Format f10614b;

    /* renamed from: c */
    public final Format f10615c;

    /* renamed from: d */
    public final int f10616d;

    /* renamed from: e */
    public final int f10617e;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i2, int i3) {
        Assertions.m7513a(i2 == 0 || i3 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f10613a = str;
        Objects.requireNonNull(format);
        this.f10614b = format;
        Objects.requireNonNull(format2);
        this.f10615c = format2;
        this.f10616d = i2;
        this.f10617e = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        return this.f10616d == decoderReuseEvaluation.f10616d && this.f10617e == decoderReuseEvaluation.f10617e && this.f10613a.equals(decoderReuseEvaluation.f10613a) && this.f10614b.equals(decoderReuseEvaluation.f10614b) && this.f10615c.equals(decoderReuseEvaluation.f10615c);
    }

    public int hashCode() {
        return this.f10615c.hashCode() + ((this.f10614b.hashCode() + C0576a.m4107f(this.f10613a, (((this.f10616d + 527) * 31) + this.f10617e) * 31, 31)) * 31);
    }
}
