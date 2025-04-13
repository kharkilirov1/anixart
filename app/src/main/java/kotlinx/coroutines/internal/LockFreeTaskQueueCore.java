package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "Companion", "Placeholder", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LockFreeTaskQueueCore<E> {

    @NotNull
    private volatile /* synthetic */ Object _next = null;

    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f68287a;

    /* renamed from: b */
    public final boolean f68288b;

    /* renamed from: c */
    public final int f68289c;

    /* renamed from: d */
    @NotNull
    public /* synthetic */ AtomicReferenceArray f68290d;

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final Symbol f68286g = new Symbol("REMOVE_FROZEN");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68284e = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f68285f = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u0018"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Placeholder {

        /* renamed from: a */
        @JvmField
        public final int f68291a;

        public Placeholder(int i2) {
            this.f68291a = i2;
        }
    }

    public LockFreeTaskQueueCore(int i2, boolean z) {
        this.f68287a = i2;
        this.f68288b = z;
        int i3 = i2 - 1;
        this.f68289c = i3;
        this.f68290d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m34309a(@org.jetbrains.annotations.NotNull E r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.f68289c
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.f68288b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f68290d
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.f68287a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f68285f
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f68290d
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L7f
            goto La2
        L7f:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.m34313e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f68290d
            int r2 = r0.f68289c
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r2 == 0) goto L9f
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) r1
            int r1 = r1.f68291a
            if (r1 != r12) goto L9f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f68290d
            int r2 = r0.f68289c
            r2 = r2 & r12
            r1.set(r2, r7)
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 != 0) goto L73
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.m34309a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final boolean m34310b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f68285f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int m34311c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    /* renamed from: d */
    public final boolean m34312d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: e */
    public final LockFreeTaskQueueCore<E> m34313e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (f68285f.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._next;
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68284e;
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(this.f68287a * 2, this.f68288b);
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f68289c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.f68290d.get(i5);
                if (obj == null) {
                    obj = new Placeholder(i2);
                }
                lockFreeTaskQueueCore2.f68290d.set(lockFreeTaskQueueCore2.f68289c & i2, obj);
                i2++;
            }
            lockFreeTaskQueueCore2._state = (-1152921504606846977L) & j2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeTaskQueueCore2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    @Nullable
    /* renamed from: f */
    public final Object m34314f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f68286g;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.f68289c;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f68290d.get(i5);
            if (obj == null) {
                if (this.f68288b) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                long j3 = ((i2 + 1) & 1073741823) << 0;
                if (f68285f.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    this.f68290d.set(this.f68289c & i2, null);
                    return obj;
                }
                if (this.f68288b) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
                    while (true) {
                        long j4 = lockFreeTaskQueueCore._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            lockFreeTaskQueueCore = lockFreeTaskQueueCore.m34313e();
                        } else {
                            if (f68285f.compareAndSet(lockFreeTaskQueueCore, j4, (j4 & (-1073741824)) | j3)) {
                                lockFreeTaskQueueCore.f68290d.set(lockFreeTaskQueueCore.f68289c & i6, null);
                                lockFreeTaskQueueCore = null;
                            } else {
                                continue;
                            }
                        }
                        if (lockFreeTaskQueueCore == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
