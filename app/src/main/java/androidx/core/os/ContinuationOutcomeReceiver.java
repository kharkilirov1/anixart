package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: OutcomeReceiver.kt */
@RequiresApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull E error) {
        Intrinsics.m32179h(error, "error");
        if (compareAndSet(false, true)) {
            ResultKt.m31891a(error);
            throw null;
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ContinuationOutcomeReceiver(outcomeReceived = ");
        m24u.append(get());
        m24u.append(')');
        return m24u.toString();
    }
}
