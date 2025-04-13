package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/LongProgression;", "", "", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class LongProgression implements Iterable<Long>, KMappedMarker {

    /* renamed from: b */
    public final long f63389b;

    /* renamed from: c */
    public final long f63390c;

    /* renamed from: d */
    public final long f63391d;

    /* compiled from: Progressions.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public LongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63389b = j2;
        if (j4 > 0) {
            if (j2 < j3) {
                j3 -= ProgressionUtilKt.m32134c(ProgressionUtilKt.m32134c(j3, j4) - ProgressionUtilKt.m32134c(j2, j4), j4);
            }
        } else {
            if (j4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j2 > j3) {
                long j5 = -j4;
                j3 += ProgressionUtilKt.m32134c(ProgressionUtilKt.m32134c(j2, j5) - ProgressionUtilKt.m32134c(j3, j5), j5);
            }
        }
        this.f63390c = j3;
        this.f63391d = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression longProgression = (LongProgression) obj;
                if (this.f63389b != longProgression.f63389b || this.f63390c != longProgression.f63390c || this.f63391d != longProgression.f63391d) {
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
        long j2 = 31;
        long j3 = this.f63389b;
        long j4 = this.f63390c;
        long j5 = (((j3 ^ (j3 >>> 32)) * j2) + (j4 ^ (j4 >>> 32))) * j2;
        long j6 = this.f63391d;
        return (int) (j5 + (j6 ^ (j6 >>> 32)));
    }

    public boolean isEmpty() {
        long j2 = this.f63391d;
        long j3 = this.f63389b;
        long j4 = this.f63390c;
        if (j2 > 0) {
            if (j3 > j4) {
                return true;
            }
        } else if (j3 < j4) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new LongProgressionIterator(this.f63389b, this.f63390c, this.f63391d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f63391d > 0) {
            sb = new StringBuilder();
            sb.append(this.f63389b);
            sb.append("..");
            sb.append(this.f63390c);
            sb.append(" step ");
            j2 = this.f63391d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f63389b);
            sb.append(" downTo ");
            sb.append(this.f63390c);
            sb.append(" step ");
            j2 = -this.f63391d;
        }
        sb.append(j2);
        return sb.toString();
    }
}
