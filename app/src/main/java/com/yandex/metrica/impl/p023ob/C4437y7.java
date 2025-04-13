package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.y7 */
/* loaded from: classes2.dex */
public final class C4437y7 implements InterfaceC3920ea<String, byte[]> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: a */
    public String mo17817a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] mo17818b(@NotNull String str) {
        if (Intrinsics.m32174c(PluginErrorDetails.Platform.NATIVE, str)) {
            str = "JVM";
        }
        Charset charset = Charsets.f66855b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
