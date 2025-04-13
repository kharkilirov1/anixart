package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.AbstractChannel", m32126f = "AbstractChannel.kt", m32127l = {633}, m32128m = "receiveCatching-JP2dKIU")
/* loaded from: classes3.dex */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67099e;

    /* renamed from: f */
    public final /* synthetic */ AbstractChannel<E> f67100f;

    /* renamed from: g */
    public int f67101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, Continuation<? super AbstractChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.f67100f = abstractChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67099e = obj;
        this.f67101g |= Integer.MIN_VALUE;
        Object mo34134q = this.f67100f.mo34134q(this);
        return mo34134q == CoroutineSingletons.COROUTINE_SUSPENDED ? mo34134q : new ChannelResult(mo34134q);
    }
}
