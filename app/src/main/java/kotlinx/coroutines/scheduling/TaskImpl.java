package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.DebugStringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Tasks.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class TaskImpl extends Task {

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Runnable f68359d;

    public TaskImpl(@NotNull Runnable runnable, long j2, @NotNull TaskContext taskContext) {
        super(j2, taskContext);
        this.f68359d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f68359d.run();
        } finally {
            this.f68357c.mo34376h();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Task[");
        m24u.append(DebugStringsKt.m34022a(this.f68359d));
        m24u.append('@');
        m24u.append(DebugStringsKt.m34023b(this.f68359d));
        m24u.append(", ");
        m24u.append(this.f68356b);
        m24u.append(", ");
        m24u.append(this.f68357c);
        m24u.append(']');
        return m24u.toString();
    }
}
