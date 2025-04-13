package kotlin.script.experimental.jvm.util;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: jvmClasspathUtil.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"takeAndFilter", "", "Ljava/io/File;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class JvmClasspathUtilKt$scriptCompilationClasspathFromContextOrNull$1 extends Lambda implements Function1<List<? extends File>, List<? extends File>> {
    @Override // kotlin.jvm.functions.Function1
    public List<? extends File> invoke(List<? extends File> list) {
        List<? extends File> receiver$0 = list;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (receiver$0.isEmpty()) {
            return null;
        }
        throw null;
    }
}
