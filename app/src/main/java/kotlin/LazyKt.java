package kotlin;

import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class LazyKt extends LazyKt__LazyKt {
    @NotNull
    /* renamed from: a */
    public static Lazy m31880a(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode, @NotNull Function0 initializer) {
        Intrinsics.m32179h(initializer, "initializer");
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal == 0) {
            return new SynchronizedLazyImpl(initializer, null, 2);
        }
        if (ordinal == 1) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (ordinal == 2) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: b */
    public static Lazy m31881b(@NotNull Function0 initializer) {
        Intrinsics.m32179h(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2);
    }
}
