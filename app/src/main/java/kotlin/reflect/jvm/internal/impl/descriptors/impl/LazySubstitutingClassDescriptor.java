package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class LazySubstitutingClassDescriptor implements ClassDescriptor {

    /* renamed from: a */
    public final ClassDescriptor f64177a;

    /* renamed from: b */
    public final TypeSubstitutor f64178b;

    /* renamed from: c */
    public TypeSubstitutor f64179c;

    /* renamed from: d */
    public List<TypeParameterDescriptor> f64180d;

    /* renamed from: e */
    public List<TypeParameterDescriptor> f64181e;

    /* renamed from: f */
    public TypeConstructor f64182f;

    public LazySubstitutingClassDescriptor(ClassDescriptor classDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f64177a = classDescriptor;
        this.f64178b = typeSubstitutor;
    }

    /* renamed from: C */
    public final TypeSubstitutor m32628C() {
        if (this.f64179c == null) {
            if (this.f64178b.m33687e()) {
                this.f64179c = this.f64178b;
            } else {
                List<TypeParameterDescriptor> parameters = this.f64177a.mo32440j().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.f64180d = arrayList;
                TypeSubstitutor m33648a = DescriptorSubstitutor.m33648a(parameters, this.f64178b.f66349a, this, arrayList, null);
                if (m33648a == null) {
                    throw new AssertionError("Substitution failed");
                }
                this.f64179c = m33648a;
                this.f64181e = CollectionsKt.m32041r(this.f64180d, new Function1<TypeParameterDescriptor, Boolean>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.1
                    @Override // kotlin.jvm.functions.Function1
                    public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
                        return Boolean.valueOf(!typeParameterDescriptor.mo32501m0());
                    }
                });
            }
        }
        return this.f64179c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return this.f64177a.mo32430D0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F */
    public Collection<ClassDescriptor> mo32431F() {
        return this.f64177a.mo32431F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F0 */
    public ReceiverParameterDescriptor mo32504F0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32508a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return this.f64177a.mo32432I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return this.f64177a.mo32433J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return this.f64177a.mo32434P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return this.f64177a.mo32435Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: S */
    public ClassDescriptor mo32436S() {
        return this.f64177a.mo32436S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: a0 */
    public MemberScope mo32505a0(@NotNull TypeSubstitution typeSubstitution) {
        MemberScope mo32505a0 = this.f64177a.mo32505a0(typeSubstitution);
        return this.f64178b.m33687e() ? mo32505a0 : new SubstitutingScope(mo32505a0, m32628C());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f64177a.mo32437b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public DeclarationDescriptorNonRoot mo32503c(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.m33687e() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.m33685d(typeSubstitutor.f66349a, m32628C().f66349a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return this.f64177a.mo32438g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64177a.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f64177a.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64177a.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return SourceElement.f63979a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f64177a.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        TypeConstructor mo32440j = this.f64177a.mo32440j();
        if (this.f64178b.m33687e()) {
            return mo32440j;
        }
        if (this.f64182f == null) {
            TypeSubstitutor m32628C = m32628C();
            Collection<KotlinType> mo32602a = mo32440j.mo32602a();
            ArrayList arrayList = new ArrayList(mo32602a.size());
            Iterator<KotlinType> it = mo32602a.iterator();
            while (it.hasNext()) {
                arrayList.add(m32628C.m33689h(it.next(), Variance.INVARIANT));
            }
            this.f64182f = new ClassTypeConstructorImpl(this, this.f64180d, arrayList, LockBasedStorageManager.f66255e);
        }
        return this.f64182f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64177a.mo32441k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: l */
    public Collection<ClassConstructorDescriptor> mo32442l() {
        Collection<ClassConstructorDescriptor> mo32442l = this.f64177a.mo32442l();
        ArrayList arrayList = new ArrayList(mo32442l.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : mo32442l) {
            arrayList.add(classConstructorDescriptor.mo32495u((DeclarationDescriptor) this, classConstructorDescriptor.mo32441k(), classConstructorDescriptor.getVisibility(), classConstructorDescriptor.mo32493g(), false).mo32503c(m32628C()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    public SimpleType mo32502r() {
        return KotlinTypeFactory.m33664b(getAnnotations(), this, TypeUtils.m33693c(mo32440j().getParameters()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        m32628C();
        return this.f64181e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: u0 */
    public MemberScope mo32506u0() {
        return this.f64177a.mo32506u0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return this.f64177a.mo32444x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        MemberScope mo32445x0 = this.f64177a.mo32445x0();
        return this.f64178b.m33687e() ? mo32445x0 : new SubstitutingScope(mo32445x0, m32628C());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: y */
    public boolean mo32446y() {
        return this.f64177a.mo32446y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return this.f64177a.mo32447y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public ClassDescriptor mo32487a() {
        return this.f64177a.mo32487a();
    }
}
