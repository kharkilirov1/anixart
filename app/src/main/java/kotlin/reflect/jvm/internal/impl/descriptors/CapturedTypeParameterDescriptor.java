package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes3.dex */
final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {

    /* renamed from: a */
    public final TypeParameterDescriptor f63944a;

    /* renamed from: b */
    public final DeclarationDescriptor f63945b;

    /* renamed from: c */
    public final int f63946c;

    public CapturedTypeParameterDescriptor(@NotNull TypeParameterDescriptor originalDescriptor, @NotNull DeclarationDescriptor declarationDescriptor, int i2) {
        Intrinsics.m32180i(originalDescriptor, "originalDescriptor");
        Intrinsics.m32180i(declarationDescriptor, "declarationDescriptor");
        this.f63944a = originalDescriptor;
        this.f63945b = declarationDescriptor;
        this.f63946c = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: A */
    public boolean mo32497A() {
        return this.f63944a.mo32497A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.f63944a.mo32498H(declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f63945b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f63944a.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f63944a.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        return this.f63944a.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: h */
    public int mo32499h() {
        return this.f63944a.mo32499h() + this.f63946c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return this.f63944a.mo32439i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f63944a.mo32440j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* renamed from: m */
    public Variance mo32500m() {
        return this.f63944a.mo32500m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: m0 */
    public boolean mo32501m0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    public SimpleType mo32502r() {
        return this.f63944a.mo32502r();
    }

    @NotNull
    public String toString() {
        return this.f63944a.toString() + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public TypeParameterDescriptor mo32487a() {
        TypeParameterDescriptor mo32487a = this.f63944a.mo32487a();
        Intrinsics.m32175d(mo32487a, "originalDescriptor.original");
        return mo32487a;
    }
}
