package okhttp3.internal.http;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: StatusLine.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m31884d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class StatusLine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;

    @JvmField
    public final int code;

    @JvmField
    @NotNull
    public final String message;

    @JvmField
    @NotNull
    public final Protocol protocol;

    /* compiled from: StatusLine.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m31884d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final StatusLine get(@NotNull Response response) {
            Intrinsics.m32179h(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        @NotNull
        public final StatusLine parse(@NotNull String statusLine) throws IOException {
            Protocol protocol;
            String str;
            Intrinsics.m32179h(statusLine, "statusLine");
            int i2 = 9;
            if (StringsKt.m33898X(statusLine, "HTTP/1.", false, 2, null)) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!StringsKt.m33898X(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (statusLine.length() < i3) {
                throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i2, i3);
                Intrinsics.m32178g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i3) {
                    str = "";
                } else {
                    if (statusLine.charAt(i3) != ' ') {
                        throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i2 + 4);
                    Intrinsics.m32178g(str, "(this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C0000a.m14k("Unexpected status line: ", statusLine));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StatusLine(@NotNull Protocol protocol, int i2, @NotNull String message) {
        Intrinsics.m32179h(protocol, "protocol");
        Intrinsics.m32179h(message, "message");
        this.protocol = protocol;
        this.code = i2;
        this.message = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
