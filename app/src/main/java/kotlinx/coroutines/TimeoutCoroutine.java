package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;

/* compiled from: Timeout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/TimeoutCoroutine;", "U", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {

    /* renamed from: e */
    @JvmField
    public final long f67060e;

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    @NotNull
    /* renamed from: h0 */
    public String mo33952h0() {
        return super.mo33952h0() + "(timeMillis=" + this.f67060e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m34077J(new TimeoutCancellationException("Timed out waiting for " + this.f67060e + " ms", this));
    }
}
