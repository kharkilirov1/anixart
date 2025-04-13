package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class Files {

    /* renamed from: com.google.common.io.Files$1 */
    class C18961 implements LineProcessor<List<String>> {
        public C18961() {
            new ArrayList();
        }
    }

    /* renamed from: com.google.common.io.Files$2 */
    public class C18972 implements SuccessorsFunction<File> {
        @Override // com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Iterable<? extends File> mo11982d(File file) {
            File[] listFiles;
            File file2 = file;
            return (!file2.isDirectory() || (listFiles = file2.listFiles()) == null) ? ImmutableList.m11627D() : Collections.unmodifiableList(Arrays.asList(listFiles));
        }
    }

    public static final class FileByteSink extends ByteSink {
        public String toString() {
            return "Files.asByteSink(null, null)";
        }
    }

    public static final class FileByteSource extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            return new FileInputStream((File) null);
        }

        public String toString() {
            return "Files.asByteSource(null)";
        }
    }

    public enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        };

        FilePredicate(C18961 c18961) {
        }
    }
}
