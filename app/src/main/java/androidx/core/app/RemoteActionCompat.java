package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements VersionedParcelable {

    /* renamed from: a */
    @NonNull
    @RestrictTo
    public IconCompat f3263a;

    /* renamed from: b */
    @NonNull
    @RestrictTo
    public CharSequence f3264b;

    /* renamed from: c */
    @NonNull
    @RestrictTo
    public CharSequence f3265c;

    /* renamed from: d */
    @NonNull
    @RestrictTo
    public PendingIntent f3266d;

    /* renamed from: e */
    @RestrictTo
    public boolean f3267e;

    /* renamed from: f */
    @RestrictTo
    public boolean f3268f;

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static RemoteAction m1635a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @DoNotInline
        /* renamed from: b */
        public static PendingIntent m1636b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @DoNotInline
        /* renamed from: c */
        public static CharSequence m1637c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @DoNotInline
        /* renamed from: d */
        public static Icon m1638d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @DoNotInline
        /* renamed from: e */
        public static CharSequence m1639e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m1640f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @DoNotInline
        /* renamed from: g */
        public static void m1641g(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1642a(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1643b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    @RestrictTo
    public RemoteActionCompat() {
    }
}
