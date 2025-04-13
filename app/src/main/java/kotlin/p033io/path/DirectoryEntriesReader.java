package kotlin.p033io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {

    /* renamed from: a */
    public final boolean f63281a;

    /* renamed from: b */
    @Nullable
    public PathNode f63282b;

    /* renamed from: c */
    @NotNull
    public ArrayDeque<PathNode> f63283c;

    @NotNull
    /* renamed from: a */
    public final List<PathNode> m32143a(@NotNull PathNode directoryNode) {
        Intrinsics.m32179h(directoryNode, "directoryNode");
        this.f63282b = directoryNode;
        Path path = directoryNode.f63289a;
        LinkFollowing linkFollowing = LinkFollowing.f63284a;
        Files.walkFileTree(path, this.f63281a ? LinkFollowing.f63288e : LinkFollowing.f63287d, 1, this);
        this.f63283c.removeFirst();
        ArrayDeque<PathNode> arrayDeque = this.f63283c;
        this.f63283c = new ArrayDeque<>();
        return arrayDeque;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes attrs) {
        Path dir = (Path) obj;
        Intrinsics.m32179h(dir, "dir");
        Intrinsics.m32179h(attrs, "attrs");
        this.f63283c.addLast(new PathNode(dir, attrs.fileKey(), this.f63282b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.m32178g(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Object obj, BasicFileAttributes attrs) {
        Path file = (Path) obj;
        Intrinsics.m32179h(file, "file");
        Intrinsics.m32179h(attrs, "attrs");
        this.f63283c.addLast(new PathNode(file, null, this.f63282b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        Intrinsics.m32178g(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
