package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import androidx.room.util.C0576a;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes3.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* renamed from: e */
    public List<? extends TypeParameterDescriptor> f64071e;

    /* renamed from: f */
    public final AbstractTypeAliasDescriptor$typeConstructor$1 f64072f;

    /* renamed from: g */
    public final Visibility f64073g;

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull Visibility visibility) {
        super(declarationDescriptor, annotations, name, sourceElement);
        this.f64073g = visibility;
        this.f64072f = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            /* renamed from: a */
            public Collection<KotlinType> mo32602a() {
                Collection<KotlinType> mo32602a = ((DeserializedTypeAliasDescriptor) AbstractTypeAliasDescriptor.this).mo32564g0().mo33515H0().mo32602a();
                Intrinsics.m32175d(mo32602a, "declarationDescriptor.un…pe.constructor.supertypes");
                return mo32602a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* renamed from: b */
            public ClassifierDescriptor mo32449b() {
                return AbstractTypeAliasDescriptor.this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* renamed from: c */
            public boolean mo32450c() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public List<TypeParameterDescriptor> getParameters() {
                return AbstractTypeAliasDescriptor.this.mo32601G();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            /* renamed from: n */
            public KotlinBuiltIns mo32603n() {
                return DescriptorUtilsKt.m33534g(AbstractTypeAliasDescriptor.this);
            }

            @NotNull
            public String toString() {
                return C0576a.m4118q(C0000a.m24u("[typealias "), AbstractTypeAliasDescriptor.this.f64102b.f65606b, ']');
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* renamed from: D */
    public DeclarationDescriptorWithSource mo32487a() {
        return this;
    }

    @NotNull
    /* renamed from: G */
    public abstract List<TypeParameterDescriptor> mo32601G();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.m32180i(visitor, "visitor");
        return visitor.mo32511e(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return TypeUtils.m33692b(((DeserializedTypeAliasDescriptor) this).mo32564g0(), new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(UnwrappedType unwrappedType) {
                UnwrappedType type = unwrappedType;
                Intrinsics.m32175d(type, "type");
                boolean z = false;
                if (!KotlinTypeKt.m33667a(type)) {
                    ClassifierDescriptor mo32449b = type.mo33515H0().mo32449b();
                    if ((mo32449b instanceof TypeParameterDescriptor) && (Intrinsics.m32174c(((TypeParameterDescriptor) mo32449b).mo32437b(), AbstractTypeAliasDescriptor.this) ^ true)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public ClassifierDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public DeclarationDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f64073g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f64072f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        List list = this.f64071e;
        if (list != null) {
            return list;
        }
        Intrinsics.m32189r("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("typealias ");
        m24u.append(this.f64102b.f65606b);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }
}
