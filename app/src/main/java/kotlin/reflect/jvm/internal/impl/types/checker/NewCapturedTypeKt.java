package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class NewCapturedTypeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    @Nullable
    /* renamed from: a */
    public static SimpleType m33706a(SimpleType simpleType, CaptureStatus captureStatus, Function2 function2, int i2) {
        Function2<Object, Object, Unit> acceptNewCapturedType = (i2 & 4) != 0 ? FunctionsKt.f66483b : null;
        Intrinsics.m32180i(acceptNewCapturedType, "acceptNewCapturedType");
        if (simpleType.mo33514G0().size() != simpleType.mo33515H0().getParameters().size()) {
            return null;
        }
        List<TypeProjection> mo33514G0 = simpleType.mo33514G0();
        boolean z = true;
        if (!(mo33514G0 instanceof Collection) || !mo33514G0.isEmpty()) {
            Iterator it = mo33514G0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((TypeProjection) it.next()).mo33671a() == Variance.INVARIANT)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo33514G0, 10));
        for (TypeProjection typeProjection : mo33514G0) {
            Variance mo33671a = typeProjection.mo33671a();
            Variance variance = Variance.INVARIANT;
            if (mo33671a != variance) {
                typeProjection = new TypeProjectionImpl(variance, new NewCapturedType(captureStatus, new NewCapturedTypeConstructor(typeProjection, null, 2), (typeProjection.mo33672b() || typeProjection.mo33671a() != Variance.IN_VARIANCE) ? null : typeProjection.getType().mo33662J0(), Annotations.Companion.f64024a, false));
            }
            arrayList.add(typeProjection);
        }
        TypeSubstitutor typeSubstitutor = new TypeSubstitutor(TypeConstructorSubstitution.f66342b.m33677b(simpleType.mo33515H0(), arrayList));
        int size = mo33514G0.size();
        for (int i3 = 0; i3 < size; i3++) {
            TypeProjection typeProjection2 = mo33514G0.get(i3);
            TypeProjection typeProjection3 = (TypeProjection) arrayList.get(i3);
            if (typeProjection2.mo33671a() != Variance.INVARIANT) {
                TypeParameterDescriptor typeParameterDescriptor = simpleType.mo33515H0().getParameters().get(i3);
                Intrinsics.m32175d(typeParameterDescriptor, "type.constructor.parameters[index]");
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.m32175d(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(upperBounds, 10));
                Iterator it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(NewKotlinTypeChecker.f66379b.m33716k(typeSubstitutor.m33688f((KotlinType) it2.next(), Variance.INVARIANT).mo33662J0()));
                }
                ArrayList arrayList3 = arrayList2;
                if (!typeProjection2.mo33672b()) {
                    arrayList3 = arrayList2;
                    if (typeProjection2.mo33671a() == Variance.OUT_VARIANCE) {
                        arrayList3 = CollectionsKt.m32003P(arrayList2, NewKotlinTypeChecker.f66379b.m33716k(typeProjection2.getType().mo33662J0()));
                    }
                }
                KotlinType type = typeProjection3.getType();
                if (type == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
                NewCapturedTypeConstructor newCapturedTypeConstructor = ((NewCapturedType) type).f66373b;
                Objects.requireNonNull(newCapturedTypeConstructor);
                newCapturedTypeConstructor.f66378b = arrayList3;
            }
        }
        return KotlinTypeFactory.m33665c(simpleType.getAnnotations(), simpleType.mo33515H0(), arrayList, simpleType.mo32838I0());
    }
}
