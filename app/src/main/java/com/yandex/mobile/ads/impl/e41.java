package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e41 {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final bt0 f49803a;

    /* renamed from: b */
    @JvmField
    public final int f49804b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final String f49805c;

    /* renamed from: com.yandex.mobile.ads.impl.e41$a */
    public static final class C5004a {
        @NotNull
        /* renamed from: a */
        public static e41 m24006a(@NotNull String statusLine) throws IOException {
            bt0 bt0Var;
            String str;
            Intrinsics.m32179h(statusLine, "statusLine");
            int i2 = 9;
            if (StringsKt.m33898X(statusLine, "HTTP/1.", false, 2, null)) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    bt0Var = bt0.f48973b;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
                    }
                    bt0Var = bt0.f48974c;
                }
            } else {
                if (!StringsKt.m33898X(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
                }
                bt0Var = bt0.f48973b;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (statusLine.length() < i3) {
                throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i2, i3);
                Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i3) {
                    str = "";
                } else {
                    if (statusLine.charAt(i3) != ' ') {
                        throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i2 + 4);
                    Intrinsics.m32178g(str, "this as java.lang.String).substring(startIndex)");
                }
                return new e41(bt0Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(um1.m29049a("Unexpected status line: ", statusLine));
            }
        }
    }

    public e41(@NotNull bt0 protocol, int i2, @NotNull String message) {
        Intrinsics.m32179h(protocol, "protocol");
        Intrinsics.m32179h(message, "message");
        this.f49803a = protocol;
        this.f49804b = i2;
        this.f49805c = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f49803a == bt0.f48973b) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f49804b);
        sb.append(' ');
        sb.append(this.f49805c);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
