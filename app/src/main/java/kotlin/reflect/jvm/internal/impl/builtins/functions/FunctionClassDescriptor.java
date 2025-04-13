package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: FunctionClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {

    /* renamed from: e */
    public final FunctionTypeConstructor f63844e;

    /* renamed from: f */
    public final FunctionClassScope f63845f;

    /* renamed from: g */
    public final List<TypeParameterDescriptor> f63846g;

    /* renamed from: h */
    public final StorageManager f63847h;

    /* renamed from: i */
    public final PackageFragmentDescriptor f63848i;

    /* renamed from: j */
    @NotNull
    public final Kind f63849j;

    /* renamed from: k */
    public final int f63850k;

    /* compiled from: FunctionClassDescriptor.kt */
    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {

        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Kind.values().length];
                iArr[Kind.f63857e.ordinal()] = 1;
                iArr[Kind.f63859g.ordinal()] = 2;
                int[] iArr2 = new int[Kind.values().length];
                iArr2[Kind.f63858f.ordinal()] = 1;
                iArr2[3] = 2;
            }
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.f63847h);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            return true;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1] */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: e */
        public Collection<KotlinType> mo32451e() {
            final ArrayList arrayList = new ArrayList(2);
            ?? r2 = new Function2<PackageFragmentDescriptor, Name, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* renamed from: a */
                public final void m32455a(@NotNull PackageFragmentDescriptor packageFragment, @NotNull Name name) {
                    Intrinsics.m32180i(packageFragment, "packageFragment");
                    Intrinsics.m32180i(name, "name");
                    ClassifierDescriptor mo32732c = packageFragment.mo32415p().mo32732c(name, NoLookupLocation.FROM_BUILTINS);
                    if (!(mo32732c instanceof ClassDescriptor)) {
                        mo32732c = null;
                    }
                    ClassDescriptor classDescriptor = (ClassDescriptor) mo32732c;
                    if (classDescriptor == null) {
                        throw new IllegalStateException(("Class " + name + " not found in " + packageFragment).toString());
                    }
                    TypeConstructor mo32440j = classDescriptor.mo32440j();
                    Intrinsics.m32175d(mo32440j, "descriptor.typeConstructor");
                    List m32019f0 = CollectionsKt.m32019f0(FunctionClassDescriptor.this.f63846g, mo32440j.getParameters().size());
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(m32019f0, 10));
                    Iterator it = m32019f0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).mo32502r()));
                    }
                    ArrayList arrayList3 = arrayList;
                    int i2 = Annotations.f64023H1;
                    arrayList3.add(KotlinTypeFactory.m33664b(Annotations.Companion.f64024a, classDescriptor, arrayList2));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PackageFragmentDescriptor packageFragmentDescriptor, Name name) {
                    m32455a(packageFragmentDescriptor, name);
                    return Unit.f63088a;
                }
            };
            int ordinal = FunctionClassDescriptor.this.f63849j.ordinal();
            if (ordinal == 1) {
                FqName BUILT_INS_PACKAGE_FQ_NAME = KotlinBuiltIns.f63725g;
                Intrinsics.m32175d(BUILT_INS_PACKAGE_FQ_NAME, "BUILT_INS_PACKAGE_FQ_NAME");
                r2.m32455a(m32454m(BUILT_INS_PACKAGE_FQ_NAME), Name.m33211d("Function"));
            } else if (ordinal != 3) {
                FunctionClassDescriptor functionClassDescriptor = FunctionClassDescriptor.this;
                r2.m32455a(functionClassDescriptor.f63848i, Name.m33211d(functionClassDescriptor.f63849j.f63863c));
            } else {
                r2.m32455a(FunctionClassDescriptor.this.f63848i, Name.m33211d("KFunction"));
            }
            int ordinal2 = FunctionClassDescriptor.this.f63849j.ordinal();
            if (ordinal2 == 2) {
                FqName BUILT_INS_PACKAGE_FQ_NAME2 = KotlinBuiltIns.f63725g;
                Intrinsics.m32175d(BUILT_INS_PACKAGE_FQ_NAME2, "BUILT_INS_PACKAGE_FQ_NAME");
                r2.m32455a(m32454m(BUILT_INS_PACKAGE_FQ_NAME2), Kind.f63856d.m32456a(FunctionClassDescriptor.this.f63850k));
            } else if (ordinal2 == 3) {
                FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE = DescriptorUtils.f65877c;
                Intrinsics.m32175d(COROUTINES_PACKAGE_FQ_NAME_RELEASE, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
                r2.m32455a(m32454m(COROUTINES_PACKAGE_FQ_NAME_RELEASE), Kind.f63857e.m32456a(FunctionClassDescriptor.this.f63850k));
            }
            return CollectionsKt.m32027j0(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.f63846g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: h */
        public SupertypeLoopChecker mo32452h() {
            return SupertypeLoopChecker.EMPTY.f63981a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* renamed from: k */
        public ClassDescriptor mo32449b() {
            return FunctionClassDescriptor.this;
        }

        /* renamed from: m */
        public final BuiltInsPackageFragment m32454m(FqName fqName) {
            List<PackageFragmentDescriptor> mo32553E = FunctionClassDescriptor.this.f63848i.mo32437b().mo32545K(fqName).mo32553E();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo32553E) {
                if (obj instanceof BuiltInsPackageFragment) {
                    arrayList.add(obj);
                }
            }
            return (BuiltInsPackageFragment) CollectionsKt.m32044u(arrayList);
        }

        @NotNull
        public String toString() {
            return FunctionClassDescriptor.this.toString();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: FunctionClassDescriptor.kt */
    public static final class Kind {

        /* renamed from: d */
        public static final Kind f63856d;

        /* renamed from: e */
        public static final Kind f63857e;

        /* renamed from: f */
        public static final Kind f63858f;

        /* renamed from: g */
        public static final Kind f63859g;

        /* renamed from: h */
        public static final /* synthetic */ Kind[] f63860h;

        /* renamed from: i */
        public static final Companion f63861i;

        /* renamed from: b */
        @NotNull
        public final FqName f63862b;

        /* renamed from: c */
        @NotNull
        public final String f63863c;

        /* compiled from: FunctionClassDescriptor.kt */
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            FqName BUILT_INS_PACKAGE_FQ_NAME = KotlinBuiltIns.f63725g;
            Intrinsics.m32175d(BUILT_INS_PACKAGE_FQ_NAME, "BUILT_INS_PACKAGE_FQ_NAME");
            Kind kind = new Kind("Function", 0, BUILT_INS_PACKAGE_FQ_NAME, "Function");
            f63856d = kind;
            FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE = DescriptorUtils.f65877c;
            Intrinsics.m32175d(COROUTINES_PACKAGE_FQ_NAME_RELEASE, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
            Kind kind2 = new Kind("SuspendFunction", 1, COROUTINES_PACKAGE_FQ_NAME_RELEASE, "SuspendFunction");
            f63857e = kind2;
            FqName fqName = ReflectionTypesKt.f63827a;
            Kind kind3 = new Kind("KFunction", 2, fqName, "KFunction");
            f63858f = kind3;
            Kind kind4 = new Kind("KSuspendFunction", 3, fqName, "KSuspendFunction");
            f63859g = kind4;
            f63860h = new Kind[]{kind, kind2, kind3, kind4};
            f63861i = new Companion(null);
        }

        public Kind(String str, int i2, @NotNull FqName packageFqName, @NotNull String str2) {
            Intrinsics.m32180i(packageFqName, "packageFqName");
            this.f63862b = packageFqName;
            this.f63863c = str2;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f63860h.clone();
        }

        @NotNull
        /* renamed from: a */
        public final Name m32456a(int i2) {
            return Name.m33211d(this.f63863c + i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$1] */
    public FunctionClassDescriptor(@NotNull StorageManager storageManager, @NotNull PackageFragmentDescriptor containingDeclaration, @NotNull Kind functionKind, int i2) {
        super(storageManager, functionKind.m32456a(i2));
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(functionKind, "functionKind");
        this.f63847h = storageManager;
        this.f63848i = containingDeclaration;
        this.f63849j = functionKind;
        this.f63850k = i2;
        this.f63844e = new FunctionTypeConstructor();
        this.f63845f = new FunctionClassScope(storageManager, this);
        final ArrayList arrayList = new ArrayList();
        ?? r6 = new Function2<Variance, String, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* renamed from: a */
            public final void m32448a(@NotNull Variance variance, @NotNull String name) {
                Intrinsics.m32180i(variance, "variance");
                Intrinsics.m32180i(name, "name");
                ArrayList arrayList2 = arrayList;
                FunctionClassDescriptor functionClassDescriptor = FunctionClassDescriptor.this;
                int i3 = Annotations.f64023H1;
                arrayList2.add(TypeParameterDescriptorImpl.m32655C0(functionClassDescriptor, Annotations.Companion.f64024a, false, variance, Name.m33211d(name), arrayList.size()));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Variance variance, String str) {
                m32448a(variance, str);
                return Unit.f63088a;
            }
        };
        IntRange intRange = new IntRange(1, i2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(intRange, 10));
        IntIterator it = intRange.iterator();
        while (((IntProgressionIterator) it).f63385d) {
            int mo1135a = it.mo1135a();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(mo1135a);
            r6.m32448a(variance, sb.toString());
            arrayList2.add(Unit.f63088a);
        }
        r6.m32448a(Variance.OUT_VARIANCE, "R");
        this.f63846g = CollectionsKt.m32027j0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: F */
    public /* bridge */ /* synthetic */ Collection mo32431F() {
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
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: P */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo32434P() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: Q */
    public /* bridge */ /* synthetic */ MemberScope mo32435Q() {
        return MemberScope.Empty.f65996b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: S */
    public /* bridge */ /* synthetic */ ClassDescriptor mo32436S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f63848i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return ClassKind.INTERFACE;
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
        Visibility visibility = Visibilities.f63988e;
        Intrinsics.m32175d(visibility, "Visibilities.PUBLIC");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return SourceElement.f63979a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f63844e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: l */
    public /* bridge */ /* synthetic */ Collection mo32442l() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return this.f63846g;
    }

    @NotNull
    public String toString() {
        String str = this.f64063a.f65606b;
        Intrinsics.m32175d(str, "name.asString()");
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return this.f63845f;
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
