package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LazyJavaClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    /* renamed from: h */
    public final LazyJavaResolverContext f64515h;

    /* renamed from: i */
    public final ClassKind f64516i;

    /* renamed from: j */
    public final Modality f64517j;

    /* renamed from: k */
    public final Visibility f64518k;

    /* renamed from: l */
    public final boolean f64519l;

    /* renamed from: m */
    public final LazyJavaClassTypeConstructor f64520m;

    /* renamed from: n */
    public final LazyJavaClassMemberScope f64521n;

    /* renamed from: o */
    public final InnerClassesScopeWrapper f64522o;

    /* renamed from: p */
    public final LazyJavaStaticClassScope f64523p;

    /* renamed from: q */
    @NotNull
    public final Annotations f64524q;

    /* renamed from: r */
    public final NotNullLazyValue<List<TypeParameterDescriptor>> f64525r;

    /* renamed from: s */
    public final JavaClass f64526s;

    /* renamed from: t */
    public final ClassDescriptor f64527t;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class Companion {
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    public final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {

        /* renamed from: c */
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f64528c;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f64515h.f64479c.f64446a);
            this.f64528c = LazyJavaClassDescriptor.this.f64515h.f64479c.f64446a.mo33623c(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends TypeParameterDescriptor> invoke() {
                    return TypeParameterUtilsKt.m32567b(LazyJavaClassDescriptor.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        
            if ((!r6.m33197b() && r6.m33200e(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.f63724f)) != false) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x006e  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @org.jetbrains.annotations.NotNull
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo32451e() {
            /*
                Method dump skipped, instructions count: 511
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.mo32451e():java.util.Collection");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f64528c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: h */
        public SupertypeLoopChecker mo32452h() {
            return LazyJavaClassDescriptor.this.f64515h.f64479c.f64458m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        @NotNull
        /* renamed from: k */
        public ClassDescriptor mo32449b() {
            return LazyJavaClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            String str = LazyJavaClassDescriptor.this.f64063a.f65606b;
            Intrinsics.m32175d(str, "name.asString()");
            return str;
        }
    }

    static {
        SetsKt.m32080g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext outerContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaClass jClass, @Nullable ClassDescriptor classDescriptor) {
        super(outerContext.f64479c.f64446a, containingDeclaration, jClass.getName(), outerContext.f64479c.f64455j.mo32360a(jClass), false);
        Modality modality;
        Modality modality2 = Modality.FINAL;
        Intrinsics.m32180i(outerContext, "outerContext");
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(jClass, "jClass");
        this.f64526s = jClass;
        this.f64527t = classDescriptor;
        boolean z = false;
        LazyJavaResolverContext m32716a = ContextKt.m32716a(outerContext, this, jClass, 0, 4);
        this.f64515h = m32716a;
        m32716a.f64479c.f64452g.mo32705c(jClass, this);
        jClass.mo32804B();
        this.f64516i = jClass.mo32811p() ? ClassKind.ANNOTATION_CLASS : jClass.mo32803A() ? ClassKind.INTERFACE : jClass.mo32812v() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (!jClass.mo32811p()) {
            boolean z2 = jClass.isAbstract() || jClass.mo32803A();
            boolean z3 = !jClass.isFinal();
            if (z2) {
                modality = Modality.ABSTRACT;
            } else {
                modality = z3 ? Modality.OPEN : modality;
            }
            modality2 = modality;
        }
        this.f64517j = modality2;
        this.f64518k = jClass.getVisibility();
        if (jClass.mo32809j() != null && !jClass.mo32828i()) {
            z = true;
        }
        this.f64519l = z;
        this.f64520m = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(m32716a, this, jClass);
        this.f64521n = lazyJavaClassMemberScope;
        this.f64522o = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f64523p = new LazyJavaStaticClassScope(m32716a, jClass, this);
        this.f64524q = new LazyJavaAnnotations(m32716a, jClass);
        this.f64525r = m32716a.f64479c.f64446a.mo33623c(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends TypeParameterDescriptor> invoke() {
                List<JavaTypeParameter> typeParameters = LazyJavaClassDescriptor.this.f64526s.getTypeParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor mo32725a = LazyJavaClassDescriptor.this.f64515h.f64480d.mo32725a(javaTypeParameter);
                    if (mo32725a == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + LazyJavaClassDescriptor.this.f64526s + ", so it must be resolved");
                    }
                    arrayList.add(mo32725a);
                }
                return arrayList;
            }
        });
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
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return this.f64519l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return this.f64523p;
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
        return this.f64516i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64524q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        Visibility visibility = (Intrinsics.m32174c(this.f64518k, Visibilities.f63984a) && this.f64526s.mo32809j() == null) ? JavaVisibilities.f64344a : this.f64518k;
        Intrinsics.m32175d(visibility, "if (visibility == Visibi…ISIBILITY else visibility");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f64520m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f64517j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: l */
    public Collection mo32442l() {
        return this.f64521n.f64532k.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return this.f64525r.invoke();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Lazy Java class ");
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(this);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        m24u.append(m33468d);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: u0 */
    public MemberScope mo32506u0() {
        return this.f64522o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return this.f64521n;
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
