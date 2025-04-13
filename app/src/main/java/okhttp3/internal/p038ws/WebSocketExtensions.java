package okhttp3.internal.p038ws;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: WebSocketExtensions.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m31884d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @JvmField
    @Nullable
    public final Integer clientMaxWindowBits;

    @JvmField
    public final boolean clientNoContextTakeover;

    @JvmField
    public final boolean perMessageDeflate;

    @JvmField
    @Nullable
    public final Integer serverMaxWindowBits;

    @JvmField
    public final boolean serverNoContextTakeover;

    @JvmField
    public final boolean unknownValues;

    /* compiled from: WebSocketExtensions.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m31884d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final WebSocketExtensions parse(@NotNull Headers responseHeaders) throws IOException {
            Intrinsics.m32179h(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.m33927y(responseHeaders.name(i2), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String value = responseHeaders.value(i2);
                    int i3 = 0;
                    while (i3 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i3, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i3, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i3, delimiterOffset);
                        int i4 = delimiterOffset + 1;
                        if (StringsKt.m33927y(trimSubstring, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            while (i4 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i4, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i4, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i4, delimiterOffset3);
                                String m33887M = delimiterOffset3 < delimiterOffset2 ? StringsKt.m33887M(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), "\"") : null;
                                int i5 = delimiterOffset2 + 1;
                                if (StringsKt.m33927y(trimSubstring2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = m33887M != null ? StringsKt.m33910j0(m33887M) : null;
                                    if (num != null) {
                                        i4 = i5;
                                    }
                                    z4 = true;
                                    i4 = i5;
                                } else {
                                    if (StringsKt.m33927y(trimSubstring2, "client_no_context_takeover", true)) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (m33887M != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (StringsKt.m33927y(trimSubstring2, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = m33887M != null ? StringsKt.m33910j0(m33887M) : null;
                                        if (num2 != null) {
                                        }
                                        z4 = true;
                                    } else {
                                        if (StringsKt.m33927y(trimSubstring2, "server_no_context_takeover", true)) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (m33887M != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        z4 = true;
                                    }
                                    i4 = i5;
                                }
                            }
                            i3 = i4;
                            z = true;
                        } else {
                            i3 = i4;
                            z4 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i2 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i2 & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i2 & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i2 & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean perMessageDeflate, @Nullable Integer clientMaxWindowBits, boolean clientNoContextTakeover, @Nullable Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.m32174c(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.m32174c(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.perMessageDeflate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r2 = this.clientNoContextTakeover;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode + i3) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.serverNoContextTakeover;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode2 + i5) * 31;
        boolean z2 = this.unknownValues;
        return i6 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("WebSocketExtensions(perMessageDeflate=");
        m24u.append(this.perMessageDeflate);
        m24u.append(", clientMaxWindowBits=");
        m24u.append(this.clientMaxWindowBits);
        m24u.append(", clientNoContextTakeover=");
        m24u.append(this.clientNoContextTakeover);
        m24u.append(", serverMaxWindowBits=");
        m24u.append(this.serverMaxWindowBits);
        m24u.append(", serverNoContextTakeover=");
        m24u.append(this.serverNoContextTakeover);
        m24u.append(", unknownValues=");
        m24u.append(this.unknownValues);
        m24u.append(")");
        return m24u.toString();
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? false : z2, (i2 & 8) == 0 ? num2 : null, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4);
    }
}
