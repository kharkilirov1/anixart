package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes3.dex */
public final class StarProjectionImplKt {
    @NotNull
    /* renamed from: a */
    public static final KotlinType m33673a(@NotNull TypeParameterDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        DeclarationDescriptor mo32437b = receiver$0.mo32437b();
        if (mo32437b == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
        }
        TypeConstructor mo32440j = ((ClassifierDescriptorWithTypeParameters) mo32437b).mo32440j();
        Intrinsics.m32175d(mo32440j, "classDescriptor.typeConstructor");
        List<TypeParameterDescriptor> parameters = mo32440j.getParameters();
        Intrinsics.m32175d(parameters, "classDescriptor.typeConstructor.parameters");
        final ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters, 10));
        for (TypeParameterDescriptor it : parameters) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(it.mo32440j());
        }
        TypeSubstitutor typeSubstitutor = new TypeSubstitutor(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$starProjectionType$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            /* renamed from: g */
            public TypeProjection mo33674g(@NotNull TypeConstructor key) {
                Intrinsics.m32180i(key, "key");
                if (!arrayList.contains(key)) {
                    return null;
                }
                ClassifierDescriptor mo32449b = key.mo32449b();
                if (mo32449b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                }
                SimpleType simpleType = TypeUtils.f66355a;
                return new StarProjectionImpl((TypeParameterDescriptor) mo32449b);
            }
        });
        List<KotlinType> upperBounds = receiver$0.getUpperBounds();
        Intrinsics.m32175d(upperBounds, "this.upperBounds");
        KotlinType m33689h = typeSubstitutor.m33689h((KotlinType) CollectionsKt.m32044u(upperBounds), Variance.OUT_VARIANCE);
        if (m33689h != null) {
            return m33689h;
        }
        SimpleType m32405n = DescriptorUtilsKt.m33534g(receiver$0).m32405n();
        Intrinsics.m32175d(m32405n, "builtIns.defaultBound");
        return m32405n;
    }
}
