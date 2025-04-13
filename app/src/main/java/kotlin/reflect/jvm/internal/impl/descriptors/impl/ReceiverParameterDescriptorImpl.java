package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ReceiverParameterDescriptorImpl extends AbstractReceiverParameterDescriptor {

    /* renamed from: d */
    public final DeclarationDescriptor f64247d;

    /* renamed from: e */
    public final ReceiverValue f64248e;

    public ReceiverParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ReceiverValue receiverValue, @NotNull Annotations annotations) {
        super(annotations);
        this.f64247d = declarationDescriptor;
        this.f64248e = receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f64247d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        return this.f64248e;
    }
}
