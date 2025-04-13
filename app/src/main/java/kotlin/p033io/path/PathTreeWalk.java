package kotlin.p033io.path;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalPathApi
/* loaded from: classes3.dex */
public final class PathTreeWalk implements Sequence<Path> {
    /* renamed from: b */
    public static final LinkOption[] m32144b(PathTreeWalk pathTreeWalk) {
        Objects.requireNonNull(pathTreeWalk);
        LinkFollowing linkFollowing = LinkFollowing.f63284a;
        return ArraysKt.m31963m(null, PathWalkOption.FOLLOW_LINKS) ? LinkFollowing.f63286c : LinkFollowing.f63285b;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        return ArraysKt.m31963m(null, PathWalkOption.BREADTH_FIRST) ? SequencesKt.m33850r(new PathTreeWalk$bfsIterator$1(this, null)) : SequencesKt.m33850r(new PathTreeWalk$dfsIterator$1(this, null));
    }
}
