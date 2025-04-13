package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes3.dex */
public final class NotFoundClasses {

    /* renamed from: a */
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f63962a;

    /* renamed from: b */
    public final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> f63963b;

    /* renamed from: c */
    public final StorageManager f63964c;

    /* renamed from: d */
    public final ModuleDescriptor f63965d;

    /* compiled from: NotFoundClasses.kt */
    public static final class ClassRequest {

        /* renamed from: a */
        @NotNull
        public final ClassId f63966a;

        /* renamed from: b */
        @NotNull
        public final List<Integer> f63967b;

        public ClassRequest(@NotNull ClassId classId, @NotNull List<Integer> list) {
            this.f63966a = classId;
            this.f63967b = list;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.m32174c(this.f63966a, classRequest.f63966a) && Intrinsics.m32174c(this.f63967b, classRequest.f63967b);
        }

        public int hashCode() {
            ClassId classId = this.f63966a;
            int hashCode = (classId != null ? classId.hashCode() : 0) * 31;
            List<Integer> list = this.f63967b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("ClassRequest(classId=");
            m24u.append(this.f63966a);
            m24u.append(", typeParametersCount=");
            m24u.append(this.f63967b);
            m24u.append(")");
            return m24u.toString();
        }
    }

    /* compiled from: NotFoundClasses.kt */
    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* renamed from: h */
        public final List<TypeParameterDescriptor> f63968h;

        /* renamed from: i */
        public final ClassTypeConstructorImpl f63969i;

        /* renamed from: j */
        public final boolean f63970j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor container, @NotNull Name name, boolean z, int i2) {
            super(storageManager, container, name, SourceElement.f63979a, false);
            Intrinsics.m32180i(storageManager, "storageManager");
            Intrinsics.m32180i(container, "container");
            this.f63970j = z;
            IntRange m32243j = RangesKt.m32243j(0, i2);
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32243j, 10));
            IntIterator it = m32243j.iterator();
            while (((IntProgressionIterator) it).f63385d) {
                int mo1135a = it.mo1135a();
                Annotations annotations = Annotations.Companion.f64024a;
                Variance variance = Variance.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(mo1135a);
                arrayList.add(TypeParameterDescriptorImpl.m32655C0(this, annotations, false, variance, Name.m33211d(sb.toString()), mo1135a));
            }
            this.f63968h = arrayList;
            ModuleDescriptor m33466b = DescriptorUtils.m33466b(this);
            Intrinsics.m32175d(m33466b, "DescriptorUtils.getContainingModule(this)");
            this.f63969i = new ClassTypeConstructorImpl(this, arrayList, SetsKt.m32079f(m33466b.mo32547n().m32397e()), storageManager);
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
            return this.f63970j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* renamed from: P */
        public ClassConstructorDescriptor mo32434P() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: Q */
        public /* bridge */ /* synthetic */ MemberScope mo32435Q() {
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
            return ClassKind.CLASS;
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        /* renamed from: j */
        public TypeConstructor mo32440j() {
            return this.f63969i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        @NotNull
        /* renamed from: k */
        public Modality mo32441k() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        /* renamed from: l */
        public Collection<ClassConstructorDescriptor> mo32442l() {
            return EmptySet.f63146b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        @NotNull
        /* renamed from: t */
        public List<TypeParameterDescriptor> mo32443t() {
            return this.f63968h;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("class ");
            m24u.append(this.f64063a);
            m24u.append(" (not found)");
            return m24u.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        /* renamed from: x */
        public boolean mo32444x() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: x0 */
        public /* bridge */ /* synthetic */ MemberScope mo32445x0() {
            return MemberScope.Empty.f65996b;
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

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(module, "module");
        this.f63964c = storageManager;
        this.f63965d = module;
        this.f63962a = storageManager.mo33626f(new Function1<FqName, EmptyPackageFragmentDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public EmptyPackageFragmentDescriptor invoke(FqName fqName) {
                FqName fqName2 = fqName;
                Intrinsics.m32180i(fqName2, "fqName");
                return new EmptyPackageFragmentDescriptor(NotFoundClasses.this.f63965d, fqName2);
            }
        });
        this.f63963b = storageManager.mo33626f(new Function1<ClassRequest, MockClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public NotFoundClasses.MockClassDescriptor invoke(NotFoundClasses.ClassRequest classRequest) {
                PackageFragmentDescriptor invoke;
                NotFoundClasses.ClassRequest classRequest2 = classRequest;
                Intrinsics.m32180i(classRequest2, "<name for destructuring parameter 0>");
                ClassId classId = classRequest2.f63966a;
                List<Integer> list = classRequest2.f63967b;
                if (classId.f65595c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + classId);
                }
                ClassId m33192f = classId.m33192f();
                if (m33192f == null || (invoke = NotFoundClasses.this.m32549a(m33192f, CollectionsKt.m32038p(list, 1))) == null) {
                    MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> memoizedFunctionToNotNull = NotFoundClasses.this.f63962a;
                    FqName fqName = classId.f65593a;
                    Intrinsics.m32175d(fqName, "classId.packageFqName");
                    invoke = memoizedFunctionToNotNull.invoke(fqName);
                }
                DeclarationDescriptor declarationDescriptor = invoke;
                boolean m33194h = classId.m33194h();
                StorageManager storageManager2 = NotFoundClasses.this.f63964c;
                Name m33193g = classId.m33193g();
                Intrinsics.m32175d(m33193g, "classId.shortClassName");
                Integer num = (Integer) CollectionsKt.m32046w(list);
                return new NotFoundClasses.MockClassDescriptor(storageManager2, declarationDescriptor, m33193g, m33194h, num != null ? num.intValue() : 0);
            }
        });
    }

    @NotNull
    /* renamed from: a */
    public final ClassDescriptor m32549a(@NotNull ClassId classId, @NotNull List<Integer> list) {
        return this.f63963b.invoke(new ClassRequest(classId, list));
    }
}
