package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ArrayChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class ArrayChannel<E> extends AbstractChannel<E> {

    /* renamed from: f */
    public final int f67120f;

    /* renamed from: g */
    @NotNull
    public final BufferOverflow f67121g;

    /* renamed from: h */
    @NotNull
    public final ReentrantLock f67122h;

    /* renamed from: i */
    @NotNull
    public Object[] f67123i;

    /* renamed from: j */
    public int f67124j;

    @NotNull
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[1] = 3;
        }
    }

    public ArrayChannel(int i2, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f67120f = i2;
        this.f67121g = bufferOverflow;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(C0000a.m8e("ArrayChannel capacity must be at least 1, but ", i2, " was specified").toString());
        }
        this.f67122h = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        ArraysKt.m31974x(objArr, AbstractChannelKt.f67102a, 0, 0, 6, null);
        this.f67123i = objArr;
        this.size = 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    /* renamed from: B */
    public Object mo34127B() {
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object m34156f = m34156f();
                if (m34156f == null) {
                    m34156f = AbstractChannelKt.f67105d;
                }
                return m34156f;
            }
            Object[] objArr = this.f67123i;
            int i3 = this.f67124j;
            Object obj = objArr[i3];
            Send send = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = AbstractChannelKt.f67105d;
            boolean z = false;
            if (i2 == this.f67120f) {
                Send send2 = null;
                while (true) {
                    Send m34162o = m34162o();
                    if (m34162o == null) {
                        send = send2;
                        break;
                    }
                    if (m34162o.mo34168U(null) != null) {
                        obj2 = m34162o.getF67112e();
                        send = m34162o;
                        z = true;
                        break;
                    }
                    m34162o.mo34169V();
                    send2 = m34162o;
                }
            }
            if (obj2 != AbstractChannelKt.f67105d && !(obj2 instanceof Closed)) {
                this.size = i2;
                Object[] objArr2 = this.f67123i;
                objArr2[(this.f67124j + i2) % objArr2.length] = obj2;
            }
            this.f67124j = (this.f67124j + 1) % this.f67123i.length;
            if (z) {
                Intrinsics.m32176e(send);
                send.mo34165R();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:11:0x0015, B:13:0x0029, B:50:0x0036, B:30:0x0079, B:32:0x007d, B:34:0x0081, B:35:0x00a3, B:40:0x008d, B:42:0x0093, B:15:0x0044, B:17:0x0049, B:21:0x004e, B:23:0x0054, B:26:0x0060, B:45:0x0068, B:46:0x0077), top: B:2:0x0005 }] */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo34128C(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f67122h
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lba
            if (r1 != 0) goto L15
            kotlinx.coroutines.channels.Closed r9 = r8.m34156f()     // Catch: java.lang.Throwable -> Lba
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> Lba
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f67123i     // Catch: java.lang.Throwable -> Lba
            int r3 = r8.f67124j     // Catch: java.lang.Throwable -> Lba
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lba
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lba
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> Lba
            int r3 = r8.f67120f     // Catch: java.lang.Throwable -> Lba
            r6 = 1
            if (r1 != r3) goto L78
        L29:
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r3 = new kotlinx.coroutines.channels.AbstractChannel$TryPollDesc     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.internal.LockFreeLinkedListHead r7 = r8.f67110c     // Catch: java.lang.Throwable -> Lba
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r7 = r9.mo34397z(r3)     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto L44
            java.lang.Object r2 = r3.m34304m()     // Catch: java.lang.Throwable -> Lba
            r3 = r2
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r3 = r3.getF67112e()     // Catch: java.lang.Throwable -> Lba
            r5 = r2
            r2 = r3
            goto L66
        L44:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> Lba
            if (r7 != r3) goto L49
            goto L78
        L49:
            java.lang.Object r3 = kotlinx.coroutines.internal.AtomicKt.f68237b     // Catch: java.lang.Throwable -> Lba
            if (r7 != r3) goto L4e
            goto L29
        L4e:
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.f68384a     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.f68385b     // Catch: java.lang.Throwable -> Lba
            if (r7 != r2) goto L60
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f67123i     // Catch: java.lang.Throwable -> Lba
            int r1 = r8.f67124j     // Catch: java.lang.Throwable -> Lba
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            return r7
        L60:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L68
            r2 = r7
            r5 = r2
        L66:
            r3 = 1
            goto L79
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.m32187p(r1, r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lba
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lba
            throw r9     // Catch: java.lang.Throwable -> Lba
        L78:
            r3 = 0
        L79:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d     // Catch: java.lang.Throwable -> Lba
            if (r2 == r7) goto L8d
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto L8d
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f67123i     // Catch: java.lang.Throwable -> Lba
            int r7 = r8.f67124j     // Catch: java.lang.Throwable -> Lba
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lba
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lba
            goto La3
        L8d:
            boolean r9 = r9.mo34393e()     // Catch: java.lang.Throwable -> Lba
            if (r9 != 0) goto La3
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f67123i     // Catch: java.lang.Throwable -> Lba
            int r1 = r8.f67124j     // Catch: java.lang.Throwable -> Lba
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r9 = kotlinx.coroutines.selects.SelectKt.f68384a     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r9 = kotlinx.coroutines.selects.SelectKt.f68385b     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            return r9
        La3:
            int r9 = r8.f67124j     // Catch: java.lang.Throwable -> Lba
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f67123i     // Catch: java.lang.Throwable -> Lba
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lba
            int r9 = r9 % r1
            r8.f67124j = r9     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            if (r3 == 0) goto Lb9
            kotlin.jvm.internal.Intrinsics.m32176e(r5)
            kotlinx.coroutines.channels.Send r5 = (kotlinx.coroutines.channels.Send) r5
            r5.mo34165R()
        Lb9:
            return r4
        Lba:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ArrayChannel.mo34128C(kotlinx.coroutines.selects.SelectInstance):java.lang.Object");
    }

    /* renamed from: G */
    public final void m34173G(int i2, E e2) {
        int i3 = this.f67120f;
        if (i2 >= i3) {
            Object[] objArr = this.f67123i;
            int i4 = this.f67124j;
            objArr[i4 % objArr.length] = null;
            objArr[(i2 + i4) % objArr.length] = e2;
            this.f67124j = (i4 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f67123i;
        if (i2 >= objArr2.length) {
            int min = Math.min(objArr2.length * 2, i3);
            Object[] objArr3 = new Object[min];
            for (int i5 = 0; i5 < i2; i5++) {
                Object[] objArr4 = this.f67123i;
                objArr3[i5] = objArr4[(this.f67124j + i5) % objArr4.length];
            }
            ArraysKt.m31973w(objArr3, AbstractChannelKt.f67102a, i2, min);
            this.f67123i = objArr3;
            this.f67124j = 0;
        }
        Object[] objArr5 = this.f67123i;
        objArr5[(this.f67124j + i2) % objArr5.length] = e2;
    }

    /* renamed from: H */
    public final Symbol m34174H(int i2) {
        if (i2 < this.f67120f) {
            this.size = i2 + 1;
            return null;
        }
        int ordinal = this.f67121g.ordinal();
        if (ordinal == 0) {
            return AbstractChannelKt.f67104c;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return AbstractChannelKt.f67103b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @Nullable
    /* renamed from: c */
    public Object mo34153c(@NotNull Send send) {
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            return super.mo34153c(send);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: d */
    public String mo34154d() {
        StringBuilder m24u = C0000a.m24u("(buffer:capacity=");
        m24u.append(this.f67120f);
        m24u.append(",size=");
        return C0000a.m17n(m24u, this.size, ')');
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public final boolean mo34158h() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: i */
    public final boolean mo34159i() {
        return this.size == this.f67120f && this.f67121g == BufferOverflow.SUSPEND;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: k */
    public Object mo34161k(E e2) {
        ReceiveOrClosed<E> mo34132n;
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            Closed<?> m34156f = m34156f();
            if (m34156f != null) {
                return m34156f;
            }
            Symbol m34174H = m34174H(i2);
            if (m34174H != null) {
                return m34174H;
            }
            if (i2 == 0) {
                do {
                    mo34132n = mo34132n();
                    if (mo34132n != null) {
                        if (mo34132n instanceof Closed) {
                            this.size = i2;
                            return mo34132n;
                        }
                    }
                } while (mo34132n.mo34142B(e2, null) == null);
                this.size = i2;
                reentrantLock.unlock();
                mo34132n.mo34144u(e2);
                return mo34132n.mo34183c();
            }
            m34173G(i2, e2);
            return AbstractChannelKt.f67103b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: s */
    public boolean mo34135s(@NotNull Receive<? super E> receive) {
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            return super.mo34135s(receive);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: t */
    public final boolean mo34136t() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: u */
    public final boolean mo34137u() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: w */
    public boolean mo34138w() {
        boolean z;
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            if (m34155e() != null) {
                if (mo34137u()) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: x */
    public void mo34139x(boolean z) {
        Function1<E, Unit> function1 = this.f67109b;
        ReentrantLock reentrantLock = this.f67122h;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i3 = 0;
            while (i3 < i2) {
                i3++;
                Object obj = this.f67123i[this.f67124j];
                if (function1 != null && obj != AbstractChannelKt.f67102a) {
                    undeliveredElementException = OnUndeliveredElementKt.m34319c(function1, obj, undeliveredElementException);
                }
                Object[] objArr = this.f67123i;
                int i4 = this.f67124j;
                objArr[i4] = AbstractChannelKt.f67102a;
                this.f67124j = (i4 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.mo34139x(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
