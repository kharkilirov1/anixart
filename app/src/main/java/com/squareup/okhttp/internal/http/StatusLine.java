package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.ProtocolException;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class StatusLine {

    /* renamed from: a */
    public final Protocol f25184a;

    /* renamed from: b */
    public final int f25185b;

    /* renamed from: c */
    public final String f25186c;

    public StatusLine(Protocol protocol, int i2, String str) {
        this.f25184a = protocol;
        this.f25185b = i2;
        this.f25186c = str;
    }

    /* renamed from: a */
    public static StatusLine m14008a(String str) throws IOException {
        String str2;
        Protocol protocol = Protocol.HTTP_1_0;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
                }
                str2 = str.substring(i2 + 4);
            }
            return new StatusLine(protocol, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(C0000a.m14k("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25184a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f25185b);
        if (this.f25186c != null) {
            sb.append(' ');
            sb.append(this.f25186c);
        }
        return sb.toString();
    }
}
