package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ProcessUtils {

    /* renamed from: a */
    @Nullable
    public static String f15902a;

    /* renamed from: b */
    public static int f15903b;

    @androidx.annotation.Nullable
    @KeepForSdk
    /* renamed from: a */
    public static String m8246a() {
        BufferedReader bufferedReader;
        if (f15902a == null) {
            int i2 = f15903b;
            if (i2 == 0) {
                i2 = Process.myPid();
                f15903b = i2;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            try {
                if (i2 > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(25);
                        sb.append("/proc/");
                        sb.append(i2);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        Objects.requireNonNull(readLine, "null reference");
                        str = readLine.trim();
                        bufferedReader.close();
                    } catch (IOException unused2) {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        f15902a = str;
                        return f15902a;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException unused4) {
            }
            f15902a = str;
        }
        return f15902a;
    }
}
