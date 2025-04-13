package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypesJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalStdlibApi
/* loaded from: classes3.dex */
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    /* renamed from: b */
    @NotNull
    public final Type f63410b;

    public GenericArrayTypeImpl(@NotNull Type elementType) {
        Intrinsics.m32179h(elementType, "elementType");
        this.f63410b = elementType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.m32174c(this.f63410b, ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.f63410b;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        return TypesJVMKt.m32246a(this.f63410b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return this.f63410b.hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
