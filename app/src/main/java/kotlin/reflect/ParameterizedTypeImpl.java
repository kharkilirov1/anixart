package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypesJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalStdlibApi
/* loaded from: classes3.dex */
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {

    /* renamed from: b */
    @NotNull
    public final Class<?> f63429b;

    /* renamed from: c */
    @Nullable
    public final Type f63430c;

    /* renamed from: d */
    @NotNull
    public final Type[] f63431d;

    public ParameterizedTypeImpl(@NotNull Class<?> cls, @Nullable Type type, @NotNull List<? extends Type> list) {
        this.f63429b = cls;
        this.f63430c = type;
        Object[] array = list.toArray(new Type[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f63431d = (Type[]) array;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.m32174c(this.f63429b, parameterizedType.getRawType()) && Intrinsics.m32174c(this.f63430c, parameterizedType.getOwnerType()) && Arrays.equals(this.f63431d, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.f63431d;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.f63430c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.f63429b;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f63430c;
        if (type != null) {
            sb.append(TypesJVMKt.m32246a(type));
            sb.append("$");
            sb.append(this.f63429b.getSimpleName());
        } else {
            sb.append(TypesJVMKt.m32246a(this.f63429b));
        }
        Type[] typeArr = this.f63431d;
        if (!(typeArr.length == 0)) {
            ArraysKt.m31937M(typeArr, sb, null, "<", ">", 0, null, ParameterizedTypeImpl$getTypeName$1$1.f63432d, 50, null);
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f63429b.hashCode();
        Type type = this.f63430c;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f63431d);
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
