package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {

    /* renamed from: e */
    public final DeclarationDescriptor f64092e;

    /* renamed from: f */
    public final SourceElement f64093f;

    /* renamed from: g */
    public final boolean f64094g;

    public ClassDescriptorBase(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z) {
        super(storageManager, name);
        this.f64092e = declarationDescriptor;
        this.f64093f = sourceElement;
        this.f64094g = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f64092e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return this.f64093f;
    }

    /* renamed from: x */
    public boolean mo32444x() {
        return this.f64094g;
    }
}
