package com.google.android.gms.common.util;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {

    /* renamed from: a */
    public static final Method f15904a;

    /* renamed from: b */
    public static final Method f15905b;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f15904a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
        }
        f15905b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (PlatformVersion.m8245b()) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        if (PlatformVersion.m8245b()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        }
        if (PlatformVersion.m8245b()) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }
}
