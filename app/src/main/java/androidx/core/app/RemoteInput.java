package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemoteInput {

    /* renamed from: a */
    public final String f3269a;

    /* renamed from: b */
    public final CharSequence f3270b;

    /* renamed from: c */
    public final CharSequence[] f3271c = null;

    /* renamed from: d */
    public final boolean f3272d;

    /* renamed from: e */
    public final int f3273e;

    /* renamed from: f */
    public final Bundle f3274f;

    /* renamed from: g */
    public final Set<String> f3275g;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static ClipData m1646a(Intent intent) {
            return intent.getClipData();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1647b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    @RequiresApi
    public static class Api20Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1648a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        @DoNotInline
        /* renamed from: b */
        public static Bundle m1649b(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1650a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.m1644a(remoteInput), intent, map);
        }

        @DoNotInline
        /* renamed from: b */
        public static Set<String> m1651b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        /* renamed from: c */
        public static Map<String, Uri> m1652c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @DoNotInline
        /* renamed from: d */
        public static RemoteInput.Builder m1653d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1654a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1655b(Intent intent, int i2) {
            android.app.RemoteInput.setResultsSource(intent, i2);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1656a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* renamed from: b */
        public static RemoteInput.Builder m1657b(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public final String f3276a;

        /* renamed from: d */
        public CharSequence f3279d;

        /* renamed from: b */
        public final Set<String> f3277b = new HashSet();

        /* renamed from: c */
        public final Bundle f3278c = new Bundle();

        /* renamed from: e */
        public boolean f3280e = true;

        public Builder(@NonNull String str) {
            this.f3276a = str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i2, Bundle bundle, Set<String> set) {
        this.f3269a = str;
        this.f3270b = charSequence;
        this.f3272d = z;
        this.f3273e = i2;
        this.f3274f = bundle;
        this.f3275g = set;
        if (i2 == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    @RequiresApi
    /* renamed from: a */
    public static android.app.RemoteInput m1644a(RemoteInput remoteInput) {
        Set<String> set;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.f3269a).setLabel(remoteInput.f3270b).setChoices(remoteInput.f3271c).setAllowFreeFormInput(remoteInput.f3272d).addExtras(remoteInput.f3274f);
        if (Build.VERSION.SDK_INT >= 26 && (set = remoteInput.f3275g) != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                Api26Impl.m1653d(addExtras, it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m1657b(addExtras, remoteInput.f3273e);
        }
        return addExtras.build();
    }

    @Nullable
    /* renamed from: b */
    public static Bundle m1645b(@NonNull Intent intent) {
        return Api20Impl.m1649b(intent);
    }
}
