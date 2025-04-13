package kotlin.p033io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/path/PathNode;", "", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class PathNode {

    /* renamed from: a */
    @NotNull
    public final Path f63289a;

    /* renamed from: b */
    @Nullable
    public final Object f63290b;

    /* renamed from: c */
    @Nullable
    public final PathNode f63291c;

    /* renamed from: d */
    @Nullable
    public Iterator<PathNode> f63292d;

    public PathNode(@NotNull Path path, @Nullable Object obj, @Nullable PathNode pathNode) {
        Intrinsics.m32179h(path, "path");
        this.f63289a = path;
        this.f63290b = obj;
        this.f63291c = pathNode;
    }
}
