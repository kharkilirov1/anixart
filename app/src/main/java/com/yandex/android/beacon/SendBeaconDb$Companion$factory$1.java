package com.yandex.android.beacon;

import com.yandex.android.beacon.SendBeaconDb;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendBeaconDb.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class SendBeaconDb$Companion$factory$1 implements SendBeaconDb.Factory, FunctionAdapter {

    /* renamed from: a */
    public static final SendBeaconDb$Companion$factory$1 f30813a = new SendBeaconDb$Companion$factory$1();

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof SendBeaconDb.Factory) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m32174c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(2, SendBeaconDb.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
