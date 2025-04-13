package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ULong.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lkotlin/ULong;", "", "Companion", "data", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@JvmInline
@WasExperimental
/* loaded from: classes3.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: b */
    public final long f63079b;

    /* compiled from: ULong.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, m31884d2 = {"Lkotlin/ULong$Companion;", "", "Lkotlin/ULong;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @NotNull
    /* renamed from: a */
    public static String m31897a(long j2) {
        if (j2 >= 0) {
            CharsKt.m33863b(10);
            String l2 = Long.toString(j2, 10);
            Intrinsics.m32178g(l2, "toString(this, checkRadix(radix))");
            return l2;
        }
        long j3 = 10;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        CharsKt.m33863b(10);
        String l3 = Long.toString(j4, 10);
        Intrinsics.m32178g(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        CharsKt.m33863b(10);
        String l4 = Long.toString(j5, 10);
        Intrinsics.m32178g(l4, "toString(this, checkRadix(radix))");
        sb.append(l4);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.m31901b(this.f63079b, uLong.f63079b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ULong) && this.f63079b == ((ULong) obj).f63079b;
    }

    public int hashCode() {
        long j2 = this.f63079b;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NotNull
    public String toString() {
        return m31897a(this.f63079b);
    }
}
