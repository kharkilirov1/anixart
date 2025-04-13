package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*(\b\u0000\u0010\u0003\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0004"}, m31884d2 = {"Lkotlin/Function1;", "", "", "Handler", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class AbstractChannelKt {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final Symbol f67102a = new Symbol("EMPTY");

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Symbol f67103b = new Symbol("OFFER_SUCCESS");

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final Symbol f67104c = new Symbol("OFFER_FAILED");

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final Symbol f67105d = new Symbol("POLL_FAILED");

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final Symbol f67106e = new Symbol("ENQUEUE_FAILED");

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final Symbol f67107f = new Symbol("ON_CLOSE_HANDLER_INVOKED");
}
