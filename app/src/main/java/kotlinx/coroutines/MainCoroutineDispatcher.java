package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String m34116w = m34116w();
        if (m34116w != null) {
            return m34116w;
        }
        return getClass().getSimpleName() + '@' + DebugStringsKt.m34023b(this);
    }

    @NotNull
    /* renamed from: v */
    public abstract MainCoroutineDispatcher mo34115v();

    @InternalCoroutinesApi
    @Nullable
    /* renamed from: w */
    public final String m34116w() {
        MainCoroutineDispatcher mainCoroutineDispatcher;
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        MainCoroutineDispatcher mainCoroutineDispatcher2 = MainDispatcherLoader.f68292a;
        if (this == mainCoroutineDispatcher2) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = mainCoroutineDispatcher2.mo34115v();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this == mainCoroutineDispatcher) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
