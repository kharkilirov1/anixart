package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: _Strings.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "", "invoke"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class StringsKt___StringsKt$windowed$1 extends Lambda implements Function1<CharSequence, String> {
    static {
        new StringsKt___StringsKt$windowed$1();
    }

    public StringsKt___StringsKt$windowed$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(CharSequence charSequence) {
        CharSequence it = charSequence;
        Intrinsics.m32179h(it, "it");
        return it.toString();
    }
}
