package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class TransientReceiver extends AbstractReceiverValue {
    public TransientReceiver(@NotNull KotlinType kotlinType) {
        super(kotlinType, null);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("{Transient} : ");
        m24u.append(this.f66011a);
        return m24u.toString();
    }
}
