package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIntRange.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@WasExperimental
/* loaded from: classes3.dex */
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* renamed from: b */
    public final int f63396b;

    /* renamed from: c */
    public final int f63397c;

    /* renamed from: d */
    public final int f63398d;

    /* compiled from: UIntRange.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public UIntProgression(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63396b = i2;
        if (i4 > 0) {
            if (UnsignedKt.m31900a(i2, i3) < 0) {
                i3 -= UProgressionUtilKt.m32135a(i3, i2, i4);
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (UnsignedKt.m31900a(i2, i3) > 0) {
                i3 += UProgressionUtilKt.m32135a(i2, i3, -i4);
            }
        }
        this.f63397c = i3;
        this.f63398d = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (this.f63396b != uIntProgression.f63396b || this.f63397c != uIntProgression.f63397c || this.f63398d != uIntProgression.f63398d) {
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
        return (((this.f63396b * 31) + this.f63397c) * 31) + this.f63398d;
    }

    public boolean isEmpty() {
        if (this.f63398d > 0) {
            if (UnsignedKt.m31900a(this.f63396b, this.f63397c) > 0) {
                return true;
            }
        } else if (UnsignedKt.m31900a(this.f63396b, this.f63397c) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.f63396b, this.f63397c, this.f63398d, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f63398d > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m31895a(this.f63396b));
            sb.append("..");
            sb.append((Object) UInt.m31895a(this.f63397c));
            sb.append(" step ");
            i2 = this.f63398d;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m31895a(this.f63396b));
            sb.append(" downTo ");
            sb.append((Object) UInt.m31895a(this.f63397c));
            sb.append(" step ");
            i2 = -this.f63398d;
        }
        sb.append(i2);
        return sb.toString();
    }
}
