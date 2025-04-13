package com.bumptech.glide.load.engine.executor;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class RuntimeCompat {

    /* renamed from: com.bumptech.glide.load.engine.executor.RuntimeCompat$1 */
    class C08081 implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f8413a;

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f8413a.matcher(str).matches();
        }
    }
}
