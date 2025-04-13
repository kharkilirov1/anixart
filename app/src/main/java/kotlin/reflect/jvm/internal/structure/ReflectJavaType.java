package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "Factory", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ReflectJavaType implements JavaType {

    /* renamed from: a */
    public static final Factory f66573a = new Factory(null);

    /* compiled from: ReflectJavaType.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Factory {
        public Factory() {
        }

        @NotNull
        /* renamed from: a */
        public final ReflectJavaType m33812a(@NotNull Type type) {
            Intrinsics.m32180i(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new ReflectJavaArrayType(type) : type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }

        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    /* renamed from: I */
    public abstract Type getF66565c();

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.m32174c(getF66565c(), ((ReflectJavaType) obj).getF66565c());
    }

    public int hashCode() {
        return getF66565c().hashCode();
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + getF66565c();
    }
}
