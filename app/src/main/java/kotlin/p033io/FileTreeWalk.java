package kotlin.p033io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FileTreeWalk implements Sequence<File> {

    /* compiled from: FileTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static abstract class DirectoryState extends WalkState {
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* renamed from: d */
        @NotNull
        public final ArrayDeque<WalkState> f63261d = new ArrayDeque<>();

        /* compiled from: FileTreeWalk.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public final class BottomUpDirectoryState extends DirectoryState {

            /* renamed from: b */
            public boolean f63263b;

            /* renamed from: c */
            @Nullable
            public File[] f63264c;

            /* renamed from: d */
            public int f63265d;

            /* renamed from: e */
            public boolean f63266e;

            /* renamed from: f */
            public final /* synthetic */ FileTreeWalkIterator f63267f;

            @Override // kotlin.io.FileTreeWalk.WalkState
            @Nullable
            /* renamed from: a */
            public File mo32139a() {
                if (!this.f63266e && this.f63264c == null) {
                    Objects.requireNonNull(FileTreeWalk.this);
                    File[] listFiles = this.f63273a.listFiles();
                    this.f63264c = listFiles;
                    if (listFiles == null) {
                        Objects.requireNonNull(FileTreeWalk.this);
                        this.f63266e = true;
                    }
                }
                File[] fileArr = this.f63264c;
                if (fileArr != null && this.f63265d < fileArr.length) {
                    Intrinsics.m32176e(fileArr);
                    int i2 = this.f63265d;
                    this.f63265d = i2 + 1;
                    return fileArr[i2];
                }
                if (this.f63263b) {
                    Objects.requireNonNull(FileTreeWalk.this);
                    return null;
                }
                this.f63263b = true;
                return this.f63273a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public final class SingleFileState extends WalkState {

            /* renamed from: b */
            public boolean f63268b;

            @Override // kotlin.io.FileTreeWalk.WalkState
            @Nullable
            /* renamed from: a */
            public File mo32139a() {
                if (this.f63268b) {
                    return null;
                }
                this.f63268b = true;
                return this.f63273a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public final class TopDownDirectoryState extends DirectoryState {

            /* renamed from: b */
            public boolean f63269b;

            /* renamed from: c */
            @Nullable
            public File[] f63270c;

            /* renamed from: d */
            public int f63271d;

            /* renamed from: e */
            public final /* synthetic */ FileTreeWalkIterator f63272e;

            @Override // kotlin.io.FileTreeWalk.WalkState
            @Nullable
            /* renamed from: a */
            public File mo32139a() {
                if (!this.f63269b) {
                    Objects.requireNonNull(FileTreeWalk.this);
                    this.f63269b = true;
                    return this.f63273a;
                }
                File[] fileArr = this.f63270c;
                if (fileArr != null && this.f63271d >= fileArr.length) {
                    Objects.requireNonNull(FileTreeWalk.this);
                    return null;
                }
                if (fileArr == null) {
                    File[] listFiles = this.f63273a.listFiles();
                    this.f63270c = listFiles;
                    if (listFiles == null) {
                        Objects.requireNonNull(FileTreeWalk.this);
                    }
                    File[] fileArr2 = this.f63270c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Objects.requireNonNull(FileTreeWalk.this);
                        return null;
                    }
                }
                File[] fileArr3 = this.f63270c;
                Intrinsics.m32176e(fileArr3);
                int i2 = this.f63271d;
                this.f63271d = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public FileTreeWalkIterator() {
            throw null;
        }

        @Override // kotlin.collections.AbstractIterator
        /* renamed from: a */
        public void mo16754a() {
            File file;
            while (true) {
                WalkState peek = this.f63261d.peek();
                file = null;
                if (peek == null) {
                    break;
                }
                File mo32139a = peek.mo32139a();
                if (mo32139a == null) {
                    this.f63261d.pop();
                } else {
                    if (!Intrinsics.m32174c(mo32139a, peek.f63273a) && mo32139a.isDirectory()) {
                        int size = this.f63261d.size();
                        Objects.requireNonNull(FileTreeWalk.this);
                        if (size < 0) {
                            Objects.requireNonNull(FileTreeWalk.this);
                            throw null;
                        }
                    }
                    file = mo32139a;
                }
            }
            if (file != null) {
                m31904c(file);
            } else {
                m31903b();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static abstract class WalkState {

        /* renamed from: a */
        @NotNull
        public final File f63273a;

        @Nullable
        /* renamed from: a */
        public abstract File mo32139a();
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        new FileTreeWalkIterator();
        throw null;
    }
}
