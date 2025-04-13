package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DefaultExecutorKt {

    /* renamed from: a */
    public static final boolean f66981a;

    /* renamed from: b */
    @NotNull
    public static final Delay f66982b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Delay delay;
        boolean m34333e = SystemPropsKt.m34333e("kotlinx.coroutines.main.delay", false);
        f66981a = m34333e;
        if (m34333e) {
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f68292a;
            delay = (MainDispatchersKt.m34315a(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof Delay)) ? DefaultExecutor.f66979h : (Delay) mainCoroutineDispatcher;
        } else {
            delay = DefaultExecutor.f66979h;
        }
        f66982b = delay;
    }
}
