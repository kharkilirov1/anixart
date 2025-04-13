package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;

/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlinx/coroutines/channels/ReceiveChannel$onReceiveOrNull$1", "Lkotlinx/coroutines/selects/SelectClause1;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ReceiveChannel$onReceiveOrNull$1 implements SelectClause1<Object> {
    @Override // kotlinx.coroutines.selects.SelectClause1
    @InternalCoroutinesApi
    /* renamed from: f */
    public <R> void mo34002f(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        throw null;
    }
}
