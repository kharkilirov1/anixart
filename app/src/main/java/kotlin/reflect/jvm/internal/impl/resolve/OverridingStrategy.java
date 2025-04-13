package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes3.dex */
public abstract class OverridingStrategy {
    /* renamed from: a */
    public abstract void mo32620a(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: b */
    public abstract void mo33489b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* renamed from: c */
    public abstract void mo33490c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* renamed from: d */
    public void mo32698d(@NotNull CallableMemberDescriptor member, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
        Intrinsics.m32180i(member, "member");
        member.mo32494t0(collection);
    }
}
