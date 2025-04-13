package kotlin.p033io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Utils.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m31884d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements Function2 {
    static {
        new FilesKt__UtilsKt$copyRecursively$1();
    }

    public FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        IOException exception = (IOException) obj2;
        Intrinsics.m32179h((File) obj, "<anonymous parameter 0>");
        Intrinsics.m32179h(exception, "exception");
        throw exception;
    }
}
