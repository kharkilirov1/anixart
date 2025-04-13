package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.yandex.div2.C3033a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor {

    /* renamed from: e */
    public final ClassId f66157e;

    /* renamed from: f */
    public final Modality f66158f;

    /* renamed from: g */
    public final Visibility f66159g;

    /* renamed from: h */
    public final ClassKind f66160h;

    /* renamed from: i */
    @NotNull
    public final DeserializationContext f66161i;

    /* renamed from: j */
    public final MemberScopeImpl f66162j;

    /* renamed from: k */
    public final DeserializedClassTypeConstructor f66163k;

    /* renamed from: l */
    public final DeserializedClassMemberScope f66164l;

    /* renamed from: m */
    public final EnumEntryClassDescriptors f66165m;

    /* renamed from: n */
    public final DeclarationDescriptor f66166n;

    /* renamed from: o */
    public final NullableLazyValue<ClassConstructorDescriptor> f66167o;

    /* renamed from: p */
    public final NotNullLazyValue<Collection<ClassConstructorDescriptor>> f66168p;

    /* renamed from: q */
    public final NullableLazyValue<ClassDescriptor> f66169q;

    /* renamed from: r */
    public final NotNullLazyValue<Collection<ClassDescriptor>> f66170r;

    /* renamed from: s */
    @NotNull
    public final ProtoContainer.Class f66171s;

    /* renamed from: t */
    @NotNull
    public final Annotations f66172t;

    /* renamed from: u */
    @NotNull
    public final ProtoBuf.Class f66173u;

    /* renamed from: v */
    @NotNull
    public final BinaryVersion f66174v;

    /* renamed from: w */
    public final SourceElement f66175w;

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* renamed from: m */
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f66178m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DeserializedClassMemberScope() {
            /*
                r7 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.this = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r8.f66161i
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f66173u
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r0.f64933o
                java.lang.String r0 = "classProto.functionList"
                kotlin.jvm.internal.Intrinsics.m32175d(r2, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f66173u
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r3 = r0.f64934p
                java.lang.String r0 = "classProto.propertyList"
                kotlin.jvm.internal.Intrinsics.m32175d(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f66173u
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r4 = r0.f64935q
                java.lang.String r0 = "classProto.typeAliasList"
                kotlin.jvm.internal.Intrinsics.m32175d(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f66173u
                java.util.List<java.lang.Integer> r0 = r0.f64930l
                java.lang.String r5 = "classProto.nestedClassNameList"
                kotlin.jvm.internal.Intrinsics.m32175d(r0, r5)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r8.f66161i
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8 = r8.f66070d
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.CollectionsKt.m32032m(r0, r6)
                r5.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L53
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.m33585b(r8, r6)
                r5.add(r6)
                goto L3b
            L53:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r8.<init>()
                r0 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r7.f66212k
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r8 = r8.f66069c
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r8 = r8.f66050b
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r8 = r8.mo33623c(r0)
                r7.f66178m = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: a */
        public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(location, "location");
            m33611q(name, location);
            return super.mo32614a(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* renamed from: c */
        public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
            ClassDescriptor invoke;
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(location, "location");
            UtilsKt.m32659a(this.f66212k.f66069c.f66058j, location, DeserializedClassDescriptor.this, name);
            EnumEntryClassDescriptors enumEntryClassDescriptors = DeserializedClassDescriptor.this.f66165m;
            return (enumEntryClassDescriptors == null || (invoke = enumEntryClassDescriptors.f66188b.invoke(name)) == null) ? super.mo32732c(name, location) : invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* renamed from: d */
        public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.m32180i(kindFilter, "kindFilter");
            Intrinsics.m32180i(nameFilter, "nameFilter");
            return this.f66178m.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: e */
        public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(location, "location");
            m33611q(name, location);
            return super.mo32617e(name, location);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* renamed from: g */
        public void mo33605g(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
            ?? r1;
            EnumEntryClassDescriptors enumEntryClassDescriptors = DeserializedClassDescriptor.this.f66165m;
            if (enumEntryClassDescriptors != null) {
                Set<Name> keySet = enumEntryClassDescriptors.f66187a.keySet();
                r1 = new ArrayList();
                for (Name name : keySet) {
                    Intrinsics.m32180i(name, "name");
                    ClassDescriptor invoke = enumEntryClassDescriptors.f66188b.invoke(name);
                    if (invoke != null) {
                        r1.add(invoke);
                    }
                }
            } else {
                r1 = 0;
            }
            if (r1 == 0) {
                r1 = EmptyList.f63144b;
            }
            collection.addAll(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* renamed from: i */
        public void mo33606i(@NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
            Intrinsics.m32180i(name, "name");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.f66163k.mo32602a().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo32791p().mo32614a(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            CollectionsKt.m32007T(collection, new Function1<SimpleFunctionDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(SimpleFunctionDescriptor simpleFunctionDescriptor) {
                    SimpleFunctionDescriptor it2 = simpleFunctionDescriptor;
                    Intrinsics.m32180i(it2, "it");
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = DeserializedClassDescriptor.DeserializedClassMemberScope.this;
                    return Boolean.valueOf(deserializedClassMemberScope.f66212k.f66069c.f66064p.mo32477c(DeserializedClassDescriptor.this, it2));
                }
            });
            collection.addAll(this.f66212k.f66069c.f66063o.mo32476b(name, DeserializedClassDescriptor.this));
            OverridingUtil.m33496g(arrayList, new ArrayList(collection), DeserializedClassDescriptor.this, new C6730xf150c8cf(collection));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* renamed from: j */
        public void mo33607j(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
            Intrinsics.m32180i(name, "name");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.f66163k.mo32602a().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo32791p().mo32617e(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            OverridingUtil.m33496g(arrayList, new ArrayList(collection), DeserializedClassDescriptor.this, new C6730xf150c8cf(collection));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* renamed from: k */
        public ClassId mo33608k(@NotNull Name name) {
            Intrinsics.m32180i(name, "name");
            return DeserializedClassDescriptor.this.f66157e.m33191c(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* renamed from: m */
        public Set<Name> mo33609m() {
            List<KotlinType> mo32602a = DeserializedClassDescriptor.this.f66163k.mo32602a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo32602a.iterator();
            while (it.hasNext()) {
                CollectionsKt.m32020g(linkedHashSet, ((KotlinType) it.next()).mo32791p().mo32615b());
            }
            linkedHashSet.addAll(this.f66212k.f66069c.f66063o.mo32479e(DeserializedClassDescriptor.this));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* renamed from: n */
        public Set<Name> mo33610n() {
            List<KotlinType> mo32602a = DeserializedClassDescriptor.this.f66163k.mo32602a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo32602a.iterator();
            while (it.hasNext()) {
                CollectionsKt.m32020g(linkedHashSet, ((KotlinType) it.next()).mo32791p().mo32618f());
            }
            return linkedHashSet;
        }

        /* renamed from: q */
        public void m33611q(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            UtilsKt.m32659a(this.f66212k.f66069c.f66058j, lookupLocation, DeserializedClassDescriptor.this, name);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {

        /* renamed from: c */
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f66184c;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.f66161i.f66069c.f66050b);
            this.f66184c = DeserializedClassDescriptor.this.f66161i.f66069c.f66050b.mo33623c(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends TypeParameterDescriptor> invoke() {
                    return TypeParameterUtilsKt.m32567b(DeserializedClassDescriptor.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: b */
        public ClassifierDescriptor mo32449b() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: c */
        public boolean mo32450c() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* renamed from: e */
        public Collection<KotlinType> mo32451e() {
            String str;
            FqName m33189a;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ProtoBuf.Class receiver$0 = deserializedClassDescriptor.f66173u;
            TypeTable typeTable = deserializedClassDescriptor.f66161i.f66072f;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            Intrinsics.m32180i(typeTable, "typeTable");
            List<ProtoBuf.Type> list = receiver$0.f64927i;
            boolean z = !list.isEmpty();
            ?? r2 = list;
            if (!z) {
                r2 = 0;
            }
            if (r2 == 0) {
                List<Integer> supertypeIdList = receiver$0.f64928j;
                Intrinsics.m32175d(supertypeIdList, "supertypeIdList");
                r2 = new ArrayList(CollectionsKt.m32032m(supertypeIdList, 10));
                for (Integer it : supertypeIdList) {
                    Intrinsics.m32175d(it, "it");
                    r2.add(typeTable.m33129a(it.intValue()));
                }
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(r2, 10));
            Iterator it2 = r2.iterator();
            while (it2.hasNext()) {
                arrayList.add(DeserializedClassDescriptor.this.f66161i.f66067a.m33594e((ProtoBuf.Type) it2.next()));
            }
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            List m32002O = CollectionsKt.m32002O(arrayList, deserializedClassDescriptor2.f66161i.f66069c.f66063o.mo32478d(deserializedClassDescriptor2));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it3 = m32002O.iterator();
            while (it3.hasNext()) {
                ClassifierDescriptor mo32449b = ((KotlinType) it3.next()).mo33515H0().mo32449b();
                if (!(mo32449b instanceof NotFoundClasses.MockClassDescriptor)) {
                    mo32449b = null;
                }
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = (NotFoundClasses.MockClassDescriptor) mo32449b;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                DeserializedClassDescriptor deserializedClassDescriptor3 = DeserializedClassDescriptor.this;
                ErrorReporter errorReporter = deserializedClassDescriptor3.f66161i.f66069c.f66057i;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId m33535h = DescriptorUtilsKt.m33535h(mockClassDescriptor2);
                    if (m33535h == null || (m33189a = m33535h.m33189a()) == null || (str = m33189a.f65597a.f65602a) == null) {
                        str = mockClassDescriptor2.f64063a.f65606b;
                    }
                    arrayList3.add(str);
                }
                errorReporter.mo32357b(deserializedClassDescriptor3, arrayList3);
            }
            return CollectionsKt.m32027j0(m32002O);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f66184c.invoke();
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
            return DeserializedClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            String str = DeserializedClassDescriptor.this.f64063a.f65606b;
            Intrinsics.m32175d(str, "name.toString()");
            return str;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class EnumEntryClassDescriptors {

        /* renamed from: a */
        public final Map<Name, ProtoBuf.EnumEntry> f66187a;

        /* renamed from: b */
        public final MemoizedFunctionToNullable<Name, ClassDescriptor> f66188b;

        /* renamed from: c */
        public final NotNullLazyValue<Set<Name>> f66189c;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf.EnumEntry> list = DeserializedClassDescriptor.this.f66173u.f64936r;
            Intrinsics.m32175d(list, "classProto.enumEntryList");
            int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g < 16 ? 16 : m32062g);
            for (Object obj : list) {
                ProtoBuf.EnumEntry it = (ProtoBuf.EnumEntry) obj;
                NameResolver nameResolver = DeserializedClassDescriptor.this.f66161i.f66070d;
                Intrinsics.m32175d(it, "it");
                linkedHashMap.put(NameResolverUtilKt.m33585b(nameResolver, it.f65020e), obj);
            }
            this.f66187a = linkedHashMap;
            this.f66188b = DeserializedClassDescriptor.this.f66161i.f66069c.f66050b.mo33627g(new C6732xaf8327b7(this));
            this.f66189c = DeserializedClassDescriptor.this.f66161i.f66069c.f66050b.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Set<? extends Name> invoke() {
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = DeserializedClassDescriptor.EnumEntryClassDescriptors.this;
                    Objects.requireNonNull(enumEntryClassDescriptors);
                    HashSet hashSet = new HashSet();
                    Iterator<KotlinType> it2 = DeserializedClassDescriptor.this.f66163k.mo32602a().iterator();
                    while (it2.hasNext()) {
                        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m33549a(it2.next().mo32791p(), null, null, 3, null)) {
                            if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                                hashSet.add(declarationDescriptor.getName());
                            }
                        }
                    }
                    List<ProtoBuf.Function> list2 = DeserializedClassDescriptor.this.f66173u.f64933o;
                    Intrinsics.m32175d(list2, "classProto.functionList");
                    for (ProtoBuf.Function it3 : list2) {
                        NameResolver nameResolver2 = DeserializedClassDescriptor.this.f66161i.f66070d;
                        Intrinsics.m32175d(it3, "it");
                        hashSet.add(NameResolverUtilKt.m33585b(nameResolver2, it3.f65057g));
                    }
                    List<ProtoBuf.Property> list3 = DeserializedClassDescriptor.this.f66173u.f64934p;
                    Intrinsics.m32175d(list3, "classProto.propertyList");
                    for (ProtoBuf.Property it4 : list3) {
                        NameResolver nameResolver3 = DeserializedClassDescriptor.this.f66161i.f66070d;
                        Intrinsics.m32175d(it4, "it");
                        hashSet.add(NameResolverUtilKt.m33585b(nameResolver3, it4.f65132g));
                    }
                    return SetsKt.m32077d(hashSet, hashSet);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(@NotNull DeserializationContext outerContext, @NotNull ProtoBuf.Class classProto, @NotNull NameResolver nameResolver, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        super(outerContext.f66069c.f66050b, NameResolverUtilKt.m33584a(nameResolver, classProto.f64924f).m33193g());
        Annotations nonEmptyDeserializedAnnotations;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        Intrinsics.m32180i(outerContext, "outerContext");
        Intrinsics.m32180i(classProto, "classProto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        Intrinsics.m32180i(sourceElement, "sourceElement");
        this.f66173u = classProto;
        this.f66174v = metadataVersion;
        this.f66175w = sourceElement;
        this.f66157e = NameResolverUtilKt.m33584a(nameResolver, classProto.f64924f);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f66128a;
        this.f66158f = protoEnumFlags.m33588b(Flags.f65399d.mo33113b(classProto.f64923e));
        this.f66159g = protoEnumFlags.m33589c(Flags.f65398c.mo33113b(classProto.f64923e));
        ProtoBuf.Class.Kind mo33113b = Flags.f65400e.mo33113b(classProto.f64923e);
        ClassKind classKind2 = ClassKind.CLASS;
        if (mo33113b != null) {
            switch (mo33113b.ordinal()) {
                case 1:
                    classKind2 = ClassKind.INTERFACE;
                    break;
                case 2:
                    classKind2 = classKind;
                    break;
                case 3:
                    classKind2 = ClassKind.ENUM_ENTRY;
                    break;
                case 4:
                    classKind2 = ClassKind.ANNOTATION_CLASS;
                    break;
                case 5:
                case 6:
                    classKind2 = ClassKind.OBJECT;
                    break;
            }
        }
        this.f66160h = classKind2;
        List<ProtoBuf.TypeParameter> list = classProto.f64926h;
        Intrinsics.m32175d(list, "classProto.typeParameterList");
        ProtoBuf.TypeTable typeTable = classProto.f64939u;
        Intrinsics.m32175d(typeTable, "classProto.typeTable");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.f65438c;
        ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.f64941w;
        Intrinsics.m32175d(versionRequirementTable, "classProto.versionRequirementTable");
        DeserializationContext m33568a = outerContext.m33568a(this, list, nameResolver, typeTable2, companion.m33130a(versionRequirementTable), metadataVersion);
        this.f66161i = m33568a;
        this.f66162j = classKind2 == classKind ? new StaticScopeForKotlinEnum(m33568a.f66069c.f66050b, this) : MemberScope.Empty.f65996b;
        this.f66163k = new DeserializedClassTypeConstructor();
        this.f66164l = new DeserializedClassMemberScope(this);
        this.f66165m = classKind2 == classKind ? new EnumEntryClassDescriptors() : null;
        DeclarationDescriptor declarationDescriptor = outerContext.f66071e;
        this.f66166n = declarationDescriptor;
        this.f66167o = m33568a.f66069c.f66050b.mo33624d(new Function0<ClassConstructorDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ClassConstructorDescriptor invoke() {
                Object obj;
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                if (deserializedClassDescriptor.f66160h.m32507a()) {
                    ClassConstructorDescriptorImpl m33462g = DescriptorFactory.m33462g(deserializedClassDescriptor, SourceElement.f63979a);
                    m33462g.f64123g = deserializedClassDescriptor.mo32502r();
                    return m33462g;
                }
                List<ProtoBuf.Constructor> list2 = deserializedClassDescriptor.f66173u.f64932n;
                Intrinsics.m32175d(list2, "classProto.constructorList");
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    ProtoBuf.Constructor it2 = (ProtoBuf.Constructor) obj;
                    Flags.BooleanFlagField booleanFlagField = Flags.f65406k;
                    Intrinsics.m32175d(it2, "it");
                    if (!booleanFlagField.mo33113b(it2.f64974e).booleanValue()) {
                        break;
                    }
                }
                ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
                if (constructor != null) {
                    return deserializedClassDescriptor.f66161i.f66068b.m33579h(constructor, true);
                }
                return null;
            }
        });
        this.f66168p = m33568a.f66069c.f66050b.mo33623c(new Function0<Collection<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Collection<? extends ClassConstructorDescriptor> invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                List<ProtoBuf.Constructor> list2 = deserializedClassDescriptor.f66173u.f64932n;
                Intrinsics.m32175d(list2, "classProto.constructorList");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    ProtoBuf.Constructor it = (ProtoBuf.Constructor) obj;
                    Flags.BooleanFlagField booleanFlagField = Flags.f65406k;
                    Intrinsics.m32175d(it, "it");
                    if (C3033a.m17751m(booleanFlagField, it.f64974e, "Flags.IS_SECONDARY.get(it.flags)")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ProtoBuf.Constructor it3 = (ProtoBuf.Constructor) it2.next();
                    MemberDeserializer memberDeserializer = deserializedClassDescriptor.f66161i.f66068b;
                    Intrinsics.m32175d(it3, "it");
                    arrayList2.add(memberDeserializer.m33579h(it3, false));
                }
                return CollectionsKt.m32002O(CollectionsKt.m32002O(arrayList2, CollectionsKt.m31995H(deserializedClassDescriptor.mo32434P())), deserializedClassDescriptor.f66161i.f66069c.f66063o.mo32475a(deserializedClassDescriptor));
            }
        });
        this.f66169q = m33568a.f66069c.f66050b.mo33624d(new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ClassDescriptor invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                ProtoBuf.Class r1 = deserializedClassDescriptor.f66173u;
                if (!((r1.f64922d & 4) == 4)) {
                    return null;
                }
                ClassifierDescriptor mo32732c = deserializedClassDescriptor.f66164l.mo32732c(NameResolverUtilKt.m33585b(deserializedClassDescriptor.f66161i.f66070d, r1.f64925g), NoLookupLocation.FROM_DESERIALIZATION);
                return (ClassDescriptor) (mo32732c instanceof ClassDescriptor ? mo32732c : null);
            }
        });
        this.f66170r = m33568a.f66069c.f66050b.mo33623c(new Function0<Collection<? extends ClassDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Collection<? extends ClassDescriptor> invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                if (deserializedClassDescriptor.f66158f != Modality.SEALED) {
                    return EmptyList.f63144b;
                }
                List<Integer> fqNames = deserializedClassDescriptor.f66173u.f64937s;
                Intrinsics.m32175d(fqNames, "fqNames");
                if (!(!fqNames.isEmpty())) {
                    return DescriptorUtilsKt.m33528a(deserializedClassDescriptor);
                }
                ArrayList arrayList = new ArrayList();
                for (Integer index : fqNames) {
                    DeserializationContext deserializationContext = deserializedClassDescriptor.f66161i;
                    DeserializationComponents deserializationComponents = deserializationContext.f66069c;
                    NameResolver nameResolver2 = deserializationContext.f66070d;
                    Intrinsics.m32175d(index, "index");
                    ClassDescriptor m33562b = deserializationComponents.m33562b(NameResolverUtilKt.m33584a(nameResolver2, index.intValue()));
                    if (m33562b != null) {
                        arrayList.add(m33562b);
                    }
                }
                return arrayList;
            }
        });
        NameResolver nameResolver2 = m33568a.f66070d;
        TypeTable typeTable3 = m33568a.f66072f;
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) (declarationDescriptor instanceof DeserializedClassDescriptor ? declarationDescriptor : null);
        this.f66171s = new ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f66171s : null);
        if (Flags.f65397b.mo33113b(classProto.f64923e).booleanValue()) {
            nonEmptyDeserializedAnnotations = new NonEmptyDeserializedAnnotations(m33568a.f66069c.f66050b, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends AnnotationDescriptor> invoke() {
                    DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                    return CollectionsKt.m32027j0(deserializedClassDescriptor2.f66161i.f66069c.f66054f.mo32872c(deserializedClassDescriptor2.f66171s));
                }
            });
        } else {
            int i2 = Annotations.f64023H1;
            nonEmptyDeserializedAnnotations = Annotations.Companion.f64024a;
        }
        this.f66172t = nonEmptyDeserializedAnnotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return C3033a.m17751m(Flags.f65402g, this.f66173u.f64923e, "Flags.IS_DATA.get(classProto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F */
    public Collection<ClassDescriptor> mo32431F() {
        return this.f66170r.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return C3033a.m17751m(Flags.f65404i, this.f66173u.f64923e, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return C3033a.m17751m(Flags.f65401f, this.f66173u.f64923e, "Flags.IS_INNER.get(classProto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return this.f66167o.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return this.f66162j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: S */
    public ClassDescriptor mo32436S() {
        return this.f66169q.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        return this.f66166n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return this.f66160h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66172t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return this.f66159g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return this.f66175w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return C3033a.m17751m(Flags.f65405j, this.f66173u.f64923e, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f66163k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return this.f66158f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: l */
    public Collection<ClassConstructorDescriptor> mo32442l() {
        return this.f66168p.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return this.f66161i.f66067a.m33592c();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("deserialized class ");
        m24u.append(this.f64063a);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return C3033a.m17751m(Flags.f65403h, this.f66173u.f64923e, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return this.f66164l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: y */
    public boolean mo32446y() {
        return Flags.f65400e.mo33113b(this.f66173u.f64923e) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }
}
