package kotlinx.coroutines.sync;

import androidx.room.util.C0576a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Mutex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class MutexImpl implements Mutex, SelectClause2<Object, Mutex> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68400b = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");

    @NotNull
    public volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class LockCont extends LockWaiter {

        /* renamed from: g */
        @NotNull
        public final CancellableContinuation<Unit> f68401g;

        /* renamed from: h */
        public final /* synthetic */ MutexImpl f68402h;

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        /* renamed from: R */
        public void mo34399R() {
            this.f68401g.mo33964G(CancellableContinuationImplKt.f66946a);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        /* renamed from: T */
        public boolean mo34400T() {
            if (!m34401S()) {
                return false;
            }
            CancellableContinuation<Unit> cancellableContinuation = this.f68401g;
            Unit unit = Unit.f63088a;
            final MutexImpl mutexImpl = this.f68402h;
            return cancellableContinuation.mo33968w(unit, null, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    MutexImpl.this.mo34398a(this.f68411e);
                    return Unit.f63088a;
                }
            }) != null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("LockCont[");
            m24u.append(this.f68411e);
            m24u.append(", ");
            m24u.append(this.f68401g);
            m24u.append("] for ");
            m24u.append(this.f68402h);
            return m24u.toString();
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class LockSelect<R> extends LockWaiter {

        /* renamed from: g */
        @JvmField
        @NotNull
        public final SelectInstance<R> f68405g;

        /* renamed from: h */
        @JvmField
        @NotNull
        public final Function2<Mutex, Continuation<? super R>, Object> f68406h;

        /* renamed from: i */
        public final /* synthetic */ MutexImpl f68407i;

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        /* renamed from: R */
        public void mo34399R() {
            Function2<Mutex, Continuation<? super R>, Object> function2 = this.f68406h;
            MutexImpl mutexImpl = this.f68407i;
            Continuation<R> mo34395p = this.f68405g.mo34395p();
            final MutexImpl mutexImpl2 = this.f68407i;
            CancellableKt.m34350d(function2, mutexImpl, mo34395p, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    MutexImpl.this.mo34398a(this.f68411e);
                    return Unit.f63088a;
                }
            });
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        /* renamed from: T */
        public boolean mo34400T() {
            return m34401S() && this.f68405g.mo34393e();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("LockSelect[");
            m24u.append(this.f68411e);
            m24u.append(", ");
            m24u.append(this.f68405g);
            m24u.append("] for ");
            m24u.append(this.f68407i);
            return m24u.toString();
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public abstract class LockWaiter extends LockFreeLinkedListNode implements DisposableHandle {

        /* renamed from: f */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f68410f = AtomicIntegerFieldUpdater.newUpdater(LockWaiter.class, "isTaken");

        /* renamed from: e */
        @JvmField
        @Nullable
        public final Object f68411e;

        @NotNull
        private volatile /* synthetic */ int isTaken;

        /* renamed from: R */
        public abstract void mo34399R();

        /* renamed from: S */
        public final boolean m34401S() {
            return f68410f.compareAndSet(this, 0, 1);
        }

        /* renamed from: T */
        public abstract boolean mo34400T();

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: f */
        public final void mo34038f() {
            mo34192O();
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class LockedQueue extends LockFreeLinkedListHead {

        /* renamed from: e */
        @JvmField
        @NotNull
        public Object f68412e;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return C0576a.m4117p(C0000a.m24u("LockedQueue["), this.f68412e, ']');
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "PrepareOp", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class TryLockDesc extends AtomicDesc {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final MutexImpl f68413b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Object f68414c;

        /* compiled from: Mutex.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
        public final class PrepareOp extends OpDescriptor {

            /* renamed from: a */
            @NotNull
            public final AtomicOp<?> f68415a;

            public PrepareOp(@NotNull TryLockDesc tryLockDesc, AtomicOp<?> atomicOp) {
                this.f68415a = atomicOp;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @NotNull
            /* renamed from: a */
            public AtomicOp<?> mo34262a() {
                return this.f68415a;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @Nullable
            /* renamed from: c */
            public Object mo34263c(@Nullable Object obj) {
                Object obj2 = this.f68415a.m34268h() ? MutexKt.f68424f : this.f68415a;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                MutexImpl mutexImpl = (MutexImpl) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f68400b;
                while (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl, this, obj2) && atomicReferenceFieldUpdater.get(mutexImpl) == this) {
                }
                return null;
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        /* renamed from: a */
        public void mo34260a(@NotNull AtomicOp<?> atomicOp, @Nullable Object obj) {
            Empty empty;
            if (obj != null) {
                empty = MutexKt.f68424f;
            } else {
                Object obj2 = this.f68414c;
                empty = obj2 == null ? MutexKt.f68423e : new Empty(obj2);
            }
            MutexImpl mutexImpl = this.f68413b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f68400b;
            while (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl, atomicOp, empty) && atomicReferenceFieldUpdater.get(mutexImpl) == atomicOp) {
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        @Nullable
        /* renamed from: b */
        public Object mo34261b(@NotNull AtomicOp<?> atomicOp) {
            boolean z;
            PrepareOp prepareOp = new PrepareOp(this, atomicOp);
            MutexImpl mutexImpl = this.f68413b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f68400b;
            Empty empty = MutexKt.f68424f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(mutexImpl, empty, prepareOp)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(mutexImpl) != empty) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return MutexKt.f68419a;
            }
            prepareOp.mo34263c(this.f68413b);
            return null;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class UnlockOp extends AtomicOp<MutexImpl> {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final LockedQueue f68416b;

        public UnlockOp(@NotNull LockedQueue lockedQueue) {
            this.f68416b = lockedQueue;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: d */
        public void mo34264d(MutexImpl mutexImpl, Object obj) {
            MutexImpl mutexImpl2 = mutexImpl;
            Object obj2 = obj == null ? MutexKt.f68424f : this.f68416b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f68400b;
            while (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl2, this, obj2) && atomicReferenceFieldUpdater.get(mutexImpl2) == this) {
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: i */
        public Object mo34105i(MutexImpl mutexImpl) {
            LockedQueue lockedQueue = this.f68416b;
            if (lockedQueue.m34290I() == lockedQueue) {
                return null;
            }
            return MutexKt.f68420b;
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: a */
    public void mo34398a(@Nullable Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof Empty) {
                if (obj == null) {
                    if (!(((Empty) obj2).f68399a != MutexKt.f68422d)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    Empty empty = (Empty) obj2;
                    if (!(empty.f68399a == obj)) {
                        StringBuilder m24u = C0000a.m24u("Mutex is locked by ");
                        m24u.append(empty.f68399a);
                        m24u.append(" but expected ");
                        m24u.append(obj);
                        throw new IllegalStateException(m24u.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68400b;
                Empty empty2 = MutexKt.f68424f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, empty2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj2 instanceof OpDescriptor) {
                ((OpDescriptor) obj2).mo34263c(this);
            } else {
                if (!(obj2 instanceof LockedQueue)) {
                    throw new IllegalStateException(Intrinsics.m32187p("Illegal state ", obj2).toString());
                }
                if (obj != null) {
                    LockedQueue lockedQueue = (LockedQueue) obj2;
                    if (!(lockedQueue.f68412e == obj)) {
                        StringBuilder m24u2 = C0000a.m24u("Mutex is locked by ");
                        m24u2.append(lockedQueue.f68412e);
                        m24u2.append(" but expected ");
                        m24u2.append(obj);
                        throw new IllegalStateException(m24u2.toString().toString());
                    }
                }
                LockedQueue lockedQueue2 = (LockedQueue) obj2;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) lockedQueue2.m34290I();
                    if (lockFreeLinkedListNode == lockedQueue2) {
                        lockFreeLinkedListNode = null;
                        break;
                    } else if (lockFreeLinkedListNode.mo34192O()) {
                        break;
                    } else {
                        lockFreeLinkedListNode.m34293L();
                    }
                }
                if (lockFreeLinkedListNode == null) {
                    UnlockOp unlockOp = new UnlockOp(lockedQueue2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68400b;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, unlockOp)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z = false;
                            break;
                        }
                    }
                    if (z && unlockOp.mo34263c(this) == null) {
                        return;
                    }
                } else {
                    LockWaiter lockWaiter = (LockWaiter) lockFreeLinkedListNode;
                    if (lockWaiter.mo34400T()) {
                        Object obj3 = lockWaiter.f68411e;
                        if (obj3 == null) {
                            obj3 = MutexKt.f68421c;
                        }
                        lockedQueue2.f68412e = obj3;
                        lockWaiter.mo34399R();
                        return;
                    }
                }
            }
        }
    }

    @NotNull
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof Empty) {
                return C0576a.m4117p(C0000a.m24u("Mutex["), ((Empty) obj).f68399a, ']');
            }
            if (!(obj instanceof OpDescriptor)) {
                if (obj instanceof LockedQueue) {
                    return C0576a.m4117p(C0000a.m24u("Mutex["), ((LockedQueue) obj).f68412e, ']');
                }
                throw new IllegalStateException(Intrinsics.m32187p("Illegal state ", obj).toString());
            }
            ((OpDescriptor) obj).mo34263c(this);
        }
    }
}
