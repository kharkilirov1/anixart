package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class ErrorSimpleFunctionDescriptorImpl extends SimpleFunctionDescriptorImpl {
    public ErrorSimpleFunctionDescriptorImpl(@NotNull ClassDescriptor classDescriptor, @NotNull ErrorUtils.ErrorScope errorScope) {
        super(classDescriptor, null, Annotations.Companion.f64024a, Name.m33213f("<ERROR FUNCTION>"), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f63979a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: G */
    public FunctionDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    /* renamed from: K0 */
    public SimpleFunctionDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: h0 */
    public <V> V mo32491h0(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* renamed from: s */
    public FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> mo32524s() {
        return new FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl.1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* renamed from: A */
            public SimpleFunctionDescriptor mo32527A() {
                return ErrorSimpleFunctionDescriptorImpl.this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: a */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32528a(@NotNull List<ValueParameterDescriptor> list) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: b */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32529b(@NotNull Visibility visibility) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: c */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32530c(@NotNull Modality modality) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: d */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32531d(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: e */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32532e() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: f */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32533f(@NotNull KotlinType kotlinType) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: g */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32534g() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: h */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32535h(boolean z) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: i */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32536i(@NotNull TypeSubstitution typeSubstitution) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: j */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32537j(@NotNull List<TypeParameterDescriptor> list) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: k */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32538k(@NotNull DeclarationDescriptor declarationDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: l */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32539l() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: m */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32540m(@NotNull CallableMemberDescriptor.Kind kind) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: n */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32541n(@NotNull Annotations annotations) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: o */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32542o(@NotNull Name name) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            @NotNull
            /* renamed from: p */
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> mo32543p() {
                return this;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: t0 */
    public void mo32494t0(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: u */
    public CallableMemberDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }
}
