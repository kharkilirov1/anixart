package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.DeprecationLevel;
import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes3.dex */
public final class VersionRequirement {

    /* renamed from: a */
    @NotNull
    public final Version f65428a;

    /* renamed from: b */
    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind f65429b;

    /* renamed from: c */
    @NotNull
    public final DeprecationLevel f65430c;

    /* renamed from: d */
    @Nullable
    public final Integer f65431d;

    /* renamed from: e */
    @Nullable
    public final String f65432e;

    /* compiled from: VersionRequirement.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
            }
        }
    }

    /* compiled from: VersionRequirement.kt */
    public static final class Version {

        /* renamed from: d */
        @JvmField
        @NotNull
        public static final Version f65433d = new Version(256, 256, 256);

        /* renamed from: a */
        public final int f65434a;

        /* renamed from: b */
        public final int f65435b;

        /* renamed from: c */
        public final int f65436c;

        /* compiled from: VersionRequirement.kt */
        public static final class Companion {
        }

        public Version(int i2, int i3, int i4) {
            this.f65434a = i2;
            this.f65435b = i3;
            this.f65436c = i4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof Version) {
                    Version version = (Version) obj;
                    if (this.f65434a == version.f65434a) {
                        if (this.f65435b == version.f65435b) {
                            if (this.f65436c == version.f65436c) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f65434a * 31) + this.f65435b) * 31) + this.f65436c;
        }

        @NotNull
        public String toString() {
            StringBuilder sb;
            int i2;
            if (this.f65436c == 0) {
                sb = new StringBuilder();
                sb.append(this.f65434a);
                sb.append('.');
                i2 = this.f65435b;
            } else {
                sb = new StringBuilder();
                sb.append(this.f65434a);
                sb.append('.');
                sb.append(this.f65435b);
                sb.append('.');
                i2 = this.f65436c;
            }
            sb.append(i2);
            return sb.toString();
        }

        public Version(int i2, int i3, int i4, int i5) {
            i4 = (i5 & 4) != 0 ? 0 : i4;
            this.f65434a = i2;
            this.f65435b = i3;
            this.f65436c = i4;
        }
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind versionKind, @NotNull DeprecationLevel deprecationLevel, @Nullable Integer num, @Nullable String str) {
        this.f65428a = version;
        this.f65429b = versionKind;
        this.f65430c = deprecationLevel;
        this.f65431d = num;
        this.f65432e = str;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder m24u = C0000a.m24u("since ");
        m24u.append(this.f65428a);
        m24u.append(' ');
        m24u.append(this.f65430c);
        String str2 = "";
        if (this.f65431d != null) {
            StringBuilder m24u2 = C0000a.m24u(" error ");
            m24u2.append(this.f65431d);
            str = m24u2.toString();
        } else {
            str = "";
        }
        m24u.append(str);
        if (this.f65432e != null) {
            StringBuilder m24u3 = C0000a.m24u(": ");
            m24u3.append(this.f65432e);
            str2 = m24u3.toString();
        }
        m24u.append(str2);
        return m24u.toString();
    }
}
