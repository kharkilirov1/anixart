package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* compiled from: KClasses.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, m31884d2 = {"<anonymous>", "", "Lkotlin/reflect/KType;", "kotlin.jvm.PlatformType", "", "current", "getNeighbors"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class KClasses$allSupertypes$1<N> implements DFS.Neighbors<KType> {
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* renamed from: a */
    public Iterable<? extends KType> mo32250a(KType kType) {
        KType kType2 = kType;
        KClassifier f63357b = kType2.getF63357b();
        if (!(f63357b instanceof KClass)) {
            f63357b = null;
        }
        KClass kClass = (KClass) f63357b;
        if (kClass == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + kType2);
        }
        List<KType> mo32164a = kClass.mo32164a();
        if (kType2.mo32218c().isEmpty()) {
            return mo32164a;
        }
        TypeSubstitutor m33684c = TypeSubstitutor.m33684c(((KTypeImpl) kType2).f63615e);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32164a, 10));
        for (KType kType3 : mo32164a) {
            if (kType3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            }
            KotlinType m33689h = m33684c.m33689h(((KTypeImpl) kType3).f63615e, Variance.INVARIANT);
            if (m33689h == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + kType3 + " (" + kType2 + ')');
            }
            arrayList.add(new KTypeImpl(m33689h, new Function0() { // from class: kotlin.reflect.full.KClasses$allSupertypes$1$1$1$1
                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    throw new NotImplementedError("An operation is not implemented: Java type for supertype");
                }
            }));
        }
        return arrayList;
    }
}
