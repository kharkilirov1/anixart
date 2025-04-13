package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* renamed from: a */
    public final KotlinType f66011a;

    /* renamed from: b */
    public final ReceiverValue f66012b;

    public AbstractReceiverValue(@NotNull KotlinType kotlinType, @Nullable ReceiverValue receiverValue) {
        this.f66011a = kotlinType;
        this.f66012b = receiverValue == null ? this : receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public KotlinType getType() {
        return this.f66011a;
    }
}
