package kotlin;

import com.yandex.mobile.ads.C4632R;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.internal.HidesMembers;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Exceptions.kt */
@Metadata(m31883d1 = {"kotlin/ExceptionsKt__ExceptionsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class ExceptionsKt extends ExceptionsKt__ExceptionsKt {
    @SinceKotlin
    @HidesMembers
    /* renamed from: a */
    public static void m31878a(@NotNull Throwable th, @NotNull Throwable exception) {
        Intrinsics.m32179h(th, "<this>");
        Intrinsics.m32179h(exception, "exception");
        if (th != exception) {
            PlatformImplementationsKt.f63254a.mo32130a(th, exception);
        }
    }

    @SinceKotlin
    @NotNull
    /* renamed from: b */
    public static String m31879b(@NotNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.m32178g(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
