package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68242a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68243b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");

    @NotNull
    private volatile /* synthetic */ Object _next = null;

    @NotNull
    private volatile /* synthetic */ Object _prev;

    public ConcurrentLinkedListNode(@Nullable N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public static final Object m34269a(ConcurrentLinkedListNode concurrentLinkedListNode) {
        return concurrentLinkedListNode._next;
    }

    @Nullable
    /* renamed from: b */
    public final N m34270b() {
        Object obj = this._next;
        if (obj == ConcurrentLinkedListKt.f68241a) {
            return null;
        }
        return (N) obj;
    }

    /* renamed from: c */
    public abstract boolean mo34271c();

    /* renamed from: d */
    public final boolean m34272d() {
        return m34270b() == null;
    }

    /* renamed from: e */
    public final void m34273e() {
        while (true) {
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) this._prev;
            while (concurrentLinkedListNode != null && concurrentLinkedListNode.mo34271c()) {
                concurrentLinkedListNode = (ConcurrentLinkedListNode) concurrentLinkedListNode._prev;
            }
            ConcurrentLinkedListNode m34270b = m34270b();
            Intrinsics.m32176e(m34270b);
            while (m34270b.mo34271c()) {
                m34270b = m34270b.m34270b();
                Intrinsics.m32176e(m34270b);
            }
            m34270b._prev = concurrentLinkedListNode;
            if (concurrentLinkedListNode != null) {
                concurrentLinkedListNode._next = m34270b;
            }
            if (!m34270b.mo34271c() && (concurrentLinkedListNode == null || !concurrentLinkedListNode.mo34271c())) {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean m34274f(@NotNull N n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68242a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }
}
