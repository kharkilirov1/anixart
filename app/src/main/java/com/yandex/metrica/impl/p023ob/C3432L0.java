package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.L0 */
/* loaded from: classes2.dex */
public class C3432L0 {
    @Nullable
    /* renamed from: a */
    public File m18470a(@Nullable File file, @NonNull String str) {
        if (file == null) {
            return null;
        }
        return m18472b(file.getAbsoluteFile(), str);
    }

    @Nullable
    /* renamed from: b */
    public File m18471b(@NonNull Context context) {
        return m18469a(context, "YandexMetricaNativeCrashes");
    }

    @Nullable
    /* renamed from: a */
    public File m18468a(@NonNull Context context) {
        File parentFile;
        if (C3658U2.m19211a(24)) {
            parentFile = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            parentFile = filesDir == null ? null : filesDir.getParentFile();
        }
        if (parentFile == null) {
            return null;
        }
        File file = new File(parentFile, "lib");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    /* renamed from: b */
    public File m18472b(@Nullable File file, @NonNull String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }

    @Nullable
    /* renamed from: b */
    public String m18473b(@NonNull Context context, @NonNull String str) {
        File filesDir;
        if (C3658U2.m19211a(21)) {
            filesDir = context.getNoBackupFilesDir();
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        return filesDir.getAbsolutePath() + "/" + str;
    }

    @Nullable
    /* renamed from: a */
    public File m18469a(@NonNull Context context, @NonNull String str) {
        File filesDir;
        if (C3658U2.m19211a(21)) {
            filesDir = context.getNoBackupFilesDir();
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        return new File(filesDir, str);
    }
}
