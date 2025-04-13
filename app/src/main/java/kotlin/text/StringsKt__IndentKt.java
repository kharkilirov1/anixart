package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* compiled from: Indent.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
class StringsKt__IndentKt extends StringsKt__AppendableKt {
    /* renamed from: a */
    public static final Function1<String, String> m33929a(final String str) {
        return str.length() == 0 ? new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(String str2) {
                String line = str2;
                Intrinsics.m32179h(line, "line");
                return line;
            }
        } : new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public String invoke(String str2) {
                String line = str2;
                Intrinsics.m32179h(line, "line");
                return C0000a.m20q(new StringBuilder(), str, line);
            }
        };
    }
}
