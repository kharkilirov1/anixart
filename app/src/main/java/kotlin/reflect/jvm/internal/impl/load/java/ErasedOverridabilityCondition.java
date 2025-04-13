package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.FlatteningSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErasedOverridabilityCondition.kt */
/* loaded from: classes3.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public final /* synthetic */ class WhenMappings {
        static {
            new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length][0] = 1;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: a */
    public ExternalOverridabilityCondition.Contract mo32672a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: b */
    public ExternalOverridabilityCondition.Result mo32673b(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        boolean z;
        CallableDescriptor mo32503c;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.UNKNOWN;
        Intrinsics.m32180i(superDescriptor, "superDescriptor");
        Intrinsics.m32180i(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            Intrinsics.m32175d(javaMethodDescriptor.f64121e, "subDescriptor.typeParameters");
            if (!(!r1.isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo m33497h = OverridingUtil.m33497h(superDescriptor, subDescriptor);
                if ((m33497h != null ? m33497h.f65905a : null) != null) {
                    return result;
                }
                List<ValueParameterDescriptor> list = javaMethodDescriptor.f64122f;
                Intrinsics.m32175d(list, "subDescriptor.valueParameters");
                Sequence m33852t = SequencesKt.m33852t(CollectionsKt.m32028k(list), new Function1<ValueParameterDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$isOverridable$signatureTypes$1
                    @Override // kotlin.jvm.functions.Function1
                    public KotlinType invoke(ValueParameterDescriptor valueParameterDescriptor) {
                        ValueParameterDescriptor it = valueParameterDescriptor;
                        Intrinsics.m32175d(it, "it");
                        return it.getType();
                    }
                });
                KotlinType kotlinType = javaMethodDescriptor.f64123g;
                if (kotlinType == null) {
                    Intrinsics.m32188q();
                    throw null;
                }
                Sequence m33856x = SequencesKt.m33856x(m33852t, kotlinType);
                ReceiverParameterDescriptor receiverParameterDescriptor = javaMethodDescriptor.f64124h;
                FlatteningSequence$iterator$1 flatteningSequence$iterator$1 = new FlatteningSequence$iterator$1((FlatteningSequence) SequencesKt.m33855w(m33856x, CollectionsKt.m31995H(receiverParameterDescriptor != null ? receiverParameterDescriptor.getType() : null)));
                while (true) {
                    if (!flatteningSequence$iterator$1.m33825a()) {
                        z = false;
                        break;
                    }
                    KotlinType kotlinType2 = (KotlinType) flatteningSequence$iterator$1.next();
                    if ((kotlinType2.mo33514G0().isEmpty() ^ true) && !(kotlinType2.mo33662J0() instanceof RawTypeImpl)) {
                        z = true;
                        break;
                    }
                }
                if (z || (mo32503c = superDescriptor.mo32503c(new TypeSubstitutor(RawSubstitution.f64634d))) == null) {
                    return result;
                }
                if (mo32503c instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) mo32503c;
                    Intrinsics.m32175d(simpleFunctionDescriptor.getTypeParameters(), "erasedSuper.typeParameters");
                    if ((!r1.isEmpty()) && (mo32503c = simpleFunctionDescriptor.mo32524s().mo32537j(EmptyList.f63144b).mo32527A()) == null) {
                        Intrinsics.m32188q();
                        throw null;
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.f65893c.m33508m(mo32503c, subDescriptor, false).f65905a;
                Intrinsics.m32175d(result2, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                return result2.ordinal() != 0 ? result : ExternalOverridabilityCondition.Result.OVERRIDABLE;
            }
        }
        return result;
    }
}
