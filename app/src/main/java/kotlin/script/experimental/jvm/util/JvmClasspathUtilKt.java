package kotlin.script.experimental.jvm.util;

import java.io.File;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: jvmClasspathUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-jvm"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class JvmClasspathUtilKt {

    /* renamed from: a */
    public static final Set<String> f66651a = SetsKt.m32080g("jar", "zip", "java");

    /* renamed from: a */
    public static final boolean m33817a(@NotNull File receiver$0, @NotNull String baseName) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(baseName, "baseName");
        if (!Intrinsics.m32174c(receiver$0.getName(), baseName) && !Intrinsics.m32174c(receiver$0.getName(), StringsKt.m33886L(baseName, ".jar"))) {
            StringBuilder sb = new StringBuilder();
            String quote = Pattern.quote(StringsKt.m33886L(baseName, ".jar"));
            Intrinsics.m32178g(quote, "quote(literal)");
            sb.append(quote);
            sb.append("(-\\d.*)?\\.jar");
            Regex regex = new Regex(sb.toString());
            String name = receiver$0.getName();
            Intrinsics.m32175d(name, "name");
            if (!regex.m33872d(name)) {
                return false;
            }
        }
        return true;
    }
}
