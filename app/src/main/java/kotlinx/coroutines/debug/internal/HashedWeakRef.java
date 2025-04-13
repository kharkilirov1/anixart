package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "T", "Ljava/lang/ref/WeakReference;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class HashedWeakRef<T> extends WeakReference<T> {

    /* renamed from: a */
    @JvmField
    public final int f67432a;

    public HashedWeakRef(T t, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.f67432a = t.hashCode();
    }
}
