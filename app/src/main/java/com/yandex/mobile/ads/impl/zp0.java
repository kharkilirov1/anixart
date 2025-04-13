package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zp0 {

    /* renamed from: a */
    private static final Comparator<ScanResult> f57280a = new C6135a();

    /* renamed from: com.yandex.mobile.ads.impl.zp0$a */
    public class C6135a implements Comparator<ScanResult> {
        @Override // java.util.Comparator
        public final int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult.level - scanResult2.level;
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m30264a(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 0 ? activeNetworkInfo.getTypeName() : activeNetworkInfo.getSubtypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Point m30265b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @SuppressLint
    /* renamed from: c */
    public static String m30266c(Context context) {
        WifiManager wifiManager;
        try {
            wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused) {
        }
        if (!wifiManager.isWifiEnabled()) {
            return null;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        Object obj = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
        int i2 = 0;
        if (obj == null) {
            obj = new Object[0];
        }
        ScanResult[] scanResultArr = (ScanResult[]) obj;
        Arrays.sort(scanResultArr, Collections.reverseOrder(f57280a));
        if (scanResultArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int min = Math.min(3, scanResultArr.length);
            while (i2 < min) {
                sb.append(scanResultArr[i2].BSSID);
                sb.append(",");
                sb.append(scanResultArr[i2].level);
                i2++;
                sb.append(i2 < min ? ";" : "");
            }
            return sb.toString();
        }
        return null;
    }
}
