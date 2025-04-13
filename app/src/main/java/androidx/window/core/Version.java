package androidx.window.core;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Version.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/core/Version;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Version implements Comparable<Version> {

    /* renamed from: g */
    @NotNull
    public static final Companion f6699g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final Version f6700h;

    /* renamed from: b */
    public final int f6701b;

    /* renamed from: c */
    public final int f6702c;

    /* renamed from: d */
    public final int f6703d;

    /* renamed from: e */
    @NotNull
    public final String f6704e;

    /* renamed from: f */
    @NotNull
    public final Lazy f6705f = LazyKt.m31881b(new Function0<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public BigInteger invoke() {
            return BigInteger.valueOf(Version.this.f6701b).shiftLeft(32).or(BigInteger.valueOf(Version.this.f6702c)).shiftLeft(32).or(BigInteger.valueOf(Version.this.f6703d));
        }
    });

    /* compiled from: Version.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/core/Version$Companion;", "", "", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @Nullable
        /* renamed from: a */
        public final Version m4422a(@Nullable String str) {
            if (str == null || StringsKt.m33879E(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            Intrinsics.m32178g(description, "description");
            return new Version(intValue, intValue2, intValue3, description);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Version(0, 0, 0, "");
        f6700h = new Version(0, 1, 0, "");
        new Version(1, 0, 0, "");
    }

    public Version(int i2, int i3, int i4, String str) {
        this.f6701b = i2;
        this.f6702c = i3;
        this.f6703d = i4;
        this.f6704e = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Version other) {
        Intrinsics.m32179h(other, "other");
        Object value = this.f6705f.getValue();
        Intrinsics.m32178g(value, "<get-bigInteger>(...)");
        Object value2 = other.f6705f.getValue();
        Intrinsics.m32178g(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.f6701b == version.f6701b && this.f6702c == version.f6702c && this.f6703d == version.f6703d;
    }

    public int hashCode() {
        return ((((527 + this.f6701b) * 31) + this.f6702c) * 31) + this.f6703d;
    }

    @NotNull
    public String toString() {
        String m32187p = StringsKt.m33879E(this.f6704e) ^ true ? Intrinsics.m32187p("-", this.f6704e) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6701b);
        sb.append('.');
        sb.append(this.f6702c);
        sb.append('.');
        return C0000a.m18o(sb, this.f6703d, m32187p);
    }
}
