package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes3.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    /* renamed from: b */
    public void mo33489b(@NotNull CallableMemberDescriptor first, @NotNull CallableMemberDescriptor second) {
        Intrinsics.m32180i(first, "first");
        Intrinsics.m32180i(second, "second");
        mo32621e(first, second);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    /* renamed from: c */
    public void mo33490c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor fromCurrent) {
        Intrinsics.m32180i(fromCurrent, "fromCurrent");
        mo32621e(callableMemberDescriptor, fromCurrent);
    }

    /* renamed from: e */
    public abstract void mo32621e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);
}
