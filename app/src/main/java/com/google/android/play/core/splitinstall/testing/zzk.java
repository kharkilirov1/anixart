package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileFilter;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzk implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i2 = FakeSplitInstallManager.f20221k;
        return file.getName().endsWith(".apk");
    }
}
