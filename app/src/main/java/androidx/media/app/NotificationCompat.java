package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class NotificationCompat {

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m3312a(RemoteViews remoteViews, int i2, CharSequence charSequence) {
            remoteViews.setContentDescription(i2, charSequence);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static Notification.MediaStyle m3313a() {
            return new Notification.MediaStyle();
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.MediaStyle m3314b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                m3317e(mediaStyle, iArr);
            }
            if (token != null) {
                m3315c(mediaStyle, (MediaSession.Token) token.f155c);
            }
            return mediaStyle;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m3315c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m3316d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m3317e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static Notification.DecoratedMediaCustomViewStyle m3318a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                Api21Impl.m3316d(notificationBuilderWithBuilderAccessor.mo1596a(), Api21Impl.m3314b(Api24Impl.m3318a(), null, null));
            } else {
                Api21Impl.m3316d(notificationBuilderWithBuilderAccessor.mo1596a(), Api21Impl.m3314b(Api21Impl.m3313a(), null, null));
            }
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: d */
        public RemoteViews mo1616d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            Objects.requireNonNull(this.f3208a);
            Objects.requireNonNull(this.f3208a);
            return null;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: e */
        public RemoteViews mo1617e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            Objects.requireNonNull(this.f3208a);
            Objects.requireNonNull(this.f3208a);
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: f */
        public RemoteViews mo1618f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            Objects.requireNonNull(this.f3208a);
            Objects.requireNonNull(this.f3208a);
            return null;
        }
    }

    public static class MediaStyle extends NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Api21Impl.m3316d(notificationBuilderWithBuilderAccessor.mo1596a(), Api21Impl.m3314b(Api21Impl.m3313a(), null, null));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: d */
        public RemoteViews mo1616d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: e */
        public RemoteViews mo1617e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }
}
