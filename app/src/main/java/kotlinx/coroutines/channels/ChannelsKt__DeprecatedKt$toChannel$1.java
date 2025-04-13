package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487, 278}, m32128m = "toChannel")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends SendChannel<? super E>> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67321e;

    /* renamed from: f */
    public Object f67322f;

    /* renamed from: g */
    public Object f67323g;

    /* renamed from: h */
    public /* synthetic */ Object f67324h;

    /* renamed from: i */
    public int f67325i;

    public ChannelsKt__DeprecatedKt$toChannel$1(Continuation<? super ChannelsKt__DeprecatedKt$toChannel$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67324h = obj;
        this.f67325i |= Integer.MIN_VALUE;
        return ChannelsKt.m34180b(null, null, this);
    }
}
