package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes3.dex */
public final class NewKotlinTypeChecker implements KotlinTypeChecker {

    /* renamed from: b */
    public static final NewKotlinTypeChecker f66379b = new NewKotlinTypeChecker();

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TypeCheckerContext.LowerCapturedTypePolicy.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            int[] iArr2 = new int[TypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.values().length];
            iArr2[1] = 1;
            iArr2[0] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            int[] iArr3 = new int[Variance.values().length];
            iArr3[Variance.INVARIANT.ordinal()] = 1;
            iArr3[Variance.OUT_VARIANCE.ordinal()] = 2;
            iArr3[Variance.IN_VARIANCE.ordinal()] = 3;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* renamed from: a */
    public boolean mo33701a(@NotNull KotlinType a2, @NotNull KotlinType b) {
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        return m33709d(new TypeCheckerContext(false, false, 2), a2.mo33662J0(), b.mo33662J0());
    }

    /* renamed from: b */
    public final List<SimpleType> m33707b(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeConstructor typeConstructor) {
        TypeCheckerContext.SupertypesPolicy lowerIfFlexibleWithCustomSubstitutor;
        CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
        ClassifierDescriptor mo32449b = typeConstructor.mo32449b();
        if (!(mo32449b instanceof ClassDescriptor)) {
            mo32449b = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
        if (classDescriptor != null) {
            if ((!ModalityKt.m32544a(classDescriptor) || classDescriptor.mo32438g() == ClassKind.ENUM_ENTRY || classDescriptor.mo32438g() == ClassKind.ANNOTATION_CLASS) ? false : true) {
                TypeConstructor a2 = simpleType.mo33515H0();
                Objects.requireNonNull(typeCheckerContext);
                Intrinsics.m32180i(a2, "a");
                if (!Intrinsics.m32174c(a2, typeConstructor)) {
                    return EmptyList.f63144b;
                }
                SimpleType m33706a = NewCapturedTypeKt.m33706a(simpleType, captureStatus, null, 4);
                if (m33706a == null) {
                    m33706a = simpleType;
                }
                return CollectionsKt.m31993F(m33706a);
            }
        }
        SmartList smartList = new SmartList();
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
                SimpleType m33706a2 = NewCapturedTypeKt.m33706a(current, captureStatus, null, 4);
                if (m33706a2 == null) {
                    m33706a2 = current;
                }
                TypeConstructor a3 = m33706a2.mo33515H0();
                Intrinsics.m32180i(a3, "a");
                if (Intrinsics.m32174c(a3, typeConstructor)) {
                    smartList.add(m33706a2);
                    lowerIfFlexibleWithCustomSubstitutor = TypeCheckerContext.SupertypesPolicy.None.f66395a;
                } else {
                    lowerIfFlexibleWithCustomSubstitutor = m33706a2.mo33514G0().isEmpty() ? TypeCheckerContext.SupertypesPolicy.LowerIfFlexible.f66393a : new TypeCheckerContext.SupertypesPolicy.LowerIfFlexibleWithCustomSubstitutor(new TypeSubstitutor(TypeConstructorSubstitution.f66342b.m33676a(m33706a2)));
                }
                if (!(!Intrinsics.m32174c(lowerIfFlexibleWithCustomSubstitutor, TypeCheckerContext.SupertypesPolicy.None.f66395a))) {
                    lowerIfFlexibleWithCustomSubstitutor = null;
                }
                if (lowerIfFlexibleWithCustomSubstitutor != null) {
                    for (KotlinType supertype : current.mo33515H0().mo32602a()) {
                        Intrinsics.m32175d(supertype, "supertype");
                        arrayDeque.add(lowerIfFlexibleWithCustomSubstitutor.mo33727a(supertype));
                    }
                }
            }
        }
        TypeCheckerContext.m33723a(typeCheckerContext);
        return smartList;
    }

    /* renamed from: c */
    public final List<SimpleType> m33708c(@NotNull TypeCheckerContext typeCheckerContext, SimpleType simpleType, TypeConstructor typeConstructor) {
        List<SimpleType> m33707b = m33707b(typeCheckerContext, simpleType, typeConstructor);
        if (m33707b.size() < 2) {
            return m33707b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m33707b.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<TypeProjection> mo33514G0 = ((SimpleType) next).mo33514G0();
            if (!(mo33514G0 instanceof Collection) || !mo33514G0.isEmpty()) {
                Iterator<T> it2 = mo33514G0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Intrinsics.m32175d(((TypeProjection) it2.next()).getType(), "it.type");
                    if (!(!(r3.mo33662J0() instanceof FlexibleType))) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : m33707b;
    }

    /* renamed from: d */
    public final boolean m33709d(@NotNull TypeCheckerContext typeCheckerContext, @NotNull UnwrappedType a2, @NotNull UnwrappedType b) {
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        if (a2 == b) {
            return true;
        }
        if (m33711f(a2) && m33711f(b)) {
            if (!typeCheckerContext.m33725c(a2.mo33515H0(), b.mo33515H0())) {
                return false;
            }
            if (a2.mo33514G0().isEmpty()) {
                return m33710e(a2) || m33710e(b) || a2.mo32838I0() == b.mo32838I0();
            }
        }
        return m33714i(typeCheckerContext, a2, b) && m33714i(typeCheckerContext, b, a2);
    }

    /* renamed from: e */
    public final boolean m33710e(@NotNull KotlinType kotlinType) {
        return FlexibleTypesKt.m33659c(kotlinType).mo32838I0() != FlexibleTypesKt.m33660d(kotlinType).mo32838I0();
    }

    /* renamed from: f */
    public final boolean m33711f(KotlinType kotlinType) {
        if (kotlinType.mo33515H0().mo32450c()) {
            UnwrappedType unwrappedType = (UnwrappedType) kotlinType;
            if (!(unwrappedType instanceof DynamicType) && !(unwrappedType instanceof DefinitelyNotNullType) && Intrinsics.m32174c(FlexibleTypesKt.m33659c(kotlinType).mo33515H0(), FlexibleTypesKt.m33660d(kotlinType).mo33515H0())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m33712g(@NotNull TypeCheckerContext typeCheckerContext, List<? extends TypeProjection> list, SimpleType simpleType) {
        boolean m33709d;
        if (list == simpleType.mo33514G0()) {
            return true;
        }
        List<TypeParameterDescriptor> parameters = simpleType.mo33515H0().getParameters();
        Intrinsics.m32175d(parameters, "superType.constructor.parameters");
        int size = parameters.size();
        for (int i2 = 0; i2 < size; i2++) {
            TypeProjection typeProjection = simpleType.mo33514G0().get(i2);
            if (!typeProjection.mo33672b()) {
                UnwrappedType mo33662J0 = typeProjection.getType().mo33662J0();
                TypeProjection typeProjection2 = list.get(i2);
                typeProjection2.mo33671a();
                Variance variance = Variance.INVARIANT;
                UnwrappedType mo33662J02 = typeProjection2.getType().mo33662J0();
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i2);
                Intrinsics.m32175d(typeParameterDescriptor, "parameters[index]");
                Variance mo32500m = typeParameterDescriptor.mo32500m();
                Intrinsics.m32175d(mo32500m, "parameters[index].variance");
                Variance mo33671a = typeProjection.mo33671a();
                Intrinsics.m32175d(mo33671a, "superProjection.projectionKind");
                if (mo32500m == variance) {
                    mo32500m = mo33671a;
                } else if (mo33671a != variance && mo32500m != mo33671a) {
                    mo32500m = null;
                }
                if (mo32500m == null) {
                    return typeCheckerContext.f66387d;
                }
                int i3 = typeCheckerContext.f66384a;
                if (i3 > 100) {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + mo33662J02).toString());
                }
                typeCheckerContext.f66384a = i3 + 1;
                int ordinal = mo32500m.ordinal();
                if (ordinal == 0) {
                    m33709d = f66379b.m33709d(typeCheckerContext, mo33662J02, mo33662J0);
                } else if (ordinal == 1) {
                    m33709d = f66379b.m33714i(typeCheckerContext, mo33662J0, mo33662J02);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m33709d = f66379b.m33714i(typeCheckerContext, mo33662J02, mo33662J0);
                }
                typeCheckerContext.f66384a--;
                if (!m33709d) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m33713h(@NotNull KotlinType subtype, @NotNull KotlinType supertype) {
        Intrinsics.m32180i(subtype, "subtype");
        Intrinsics.m32180i(supertype, "supertype");
        return m33714i(new TypeCheckerContext(true, false, 2), subtype.mo33662J0(), supertype.mo33662J0());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33714i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.UnwrappedType r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.UnwrappedType r29) {
        /*
            Method dump skipped, instructions count: 1459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.m33714i(kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType):boolean");
    }

    @NotNull
    /* renamed from: j */
    public final SimpleType m33715j(@NotNull SimpleType type) {
        KotlinType type2;
        Intrinsics.m32180i(type, "type");
        TypeConstructor mo33515H0 = type.mo33515H0();
        if (!(mo33515H0 instanceof CapturedTypeConstructor)) {
            if (mo33515H0 instanceof IntegerValueTypeConstructor) {
                Objects.requireNonNull((IntegerValueTypeConstructor) mo33515H0);
                CollectionsKt.m32032m(null, 10);
                throw null;
            }
            if (!(mo33515H0 instanceof IntersectionTypeConstructor) || !type.mo32838I0()) {
                return type;
            }
            Set<KotlinType> set = ((IntersectionTypeConstructor) mo33515H0).f66323a;
            Intrinsics.m32175d(set, "constructor.supertypes");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(set, 10));
            for (KotlinType it : set) {
                Intrinsics.m32175d(it, "it");
                arrayList.add(TypeUtilsKt.m33752g(it));
            }
            IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(arrayList);
            return KotlinTypeFactory.m33666d(type.getAnnotations(), intersectionTypeConstructor, EmptyList.f63144b, false, intersectionTypeConstructor.m33661d());
        }
        CapturedTypeConstructor capturedTypeConstructor = (CapturedTypeConstructor) mo33515H0;
        TypeProjection typeProjection = capturedTypeConstructor.f65917b;
        if (!(typeProjection.mo33671a() == Variance.IN_VARIANCE)) {
            typeProjection = null;
        }
        UnwrappedType mo33662J0 = (typeProjection == null || (type2 = typeProjection.getType()) == null) ? null : type2.mo33662J0();
        if (capturedTypeConstructor.f65916a == null) {
            TypeProjection typeProjection2 = capturedTypeConstructor.f65917b;
            Collection<KotlinType> mo32602a = capturedTypeConstructor.mo32602a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(mo32602a, 10));
            Iterator<T> it2 = mo32602a.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((KotlinType) it2.next()).mo33662J0());
            }
            capturedTypeConstructor.f65916a = new NewCapturedTypeConstructor(typeProjection2, arrayList2);
        }
        CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
        NewCapturedTypeConstructor newCapturedTypeConstructor = capturedTypeConstructor.f65916a;
        if (newCapturedTypeConstructor != null) {
            return new NewCapturedType(captureStatus, newCapturedTypeConstructor, mo33662J0, type.getAnnotations(), type.mo32838I0());
        }
        Intrinsics.m32188q();
        throw null;
    }

    @NotNull
    /* renamed from: k */
    public final UnwrappedType m33716k(@NotNull UnwrappedType type) {
        UnwrappedType m33663a;
        Intrinsics.m32180i(type, "type");
        if (type instanceof SimpleType) {
            m33663a = m33715j((SimpleType) type);
        } else {
            if (!(type instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            FlexibleType flexibleType = (FlexibleType) type;
            SimpleType m33715j = m33715j(flexibleType.f66316a);
            SimpleType m33715j2 = m33715j(flexibleType.f66317b);
            m33663a = (m33715j == flexibleType.f66316a && m33715j2 == flexibleType.f66317b) ? type : KotlinTypeFactory.m33663a(m33715j, m33715j2);
        }
        return TypeWithEnhancementKt.m33699b(m33663a, type);
    }
}
