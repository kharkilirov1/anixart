package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ReflectJavaWildcardType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* renamed from: b */
    @NotNull
    public final WildcardType f66579b;

    public ReflectJavaWildcardType(@NotNull WildcardType wildcardType) {
        this.f66579b = wildcardType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    /* renamed from: C */
    public boolean mo32833C() {
        Intrinsics.m32175d(this.f66579b.getUpperBounds(), "reflectType.upperBounds");
        return !Intrinsics.m32174c((Type) ArraysKt.m31927C(r0), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    /* renamed from: I */
    public Type getF66565c() {
        return this.f66579b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    /* renamed from: w */
    public JavaType mo32834w() {
        Type[] upperBounds = this.f66579b.getUpperBounds();
        Type[] lowerBounds = this.f66579b.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder m24u = C0000a.m24u("Wildcard types with many bounds are not yet supported: ");
            m24u.append(this.f66579b);
            throw new UnsupportedOperationException(m24u.toString());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.f66573a;
            Object m31949Y = ArraysKt.m31949Y(lowerBounds);
            Intrinsics.m32175d(m31949Y, "lowerBounds.single()");
            return factory.m33812a((Type) m31949Y);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type ub = (Type) ArraysKt.m31949Y(upperBounds);
        if (!(!Intrinsics.m32174c(ub, Object.class))) {
            return null;
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.f66573a;
        Intrinsics.m32175d(ub, "ub");
        return factory2.m33812a(ub);
    }
}
