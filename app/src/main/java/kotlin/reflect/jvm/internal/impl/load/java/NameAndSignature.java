package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes3.dex */
final class NameAndSignature {

    /* renamed from: a */
    @NotNull
    public final Name f64372a;

    /* renamed from: b */
    @NotNull
    public final String f64373b;

    public NameAndSignature(@NotNull Name name, @NotNull String signature) {
        Intrinsics.m32180i(signature, "signature");
        this.f64372a = name;
        this.f64373b = signature;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameAndSignature)) {
            return false;
        }
        NameAndSignature nameAndSignature = (NameAndSignature) obj;
        return Intrinsics.m32174c(this.f64372a, nameAndSignature.f64372a) && Intrinsics.m32174c(this.f64373b, nameAndSignature.f64373b);
    }

    public int hashCode() {
        Name name = this.f64372a;
        int hashCode = (name != null ? name.hashCode() : 0) * 31;
        String str = this.f64373b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NameAndSignature(name=");
        m24u.append(this.f64372a);
        m24u.append(", signature=");
        return C0000a.m20q(m24u, this.f64373b, ")");
    }
}
