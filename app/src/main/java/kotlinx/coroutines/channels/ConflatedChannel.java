package kotlinx.coroutines.channels;

import androidx.room.util.C0576a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ConflatedChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class ConflatedChannel<E> extends AbstractChannel<E> {

    /* renamed from: f */
    @NotNull
    public final ReentrantLock f67362f;

    /* renamed from: g */
    @Nullable
    public Object f67363g;

    public ConflatedChannel(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f67362f = new ReentrantLock();
        this.f67363g = AbstractChannelKt.f67102a;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    /* renamed from: B */
    public Object mo34127B() {
        ReentrantLock reentrantLock = this.f67362f;
        reentrantLock.lock();
        try {
            Object obj = this.f67363g;
            Symbol symbol = AbstractChannelKt.f67102a;
            if (obj != symbol) {
                this.f67363g = symbol;
                return obj;
            }
            Object m34156f = m34156f();
            if (m34156f == null) {
                m34156f = AbstractChannelKt.f67105d;
            }
            return m34156f;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    /* renamed from: C */
    public Object mo34128C(@NotNull SelectInstance<?> selectInstance) {
        ReentrantLock reentrantLock = this.f67362f;
        reentrantLock.lock();
        try {
            Object obj = this.f67363g;
            Symbol symbol = AbstractChannelKt.f67102a;
            if (obj == symbol) {
                Object m34156f = m34156f();
                if (m34156f == null) {
                    m34156f = AbstractChannelKt.f67105d;
                }
                return m34156f;
            }
            if (!selectInstance.mo34393e()) {
                Object obj2 = SelectKt.f68384a;
                return SelectKt.f68385b;
            }
            Object obj3 = this.f67363g;
            this.f67363g = symbol;
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: G */
    public final UndeliveredElementException m34186G(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f67363g;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != AbstractChannelKt.f67102a && (function1 = this.f67109b) != null) {
            undeliveredElementException = OnUndeliveredElementKt.m34319c(function1, obj2, null);
        }
        this.f67363g = obj;
        return undeliveredElementException;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: d */
    public String mo34154d() {
        return C0576a.m4117p(C0000a.m24u("(value="), this.f67363g, ')');
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public final boolean mo34158h() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: i */
    public final boolean mo34159i() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: k */
    public Object mo34161k(E e2) {
        ReceiveOrClosed<E> mo34132n;
        ReentrantLock reentrantLock = this.f67362f;
        reentrantLock.lock();
        try {
            Closed<?> m34156f = m34156f();
            if (m34156f != null) {
                return m34156f;
            }
            if (this.f67363g == AbstractChannelKt.f67102a) {
                do {
                    mo34132n = mo34132n();
                    if (mo34132n != null) {
                        if (mo34132n instanceof Closed) {
                            return mo34132n;
                        }
                    }
                } while (mo34132n.mo34142B(e2, null) == null);
                reentrantLock.unlock();
                mo34132n.mo34144u(e2);
                return mo34132n.mo34183c();
            }
            UndeliveredElementException m34186G = m34186G(e2);
            if (m34186G == null) {
                return AbstractChannelKt.f67103b;
            }
            throw m34186G;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: s */
    public boolean mo34135s(@NotNull Receive<? super E> receive) {
        ReentrantLock reentrantLock = this.f67362f;
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
        return this.f67363g == AbstractChannelKt.f67102a;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: x */
    public void mo34139x(boolean z) {
        ReentrantLock reentrantLock = this.f67362f;
        reentrantLock.lock();
        try {
            UndeliveredElementException m34186G = m34186G(AbstractChannelKt.f67102a);
            reentrantLock.unlock();
            super.mo34139x(z);
            if (m34186G != null) {
                throw m34186G;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
