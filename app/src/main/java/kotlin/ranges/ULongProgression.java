package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ULongRange.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@WasExperimental
/* loaded from: classes3.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    /* renamed from: b */
    public final long f63403b;

    /* renamed from: c */
    public final long f63404c;

    /* renamed from: d */
    public final long f63405d;

    /* compiled from: ULongRange.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public ULongProgression(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63403b = j2;
        if (j4 > 0) {
            if (UnsignedKt.m31901b(j2, j3) < 0) {
                j3 -= UProgressionUtilKt.m32136b(j3, j2, j4);
            }
        } else {
            if (j4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (UnsignedKt.m31901b(j2, j3) > 0) {
                j3 += UProgressionUtilKt.m32136b(j2, j3, -j4);
            }
        }
        this.f63404c = j3;
        this.f63405d = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.f63403b != uLongProgression.f63403b || this.f63404c != uLongProgression.f63404c || this.f63405d != uLongProgression.f63405d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.f63403b;
        long j3 = this.f63404c;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f63405d;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public boolean isEmpty() {
        long j2 = this.f63405d;
        int m31901b = UnsignedKt.m31901b(this.f63403b, this.f63404c);
        if (j2 > 0) {
            if (m31901b > 0) {
                return true;
            }
        } else if (m31901b < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.f63403b, this.f63404c, this.f63405d, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f63405d > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m31897a(this.f63403b));
            sb.append("..");
            sb.append((Object) ULong.m31897a(this.f63404c));
            sb.append(" step ");
            j2 = this.f63405d;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m31897a(this.f63403b));
            sb.append(" downTo ");
            sb.append((Object) ULong.m31897a(this.f63404c));
            sb.append(" step ");
            j2 = -this.f63405d;
        }
        sb.append(j2);
        return sb.toString();
    }
}
