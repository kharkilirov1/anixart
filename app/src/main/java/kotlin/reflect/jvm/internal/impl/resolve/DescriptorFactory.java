package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class DescriptorFactory {

    public static class DefaultClassConstructorDescriptor extends ClassConstructorDescriptorImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
            super(classDescriptor, null, Annotations.Companion.f64024a, true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            int i2 = Annotations.f64023H1;
            List<ValueParameterDescriptor> emptyList = Collections.emptyList();
            Name name = DescriptorUtils.f65875a;
            ClassKind mo32438g = classDescriptor.mo32438g();
            m32610L0(emptyList, (mo32438g == ClassKind.ENUM_CLASS || mo32438g.m32507a() || DescriptorUtils.m33482r(classDescriptor)) ? Visibilities.f63984a : DescriptorUtils.m33474j(classDescriptor) ? Visibilities.f63994k : Visibilities.f63988e);
        }
    }

    @NotNull
    /* renamed from: a */
    public static PropertyGetterDescriptorImpl m33456a(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations) {
        return m33461f(propertyDescriptor, annotations, true, false, false, propertyDescriptor.mo32439i());
    }

    @NotNull
    /* renamed from: b */
    public static PropertySetterDescriptorImpl m33457b(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2) {
        return m33463h(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getVisibility(), propertyDescriptor.mo32439i());
    }

    @NotNull
    /* renamed from: c */
    public static SimpleFunctionDescriptor m33458c(@NotNull ClassDescriptor classDescriptor) {
        int i2 = Annotations.f64023H1;
        Annotations annotations = Annotations.Companion.f64024a;
        SimpleFunctionDescriptorImpl m32646L0 = SimpleFunctionDescriptorImpl.m32646L0(classDescriptor, annotations, DescriptorUtils.f65876b, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.mo32439i());
        return m32646L0.mo32623C0(null, null, Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(m32646L0, null, 0, annotations, Name.m33211d("value"), DescriptorUtilsKt.m33534g(classDescriptor).m32413y(), false, false, false, null, classDescriptor.mo32439i())), classDescriptor.mo32502r(), Modality.FINAL, Visibilities.f63988e);
    }

    @NotNull
    /* renamed from: d */
    public static SimpleFunctionDescriptor m33459d(@NotNull ClassDescriptor classDescriptor) {
        int i2 = Annotations.f64023H1;
        return SimpleFunctionDescriptorImpl.m32646L0(classDescriptor, Annotations.Companion.f64024a, DescriptorUtils.f65875a, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.mo32439i()).mo32623C0(null, null, Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.m33534g(classDescriptor).m32399g(Variance.INVARIANT, classDescriptor.mo32502r()), Modality.FINAL, Visibilities.f63988e);
    }

    @Nullable
    /* renamed from: e */
    public static ReceiverParameterDescriptor m33460e(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType, @NotNull Annotations annotations) {
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    @NotNull
    /* renamed from: f */
    public static PropertyGetterDescriptorImpl m33461f(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3, @NotNull SourceElement sourceElement) {
        return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.mo32441k(), propertyDescriptor.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    @NotNull
    /* renamed from: g */
    public static ClassConstructorDescriptorImpl m33462g(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
        return new DefaultClassConstructorDescriptor(classDescriptor, sourceElement);
    }

    @NotNull
    /* renamed from: h */
    public static PropertySetterDescriptorImpl m33463h(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2, boolean z, boolean z2, boolean z3, @NotNull Visibility visibility, @NotNull SourceElement sourceElement) {
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.mo32441k(), visibility, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.f64245m = PropertySetterDescriptorImpl.m32645Z(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2);
        return propertySetterDescriptorImpl;
    }

    /* renamed from: i */
    public static boolean m33464i(@NotNull FunctionDescriptor functionDescriptor) {
        return functionDescriptor.mo32493g() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.m33477m(functionDescriptor.mo32437b());
    }
}
