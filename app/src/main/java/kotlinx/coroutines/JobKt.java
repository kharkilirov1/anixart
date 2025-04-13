package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, m31885k = 4, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class JobKt {
    /* renamed from: a */
    public static CompletableJob m34069a(Job job, int i2, Object obj) {
        return new JobImpl(null);
    }

    /* renamed from: b */
    public static final void m34070b(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        int i2 = Job.f67018J1;
        Job job = (Job) coroutineContext.get(Job.Key.f67019b);
        if (job == null) {
            return;
        }
        job.mo34061b(cancellationException);
    }

    /* renamed from: d */
    public static final void m34072d(@NotNull CoroutineContext coroutineContext) {
        int i2 = Job.f67018J1;
        Job job = (Job) coroutineContext.get(Job.Key.f67019b);
        if (job != null && !job.mo33950a()) {
            throw job.mo34064o();
        }
    }

    @NotNull
    /* renamed from: e */
    public static final Job m34073e(@NotNull CoroutineContext coroutineContext) {
        int i2 = Job.f67018J1;
        Job job = (Job) coroutineContext.get(Job.Key.f67019b);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(Intrinsics.m32187p("Current context doesn't contain Job in it: ", coroutineContext).toString());
    }
}
