package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TypesJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalStdlibApi
/* loaded from: classes3.dex */
final class WildcardTypeImpl implements WildcardType, TypeImpl {

    /* renamed from: d */
    @NotNull
    public static final WildcardTypeImpl f63436d = new WildcardTypeImpl(null, null);

    /* renamed from: b */
    @Nullable
    public final Type f63437b;

    /* renamed from: c */
    @Nullable
    public final Type f63438c;

    /* compiled from: TypesJVM.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public WildcardTypeImpl(@Nullable Type type, @Nullable Type type2) {
        this.f63437b = type;
        this.f63438c = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.f63438c;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        if (this.f63438c != null) {
            StringBuilder m24u = C0000a.m24u("? super ");
            m24u.append(TypesJVMKt.m32246a(this.f63438c));
            return m24u.toString();
        }
        Type type = this.f63437b;
        if (type == null || Intrinsics.m32174c(type, Object.class)) {
            return "?";
        }
        StringBuilder m24u2 = C0000a.m24u("? extends ");
        m24u2.append(TypesJVMKt.m32246a(this.f63437b));
        return m24u2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f63437b;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
