package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Credentials.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m31884d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String basic(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.m32179h(username, "username");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(charset, "charset");
        return C0000a.m14k("Basic ", ByteString.f68753f.m34591c(username + ':' + password, charset).mo34574a());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            Intrinsics.m32178g(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }
}
