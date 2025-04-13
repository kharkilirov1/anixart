package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeserializedClassDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1 */
/* loaded from: classes3.dex */
public final class C6730xf150c8cf extends NonReportingOverrideStrategy {

    /* renamed from: a */
    public final /* synthetic */ Collection f66183a;

    public C6730xf150c8cf(Collection collection) {
        this.f66183a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    /* renamed from: a */
    public void mo32620a(@NotNull CallableMemberDescriptor fakeOverride) {
        Intrinsics.m32180i(fakeOverride, "fakeOverride");
        OverridingUtil.m33503q(fakeOverride, null);
        this.f66183a.add(fakeOverride);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    /* renamed from: e */
    public void mo32621e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
    }
}
