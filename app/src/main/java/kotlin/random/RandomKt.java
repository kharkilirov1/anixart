package kotlin.random;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: Random.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class RandomKt {
    @SinceKotlin
    /* renamed from: a */
    public static final int m32230a(@NotNull Random random, @NotNull IntRange intRange) {
        if (intRange.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + intRange);
        }
        int i2 = intRange.f63381c;
        if (i2 < Integer.MAX_VALUE) {
            return random.mo32229d(intRange.f63380b, i2 + 1);
        }
        int i3 = intRange.f63380b;
        return i3 > Integer.MIN_VALUE ? random.mo32229d(i3 - 1, i2) + 1 : random.mo32226b();
    }
}
