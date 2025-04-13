package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ReflectJavaArrayType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* renamed from: b */
    @NotNull
    public final ReflectJavaType f66552b;

    /* renamed from: c */
    @NotNull
    public final Type f66553c;

    public ReflectJavaArrayType(@NotNull Type type) {
        ReflectJavaType m33812a;
        this.f66553c = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.f66573a;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.m32175d(componentType, "getComponentType()");
                    m33812a = factory.m33812a(componentType);
                }
            }
            StringBuilder m24u = C0000a.m24u("Not an array type (");
            m24u.append(type.getClass());
            m24u.append("): ");
            m24u.append(type);
            throw new IllegalArgumentException(m24u.toString());
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.f66573a;
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        Intrinsics.m32175d(genericComponentType, "genericComponentType");
        m33812a = factory2.m33812a(genericComponentType);
        this.f66552b = m33812a;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    @NotNull
    /* renamed from: I, reason: from getter */
    public Type getF66565c() {
        return this.f66553c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    /* renamed from: m */
    public JavaType mo32802m() {
        return this.f66552b;
    }
}
