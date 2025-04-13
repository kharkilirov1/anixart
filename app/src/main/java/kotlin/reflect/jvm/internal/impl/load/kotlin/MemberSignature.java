package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MemberSignature.kt */
/* loaded from: classes3.dex */
public final class MemberSignature {

    /* renamed from: b */
    public static final Companion f64804b = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final String f64805a;

    /* compiled from: MemberSignature.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final MemberSignature m32923a(@NotNull String name, @NotNull String desc) {
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(desc, "desc");
            return new MemberSignature(C0000a.m16m(name, "#", desc), null);
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final MemberSignature m32924b(@NotNull JvmMemberSignature jvmMemberSignature) {
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                return m32926d(jvmMemberSignature.mo33175c(), jvmMemberSignature.mo33174b());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                return m32923a(jvmMemberSignature.mo33175c(), jvmMemberSignature.mo33174b());
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        @NotNull
        /* renamed from: c */
        public final MemberSignature m32925c(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.m32180i(nameResolver, "nameResolver");
            return m32926d(nameResolver.getString(jvmMethodSignature.f65508d), nameResolver.getString(jvmMethodSignature.f65509e));
        }

        @JvmStatic
        @NotNull
        /* renamed from: d */
        public final MemberSignature m32926d(@NotNull String name, @NotNull String desc) {
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(desc, "desc");
            return new MemberSignature(C0000a.m14k(name, desc), null);
        }

        @JvmStatic
        @NotNull
        /* renamed from: e */
        public final MemberSignature m32927e(@NotNull MemberSignature signature, int i2) {
            Intrinsics.m32180i(signature, "signature");
            return new MemberSignature(signature.f64805a + "@" + i2, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MemberSignature(@NotNull String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f64805a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof MemberSignature) && Intrinsics.m32174c(this.f64805a, ((MemberSignature) obj).f64805a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f64805a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return C0000a.m20q(C0000a.m24u("MemberSignature(signature="), this.f64805a, ")");
    }
}
