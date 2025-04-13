package io.ashdavies.p030rx.rxtasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.SingleEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleEmitterListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lio/ashdavies/rx/rxtasks/SingleEmitterListener;", "", "T", "Lcom/google/android/gms/tasks/OnCompleteListener;", "rx-tasks_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SingleEmitterListener<T> implements OnCompleteListener<T> {

    /* renamed from: a */
    public final SingleEmitter<T> f58052a;

    public SingleEmitterListener(@NotNull SingleEmitter<T> singleEmitter) {
        this.f58052a = singleEmitter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NotNull Task<T> task) {
        Intrinsics.m32180i(task, "task");
        try {
            this.f58052a.onSuccess(TaskKt.m30797a(task));
        } catch (Exception e2) {
            this.f58052a.onError(e2);
        }
    }
}
