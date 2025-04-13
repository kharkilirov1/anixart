package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Runnable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ContinuationRunnable(ran = ");
        m24u.append(get());
        m24u.append(')');
        return m24u.toString();
    }
}
