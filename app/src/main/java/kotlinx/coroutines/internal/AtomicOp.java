package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Atomic.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AtomicOp<T> extends OpDescriptor {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68238a = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");

    @NotNull
    private volatile /* synthetic */ Object _consensus = AtomicKt.f68236a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    @NotNull
    /* renamed from: a */
    public AtomicOp<?> mo34262a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    @Nullable
    /* renamed from: c */
    public final Object mo34263c(@Nullable Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == AtomicKt.f68236a) {
            obj2 = m34265e(mo34105i(obj));
        }
        mo34264d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo34264d(T t, @Nullable Object obj);

    @Nullable
    /* renamed from: e */
    public final Object m34265e(@Nullable Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        Object obj3 = AtomicKt.f68236a;
        if (obj2 != obj3) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68238a;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                z = false;
                break;
            }
        }
        return z ? obj : this._consensus;
    }

    @Nullable
    /* renamed from: f, reason: from getter */
    public final Object get_consensus() {
        return this._consensus;
    }

    /* renamed from: g */
    public long mo34267g() {
        return 0L;
    }

    /* renamed from: h */
    public final boolean m34268h() {
        return this._consensus != AtomicKt.f68236a;
    }

    @Nullable
    /* renamed from: i */
    public abstract Object mo34105i(T t);
}
