package kotlin.comparisons;

import com.yandex.mobile.ads.C4632R;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlin/comparisons/ComparisonsKt__ComparisonsKt", "kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt", "kotlin/comparisons/ComparisonsKt___ComparisonsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class ComparisonsKt extends ComparisonsKt___ComparisonsKt {
    @NotNull
    /* renamed from: a */
    public static Comparator m32108a(@NotNull final Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    for (Function1<T, Comparable<?>> function1 : function1Arr) {
                        int m32109b = ComparisonsKt.m32109b(function1.invoke(t), function1.invoke(t2));
                        if (m32109b != 0) {
                            return m32109b;
                        }
                    }
                    return 0;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public static int m32109b(@Nullable Comparable comparable, @Nullable Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
