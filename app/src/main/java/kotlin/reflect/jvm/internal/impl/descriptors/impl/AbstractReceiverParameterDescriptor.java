package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.TransientReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class AbstractReceiverParameterDescriptor extends DeclarationDescriptorImpl implements ReceiverParameterDescriptor {

    /* renamed from: c */
    public static final Name f64070c = Name.m33213f("<this>");

    public AbstractReceiverParameterDescriptor(@NotNull Annotations annotations) {
        super(annotations, f64070c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: B */
    public boolean mo32486B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32516l(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public CallableDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public DeclarationDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    public Collection<? extends CallableDescriptor> mo32488e() {
        return Collections.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: f */
    public List<ValueParameterDescriptor> mo32489f() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: f0 */
    public ReceiverParameterDescriptor mo32490f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        return getValue().getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return Visibilities.f63989f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return SourceElement.f63979a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    /* renamed from: k0 */
    public ReceiverParameterDescriptor mo32492k0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* renamed from: c */
    public ReceiverParameterDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.m33687e()) {
            return this;
        }
        KotlinType m33689h = mo32437b() instanceof ClassDescriptor ? typeSubstitutor.m33689h(getType(), Variance.OUT_VARIANCE) : typeSubstitutor.m33689h(getType(), Variance.INVARIANT);
        if (m33689h == null) {
            return null;
        }
        return m33689h == getType() ? this : new ReceiverParameterDescriptorImpl(mo32437b(), new TransientReceiver(m33689h), this.f64001a);
    }
}
