package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadContextElement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
/* loaded from: classes3.dex */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: A */
    CopyableThreadContextElement<S> m34008A();

    @NotNull
    /* renamed from: i */
    CoroutineContext m34009i(@NotNull CoroutineContext.Element element);
}
