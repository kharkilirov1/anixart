package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
final class TypeAndDefaultQualifiers {

    /* renamed from: a */
    @NotNull
    public final KotlinType f64736a;

    /* renamed from: b */
    @Nullable
    public final JavaTypeQualifiers f64737b;

    public TypeAndDefaultQualifiers(@NotNull KotlinType kotlinType, @Nullable JavaTypeQualifiers javaTypeQualifiers) {
        this.f64736a = kotlinType;
        this.f64737b = javaTypeQualifiers;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeAndDefaultQualifiers)) {
            return false;
        }
        TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) obj;
        return Intrinsics.m32174c(this.f64736a, typeAndDefaultQualifiers.f64736a) && Intrinsics.m32174c(this.f64737b, typeAndDefaultQualifiers.f64737b);
    }

    public int hashCode() {
        KotlinType kotlinType = this.f64736a;
        int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
        JavaTypeQualifiers javaTypeQualifiers = this.f64737b;
        return hashCode + (javaTypeQualifiers != null ? javaTypeQualifiers.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TypeAndDefaultQualifiers(type=");
        m24u.append(this.f64736a);
        m24u.append(", defaultQualifiers=");
        m24u.append(this.f64737b);
        m24u.append(")");
        return m24u.toString();
    }
}
