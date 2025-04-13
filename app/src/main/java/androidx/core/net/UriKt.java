package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Uri.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"core-ktx_release"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UriKt {
    @NotNull
    /* renamed from: a */
    public static final File m1939a(@NotNull Uri uri) {
        Intrinsics.m32179h(uri, "<this>");
        if (!Intrinsics.m32174c(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(C0000a.m12i("Uri lacks 'file' scheme: ", uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(C0000a.m12i("Uri path is null: ", uri).toString());
    }
}
