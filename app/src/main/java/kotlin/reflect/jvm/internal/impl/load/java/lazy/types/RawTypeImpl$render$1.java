package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RawType.kt */
/* loaded from: classes3.dex */
public final class RawTypeImpl$render$1 extends Lambda implements Function2<String, String, Boolean> {

    /* renamed from: b */
    public static final RawTypeImpl$render$1 f64635b = new RawTypeImpl$render$1();

    public RawTypeImpl$render$1() {
        super(2);
    }

    /* renamed from: a */
    public final boolean m32792a(@NotNull String first, @NotNull String second) {
        Intrinsics.m32180i(first, "first");
        Intrinsics.m32180i(second, "second");
        return Intrinsics.m32174c(first, StringsKt.m33885K(second, "out ")) || Intrinsics.m32174c(second, "*");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
        return Boolean.valueOf(m32792a(str, str2));
    }
}
