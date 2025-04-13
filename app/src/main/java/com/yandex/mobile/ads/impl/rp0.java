package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rp0 {

    /* renamed from: a */
    @Deprecated
    @NotNull
    private static final List<String> f54386a = CollectionsKt.m31994G("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    /* renamed from: a */
    public static void m27965a(@NotNull Context context) throws d60 {
        Intrinsics.m32179h(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            List m32031l0 = CollectionsKt.m32031l0(f54386a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                ArrayList arrayList = (ArrayList) m32031l0;
                arrayList.removeAll(ArraysKt.m31952b0(strArr));
                if (arrayList.size() <= 0) {
                    return;
                }
                String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{m32031l0}, 1));
                Intrinsics.m32178g(format, "format(format, *args)");
                throw new d60(format);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
