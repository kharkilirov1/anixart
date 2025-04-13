package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes3.dex */
final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1<N> implements DFS.Neighbors<N> {

    /* renamed from: a */
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1 f64606a = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* renamed from: a */
    public Iterable mo32250a(Object obj) {
        ClassDescriptor it = (ClassDescriptor) obj;
        Intrinsics.m32175d(it, "it");
        TypeConstructor mo32440j = it.mo32440j();
        Intrinsics.m32175d(mo32440j, "it.typeConstructor");
        Collection<KotlinType> mo32602a = mo32440j.mo32602a();
        Intrinsics.m32175d(mo32602a, "it.typeConstructor.supertypes");
        return SequencesKt.m33835c(SequencesKt.m33853u(CollectionsKt.m32028k(mo32602a), new Function1<KotlinType, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.1
            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(KotlinType kotlinType) {
                ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
                if (!(mo32449b instanceof ClassDescriptor)) {
                    mo32449b = null;
                }
                return (ClassDescriptor) mo32449b;
            }
        }));
    }
}
