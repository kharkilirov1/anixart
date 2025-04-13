package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class LazyClassReceiverParameterDescriptor extends AbstractReceiverParameterDescriptor {

    /* renamed from: d */
    public final ClassDescriptor f64168d;

    /* renamed from: e */
    public final ImplicitClassReceiver f64169e;

    public LazyClassReceiverParameterDescriptor(@NotNull ClassDescriptor classDescriptor) {
        super(Annotations.Companion.f64024a);
        this.f64168d = classDescriptor;
        this.f64169e = new ImplicitClassReceiver(classDescriptor, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f64168d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        return this.f64169e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        StringBuilder m24u = C0000a.m24u("class ");
        m24u.append(this.f64168d.getName());
        m24u.append("::this");
        return m24u.toString();
    }
}
