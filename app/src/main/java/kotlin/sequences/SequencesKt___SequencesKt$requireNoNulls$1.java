package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _Sequences.kt */
@Metadata(m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements Function1<Object, Object> {
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Object invoke(@Nullable Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in null.");
    }
}
