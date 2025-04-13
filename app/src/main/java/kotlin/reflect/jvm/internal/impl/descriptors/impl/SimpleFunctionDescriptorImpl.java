package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
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
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    public SimpleFunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @NotNull
    /* renamed from: L0 */
    public static SimpleFunctionDescriptorImpl m32646L0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, null, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        return (SimpleFunctionDescriptor) super.mo32495u(declarationDescriptor, modality, visibility, kind, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor mo32487a() {
        return (SimpleFunctionDescriptor) super.mo32487a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptorImpl mo32623C0(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<ValueParameterDescriptor> list2, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull Visibility visibility) {
        return mo32650O0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, visibility, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = this.f64102b;
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @NotNull
    /* renamed from: O0 */
    public SimpleFunctionDescriptorImpl mo32650O0(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<ValueParameterDescriptor> list2, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull Visibility visibility, @Nullable Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        super.mo32623C0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, visibility);
        if (map != null && !map.isEmpty()) {
            this.f64120C = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    /* renamed from: s */
    public FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> mo32524s() {
        return super.mo32524s();
    }
}
