package kotlinx.coroutines.channels;

import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayBroadcastChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Subscriber", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ArrayBroadcastChannel<E> extends AbstractSendChannel<E> implements BroadcastChannel<E> {

    @NotNull
    private volatile /* synthetic */ long _head;

    @NotNull
    private volatile /* synthetic */ int _size;

    @NotNull
    private volatile /* synthetic */ long _tail;

    /* compiled from: ArrayBroadcastChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Subscriber<E> extends AbstractChannel<E> implements ReceiveChannel<E> {

        @NotNull
        private volatile /* synthetic */ long _subHead;

        /* renamed from: f */
        @NotNull
        public final ArrayBroadcastChannel<E> f67118f;

        /* renamed from: g */
        @NotNull
        public final ReentrantLock f67119g;

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        @Override // kotlinx.coroutines.channels.AbstractChannel
        @org.jetbrains.annotations.Nullable
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo34127B() {
            /*
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f67119g
                r0.lock()
                java.lang.Object r1 = r8.m34172H()     // Catch: java.lang.Throwable -> L43
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L43
                r3 = 1
                if (r2 == 0) goto Lf
                goto L13
            Lf:
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> L43
                if (r1 != r2) goto L15
            L13:
                r2 = 0
                goto L1d
            L15:
                long r4 = r8._subHead     // Catch: java.lang.Throwable -> L43
                r6 = 1
                long r4 = r4 + r6
                r8._subHead = r4     // Catch: java.lang.Throwable -> L43
                r2 = 1
            L1d:
                r0.unlock()
                boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
                r4 = 0
                if (r0 == 0) goto L29
                r0 = r1
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                goto L2a
            L29:
                r0 = r4
            L2a:
                if (r0 != 0) goto L2d
                goto L32
            L2d:
                java.lang.Throwable r0 = r0.f67351e
                r8.mo34163y(r0)
            L32:
                boolean r0 = r8.m34171G()
                if (r0 == 0) goto L39
                goto L3a
            L39:
                r3 = r2
            L3a:
                if (r3 != 0) goto L3d
                return r1
            L3d:
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r8.f67118f
                java.util.Objects.requireNonNull(r0)
                throw r4
            L43:
                r1 = move-exception
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber.mo34127B():java.lang.Object");
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @Nullable
        /* renamed from: C */
        public Object mo34128C(@NotNull SelectInstance<?> selectInstance) {
            ReentrantLock reentrantLock = this.f67119g;
            reentrantLock.lock();
            try {
                Object m34172H = m34172H();
                boolean z = false;
                if (!(m34172H instanceof Closed) && m34172H != AbstractChannelKt.f67105d) {
                    if (selectInstance.mo34393e()) {
                        this._subHead++;
                        z = true;
                    } else {
                        Object obj = SelectKt.f68384a;
                        m34172H = SelectKt.f68385b;
                    }
                }
                reentrantLock.unlock();
                Closed closed = m34172H instanceof Closed ? (Closed) m34172H : null;
                if (closed != null) {
                    mo34163y(closed.f67351e);
                }
                if (!(m34171G() ? true : z)) {
                    return m34172H;
                }
                Objects.requireNonNull(this.f67118f);
                throw null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0039, code lost:
        
            r4 = (kotlinx.coroutines.channels.Closed) r3;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m34171G() {
            /*
                r10 = this;
                r0 = 1
                r1 = 0
                r2 = 0
            L3:
                kotlinx.coroutines.channels.Closed r3 = r10.m34155e()
                if (r3 == 0) goto Lb
            L9:
                r3 = 0
                goto L1b
            Lb:
                boolean r3 = r10.mo34137u()
                if (r3 == 0) goto L1a
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3 = r10.f67118f
                kotlinx.coroutines.channels.Closed r3 = r3.m34155e()
                if (r3 != 0) goto L1a
                goto L9
            L1a:
                r3 = 1
            L1b:
                r4 = 0
                if (r3 == 0) goto L6d
                java.util.concurrent.locks.ReentrantLock r3 = r10.f67119g
                boolean r3 = r3.tryLock()
                if (r3 != 0) goto L27
                goto L6d
            L27:
                java.lang.Object r3 = r10.m34172H()     // Catch: java.lang.Throwable -> L66
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> L66
                if (r3 != r5) goto L35
            L2f:
                java.util.concurrent.locks.ReentrantLock r3 = r10.f67119g
                r3.unlock()
                goto L3
            L35:
                boolean r5 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L66
                if (r5 == 0) goto L42
                r4 = r3
                kotlinx.coroutines.channels.Closed r4 = (kotlinx.coroutines.channels.Closed) r4     // Catch: java.lang.Throwable -> L66
            L3c:
                java.util.concurrent.locks.ReentrantLock r0 = r10.f67119g
                r0.unlock()
                goto L6d
            L42:
                kotlinx.coroutines.channels.ReceiveOrClosed r5 = r10.mo34132n()     // Catch: java.lang.Throwable -> L66
                if (r5 != 0) goto L49
                goto L3c
            L49:
                boolean r6 = r5 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L66
                if (r6 == 0) goto L4e
                goto L3c
            L4e:
                kotlinx.coroutines.internal.Symbol r4 = r5.mo34142B(r3, r4)     // Catch: java.lang.Throwable -> L66
                if (r4 != 0) goto L55
                goto L2f
            L55:
                long r6 = r10._subHead     // Catch: java.lang.Throwable -> L66
                r8 = 1
                long r6 = r6 + r8
                r10._subHead = r6     // Catch: java.lang.Throwable -> L66
                java.util.concurrent.locks.ReentrantLock r2 = r10.f67119g
                r2.unlock()
                r5.mo34144u(r3)
                r2 = 1
                goto L3
            L66:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r10.f67119g
                r1.unlock()
                throw r0
            L6d:
                if (r4 != 0) goto L70
                goto L75
            L70:
                java.lang.Throwable r0 = r4.f67351e
                r10.mo34163y(r0)
            L75:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber.m34171G():boolean");
        }

        /* renamed from: H */
        public final Object m34172H() {
            long j2 = this._subHead;
            Closed<?> m34155e = this.f67118f.m34155e();
            if (j2 >= ArrayBroadcastChannel.m34170r(this.f67118f)) {
                if (m34155e == null) {
                    m34155e = m34155e();
                }
                return m34155e == null ? AbstractChannelKt.f67105d : m34155e;
            }
            Objects.requireNonNull(this.f67118f);
            long j3 = j2 % 0;
            throw null;
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        /* renamed from: h */
        public boolean mo34158h() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        /* renamed from: i */
        public boolean mo34159i() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        /* renamed from: t */
        public boolean mo34136t() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        /* renamed from: u */
        public boolean mo34137u() {
            return this._subHead >= ArrayBroadcastChannel.m34170r(this.f67118f);
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        /* renamed from: y */
        public boolean mo34163y(@Nullable Throwable th) {
            boolean mo34163y = super.mo34163y(th);
            if (!mo34163y) {
                return mo34163y;
            }
            Objects.requireNonNull(this.f67118f);
            throw null;
        }
    }

    /* renamed from: r */
    public static final long m34170r(ArrayBroadcastChannel arrayBroadcastChannel) {
        return arrayBroadcastChannel._tail;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: d */
    public String mo34154d() {
        new StringBuilder().append("(buffer:capacity=");
        throw null;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public boolean mo34158h() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: i */
    public boolean mo34159i() {
        return this._size >= 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: k */
    public Object mo34161k(E e2) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        if (super.mo34163y(th)) {
            throw null;
        }
        return false;
    }
}
