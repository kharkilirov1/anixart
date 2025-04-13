package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: storage.kt */
/* loaded from: classes3.dex */
public final class StorageKt {
    @NotNull
    /* renamed from: a */
    public static final Object m33635a(@NotNull NotNullLazyValue receiver$0, @NotNull KProperty p) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(p, "p");
        return receiver$0.invoke();
    }
}
