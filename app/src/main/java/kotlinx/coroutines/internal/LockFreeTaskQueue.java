package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class LockFreeTaskQueue<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68283a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");

    @NotNull
    private volatile /* synthetic */ Object _cur;

    public LockFreeTaskQueue(boolean z) {
        this._cur = new LockFreeTaskQueueCore(8, z);
    }

    /* renamed from: a */
    public final boolean m34305a(@NotNull E e2) {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            int m34309a = lockFreeTaskQueueCore.m34309a(e2);
            if (m34309a == 0) {
                return true;
            }
            if (m34309a == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68283a;
                LockFreeTaskQueueCore<E> m34313e = lockFreeTaskQueueCore.m34313e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, m34313e) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (m34309a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m34306b() {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            if (lockFreeTaskQueueCore.m34310b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68283a;
            LockFreeTaskQueueCore<E> m34313e = lockFreeTaskQueueCore.m34313e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, m34313e) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }

    /* renamed from: c */
    public final int m34307c() {
        return ((LockFreeTaskQueueCore) this._cur).m34311c();
    }

    @Nullable
    /* renamed from: d */
    public final E m34308d() {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            E e2 = (E) lockFreeTaskQueueCore.m34314f();
            if (e2 != LockFreeTaskQueueCore.f68286g) {
                return e2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68283a;
            LockFreeTaskQueueCore<E> m34313e = lockFreeTaskQueueCore.m34313e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, m34313e) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
