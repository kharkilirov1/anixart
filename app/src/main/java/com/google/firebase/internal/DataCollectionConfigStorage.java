package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.firebase.events.Publisher;

/* loaded from: classes2.dex */
public class DataCollectionConfigStorage {

    /* renamed from: a */
    public final Context f23222a;

    /* renamed from: b */
    public final SharedPreferences f23223b;

    /* renamed from: c */
    public final Publisher f23224c;

    /* renamed from: d */
    public boolean f23225d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        context = Build.VERSION.SDK_INT >= 24 ? ContextCompat.m1669b(context) : context;
        this.f23222a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f23223b = sharedPreferences;
        this.f23224c = publisher;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.f23225d = z;
    }
}
