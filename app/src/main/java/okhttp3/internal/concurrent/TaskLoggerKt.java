package okhttp3.internal.concurrent;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.yandex.div2.C3033a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: TaskLogger.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m31884d2 = {"formatDuration", "", "ns", "", "log", "", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", ThrowableDeserializer.PROP_NAME_MESSAGE, "logElapsed", "T", "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", "okhttp"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        return C3033a.m17745g(new Object[]{str}, 1, "%6s", "java.lang.String.format(format, *args)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName());
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.m32178g(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<? extends T> block) {
        long j2;
        Intrinsics.m32179h(task, "task");
        Intrinsics.m32179h(queue, "queue");
        Intrinsics.m32179h(block, "block");
        boolean isLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j2 = queue.getTaskRunner().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            j2 = -1;
        }
        try {
            T invoke = block.invoke();
            if (isLoggable) {
                long nanoTime = queue.getTaskRunner().getBackend().nanoTime() - j2;
                StringBuilder m24u = C0000a.m24u("finished run in ");
                m24u.append(formatDuration(nanoTime));
                log(task, queue, m24u.toString());
            }
            return invoke;
        } catch (Throwable th) {
            if (isLoggable) {
                long nanoTime2 = queue.getTaskRunner().getBackend().nanoTime() - j2;
                StringBuilder m24u2 = C0000a.m24u("failed a run in ");
                m24u2.append(formatDuration(nanoTime2));
                log(task, queue, m24u2.toString());
            }
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<String> messageBlock) {
        Intrinsics.m32179h(task, "task");
        Intrinsics.m32179h(queue, "queue");
        Intrinsics.m32179h(messageBlock, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
