package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DefaultEmojiCompatConfig {

    @RestrictTo
    public static class DefaultEmojiCompatConfigFactory {

        /* renamed from: a */
        public final DefaultEmojiCompatConfigHelper f4000a;

        @RestrictTo
        public DefaultEmojiCompatConfigFactory(@Nullable DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper) {
            this.f4000a = Build.VERSION.SDK_INT >= 28 ? new DefaultEmojiCompatConfigHelper_API28() : new DefaultEmojiCompatConfigHelper_API19();
        }
    }

    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper {
        @Nullable
        /* renamed from: a */
        public ProviderInfo mo2792a(@NonNull ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        /* renamed from: b */
        public Signature[] mo2793b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        /* renamed from: c */
        public List<ResolveInfo> mo2794c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i2) {
            return Collections.emptyList();
        }
    }

    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @Nullable
        /* renamed from: a */
        public ProviderInfo mo2792a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @NonNull
        /* renamed from: c */
        public List<ResolveInfo> mo2794c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i2) {
            return packageManager.queryIntentContentProviders(intent, i2);
        }
    }

    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @NonNull
        /* renamed from: b */
        public Signature[] mo2793b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.FontRequestEmojiCompatConfig m2791a(@androidx.annotation.NonNull android.content.Context r8) {
        /*
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
            r1 = 0
            r0.<init>(r1)
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String r3 = "Package manager required to locate emoji font provider"
            androidx.core.util.Preconditions.m2032e(r2, r3)
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r3 = r0.f4000a
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "androidx.content.action.LOAD_EMOJI_FONT"
            r4.<init>(r5)
            r5 = 0
            java.util.List r3 = r3.mo2794c(r2, r4, r5)
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r6 = r0.f4000a
            android.content.pm.ProviderInfo r4 = r6.mo2792a(r4)
            r6 = 1
            if (r4 == 0) goto L40
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L40
            int r7 = r7.flags
            r7 = r7 & r6
            if (r7 != r6) goto L40
            goto L41
        L40:
            r6 = 0
        L41:
            if (r6 == 0) goto L21
            goto L45
        L44:
            r4 = r1
        L45:
            if (r4 != 0) goto L48
            goto L78
        L48:
            java.lang.String r3 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r0 = r0.f4000a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            android.content.pm.Signature[] r0 = r0.mo2793b(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
        L58:
            if (r5 >= r6) goto L66
            r7 = r0[r5]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            r2.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            int r5 = r5 + 1
            goto L58
        L66:
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            androidx.core.provider.FontRequest r2 = new androidx.core.provider.FontRequest     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r3, r4, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L72
            goto L79
        L72:
            r0 = move-exception
            java.lang.String r2 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r2, r0)
        L78:
            r2 = r1
        L79:
            if (r2 != 0) goto L7c
            goto L81
        L7c:
            androidx.emoji2.text.FontRequestEmojiCompatConfig r1 = new androidx.emoji2.text.FontRequestEmojiCompatConfig
            r1.<init>(r8, r2)
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.DefaultEmojiCompatConfig.m2791a(android.content.Context):androidx.emoji2.text.FontRequestEmojiCompatConfig");
    }
}
