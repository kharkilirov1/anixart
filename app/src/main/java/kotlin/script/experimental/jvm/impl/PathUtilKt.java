package kotlin.script.experimental.jvm.impl;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: pathUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-jvm"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PathUtilKt {
    @Nullable
    /* renamed from: a */
    public static final File m33816a(@NotNull URL url) {
        try {
            URI uri = url.toURI();
            Intrinsics.m32175d(uri, "toURI()");
            return new File(uri.getSchemeSpecificPart());
        } catch (URISyntaxException unused) {
            if (!Intrinsics.m32174c(url.getProtocol(), "file")) {
                return null;
            }
            return new File(url.getFile());
        }
    }
}
