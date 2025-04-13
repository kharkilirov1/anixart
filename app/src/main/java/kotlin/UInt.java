package kotlin;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* compiled from: UInt.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lkotlin/UInt;", "", "Companion", "data", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@JvmInline
@WasExperimental
/* loaded from: classes3.dex */
public final class UInt implements Comparable<UInt> {

    /* renamed from: b */
    public final int f63075b;

    /* compiled from: UInt.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\t"}, m31884d2 = {"Lkotlin/UInt$Companion;", "", "Lkotlin/UInt;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @NotNull
    /* renamed from: a */
    public static String m31895a(int i2) {
        return String.valueOf(i2 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.m31900a(this.f63075b, uInt.f63075b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof UInt) && this.f63075b == ((UInt) obj).f63075b;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF63075b() {
        return this.f63075b;
    }

    @NotNull
    public String toString() {
        return m31895a(this.f63075b);
    }
}
