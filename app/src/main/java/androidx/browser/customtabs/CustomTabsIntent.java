package androidx.browser.customtabs;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.core.app.BundleCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class CustomTabsIntent {

    /* renamed from: a */
    @NonNull
    public final Intent f1733a;

    /* renamed from: b */
    @Nullable
    public final Bundle f1734b = null;

    public static final class Builder {

        /* renamed from: a */
        public final Intent f1735a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final CustomTabColorSchemeParams.Builder f1736b = new CustomTabColorSchemeParams.Builder();

        /* renamed from: c */
        public boolean f1737c = true;

        @NonNull
        /* renamed from: a */
        public CustomTabsIntent m1024a() {
            if (!this.f1735a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                BundleCompat.m1572b(bundle, "android.support.customtabs.extra.SESSION", null);
                this.f1735a.putExtras(bundle);
            }
            this.f1735a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1737c);
            Intent intent = this.f1735a;
            Integer num = this.f1736b.f1727a;
            Bundle bundle2 = new Bundle();
            if (num != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            intent.putExtras(bundle2);
            this.f1735a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new CustomTabsIntent(this.f1735a, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShareState {
    }

    public CustomTabsIntent(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.f1733a = intent;
    }
}
