package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
final class IsKPropertyCheck implements Check {

    /* renamed from: a */
    public static final IsKPropertyCheck f66431a = new IsKPropertyCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* renamed from: a */
    public String mo33760a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m33762a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* renamed from: b */
    public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
        SimpleType simpleType;
        ValueParameterDescriptor secondParameter = functionDescriptor.mo32489f().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.f63821e;
        Intrinsics.m32175d(secondParameter, "secondParameter");
        ModuleDescriptor m33466b = DescriptorUtils.m33466b(secondParameter);
        Intrinsics.m32175d(m33466b, "DescriptorUtils.getContainingModule(this)");
        Objects.requireNonNull(companion);
        ClassId classId = KotlinBuiltIns.f63730l.f63765X;
        Intrinsics.m32175d(classId, "KotlinBuiltIns.FQ_NAMES.kProperty");
        ClassDescriptor m32519a = FindClassInModuleKt.m32519a(m33466b, classId);
        if (m32519a != null) {
            Annotations annotations = Annotations.Companion.f64024a;
            TypeConstructor mo32440j = m32519a.mo32440j();
            Intrinsics.m32175d(mo32440j, "kPropertyClass.typeConstructor");
            List<TypeParameterDescriptor> parameters = mo32440j.getParameters();
            Intrinsics.m32175d(parameters, "kPropertyClass.typeConstructor.parameters");
            Object m32011X = CollectionsKt.m32011X(parameters);
            Intrinsics.m32175d(m32011X, "kPropertyClass.typeConstructor.parameters.single()");
            simpleType = KotlinTypeFactory.m33664b(annotations, m32519a, CollectionsKt.m31993F(new StarProjectionImpl((TypeParameterDescriptor) m32011X)));
        } else {
            simpleType = null;
        }
        if (simpleType == null) {
            return false;
        }
        KotlinType type = secondParameter.getType();
        Intrinsics.m32175d(type, "secondParameter.type");
        return NewKotlinTypeChecker.f66379b.m33713h(simpleType, TypeUtilsKt.m33751f(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
