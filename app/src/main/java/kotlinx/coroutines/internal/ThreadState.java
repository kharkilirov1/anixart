package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ThreadState {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final CoroutineContext f68314a;

    /* renamed from: b */
    @NotNull
    public final Object[] f68315b;

    /* renamed from: c */
    @NotNull
    public final ThreadContextElement<Object>[] f68316c;

    /* renamed from: d */
    public int f68317d;

    public ThreadState(@NotNull CoroutineContext coroutineContext, int i2) {
        this.f68314a = coroutineContext;
        this.f68315b = new Object[i2];
        this.f68316c = new ThreadContextElement[i2];
    }
}
