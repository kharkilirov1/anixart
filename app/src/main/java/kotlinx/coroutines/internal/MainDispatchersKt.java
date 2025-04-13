package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainDispatchers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class MainDispatchersKt {
    @InternalCoroutinesApi
    /* renamed from: a */
    public static final boolean m34315a(@NotNull MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.mo34115v() instanceof MissingMainCoroutineDispatcher;
    }
}
