package kotlinx.coroutines.flow.internal;

import androidx.room.util.C0576a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {

    /* renamed from: b */
    @JvmField
    @NotNull
    public final CoroutineContext f68093b;

    /* renamed from: c */
    @JvmField
    public final int f68094c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final BufferOverflow f68095d;

    public ChannelFlow(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.f68093b = coroutineContext;
        this.f68094c = i2;
        this.f68095d = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m34021c = CoroutineScopeKt.m34021c(new ChannelFlow$collect$2(flowCollector, this, null), continuation);
        return m34021c == CoroutineSingletons.COROUTINE_SUSPENDED ? m34021c : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    /* renamed from: d */
    public Flow<T> mo34223d(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        CoroutineContext plus = coroutineContext.plus(this.f68093b);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i3 = this.f68094c;
            if (i3 != -3) {
                if (i2 != -3) {
                    if (i3 != -2) {
                        if (i2 != -2 && (i3 = i3 + i2) < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                }
                i2 = i3;
            }
            bufferOverflow = this.f68095d;
        }
        return (Intrinsics.m32174c(plus, this.f68093b) && i2 == this.f68094c && bufferOverflow == this.f68095d) ? this : mo34205h(plus, i2, bufferOverflow);
    }

    @Nullable
    /* renamed from: f */
    public String mo34206f() {
        return null;
    }

    @Nullable
    /* renamed from: g */
    public abstract Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* renamed from: h */
    public abstract ChannelFlow<T> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow);

    @NotNull
    /* renamed from: i */
    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> m34253i() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    @NotNull
    /* renamed from: j */
    public ReceiveChannel<T> mo34207j(@NotNull CoroutineScope coroutineScope) {
        CoroutineContext coroutineContext = this.f68093b;
        int i2 = this.f68094c;
        return ProduceKt.m34188b(coroutineScope, coroutineContext, i2 == -3 ? -2 : i2, this.f68095d, CoroutineStart.ATOMIC, null, m34253i());
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String mo34206f = mo34206f();
        if (mo34206f != null) {
            arrayList.add(mo34206f);
        }
        CoroutineContext coroutineContext = this.f68093b;
        if (coroutineContext != EmptyCoroutineContext.f63224b) {
            arrayList.add(Intrinsics.m32187p("context=", coroutineContext));
        }
        int i2 = this.f68094c;
        if (i2 != -3) {
            arrayList.add(Intrinsics.m32187p("capacity=", Integer.valueOf(i2)));
        }
        BufferOverflow bufferOverflow = this.f68095d;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add(Intrinsics.m32187p("onBufferOverflow=", bufferOverflow));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C0576a.m4118q(sb, CollectionsKt.m31989B(arrayList, ", ", null, null, 0, null, null, 62, null), ']');
    }
}
