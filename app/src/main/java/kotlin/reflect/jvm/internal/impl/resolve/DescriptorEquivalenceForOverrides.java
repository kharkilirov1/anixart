package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.Nullable;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes3.dex */
public final class DescriptorEquivalenceForOverrides {

    /* renamed from: a */
    public static final DescriptorEquivalenceForOverrides f65869a = new DescriptorEquivalenceForOverrides();

    /* renamed from: a */
    public final boolean m33452a(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return Intrinsics.m32174c(((ClassDescriptor) declarationDescriptor).mo32440j(), ((ClassDescriptor) declarationDescriptor2).mo32440j());
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return m33453b((TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(DeclarationDescriptor declarationDescriptor3, DeclarationDescriptor declarationDescriptor4) {
                    return Boolean.FALSE;
                }
            });
        }
        if (!(declarationDescriptor instanceof CallableDescriptor) || !(declarationDescriptor2 instanceof CallableDescriptor)) {
            return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.m32174c(((PackageFragmentDescriptor) declarationDescriptor).mo32550d(), ((PackageFragmentDescriptor) declarationDescriptor2).mo32550d()) : Intrinsics.m32174c(declarationDescriptor, declarationDescriptor2);
        }
        final CallableDescriptor a2 = (CallableDescriptor) declarationDescriptor;
        final CallableDescriptor b = (CallableDescriptor) declarationDescriptor2;
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        if (!Intrinsics.m32174c(a2, b)) {
            if (!(!Intrinsics.m32174c(a2.getName(), b.getName())) && !Intrinsics.m32174c(a2.mo32437b(), b.mo32437b()) && !DescriptorUtils.m33480p(a2) && !DescriptorUtils.m33480p(b) && m33454c(a2, b, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(DeclarationDescriptor declarationDescriptor3, DeclarationDescriptor declarationDescriptor4) {
                    return Boolean.FALSE;
                }
            })) {
                OverridingUtil overridingUtil = new OverridingUtil(new KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1
                    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
                    /* renamed from: a */
                    public boolean mo33455a(TypeConstructor c1, TypeConstructor c2) {
                        Intrinsics.m32180i(c1, "c1");
                        Intrinsics.m32180i(c2, "c2");
                        if (Intrinsics.m32174c(c1, c2)) {
                            return true;
                        }
                        ClassifierDescriptor mo32449b = c1.mo32449b();
                        ClassifierDescriptor mo32449b2 = c2.mo32449b();
                        if ((mo32449b instanceof TypeParameterDescriptor) && (mo32449b2 instanceof TypeParameterDescriptor)) {
                            return DescriptorEquivalenceForOverrides.f65869a.m33453b((TypeParameterDescriptor) mo32449b, (TypeParameterDescriptor) mo32449b2, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public Boolean invoke(DeclarationDescriptor declarationDescriptor3, DeclarationDescriptor declarationDescriptor4) {
                                    return Boolean.valueOf(Intrinsics.m32174c(declarationDescriptor3, CallableDescriptor.this) && Intrinsics.m32174c(declarationDescriptor4, b));
                                }
                            });
                        }
                        return false;
                    }
                });
                OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtil.m33507l(a2, b, null, true).f65905a;
                OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                if (result != result2 || overridingUtil.m33507l(b, a2, null, true).f65905a != result2) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m33453b(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        if (Intrinsics.m32174c(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        return !Intrinsics.m32174c(typeParameterDescriptor.mo32437b(), typeParameterDescriptor2.mo32437b()) && m33454c(typeParameterDescriptor, typeParameterDescriptor2, function2) && typeParameterDescriptor.mo32499h() == typeParameterDescriptor2.mo32499h();
    }

    /* renamed from: c */
    public final boolean m33454c(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        DeclarationDescriptor mo32437b = declarationDescriptor.mo32437b();
        DeclarationDescriptor mo32437b2 = declarationDescriptor2.mo32437b();
        return ((mo32437b instanceof CallableMemberDescriptor) || (mo32437b2 instanceof CallableMemberDescriptor)) ? function2.invoke(mo32437b, mo32437b2).booleanValue() : m33452a(mo32437b, mo32437b2);
    }
}
