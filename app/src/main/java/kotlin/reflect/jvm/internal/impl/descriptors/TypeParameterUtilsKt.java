package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TakeWhileSequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes3.dex */
public final class TypeParameterUtilsKt {
    /* renamed from: a */
    public static final PossiblyInnerType m32566a(@NotNull KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i2) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.m33654e(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.mo32443t().size() + i2;
        if (classifierDescriptorWithTypeParameters.mo32433J()) {
            List<TypeProjection> subList = kotlinType.mo33514G0().subList(i2, size);
            DeclarationDescriptor mo32437b = classifierDescriptorWithTypeParameters.mo32437b();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, m32566a(kotlinType, (ClassifierDescriptorWithTypeParameters) (mo32437b instanceof ClassifierDescriptorWithTypeParameters ? mo32437b : null), size));
        }
        if (size != kotlinType.mo33514G0().size()) {
            DescriptorUtils.m33480p(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.mo33514G0().subList(i2, kotlinType.mo33514G0().size()), null);
    }

    @NotNull
    /* renamed from: b */
    public static final List<TypeParameterDescriptor> m32567b(@NotNull ClassifierDescriptorWithTypeParameters receiver$0) {
        List<TypeParameterDescriptor> list;
        DeclarationDescriptor declarationDescriptor;
        TypeConstructor mo32440j;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        List<TypeParameterDescriptor> declaredTypeParameters = receiver$0.mo32443t();
        Intrinsics.m32175d(declaredTypeParameters, "declaredTypeParameters");
        if (!receiver$0.mo32433J() && !(receiver$0.mo32437b() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        Sequence<DeclarationDescriptor> m33537j = DescriptorUtilsKt.m33537j(receiver$0);
        C6559x246a49e2 predicate = new Function1<DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(DeclarationDescriptor declarationDescriptor2) {
                DeclarationDescriptor it = declarationDescriptor2;
                Intrinsics.m32180i(it, "it");
                return Boolean.valueOf(it instanceof CallableDescriptor);
            }
        };
        Intrinsics.m32179h(m33537j, "<this>");
        Intrinsics.m32179h(predicate, "predicate");
        List m33831A = SequencesKt.m33831A(SequencesKt.m33845m(new TakeWhileSequence(m33537j, predicate), new Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // kotlin.jvm.functions.Function1
            public Sequence<? extends TypeParameterDescriptor> invoke(DeclarationDescriptor declarationDescriptor2) {
                DeclarationDescriptor it = declarationDescriptor2;
                Intrinsics.m32180i(it, "it");
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
                Intrinsics.m32175d(typeParameters, "(it as CallableDescriptor).typeParameters");
                return CollectionsKt.m32028k(typeParameters);
            }
        }));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.m33537j(receiver$0).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                declarationDescriptor = null;
                break;
            }
            declarationDescriptor = it.next();
            if (declarationDescriptor instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null && (mo32440j = classDescriptor.mo32440j()) != null) {
            list = mo32440j.getParameters();
        }
        if (list == null) {
            list = EmptyList.f63144b;
        }
        if (m33831A.isEmpty() && list.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = receiver$0.mo32443t();
            Intrinsics.m32175d(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        List<TypeParameterDescriptor> m32002O = CollectionsKt.m32002O(m33831A, list);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32002O, 10));
        for (TypeParameterDescriptor it2 : m32002O) {
            Intrinsics.m32175d(it2, "it");
            arrayList.add(new CapturedTypeParameterDescriptor(it2, receiver$0, declaredTypeParameters.size()));
        }
        return CollectionsKt.m32002O(declaredTypeParameters, arrayList);
    }
}
