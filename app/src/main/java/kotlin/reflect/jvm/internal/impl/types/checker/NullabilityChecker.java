package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes3.dex */
public final class NullabilityChecker {

    /* renamed from: a */
    public static final NullabilityChecker f66380a = new NullabilityChecker();

    /* renamed from: a */
    public final boolean m33719a(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeCheckerContext.SupertypesPolicy supertypesPolicy) {
        if (!((NewKotlinTypeCheckerKt.m33717a(simpleType) && !simpleType.mo32838I0()) || (simpleType instanceof DefinitelyNotNullType))) {
            TypeCheckerContext.m33724b(typeCheckerContext);
            ArrayDeque<SimpleType> arrayDeque = typeCheckerContext.f66385b;
            if (arrayDeque == null) {
                Intrinsics.m32188q();
                throw null;
            }
            Set<SimpleType> set = typeCheckerContext.f66386c;
            if (set == null) {
                Intrinsics.m32188q();
                throw null;
            }
            arrayDeque.push(simpleType);
            while (!arrayDeque.isEmpty()) {
                if (set.size() > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + simpleType + ". Supertypes = " + CollectionsKt.m31989B(set, null, null, null, 0, null, null, 63, null)).toString());
                }
                SimpleType current = arrayDeque.pop();
                Intrinsics.m32175d(current, "current");
                if (set.add(current)) {
                    TypeCheckerContext.SupertypesPolicy supertypesPolicy2 = current.mo32838I0() ? TypeCheckerContext.SupertypesPolicy.None.f66395a : supertypesPolicy;
                    if (!(!Intrinsics.m32174c(supertypesPolicy2, TypeCheckerContext.SupertypesPolicy.None.f66395a))) {
                        supertypesPolicy2 = null;
                    }
                    if (supertypesPolicy2 != null) {
                        for (KotlinType supertype : current.mo33515H0().mo32602a()) {
                            Intrinsics.m32175d(supertype, "supertype");
                            SimpleType mo33727a = supertypesPolicy2.mo33727a(supertype);
                            if ((NewKotlinTypeCheckerKt.m33717a(mo33727a) && !mo33727a.mo32838I0()) || (mo33727a instanceof DefinitelyNotNullType)) {
                                TypeCheckerContext.m33723a(typeCheckerContext);
                            } else {
                                arrayDeque.add(mo33727a);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            TypeCheckerContext.m33723a(typeCheckerContext);
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m33720b(@NotNull UnwrappedType unwrappedType) {
        return m33719a(new TypeCheckerContext(false, false, 2), FlexibleTypesKt.m33659c(unwrappedType), TypeCheckerContext.SupertypesPolicy.LowerIfFlexible.f66393a);
    }
}
