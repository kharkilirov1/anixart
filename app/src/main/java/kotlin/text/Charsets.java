package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Charsets.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/Charsets;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class Charsets {

    /* renamed from: a */
    @NotNull
    public static final Charsets f66854a = new Charsets();

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Charset f66855b;

    /* renamed from: c */
    @Nullable
    public static Charset f66856c;

    /* renamed from: d */
    @Nullable
    public static Charset f66857d;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.m32178g(forName, "forName(\"UTF-8\")");
        f66855b = forName;
        Intrinsics.m32178g(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        Intrinsics.m32178g(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        Intrinsics.m32178g(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Intrinsics.m32178g(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        Intrinsics.m32178g(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
