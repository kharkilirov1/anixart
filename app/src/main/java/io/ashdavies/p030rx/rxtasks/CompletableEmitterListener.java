package io.ashdavies.p030rx.rxtasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.CompletableEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletableEmitterListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lio/ashdavies/rx/rxtasks/CompletableEmitterListener;", "Lcom/google/android/gms/tasks/OnCompleteListener;", "Ljava/lang/Void;", "rx-tasks_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CompletableEmitterListener implements OnCompleteListener<Void> {

    /* renamed from: a */
    public final CompletableEmitter f58051a;

    public CompletableEmitterListener(@NotNull CompletableEmitter completableEmitter) {
        this.f58051a = completableEmitter;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NotNull Task<Void> task) {
        Intrinsics.m32180i(task, "task");
        try {
            TaskKt.m30798b(task);
            this.f58051a.onComplete();
        } catch (Exception e2) {
            this.f58051a.onError(e2);
        }
    }
}
