package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes3.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* renamed from: a */
    public final Function1<JavaMethod, Boolean> f64492a;

    /* renamed from: b */
    public final Map<Name, List<JavaMethod>> f64493b;

    /* renamed from: c */
    public final Map<Name, JavaField> f64494c;

    /* renamed from: d */
    @NotNull
    public final JavaClass f64495d;

    /* renamed from: e */
    public final Function1<JavaMember, Boolean> f64496e;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass jClass, @NotNull Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.m32180i(jClass, "jClass");
        Intrinsics.m32180i(memberFilter, "memberFilter");
        this.f64495d = jClass;
        this.f64496e = memberFilter;
        Function1<JavaMethod, Boolean> function1 = new Function1<JavaMethod, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod r5) {
                /*
                    r4 = this;
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) r5
                    java.lang.String r0 = "m"
                    kotlin.jvm.internal.Intrinsics.m32180i(r5, r0)
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex.this
                    kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> r0 = r0.f64496e
                    java.lang.Object r0 = r0.invoke(r5)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L8c
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r5.mo32825H()
                    boolean r0 = r0.mo32803A()
                    if (r0 == 0) goto L88
                    kotlin.reflect.jvm.internal.impl.name.Name r0 = r5.getName()
                    java.lang.String r0 = r0.f65606b
                    java.lang.String r3 = "toString"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L7c
                    java.lang.String r3 = "hashCode"
                    boolean r3 = r0.equals(r3)
                    if (r3 == 0) goto L3a
                    goto L7c
                L3a:
                    java.lang.String r3 = "equals"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L7a
                    java.util.List r5 = r5.mo32827f()
                    int r0 = r5.size()
                    if (r0 != r2) goto L7a
                    java.lang.Object r5 = r5.get(r1)
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) r5
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r5 = r5.getType()
                    boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
                    if (r0 == 0) goto L7a
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) r5
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier r5 = r5.getF66564b()
                    boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
                    if (r0 == 0) goto L7a
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) r5
                    kotlin.reflect.jvm.internal.impl.name.FqName r5 = r5.mo32808d()
                    if (r5 == 0) goto L7a
                    kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r5 = r5.f65597a
                    java.lang.String r5 = r5.f65602a
                    java.lang.String r0 = "java.lang.Object"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L7a
                    r5 = 1
                    goto L84
                L7a:
                    r5 = 0
                    goto L84
                L7c:
                    java.util.List r5 = r5.mo32827f()
                    boolean r5 = r5.isEmpty()
                L84:
                    if (r5 == 0) goto L88
                    r5 = 1
                    goto L89
                L88:
                    r5 = 0
                L89:
                    if (r5 != 0) goto L8c
                    r1 = 1
                L8c:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1.invoke(java.lang.Object):java.lang.Object");
            }
        };
        this.f64492a = function1;
        Sequence m33841i = SequencesKt.m33841i(CollectionsKt.m32028k(jClass.mo32806F()), function1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) m33841i);
        while (filteringSequence$iterator$1.hasNext()) {
            Object next = filteringSequence$iterator$1.next();
            Name name = ((JavaMethod) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f64493b = linkedHashMap;
        Sequence m33841i2 = SequencesKt.m33841i(CollectionsKt.m32028k(this.f64495d.mo32813x()), this.f64496e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        FilteringSequence$iterator$1 filteringSequence$iterator$12 = new FilteringSequence$iterator$1((FilteringSequence) m33841i2);
        while (filteringSequence$iterator$12.hasNext()) {
            Object next2 = filteringSequence$iterator$12.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.f64494c = linkedHashMap2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* renamed from: a */
    public Set<Name> mo32727a() {
        Sequence m33841i = SequencesKt.m33841i(CollectionsKt.m32028k(this.f64495d.mo32806F()), this.f64492a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) m33841i);
        while (filteringSequence$iterator$1.hasNext()) {
            linkedHashSet.add(((JavaMethod) filteringSequence$iterator$1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    /* renamed from: b */
    public JavaField mo32728b(@NotNull Name name) {
        return this.f64494c.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* renamed from: c */
    public Set<Name> mo32729c() {
        Sequence m33841i = SequencesKt.m33841i(CollectionsKt.m32028k(this.f64495d.mo32813x()), this.f64496e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) m33841i);
        while (filteringSequence$iterator$1.hasNext()) {
            linkedHashSet.add(((JavaField) filteringSequence$iterator$1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    /* renamed from: d */
    public Collection<JavaMethod> mo32730d(@NotNull Name name) {
        Intrinsics.m32180i(name, "name");
        List<JavaMethod> list = this.f64493b.get(name);
        return list != null ? list : EmptyList.f63144b;
    }
}
