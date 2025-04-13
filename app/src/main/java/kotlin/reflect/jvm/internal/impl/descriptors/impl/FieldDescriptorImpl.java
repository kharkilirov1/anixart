package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: FieldDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* renamed from: b */
    @NotNull
    public final PropertyDescriptor f64117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(@NotNull Annotations annotations, @NotNull PropertyDescriptor propertyDescriptor) {
        super(annotations);
        Intrinsics.m32180i(annotations, "annotations");
        this.f64117b = propertyDescriptor;
    }
}
