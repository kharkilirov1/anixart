package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PausingDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"lifecycle-runtime-ktx_release"}, m31885k = 2, m31886mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class PausingDispatcherKt {
    @Nullable
    /* renamed from: a */
    public static final <T> Object m3223a(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        return BuildersKt.m33963b(MainDispatcherLoader.f68292a.mo34115v(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, function2, null), continuation);
    }
}
