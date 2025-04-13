package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class DynamicColors {

    /* renamed from: a */
    public static final int[] f17884a = {C2507R.attr.dynamicColorThemeOverlay};

    /* renamed from: b */
    public static final DeviceSupportCondition f17885b;

    /* renamed from: c */
    @SuppressLint
    public static final DeviceSupportCondition f17886c;

    /* renamed from: d */
    public static final Map<String, DeviceSupportCondition> f17887d;

    /* renamed from: e */
    public static final Map<String, DeviceSupportCondition> f17888e;

    public interface DeviceSupportCondition {
    }

    public static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    public interface OnAppliedCallback {
    }

    public interface Precondition {
    }

    static {
        DeviceSupportCondition deviceSupportCondition = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
        };
        f17885b = deviceSupportCondition;
        DeviceSupportCondition deviceSupportCondition2 = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2
        };
        f17886c = deviceSupportCondition2;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", deviceSupportCondition);
        hashMap.put("google", deviceSupportCondition);
        hashMap.put("hmd global", deviceSupportCondition);
        hashMap.put("infinix", deviceSupportCondition);
        hashMap.put("infinix mobility limited", deviceSupportCondition);
        hashMap.put("itel", deviceSupportCondition);
        hashMap.put("kyocera", deviceSupportCondition);
        hashMap.put("lenovo", deviceSupportCondition);
        hashMap.put("lge", deviceSupportCondition);
        hashMap.put("motorola", deviceSupportCondition);
        hashMap.put("nothing", deviceSupportCondition);
        hashMap.put("oneplus", deviceSupportCondition);
        hashMap.put("oppo", deviceSupportCondition);
        hashMap.put("realme", deviceSupportCondition);
        hashMap.put("robolectric", deviceSupportCondition);
        hashMap.put("samsung", deviceSupportCondition2);
        hashMap.put("sharp", deviceSupportCondition);
        hashMap.put("sony", deviceSupportCondition);
        hashMap.put("tcl", deviceSupportCondition);
        hashMap.put("tecno", deviceSupportCondition);
        hashMap.put("tecno mobile limited", deviceSupportCondition);
        hashMap.put("vivo", deviceSupportCondition);
        hashMap.put("xiaomi", deviceSupportCondition);
        f17887d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", deviceSupportCondition);
        hashMap2.put("jio", deviceSupportCondition);
        f17888e = Collections.unmodifiableMap(hashMap2);
    }
}
