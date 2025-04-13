package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TaskExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/DefaultTaskExecutor;", "Lcom/yandex/div/histogram/TaskExecutor;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DefaultTaskExecutor implements TaskExecutor {

    /* renamed from: a */
    @NotNull
    public final Handler f33649a = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    /* renamed from: a */
    public void mo17276a(@NotNull Function0<Unit> function0) {
        if (Intrinsics.m32174c(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            this.f33649a.post(new RunnableC2899a(function0, 0));
        }
    }
}
