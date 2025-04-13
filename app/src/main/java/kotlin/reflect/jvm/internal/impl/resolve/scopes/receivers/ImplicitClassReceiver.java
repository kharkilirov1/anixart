package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes3.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a */
    @NotNull
    public final ClassDescriptor f66014a;

    /* renamed from: b */
    @NotNull
    public final ClassDescriptor f66015b;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.m32180i(classDescriptor, "classDescriptor");
        this.f66015b = classDescriptor;
        this.f66014a = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.f66015b;
        if (!(obj instanceof ImplicitClassReceiver)) {
            obj = null;
        }
        ImplicitClassReceiver implicitClassReceiver = (ImplicitClassReceiver) obj;
        return Intrinsics.m32174c(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f66015b : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        SimpleType mo32502r = this.f66015b.mo32502r();
        Intrinsics.m32175d(mo32502r, "classDescriptor.defaultType");
        return mo32502r;
    }

    public int hashCode() {
        return this.f66015b.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    /* renamed from: q */
    public final ClassDescriptor mo33553q() {
        return this.f66015b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Class{");
        SimpleType mo32502r = this.f66015b.mo32502r();
        Intrinsics.m32175d(mo32502r, "classDescriptor.defaultType");
        m24u.append(mo32502r);
        m24u.append('}');
        return m24u.toString();
    }
}
