package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InlineClassAwareCallerKt {
    @NotNull
    /* renamed from: a */
    public static final <M extends Member> Caller<M> m32338a(@NotNull CallerImpl<? extends M> receiver$0, @NotNull CallableMemberDescriptor descriptor, boolean z) {
        boolean z2;
        KotlinType returnType;
        ReceiverParameterDescriptor mo32492k0;
        KotlinType type;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(descriptor, "descriptor");
        List<ValueParameterDescriptor> mo32489f = descriptor.mo32489f();
        Intrinsics.m32175d(mo32489f, "descriptor.valueParameters");
        boolean z3 = false;
        if (!mo32489f.isEmpty()) {
            for (ValueParameterDescriptor it : mo32489f) {
                Intrinsics.m32175d(it, "it");
                KotlinType type2 = it.getType();
                Intrinsics.m32175d(type2, "it.type");
                if (InlineClassesUtilsKt.m33486a(type2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2 || (((returnType = descriptor.getReturnType()) != null && InlineClassesUtilsKt.m33486a(returnType)) || (!(receiver$0 instanceof BoundCaller) && (mo32492k0 = descriptor.mo32492k0()) != null && (type = mo32492k0.getType()) != null && InlineClassesUtilsKt.m33486a(type)))) {
            z3 = true;
        }
        return z3 ? new InlineClassAwareCaller(descriptor, receiver$0, z) : receiver$0;
    }
}
