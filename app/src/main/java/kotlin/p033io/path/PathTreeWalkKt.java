package kotlin.p033io.path;

import java.io.IOException;
import java.nio.file.Files;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib-jdk7"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class PathTreeWalkKt {
    /* renamed from: a */
    public static final boolean m32145a(PathNode pathNode) {
        Object obj;
        for (PathNode pathNode2 = pathNode.f63291c; pathNode2 != null; pathNode2 = pathNode2.f63291c) {
            Object obj2 = pathNode2.f63290b;
            if (obj2 == null || (obj = pathNode.f63290b) == null) {
                try {
                    if (Files.isSameFile(pathNode2.f63289a, pathNode.f63289a)) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (Intrinsics.m32174c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }
}
