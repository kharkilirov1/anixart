package androidx.window.core;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecificationComputer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AndroidLogger implements Logger {

    /* renamed from: a */
    @NotNull
    public static final AndroidLogger f6679a = new AndroidLogger();

    @Override // androidx.window.core.Logger
    /* renamed from: a */
    public void mo4414a(@NotNull String tag, @NotNull String message) {
        Intrinsics.m32179h(tag, "tag");
        Intrinsics.m32179h(message, "message");
        Log.d(tag, message);
    }
}
