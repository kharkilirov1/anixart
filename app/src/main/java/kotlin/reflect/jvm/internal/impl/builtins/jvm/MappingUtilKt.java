package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: mappingUtil.kt */
/* loaded from: classes3.dex */
public final class MappingUtilKt {
    @NotNull
    /* renamed from: a */
    public static final TypeConstructorSubstitution m32485a(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor to) {
        Intrinsics.m32180i(to, "to");
        classDescriptor.mo32443t().size();
        to.mo32443t().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.f66342b;
        List<TypeParameterDescriptor> mo32443t = classDescriptor.mo32443t();
        Intrinsics.m32175d(mo32443t, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32443t, 10));
        Iterator<T> it = mo32443t.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).mo32440j());
        }
        List<TypeParameterDescriptor> mo32443t2 = to.mo32443t();
        Intrinsics.m32175d(mo32443t2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(mo32443t2, 10));
        for (TypeParameterDescriptor it2 : mo32443t2) {
            Intrinsics.m32175d(it2, "it");
            SimpleType mo32502r = it2.mo32502r();
            Intrinsics.m32175d(mo32502r, "it.defaultType");
            arrayList2.add(new TypeProjectionImpl(Variance.INVARIANT, mo32502r));
        }
        return TypeConstructorSubstitution.Companion.m33675c(companion, MapsKt.m32067l(CollectionsKt.m32039p0(arrayList, arrayList2)), false, 2);
    }
}
