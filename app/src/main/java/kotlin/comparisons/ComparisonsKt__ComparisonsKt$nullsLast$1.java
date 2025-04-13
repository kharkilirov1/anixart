package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Comparisons.kt */
@Metadata(m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31884d2 = {"<anonymous>", "", "T", "", "a", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class ComparisonsKt__ComparisonsKt$nullsLast$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        throw null;
    }
}
