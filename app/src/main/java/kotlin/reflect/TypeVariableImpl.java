package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TypesJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalStdlibApi
/* loaded from: classes3.dex */
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {

    /* renamed from: b */
    @NotNull
    public final KTypeParameter f63433b;

    public TypeVariableImpl(@NotNull KTypeParameter typeParameter) {
        Intrinsics.m32179h(typeParameter, "typeParameter");
        this.f63433b = typeParameter;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.m32174c(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<KType> upperBounds = this.f63433b.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.m32247b((KType) it.next(), true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        StringBuilder m24u = C0000a.m24u("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        m24u.append(this.f63433b);
        throw new NotImplementedError(C0000a.m14k("An operation is not implemented: ", m24u.toString()));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.f63433b.getName();
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    @NotNull
    public String toString() {
        return getName();
    }
}
