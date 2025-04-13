package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.l8 */
/* loaded from: classes2.dex */
public abstract class AbstractC4100l8 {

    /* renamed from: a */
    @NonNull
    private static final C3432L0 f45877a = new C3432L0();

    @RequiresApi
    /* renamed from: a */
    public static String[] m20355a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), (C3658U2.m19211a(24) ? RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST : 0) | RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            String[] strArr = packageInfo.applicationInfo.splitSourceDirs;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            String[] strArr2 = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr2 != null) {
                Collections.addAll(arrayList, strArr2);
            }
            ArrayList arrayList2 = new ArrayList(10);
            String str2 = packageInfo.applicationInfo.nativeLibraryDir;
            File parentFile = TextUtils.isEmpty(str2) ? null : new File(str2).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            return new String[]{TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }
}
