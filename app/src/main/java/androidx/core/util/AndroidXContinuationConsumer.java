package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: AndroidXConsumer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/core/util/AndroidXContinuationConsumer;", "T", "Landroidx/core/util/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ContinuationConsumer(resultAccepted = ");
        m24u.append(get());
        m24u.append(')');
        return m24u.toString();
    }
}
