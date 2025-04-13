package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* renamed from: b */
    @NotNull
    public final TypeParameterDescriptor[] f66320b;

    /* renamed from: c */
    @NotNull
    public final TypeProjection[] f66321c;

    /* renamed from: d */
    public final boolean f66322d;

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] parameters, @NotNull TypeProjection[] typeProjectionArr, boolean z) {
        Intrinsics.m32180i(parameters, "parameters");
        this.f66320b = parameters;
        this.f66321c = typeProjectionArr;
        this.f66322d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: b */
    public boolean mo33520b() {
        return this.f66322d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* renamed from: d */
    public TypeProjection mo32783d(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (!(mo32449b instanceof TypeParameterDescriptor)) {
            mo32449b = null;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) mo32449b;
        if (typeParameterDescriptor != null) {
            int mo32499h = typeParameterDescriptor.mo32499h();
            TypeParameterDescriptor[] typeParameterDescriptorArr = this.f66320b;
            if (mo32499h < typeParameterDescriptorArr.length && Intrinsics.m32174c(typeParameterDescriptorArr[mo32499h].mo32440j(), typeParameterDescriptor.mo32440j())) {
                return this.f66321c[mo32499h];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: e */
    public boolean mo33646e() {
        return this.f66321c.length == 0;
    }

    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<? extends TypeProjection> list2) {
        Object[] array = list.toArray(new TypeParameterDescriptor[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        TypeParameterDescriptor[] typeParameterDescriptorArr = (TypeParameterDescriptor[]) array;
        Object[] array2 = list2.toArray(new TypeProjection[0]);
        if (array2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f66320b = typeParameterDescriptorArr;
        this.f66321c = (TypeProjection[]) array2;
        this.f66322d = false;
    }
}
