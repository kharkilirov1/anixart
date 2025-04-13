package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface Job extends CoroutineContext.Element {

    /* renamed from: J1 */
    public static final /* synthetic */ int f67018J1 = 0;

    /* compiled from: Job.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
        /* renamed from: b */
        public static /* synthetic */ DisposableHandle m34066b(Job job, boolean z, boolean z2, Function1 function1, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return job.mo34063n(z, z2, function1);
        }
    }

    /* compiled from: Job.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Key implements CoroutineContext.Key<Job> {

        /* renamed from: b */
        public static final /* synthetic */ Key f67019b = new Key();
    }

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: X */
    ChildHandle mo34060X(@NotNull ChildJob childJob);

    /* renamed from: a */
    boolean mo33950a();

    /* renamed from: b */
    void mo34061b(@Nullable CancellationException cancellationException);

    boolean isCancelled();

    @Nullable
    /* renamed from: k */
    Object mo34062k(@NotNull Continuation<? super Unit> continuation);

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: n */
    DisposableHandle mo34063n(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1);

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: o */
    CancellationException mo34064o();

    boolean start();
}
