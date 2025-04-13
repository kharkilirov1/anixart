package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BuiltinOverridabilityCondition.kt */
/* loaded from: classes3.dex */
public final class BuiltinOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: a */
    public ExternalOverridabilityCondition.Contract mo32672a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: b */
    public ExternalOverridabilityCondition.Result mo32673b(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.m32180i(superDescriptor, "superDescriptor");
        Intrinsics.m32180i(subDescriptor, "subDescriptor");
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
