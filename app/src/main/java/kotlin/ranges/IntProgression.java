package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/IntProgression;", "", "", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* renamed from: b */
    public final int f63380b;

    /* renamed from: c */
    public final int f63381c;

    /* renamed from: d */
    public final int f63382d;

    /* compiled from: Progressions.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63380b = i2;
        this.f63381c = ProgressionUtilKt.m32132a(i2, i3, i4);
        this.f63382d = i4;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f63380b, this.f63381c, this.f63382d);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) obj).isEmpty()) {
                IntProgression intProgression = (IntProgression) obj;
                if (this.f63380b != intProgression.f63380b || this.f63381c != intProgression.f63381c || this.f63382d != intProgression.f63382d) {
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
        return (((this.f63380b * 31) + this.f63381c) * 31) + this.f63382d;
    }

    public boolean isEmpty() {
        if (this.f63382d > 0) {
            if (this.f63380b > this.f63381c) {
                return true;
            }
        } else if (this.f63380b < this.f63381c) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f63382d > 0) {
            sb = new StringBuilder();
            sb.append(this.f63380b);
            sb.append("..");
            sb.append(this.f63381c);
            sb.append(" step ");
            i2 = this.f63382d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f63380b);
            sb.append(" downTo ");
            sb.append(this.f63381c);
            sb.append(" step ");
            i2 = -this.f63382d;
        }
        sb.append(i2);
        return sb.toString();
    }
}
