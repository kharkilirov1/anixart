package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeUtils.kt */
/* loaded from: classes3.dex */
public final class TypeUtilsKt {
    @NotNull
    /* renamed from: a */
    public static final TypeProjection m33746a(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return new TypeProjectionImpl(Variance.INVARIANT, receiver$0);
    }

    @NotNull
    /* renamed from: b */
    public static final TypeProjection m33747b(@NotNull KotlinType type, @NotNull Variance projectionKind, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.m32180i(type, "type");
        Intrinsics.m32180i(projectionKind, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.mo32500m() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(projectionKind, type);
    }

    @NotNull
    /* renamed from: c */
    public static final KotlinBuiltIns m33748c(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        KotlinBuiltIns mo32603n = receiver$0.mo33515H0().mo32603n();
        Intrinsics.m32175d(mo32603n, "constructor.builtIns");
        return mo32603n;
    }

    /* renamed from: d */
    public static final boolean m33749d(@NotNull KotlinType receiver$0, @NotNull KotlinType kotlinType) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return NewKotlinTypeChecker.f66379b.m33713h(receiver$0, kotlinType);
    }

    /* renamed from: e */
    public static final boolean m33750e(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return TypeUtils.m33695e(receiver$0);
    }

    @NotNull
    /* renamed from: f */
    public static final KotlinType m33751f(@NotNull KotlinType kotlinType) {
        SimpleType simpleType = TypeUtils.f66355a;
        UnwrappedType mo32787K0 = kotlinType.mo33662J0().mo32787K0(false);
        Intrinsics.m32175d(mo32787K0, "TypeUtils.makeNotNullable(this)");
        return mo32787K0;
    }

    @NotNull
    /* renamed from: g */
    public static final KotlinType m33752g(@NotNull KotlinType kotlinType) {
        SimpleType simpleType = TypeUtils.f66355a;
        UnwrappedType mo32787K0 = kotlinType.mo33662J0().mo32787K0(true);
        Intrinsics.m32175d(mo32787K0, "TypeUtils.makeNullable(this)");
        return mo32787K0;
    }

    @NotNull
    /* renamed from: h */
    public static final KotlinType m33753h(@NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.mo33662J0().mo32788L0(annotations);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    @NotNull
    /* renamed from: i */
    public static final KotlinType m33754i(@NotNull KotlinType receiver$0) {
        SimpleType simpleType;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (mo33662J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) mo33662J0;
            SimpleType simpleType2 = flexibleType.f66316a;
            if (!simpleType2.mo33515H0().getParameters().isEmpty() && simpleType2.mo33515H0().mo32449b() != null) {
                List<TypeParameterDescriptor> parameters = simpleType2.mo33515H0().getParameters();
                Intrinsics.m32175d(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleType2 = TypeSubstitutionKt.m33681d(simpleType2, arrayList, null, 2);
            }
            SimpleType simpleType3 = flexibleType.f66317b;
            if (!simpleType3.mo33515H0().getParameters().isEmpty() && simpleType3.mo33515H0().mo32449b() != null) {
                List<TypeParameterDescriptor> parameters2 = simpleType3.mo33515H0().getParameters();
                Intrinsics.m32175d(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleType3 = TypeSubstitutionKt.m33681d(simpleType3, arrayList2, null, 2);
            }
            simpleType = KotlinTypeFactory.m33663a(simpleType2, simpleType3);
        } else {
            if (!(mo33662J0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType4 = (SimpleType) mo33662J0;
            boolean isEmpty = simpleType4.mo33515H0().getParameters().isEmpty();
            simpleType = simpleType4;
            if (!isEmpty) {
                ClassifierDescriptor mo32449b = simpleType4.mo33515H0().mo32449b();
                simpleType = simpleType4;
                if (mo32449b != null) {
                    List<TypeParameterDescriptor> parameters3 = simpleType4.mo33515H0().getParameters();
                    Intrinsics.m32175d(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                    }
                    simpleType = TypeSubstitutionKt.m33681d(simpleType4, arrayList3, null, 2);
                }
            }
        }
        return TypeWithEnhancementKt.m33699b(simpleType, mo33662J0);
    }
}
