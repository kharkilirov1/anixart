package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* compiled from: DescriptorUtils.kt */
/* loaded from: classes3.dex */
public final class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements Function1<ValueParameterDescriptor, Boolean> {

    /* renamed from: d */
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 f65933d = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(ValueParameterDescriptor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(ValueParameterDescriptor valueParameterDescriptor) {
        ValueParameterDescriptor p1 = valueParameterDescriptor;
        Intrinsics.m32180i(p1, "p1");
        return Boolean.valueOf(p1.mo32573q0());
    }
}
