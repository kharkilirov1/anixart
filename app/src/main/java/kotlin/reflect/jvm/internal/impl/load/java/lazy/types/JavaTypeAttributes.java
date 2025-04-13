package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes3.dex */
public final class JavaTypeAttributes {

    /* renamed from: a */
    @NotNull
    public final TypeUsage f64614a;

    /* renamed from: b */
    @NotNull
    public final JavaTypeFlexibility f64615b;

    /* renamed from: c */
    public final boolean f64616c;

    /* renamed from: d */
    @Nullable
    public final TypeParameterDescriptor f64617d;

    public JavaTypeAttributes(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        this.f64614a = typeUsage;
        this.f64615b = javaTypeFlexibility;
        this.f64616c = z;
        this.f64617d = typeParameterDescriptor;
    }

    @NotNull
    /* renamed from: a */
    public final JavaTypeAttributes m32773a(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        TypeUsage howThisTypeIsUsed = this.f64614a;
        boolean z = this.f64616c;
        TypeParameterDescriptor typeParameterDescriptor = this.f64617d;
        Intrinsics.m32180i(howThisTypeIsUsed, "howThisTypeIsUsed");
        return new JavaTypeAttributes(howThisTypeIsUsed, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof JavaTypeAttributes) {
                JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
                if (Intrinsics.m32174c(this.f64614a, javaTypeAttributes.f64614a) && Intrinsics.m32174c(this.f64615b, javaTypeAttributes.f64615b)) {
                    if (!(this.f64616c == javaTypeAttributes.f64616c) || !Intrinsics.m32174c(this.f64617d, javaTypeAttributes.f64617d)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        TypeUsage typeUsage = this.f64614a;
        int hashCode = (typeUsage != null ? typeUsage.hashCode() : 0) * 31;
        JavaTypeFlexibility javaTypeFlexibility = this.f64615b;
        int hashCode2 = (hashCode + (javaTypeFlexibility != null ? javaTypeFlexibility.hashCode() : 0)) * 31;
        boolean z = this.f64616c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.f64617d;
        return i3 + (typeParameterDescriptor != null ? typeParameterDescriptor.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("JavaTypeAttributes(howThisTypeIsUsed=");
        m24u.append(this.f64614a);
        m24u.append(", flexibility=");
        m24u.append(this.f64615b);
        m24u.append(", isForAnnotationParameter=");
        m24u.append(this.f64616c);
        m24u.append(", upperBoundOfTypeParameter=");
        m24u.append(this.f64617d);
        m24u.append(")");
        return m24u.toString();
    }

    public JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i2) {
        JavaTypeFlexibility flexibility = (i2 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : null;
        z = (i2 & 4) != 0 ? false : z;
        typeParameterDescriptor = (i2 & 8) != 0 ? null : typeParameterDescriptor;
        Intrinsics.m32180i(flexibility, "flexibility");
        this.f64614a = typeUsage;
        this.f64615b = flexibility;
        this.f64616c = z;
        this.f64617d = typeParameterDescriptor;
    }
}
