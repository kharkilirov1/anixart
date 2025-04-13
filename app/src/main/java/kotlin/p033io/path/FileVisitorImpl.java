package kotlin.p033io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileVisitorBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class FileVisitorImpl extends SimpleFileVisitor<Path> {
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        Path dir = (Path) obj;
        Intrinsics.m32179h(dir, "dir");
        FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
        Intrinsics.m32178g(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return postVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes attrs) {
        Path dir = (Path) obj;
        Intrinsics.m32179h(dir, "dir");
        Intrinsics.m32179h(attrs, "attrs");
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.m32178g(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Object obj, BasicFileAttributes attrs) {
        Path file = (Path) obj;
        Intrinsics.m32179h(file, "file");
        Intrinsics.m32179h(attrs, "attrs");
        FileVisitResult visitFile = super.visitFile(file, attrs);
        Intrinsics.m32178g(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(Object obj, IOException exc) {
        Path file = (Path) obj;
        Intrinsics.m32179h(file, "file");
        Intrinsics.m32179h(exc, "exc");
        FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
        Intrinsics.m32178g(visitFileFailed, "super.visitFileFailed(file, exc)");
        return visitFileFailed;
    }
}
