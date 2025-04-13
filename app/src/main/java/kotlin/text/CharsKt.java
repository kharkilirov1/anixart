package kotlin.text;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ranges.IntRange;
import p000a.C0000a;

@Metadata(m31883d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/CharsKt__CharKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class CharsKt extends CharsKt__CharKt {
    @PublishedApi
    /* renamed from: b */
    public static int m33863b(int i2) {
        if (new IntRange(2, 36).m32232d(i2)) {
            return i2;
        }
        StringBuilder m25v = C0000a.m25v("radix ", i2, " was not in valid range ");
        m25v.append(new IntRange(2, 36));
        throw new IllegalArgumentException(m25v.toString());
    }

    /* renamed from: c */
    public static boolean m33864c(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }
}
