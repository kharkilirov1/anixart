package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* renamed from: e */
    public final Variance f64076e;

    /* renamed from: f */
    public final boolean f64077f;

    /* renamed from: g */
    public final int f64078g;

    /* renamed from: h */
    public final NotNullLazyValue<TypeConstructor> f64079h;

    /* renamed from: i */
    public final NotNullLazyValue<SimpleType> f64080i;

    public class TypeParameterTypeConstructor extends AbstractTypeConstructor {

        /* renamed from: b */
        public final SupertypeLoopChecker f64088b;

        public TypeParameterTypeConstructor(StorageManager storageManager, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            this.f64088b = supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            return AbstractTypeParameterDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: e */
        public Collection<KotlinType> mo32451e() {
            return AbstractTypeParameterDescriptor.this.mo32605O();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @Nullable
        /* renamed from: f */
        public KotlinType mo32606f() {
            return ErrorUtils.m33652c("Cyclic upper bounds");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: h */
        public SupertypeLoopChecker mo32452h() {
            return this.f64088b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* renamed from: j */
        public void mo32607j(@NotNull KotlinType kotlinType) {
            AbstractTypeParameterDescriptor.this.mo32604G(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: n */
        public KotlinBuiltIns mo32603n() {
            return DescriptorUtilsKt.m33534g(AbstractTypeParameterDescriptor.this);
        }

        public String toString() {
            return AbstractTypeParameterDescriptor.this.f64102b.f65606b;
        }
    }

    public AbstractTypeParameterDescriptor(@NotNull final StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull final Name name, @NotNull Variance variance, boolean z, int i2, @NotNull SourceElement sourceElement, @NotNull final SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        this.f64076e = variance;
        this.f64077f = z;
        this.f64078g = i2;
        this.f64079h = storageManager.mo33623c(new Function0<TypeConstructor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public TypeConstructor invoke() {
                return AbstractTypeParameterDescriptor.this.new TypeParameterTypeConstructor(storageManager, supertypeLoopChecker);
            }
        });
        this.f64080i = storageManager.mo33623c(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                int i3 = Annotations.f64023H1;
                return KotlinTypeFactory.m33666d(Annotations.Companion.f64024a, AbstractTypeParameterDescriptor.this.mo32440j(), Collections.emptyList(), false, new LazyScopeAdapter(storageManager.mo33623c(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2.1
                    @Override // kotlin.jvm.functions.Function0
                    public MemberScope invoke() {
                        StringBuilder m24u = C0000a.m24u("Scope for type parameter ");
                        m24u.append(name.f65606b);
                        return TypeIntersectionScope.m33552h(m24u.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
                    }
                })));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: A */
    public boolean mo32497A() {
        return this.f64077f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* renamed from: D */
    public DeclarationDescriptorWithSource mo32487a() {
        return this;
    }

    /* renamed from: G */
    public abstract void mo32604G(@NotNull KotlinType kotlinType);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo32517m(this, d);
    }

    @NotNull
    /* renamed from: O */
    public abstract List<KotlinType> mo32605O();

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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    public TypeParameterDescriptor mo32487a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        return ((TypeParameterTypeConstructor) mo32440j()).mo32602a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: h */
    public int mo32499h() {
        return this.f64078g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public final TypeConstructor mo32440j() {
        return this.f64079h.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* renamed from: m */
    public Variance mo32500m() {
        return this.f64076e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* renamed from: m0 */
    public boolean mo32501m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    public SimpleType mo32502r() {
        return this.f64080i.invoke();
    }
}
