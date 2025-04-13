package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class Task implements Runnable {

    /* renamed from: b */
    @JvmField
    public long f68356b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public TaskContext f68357c;

    public Task(long j2, @NotNull TaskContext taskContext) {
        this.f68356b = j2;
        this.f68357c = taskContext;
    }

    public Task() {
        TaskContext taskContext = TasksKt.f68365f;
        this.f68356b = 0L;
        this.f68357c = taskContext;
    }
}
