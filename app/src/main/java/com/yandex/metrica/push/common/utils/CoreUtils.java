package com.yandex.metrica.push.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public class CoreUtils {
    public static <T> void accessSystemServiceSafely(@NonNull ConsumerWithThrowable<T> consumerWithThrowable, @Nullable T t, @NonNull String str, @NonNull String str2) {
        if (t == null) {
            TrackersHub.getInstance().reportEvent(str2 + " is null.");
            return;
        }
        try {
            consumerWithThrowable.consume(t);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Exception while " + str, th);
        }
    }

    @Nullable
    public static String extractRootElement(@NonNull Bundle bundle) {
        return bundle.getString("yamp");
    }

    @NonNull
    public static Bundle fromMapToBundle(@Nullable Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    public static int getIdentifierForType(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static Bundle getMetaData(@NonNull Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String getStringFromMetaData(@NonNull Context context, @NonNull String str) {
        Bundle metaData = getMetaData(context);
        String string = metaData == null ? null : metaData.getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    @Nullable
    public static String getStringFromResources(@NonNull Context context, @NonNull String str) {
        try {
            return context.getString(getIdentifierForType(context, str, "string"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public static String getStringOrOtherFromMetaData(@NonNull Context context, @NonNull String str) {
        Bundle metaData = getMetaData(context);
        Object obj = (metaData != null && metaData.containsKey(str)) ? metaData.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static boolean isEmpty(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(@Nullable String str) {
        return !isEmpty(str);
    }

    public static boolean isNotificationRelatedToSDK(@NonNull Bundle bundle) {
        return extractRootElement(bundle) != null;
    }
}
