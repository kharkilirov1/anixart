package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class ClassDescriptorImpl extends ClassDescriptorBase {

    /* renamed from: h */
    public final Modality f64095h;

    /* renamed from: i */
    public final ClassKind f64096i;

    /* renamed from: j */
    public final TypeConstructor f64097j;

    /* renamed from: k */
    public MemberScope f64098k;

    /* renamed from: l */
    public Set<ClassConstructorDescriptor> f64099l;

    /* renamed from: m */
    public ClassConstructorDescriptor f64100m;

    public ClassDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, @NotNull Modality modality, @NotNull ClassKind classKind, @NotNull Collection<KotlinType> collection, @NotNull SourceElement sourceElement, boolean z, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z);
        this.f64095h = modality;
        this.f64096i = classKind;
        this.f64097j = new ClassTypeConstructorImpl(this, Collections.emptyList(), collection, storageManager);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F */
    public Collection<ClassDescriptor> mo32431F() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return this.f64100m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return MemberScope.Empty.f65996b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: S */
    public ClassDescriptor mo32436S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return this.f64096i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        int i2 = Annotations.f64023H1;
        return Annotations.Companion.f64024a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return Visibilities.f63988e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f64097j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64095h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: l */
    public Collection<ClassConstructorDescriptor> mo32442l() {
        return this.f64099l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("class ");
        m24u.append(this.f64063a);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return this.f64098k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: y */
    public boolean mo32446y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }
}
