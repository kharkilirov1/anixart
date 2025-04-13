package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {

    /* renamed from: b */
    @NotNull
    public final Name f64102b;

    public DeclarationDescriptorImpl(@NotNull Annotations annotations, @NotNull Name name) {
        super(annotations);
        this.f64102b = name;
    }

    @NotNull
    /* renamed from: C */
    public static String m32612C(@NotNull DeclarationDescriptor declarationDescriptor) {
        try {
            return DescriptorRenderer.f65767b.mo33363r(declarationDescriptor) + "[" + declarationDescriptor.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(declarationDescriptor)) + "]";
        } catch (Throwable unused) {
            return declarationDescriptor.getClass().getSimpleName() + " " + declarationDescriptor.getName();
        }
    }

    @NotNull
    /* renamed from: a */
    public DeclarationDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f64102b;
    }

    public String toString() {
        return m32612C(this);
    }
}
