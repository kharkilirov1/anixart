package kotlin.reflect.jvm.internal.components;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RuntimeErrorReporter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    /* renamed from: b */
    public static final RuntimeErrorReporter f63701b = new RuntimeErrorReporter();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* renamed from: a */
    public void mo32356a(@NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.m32180i(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* renamed from: b */
    public void mo32357b(@NotNull ClassDescriptor descriptor, @NotNull List<String> list) {
        Intrinsics.m32180i(descriptor, "descriptor");
        StringBuilder m24u = C0000a.m24u("Incomplete hierarchy for class ");
        m24u.append(((AbstractClassDescriptor) descriptor).f64063a);
        m24u.append(", unresolved classes ");
        m24u.append(list);
        throw new IllegalStateException(m24u.toString());
    }
}
