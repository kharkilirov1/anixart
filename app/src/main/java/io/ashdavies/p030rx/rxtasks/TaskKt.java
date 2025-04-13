package io.ashdavies.p030rx.rxtasks;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Task.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"rx-tasks_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TaskKt {
    @NotNull
    /* renamed from: a */
    public static final <T> T m30797a(@NotNull Task<T> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        T t = (T) m30798b(receiver$0);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Task " + receiver$0 + " returned empty result");
    }

    @Nullable
    /* renamed from: b */
    public static final <T> T m30798b(@NotNull Task<T> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (!receiver$0.mo9711p()) {
            throw new IllegalStateException("Task " + receiver$0 + " not complete");
        }
        if (!receiver$0.mo9710o()) {
            Exception mo9707l = receiver$0.mo9707l();
            if (mo9707l == null) {
                return receiver$0.mo9708m();
            }
            throw mo9707l;
        }
        throw new CancellationException("Task " + receiver$0 + " was cancelled normally");
    }
}
