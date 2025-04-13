package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Header.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m31884d2 = {"Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class Header {

    @JvmField
    @NotNull
    public static final ByteString PSEUDO_PREFIX;

    @JvmField
    @NotNull
    public static final ByteString RESPONSE_STATUS;

    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @JvmField
    @NotNull
    public static final ByteString TARGET_AUTHORITY;

    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @JvmField
    @NotNull
    public static final ByteString TARGET_METHOD;

    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";

    @JvmField
    @NotNull
    public static final ByteString TARGET_PATH;

    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";

    @JvmField
    @NotNull
    public static final ByteString TARGET_SCHEME;

    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    @JvmField
    public final int hpackSize;

    @JvmField
    @NotNull
    public final ByteString name;

    @JvmField
    @NotNull
    public final ByteString value;

    static {
        ByteString.Companion companion = ByteString.f68753f;
        PSEUDO_PREFIX = companion.m34592d(":");
        RESPONSE_STATUS = companion.m34592d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = companion.m34592d(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.m34592d(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.m34592d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.m34592d(TARGET_AUTHORITY_UTF8);
    }

    public Header(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.mo34576d() + 32 + value.mo34576d();
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            byteString = header.name;
        }
        if ((i2 & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ByteString getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ByteString getValue() {
        return this.value;
    }

    @NotNull
    public final Header copy(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.m32174c(this.name, header.name) && Intrinsics.m32174c(this.value, header.value);
    }

    public int hashCode() {
        ByteString byteString = this.name;
        int hashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.value;
        return hashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return this.name.m34586p() + ": " + this.value.m34586p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.f68753f
            okio.ByteString r2 = r0.m34592d(r2)
            okio.ByteString r3 = r0.m34592d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull ByteString name, @NotNull String value) {
        this(name, ByteString.f68753f.m34592d(value));
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
    }
}
