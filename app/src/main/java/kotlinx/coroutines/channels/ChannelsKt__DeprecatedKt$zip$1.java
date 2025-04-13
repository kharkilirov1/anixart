package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: Deprecated.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31884d2 = {"<anonymous>", "Lkotlin/Pair;", "E", "R", "t1", "t2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$zip$1 extends Lambda implements Function2 {
    static {
        new ChannelsKt__DeprecatedKt$zip$1();
    }

    public ChannelsKt__DeprecatedKt$zip$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
