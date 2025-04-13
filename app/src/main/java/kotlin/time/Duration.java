package kotlin.time;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* compiled from: Duration.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lkotlin/time/Duration;", "", "Companion", "rawValue", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@JvmInline
@WasExperimental
/* loaded from: classes3.dex */
public final class Duration implements Comparable<Duration> {

    /* renamed from: b */
    @NotNull
    public static final Companion f66910b = new Companion(null);

    /* renamed from: c */
    public static final long f66911c;

    /* renamed from: d */
    public static final long f66912d;

    /* compiled from: Duration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/time/Duration$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = DurationJvmKt.f66913a;
        f66911c = Long.MAX_VALUE;
        f66912d = -9223372036854775805L;
    }

    /* renamed from: a */
    public static final void m33943a(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String m33883I = StringsKt.m33883I(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = m33883I.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (m33883I.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) m33883I, 0, ((i7 + 2) / 3) * 3);
            } else {
                sb.append((CharSequence) m33883I, 0, i7);
            }
        }
        sb.append(str);
    }

    /* renamed from: b */
    public static int m33944b(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return Intrinsics.m32182k(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return m33946d(j2) ? -i2 : i2;
    }

    /* renamed from: c */
    public static final boolean m33945c(long j2) {
        return j2 == f66911c || j2 == f66912d;
    }

    /* renamed from: d */
    public static final boolean m33946d(long j2) {
        return j2 < 0;
    }

    /* renamed from: e */
    public static final long m33947e(long j2, @NotNull DurationUnit unit) {
        Intrinsics.m32179h(unit, "unit");
        if (j2 == f66911c) {
            return Long.MAX_VALUE;
        }
        if (j2 == f66912d) {
            return Long.MIN_VALUE;
        }
        long j3 = j2 >> 1;
        DurationUnit sourceUnit = (((int) j2) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
        Intrinsics.m32179h(sourceUnit, "sourceUnit");
        return unit.f66922b.convert(j3, sourceUnit.f66922b);
    }

    @NotNull
    /* renamed from: f */
    public static String m33948f(long j2) {
        int i2;
        int i3;
        long j3 = j2;
        if (j3 == 0) {
            return "0s";
        }
        if (j3 == f66911c) {
            return "Infinity";
        }
        if (j3 == f66912d) {
            return "-Infinity";
        }
        boolean m33946d = m33946d(j2);
        StringBuilder sb = new StringBuilder();
        if (m33946d) {
            sb.append('-');
        }
        if (m33946d(j2)) {
            j3 = (((int) j3) & 1) + ((-(j3 >> 1)) << 1);
            int i4 = DurationJvmKt.f66913a;
        }
        long m33947e = m33947e(j3, DurationUnit.DAYS);
        int m33947e2 = m33945c(j3) ? 0 : (int) (m33947e(j3, DurationUnit.HOURS) % 24);
        int m33947e3 = m33945c(j3) ? 0 : (int) (m33947e(j3, DurationUnit.MINUTES) % 60);
        int m33947e4 = m33945c(j3) ? 0 : (int) (m33947e(j3, DurationUnit.SECONDS) % 60);
        if (m33945c(j3)) {
            i2 = 0;
        } else {
            i2 = (int) ((((int) j3) & 1) == 1 ? ((j3 >> 1) % 1000) * 1000000 : (j3 >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        }
        boolean z = m33947e != 0;
        boolean z2 = m33947e2 != 0;
        boolean z3 = m33947e3 != 0;
        boolean z4 = (m33947e4 == 0 && i2 == 0) ? false : true;
        if (z) {
            sb.append(m33947e);
            sb.append('d');
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (z2 || (z && (z3 || z4))) {
            int i5 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(m33947e2);
            sb.append('h');
            i3 = i5;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i6 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(m33947e3);
            sb.append('m');
            i3 = i6;
        }
        if (z4) {
            int i7 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (m33947e4 != 0 || z || z2 || z3) {
                m33943a(sb, m33947e4, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                m33943a(sb, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else if (i2 >= 1000) {
                m33943a(sb, i2 / 1000, i2 % 1000, 3, "us", false);
            } else {
                sb.append(i2);
                sb.append("ns");
            }
            i3 = i7;
        }
        if (m33946d && i3 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        Objects.requireNonNull(duration);
        return m33944b(0L, 0L);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Duration)) {
            return false;
        }
        Objects.requireNonNull((Duration) obj);
        return true;
    }

    public int hashCode() {
        return (int) 0;
    }

    @NotNull
    public String toString() {
        return m33948f(0L);
    }
}
