package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class WeakMapCtorCache extends CtorCache {

    /* renamed from: a */
    @NotNull
    public static final WeakMapCtorCache f68318a = new WeakMapCtorCache();

    /* renamed from: b */
    @NotNull
    public static final ReentrantReadWriteLock f68319b = new ReentrantReadWriteLock();

    /* renamed from: c */
    @NotNull
    public static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f68320c = new WeakHashMap<>();
}
