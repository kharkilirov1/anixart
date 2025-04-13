package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class ExtensionReceiver extends AbstractReceiverValue implements ImplicitReceiver {

    /* renamed from: c */
    public final CallableDescriptor f66013c;

    public ExtensionReceiver(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @Nullable ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        this.f66013c = callableDescriptor;
    }

    public String toString() {
        return this.f66011a + ": Ext {" + this.f66013c + "}";
    }
}
