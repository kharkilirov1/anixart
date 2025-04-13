package kotlin.math;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(m31883d1 = {"kotlin/math/MathKt__MathHKt", "kotlin/math/MathKt__MathJVMKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class MathKt extends MathKt__MathJVMKt {
    /* renamed from: a */
    public static int m32221a(long j2) {
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    @SinceKotlin
    /* renamed from: b */
    public static int m32222b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @SinceKotlin
    /* renamed from: c */
    public static int m32223c(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    @SinceKotlin
    /* renamed from: d */
    public static long m32224d(float f2) {
        double d = f2;
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}
