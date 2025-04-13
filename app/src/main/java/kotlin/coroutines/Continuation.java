package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* compiled from: Continuation.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/coroutines/Continuation;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface Continuation<T> {
    @NotNull
    /* renamed from: g */
    CoroutineContext mo31876g();

    /* renamed from: j */
    void mo31877j(@NotNull Object obj);
}
