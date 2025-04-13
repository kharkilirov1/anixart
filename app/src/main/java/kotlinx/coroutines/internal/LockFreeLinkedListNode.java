package kotlinx.coroutines.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LockFreeLinkedList.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class LockFreeLinkedListNode {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68268b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68269c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68270d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");

    @NotNull
    public volatile /* synthetic */ Object _next = this;

    @NotNull
    public volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static abstract class AbstractAtomicDesc extends AtomicDesc {
        @Override // kotlinx.coroutines.internal.AtomicDesc
        /* renamed from: a */
        public final void mo34260a(@NotNull AtomicOp<?> atomicOp, @Nullable Object obj) {
            LockFreeLinkedListNode f68272b;
            boolean z = false;
            boolean z2 = obj == null;
            LockFreeLinkedListNode mo34299f = mo34299f();
            if (mo34299f == null || (f68272b = getF68272b()) == null) {
                return;
            }
            Object mo34303l = z2 ? mo34303l(mo34299f, f68272b) : f68272b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(mo34299f, atomicOp, mo34303l)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(mo34299f) != atomicOp) {
                    break;
                }
            }
            if (z && z2) {
                mo34297d(mo34299f, f68272b);
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        @Nullable
        /* renamed from: b */
        public final Object mo34261b(@NotNull AtomicOp<?> atomicOp) {
            boolean z;
            while (true) {
                LockFreeLinkedListNode mo34302k = mo34302k(atomicOp);
                if (mo34302k == null) {
                    return AtomicKt.f68237b;
                }
                Object obj = mo34302k._next;
                if (obj == atomicOp || atomicOp.m34268h()) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    OpDescriptor opDescriptor = (OpDescriptor) obj;
                    if (atomicOp.m34321b(opDescriptor)) {
                        return AtomicKt.f68237b;
                    }
                    opDescriptor.mo34263c(mo34302k);
                } else {
                    Object mo34146c = mo34146c(mo34302k);
                    if (mo34146c != null) {
                        return mo34146c;
                    }
                    if (mo34301j(mo34302k, obj)) {
                        continue;
                    } else {
                        PrepareOp prepareOp = new PrepareOp(mo34302k, (LockFreeLinkedListNode) obj, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(mo34302k, obj, prepareOp)) {
                                z = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(mo34302k) != obj) {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            try {
                                if (prepareOp.mo34263c(mo34302k) != LockFreeLinkedList_commonKt.f68282a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f68268b;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(mo34302k, prepareOp, obj) && atomicReferenceFieldUpdater2.get(mo34302k) == prepareOp) {
                                }
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @Nullable
        /* renamed from: c */
        public Object mo34146c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            return null;
        }

        /* renamed from: d */
        public abstract void mo34297d(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2);

        /* renamed from: e */
        public abstract void mo34298e(@NotNull PrepareOp prepareOp);

        @Nullable
        /* renamed from: f */
        public abstract LockFreeLinkedListNode mo34299f();

        @Nullable
        /* renamed from: g */
        public abstract LockFreeLinkedListNode getF68272b();

        @Nullable
        /* renamed from: h */
        public Object mo34147h(@NotNull PrepareOp prepareOp) {
            mo34298e(prepareOp);
            return null;
        }

        /* renamed from: i */
        public void mo34148i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        /* renamed from: j */
        public boolean mo34301j(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            return false;
        }

        @Nullable
        /* renamed from: k */
        public LockFreeLinkedListNode mo34302k(@NotNull OpDescriptor opDescriptor) {
            LockFreeLinkedListNode mo34299f = mo34299f();
            Intrinsics.m32176e(mo34299f);
            return mo34299f;
        }

        @NotNull
        /* renamed from: l */
        public abstract Object mo34303l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f68271d = AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode f68272b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final T f68273c;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: d */
        public void mo34297d(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            T t = this.f68273c;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f68272b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
            t.m34289H(lockFreeLinkedListNode3);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: e */
        public void mo34298e(@NotNull PrepareOp prepareOp) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68271d;
            LockFreeLinkedListNode lockFreeLinkedListNode = prepareOp.f68276a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeLinkedListNode) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: f */
        public final LockFreeLinkedListNode mo34299f() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        /* renamed from: g, reason: from getter */
        public final LockFreeLinkedListNode getF68272b() {
            return this.f68272b;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: j */
        public boolean mo34301j(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            return obj != this.f68272b;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: k */
        public final LockFreeLinkedListNode mo34302k(@NotNull OpDescriptor opDescriptor) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f68272b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
            return lockFreeLinkedListNode.m34288F(opDescriptor);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        /* renamed from: l */
        public Object mo34303l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            T t = this.f68273c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68269c;
            while (!atomicReferenceFieldUpdater.compareAndSet(t, t, lockFreeLinkedListNode) && atomicReferenceFieldUpdater.get(t) == t) {
            }
            T t2 = this.f68273c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f68268b;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f68272b;
            while (!atomicReferenceFieldUpdater2.compareAndSet(t2, t2, lockFreeLinkedListNode3) && atomicReferenceFieldUpdater2.get(t2) == t2) {
            }
            return this.f68273c;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    @PublishedApi
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode f68274b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public LockFreeLinkedListNode f68275c;

        public CondAddOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f68274b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: d */
        public void mo34264d(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            boolean z = false;
            boolean z2 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = z2 ? this.f68274b : this.f68275c;
            if (lockFreeLinkedListNode3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode2, this, lockFreeLinkedListNode3)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2) != this) {
                        break;
                    }
                }
                if (z && z2) {
                    LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f68274b;
                    LockFreeLinkedListNode lockFreeLinkedListNode5 = this.f68275c;
                    Intrinsics.m32176e(lockFreeLinkedListNode5);
                    lockFreeLinkedListNode4.m34289H(lockFreeLinkedListNode5);
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class PrepareOp extends OpDescriptor {

        /* renamed from: a */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode f68276a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode f68277b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final AbstractAtomicDesc f68278c;

        public PrepareOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2, @NotNull AbstractAtomicDesc abstractAtomicDesc) {
            this.f68276a = lockFreeLinkedListNode;
            this.f68277b = lockFreeLinkedListNode2;
            this.f68278c = abstractAtomicDesc;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        /* renamed from: a */
        public AtomicOp<?> mo34262a() {
            AtomicOp<?> atomicOp = this.f68278c.f68235a;
            if (atomicOp != null) {
                return atomicOp;
            }
            Intrinsics.m32189r("atomicOp");
            throw null;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @Nullable
        /* renamed from: c */
        public Object mo34263c(@Nullable Object obj) {
            boolean z;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            Object mo34147h = this.f68278c.mo34147h(this);
            if (mo34147h != LockFreeLinkedList_commonKt.f68282a) {
                Object m34265e = mo34147h != null ? mo34262a().m34265e(mo34147h) : mo34262a().get_consensus();
                Object mo34262a = m34265e == AtomicKt.f68236a ? mo34262a() : m34265e == null ? this.f68278c.mo34303l(lockFreeLinkedListNode, this.f68277b) : this.f68277b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, mo34262a) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                }
                return null;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f68277b;
            Removed m34286D = LockFreeLinkedListNode.m34286D(lockFreeLinkedListNode2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f68268b;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, m34286D)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f68278c.mo34148i(lockFreeLinkedListNode);
                lockFreeLinkedListNode2.m34288F(null);
            }
            return LockFreeLinkedList_commonKt.f68282a;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("PrepareOp(op=");
            m24u.append(mo34262a());
            m24u.append(')');
            return m24u.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f68279c = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f68280d = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;

        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode f68281b;

        public RemoveFirstDesc(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f68281b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: c */
        public Object mo34146c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f68281b) {
                return LockFreeLinkedListKt.f68267b;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: d */
        public final void mo34297d(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
            lockFreeLinkedListNode2.m34288F(null);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: e */
        public void mo34298e(@NotNull PrepareOp prepareOp) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68279c;
            LockFreeLinkedListNode lockFreeLinkedListNode = prepareOp.f68276a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeLinkedListNode) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68280d;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = prepareOp.f68277b;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, lockFreeLinkedListNode2) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: f */
        public final LockFreeLinkedListNode mo34299f() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: g */
        public final LockFreeLinkedListNode getF68272b() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: j */
        public final boolean mo34301j(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            if (!(obj instanceof Removed)) {
                return false;
            }
            ((Removed) obj).f68298a.m34294M();
            return true;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: k */
        public final LockFreeLinkedListNode mo34302k(@NotNull OpDescriptor opDescriptor) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f68281b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof OpDescriptor)) {
                    return (LockFreeLinkedListNode) obj;
                }
                OpDescriptor opDescriptor2 = (OpDescriptor) obj;
                if (opDescriptor.m34321b(opDescriptor2)) {
                    return null;
                }
                opDescriptor2.mo34263c(this.f68281b);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        /* renamed from: l */
        public final Object mo34303l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            return LockFreeLinkedListNode.m34286D(lockFreeLinkedListNode2);
        }

        /* renamed from: m */
        public final T m34304m() {
            T t = (T) ((LockFreeLinkedListNode) this._affectedNode);
            Intrinsics.m32176e(t);
            return t;
        }
    }

    /* renamed from: D */
    public static final Removed m34286D(LockFreeLinkedListNode lockFreeLinkedListNode) {
        Removed removed = (Removed) lockFreeLinkedListNode._removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(lockFreeLinkedListNode);
        f68270d.lazySet(lockFreeLinkedListNode, removed2);
        return removed2;
    }

    @PublishedApi
    /* renamed from: E */
    public final boolean m34287E(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
        boolean z;
        f68269c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68268b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        lockFreeLinkedListNode.m34289H(lockFreeLinkedListNode2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f68268b;
        r4 = ((kotlinx.coroutines.internal.Removed) r4).f68298a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7.compareAndSet(r3, r2, r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7.get(r3) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r5 = true;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode m34288F(kotlinx.coroutines.internal.OpDescriptor r11) {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f68269c
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.mo34285N()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != r11) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r7 == 0) goto L44
            if (r11 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            boolean r0 = r11.m34321b(r0)
            if (r0 == 0) goto L3e
            return r1
        L3e:
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.mo34263c(r2)
            goto L0
        L44:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.Removed
            if (r7 == 0) goto L68
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f68268b
            kotlinx.coroutines.internal.Removed r4 = (kotlinx.coroutines.internal.Removed) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f68298a
        L50:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L58
            r5 = 1
            goto L5e
        L58:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L50
        L5e:
            if (r5 != 0) goto L61
            goto L0
        L61:
            r2 = r3
            goto L6
        L63:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L7
        L68:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.m34288F(kotlinx.coroutines.internal.OpDescriptor):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: H */
    public final void m34289H(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (m34290I() != lockFreeLinkedListNode) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68269c;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (mo34285N()) {
            lockFreeLinkedListNode.m34288F(null);
        }
    }

    @NotNull
    /* renamed from: I */
    public final Object m34290I() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo34263c(this);
        }
    }

    @NotNull
    /* renamed from: J */
    public final LockFreeLinkedListNode m34291J() {
        Object m34290I = m34290I();
        Removed removed = m34290I instanceof Removed ? (Removed) m34290I : null;
        LockFreeLinkedListNode lockFreeLinkedListNode = removed != null ? removed.f68298a : null;
        return lockFreeLinkedListNode == null ? (LockFreeLinkedListNode) m34290I : lockFreeLinkedListNode;
    }

    @NotNull
    /* renamed from: K */
    public final LockFreeLinkedListNode m34292K() {
        LockFreeLinkedListNode m34288F = m34288F(null);
        if (m34288F == null) {
            Object obj = this._prev;
            while (true) {
                m34288F = (LockFreeLinkedListNode) obj;
                if (!m34288F.mo34285N()) {
                    break;
                }
                obj = m34288F._prev;
            }
        }
        return m34288F;
    }

    /* renamed from: L */
    public final void m34293L() {
        ((Removed) m34290I()).f68298a.m34294M();
    }

    @PublishedApi
    /* renamed from: M */
    public final void m34294M() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object m34290I = lockFreeLinkedListNode.m34290I();
            if (!(m34290I instanceof Removed)) {
                lockFreeLinkedListNode.m34288F(null);
                return;
            }
            lockFreeLinkedListNode = ((Removed) m34290I).f68298a;
        }
    }

    /* renamed from: N */
    public boolean mo34285N() {
        return m34290I() instanceof Removed;
    }

    /* renamed from: O */
    public boolean mo34192O() {
        return m34295P() == null;
    }

    @PublishedApi
    @Nullable
    /* renamed from: P */
    public final LockFreeLinkedListNode m34295P() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z;
        do {
            Object m34290I = m34290I();
            if (m34290I instanceof Removed) {
                return ((Removed) m34290I).f68298a;
            }
            if (m34290I == this) {
                return (LockFreeLinkedListNode) m34290I;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) m34290I;
            Removed removed = (Removed) lockFreeLinkedListNode._removedRef;
            if (removed == null) {
                removed = new Removed(lockFreeLinkedListNode);
                f68270d.lazySet(lockFreeLinkedListNode, removed);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68268b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, m34290I, removed)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != m34290I) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        lockFreeLinkedListNode.m34288F(null);
        return null;
    }

    @PublishedApi
    /* renamed from: Q */
    public final int m34296Q(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2, @NotNull CondAddOp condAddOp) {
        boolean z;
        f68269c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68268b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        condAddOp.f68275c = lockFreeLinkedListNode2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, condAddOp)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                z = false;
                break;
            }
        }
        if (z) {
            return condAddOp.mo34263c(this) == null ? 1 : 2;
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return DebugStringsKt.m34022a(this.receiver);
            }
        } + '@' + DebugStringsKt.m34023b(this);
    }
}
