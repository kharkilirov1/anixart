package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class DescriptorSubstitutor {
    @Nullable
    /* renamed from: a */
    public static TypeSubstitutor m33648a(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2, @Nullable boolean[] zArr) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i2 = 0;
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            TypeParameterDescriptorImpl m32656z0 = TypeParameterDescriptorImpl.m32656z0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.mo32497A(), typeParameterDescriptor.mo32500m(), typeParameterDescriptor.getName(), i2, SourceElement.f63979a);
            hashMap.put(typeParameterDescriptor.mo32440j(), new TypeProjectionImpl(Variance.INVARIANT, m32656z0.mo32502r()));
            hashMap2.put(typeParameterDescriptor, m32656z0);
            list2.add(m32656z0);
            i2++;
        }
        TypeSubstitutor m33685d = TypeSubstitutor.m33685d(typeSubstitution, TypeConstructorSubstitution.Companion.m33675c(TypeConstructorSubstitution.f66342b, hashMap, false, 2));
        for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) hashMap2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                KotlinType m33689h = m33685d.m33689h(kotlinType, Variance.IN_VARIANCE);
                if (m33689h == null) {
                    return null;
                }
                if (m33689h != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.m32658Z();
                if (!KotlinTypeKt.m33667a(m33689h)) {
                    typeParameterDescriptorImpl.f64260k.add(m33689h);
                }
            }
            typeParameterDescriptorImpl.m32658Z();
            typeParameterDescriptorImpl.f64261l = true;
        }
        return m33685d;
    }
}
