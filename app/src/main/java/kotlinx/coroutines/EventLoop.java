package kotlinx.coroutines;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlinx.coroutines.internal.ArrayQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class EventLoop extends CoroutineDispatcher {

    /* renamed from: c */
    public long f66994c;

    /* renamed from: d */
    public boolean f66995d;

    /* renamed from: e */
    @Nullable
    public ArrayQueue<DispatchedTask<?>> f66996e;

    /* renamed from: Z */
    public final void m34041Z(@NotNull DispatchedTask<?> dispatchedTask) {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f66996e;
        if (arrayQueue == null) {
            arrayQueue = new ArrayQueue<>();
            this.f66996e = arrayQueue;
        }
        Object[] objArr = arrayQueue.f68232a;
        int i2 = arrayQueue.f68234c;
        objArr[i2] = dispatchedTask;
        int length = (objArr.length - 1) & (i2 + 1);
        arrayQueue.f68234c = length;
        int i3 = arrayQueue.f68233b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            ArraysKt.m31970t(objArr, objArr2, 0, i3, 0, 10, null);
            Object[] objArr3 = arrayQueue.f68232a;
            int length3 = objArr3.length;
            int i4 = arrayQueue.f68233b;
            ArraysKt.m31970t(objArr3, objArr2, length3 - i4, 0, i4, 4, null);
            arrayQueue.f68232a = objArr2;
            arrayQueue.f68233b = 0;
            arrayQueue.f68234c = length2;
        }
    }

    /* renamed from: b0 */
    public final void m34042b0(boolean z) {
        this.f66994c = m34046w(z) + this.f66994c;
        if (z) {
            return;
        }
        this.f66995d = true;
    }

    /* renamed from: d0 */
    public final boolean m34043d0() {
        return this.f66994c >= m34046w(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* renamed from: n0 */
    public final boolean m34044n0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f66996e;
        if (arrayQueue == null) {
            return false;
        }
        int i2 = arrayQueue.f68233b;
        DispatchedTask dispatchedTask = null;
        if (i2 != arrayQueue.f68234c) {
            ?? r3 = arrayQueue.f68232a;
            ?? r6 = r3[i2];
            r3[i2] = 0;
            arrayQueue.f68233b = (i2 + 1) & (r3.length - 1);
            Objects.requireNonNull(r6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            dispatchedTask = r6;
        }
        DispatchedTask dispatchedTask2 = dispatchedTask;
        if (dispatchedTask2 == null) {
            return false;
        }
        dispatchedTask2.run();
        return true;
    }

    public void shutdown() {
    }

    /* renamed from: v */
    public final void m34045v(boolean z) {
        long m34046w = this.f66994c - m34046w(z);
        this.f66994c = m34046w;
        if (m34046w <= 0 && this.f66995d) {
            shutdown();
        }
    }

    /* renamed from: w */
    public final long m34046w(boolean z) {
        return z ? 4294967296L : 1L;
    }
}
