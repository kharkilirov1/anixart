package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class NotificationCompat {

    public static class Action {

        /* renamed from: a */
        public final Bundle f3146a;

        /* renamed from: b */
        @Nullable
        public IconCompat f3147b;

        /* renamed from: c */
        public final RemoteInput[] f3148c;

        /* renamed from: d */
        public final RemoteInput[] f3149d;

        /* renamed from: e */
        public boolean f3150e;

        /* renamed from: f */
        public boolean f3151f;

        /* renamed from: g */
        public final int f3152g;

        /* renamed from: h */
        public final boolean f3153h;

        /* renamed from: i */
        @Deprecated
        public int f3154i;

        /* renamed from: j */
        public CharSequence f3155j;

        /* renamed from: k */
        public PendingIntent f3156k;

        /* renamed from: l */
        public boolean f3157l;

        public static final class Builder {

            /* renamed from: a */
            public final IconCompat f3158a;

            /* renamed from: b */
            public final CharSequence f3159b;

            /* renamed from: c */
            public final PendingIntent f3160c;

            /* renamed from: d */
            public boolean f3161d;

            /* renamed from: e */
            public final Bundle f3162e;

            /* renamed from: f */
            public ArrayList<RemoteInput> f3163f;

            /* renamed from: g */
            public int f3164g;

            /* renamed from: h */
            public boolean f3165h;

            /* renamed from: i */
            public boolean f3166i;

            /* renamed from: j */
            public boolean f3167j;

            public Builder(int i2, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                IconCompat m1865f = i2 == 0 ? null : IconCompat.m1865f(null, "", i2);
                Bundle bundle = new Bundle();
                this.f3161d = true;
                this.f3165h = true;
                this.f3158a = m1865f;
                this.f3159b = Builder.m1607b(charSequence);
                this.f3160c = pendingIntent;
                this.f3162e = bundle;
                this.f3163f = null;
                this.f3161d = true;
                this.f3164g = 0;
                this.f3165h = true;
                this.f3166i = false;
                this.f3167j = false;
            }
        }

        public interface Extender {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {

            /* renamed from: a */
            public int f3168a = 1;

            /* renamed from: b */
            public CharSequence f3169b;

            /* renamed from: c */
            public CharSequence f3170c;

            /* renamed from: d */
            public CharSequence f3171d;

            @NonNull
            public Object clone() throws CloneNotSupportedException {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.f3168a = this.f3168a;
                wearableExtender.f3169b = this.f3169b;
                wearableExtender.f3170c = this.f3170c;
                wearableExtender.f3171d = this.f3171d;
                return wearableExtender;
            }
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this.f3151f = true;
            this.f3147b = iconCompat;
            if (iconCompat != null && iconCompat.m1870j() == 2) {
                this.f3154i = iconCompat.m1868g();
            }
            this.f3155j = Builder.m1607b(charSequence);
            this.f3156k = pendingIntent;
            this.f3146a = bundle == null ? new Bundle() : bundle;
            this.f3148c = remoteInputArr;
            this.f3149d = remoteInputArr2;
            this.f3150e = z;
            this.f3152g = i2;
            this.f3151f = z2;
            this.f3153h = z3;
            this.f3157l = z4;
        }

        @Nullable
        /* renamed from: a */
        public IconCompat m1597a() {
            int i2;
            if (this.f3147b == null && (i2 = this.f3154i) != 0) {
                this.f3147b = IconCompat.m1865f(null, "", i2);
            }
            return this.f3147b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {

        /* renamed from: b */
        public Bitmap f3172b;

        /* renamed from: c */
        public IconCompat f3173c;

        /* renamed from: d */
        public boolean f3174d;

        /* renamed from: e */
        public boolean f3175e;

        @RequiresApi
        public static class Api16Impl {
            private Api16Impl() {
            }

            @RequiresApi
            /* renamed from: a */
            public static void m1601a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }
        }

        @RequiresApi
        public static class Api23Impl {
            private Api23Impl() {
            }

            @RequiresApi
            /* renamed from: a */
            public static void m1602a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi
        public static class Api31Impl {
            private Api31Impl() {
            }

            @RequiresApi
            /* renamed from: a */
            public static void m1603a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi
            /* renamed from: b */
            public static void m1604b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Bitmap m1864e;
            int i2 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b).setBigContentTitle(null).bigPicture(this.f3172b);
            if (this.f3174d) {
                IconCompat iconCompat = this.f3173c;
                if (iconCompat == null) {
                    Api16Impl.m1601a(bigPicture, null);
                } else if (i2 >= 23) {
                    Api23Impl.m1602a(bigPicture, iconCompat.m1874n(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3223a));
                } else if (iconCompat.m1870j() == 1) {
                    IconCompat iconCompat2 = this.f3173c;
                    int i3 = iconCompat2.f3401a;
                    if (i3 == -1 && i2 >= 23) {
                        Object obj = iconCompat2.f3402b;
                        m1864e = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i3 == 1) {
                        m1864e = (Bitmap) iconCompat2.f3402b;
                    } else {
                        if (i3 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        m1864e = IconCompat.m1864e((Bitmap) iconCompat2.f3402b, true);
                    }
                    Api16Impl.m1601a(bigPicture, m1864e);
                } else {
                    Api16Impl.m1601a(bigPicture, null);
                }
            }
            if (i2 >= 31) {
                Api31Impl.m1604b(bigPicture, this.f3175e);
                Api31Impl.m1603a(bigPicture, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @NonNull
        /* renamed from: h */
        public BigPictureStyle m1600h(@Nullable Bitmap bitmap) {
            this.f3173c = null;
            this.f3174d = true;
            return this;
        }
    }

    public static class BigTextStyle extends Style {

        /* renamed from: b */
        public CharSequence f3176b;

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: a */
        public void mo1605a(@NonNull Bundle bundle) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b).setBigContentTitle(null).bigText(this.f3176b);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @NonNull
        /* renamed from: h */
        public BigTextStyle m1606h(@Nullable CharSequence charSequence) {
            this.f3176b = Builder.m1607b(charSequence);
            return this;
        }
    }

    public static final class BubbleMetadata {

        @RequiresApi
        public static class Api29Impl {
            private Api29Impl() {
            }
        }

        @RequiresApi
        public static class Api30Impl {
            private Api30Impl() {
            }
        }

        public static final class Builder {
            @Deprecated
            public Builder() {
            }
        }
    }

    public static class Builder {

        /* renamed from: A */
        @Deprecated
        public ArrayList<String> f3177A;

        /* renamed from: a */
        @RestrictTo
        public Context f3178a;

        /* renamed from: e */
        public CharSequence f3182e;

        /* renamed from: f */
        public CharSequence f3183f;

        /* renamed from: g */
        public PendingIntent f3184g;

        /* renamed from: h */
        public Bitmap f3185h;

        /* renamed from: i */
        public CharSequence f3186i;

        /* renamed from: j */
        public int f3187j;

        /* renamed from: k */
        public int f3188k;

        /* renamed from: m */
        public Style f3190m;

        /* renamed from: n */
        public CharSequence f3191n;

        /* renamed from: o */
        public String f3192o;

        /* renamed from: p */
        public boolean f3193p;

        /* renamed from: q */
        public String f3194q;

        /* renamed from: s */
        public String f3196s;

        /* renamed from: t */
        public Bundle f3197t;

        /* renamed from: w */
        public String f3200w;

        /* renamed from: x */
        public long f3201x;

        /* renamed from: y */
        public boolean f3202y;

        /* renamed from: z */
        public Notification f3203z;

        /* renamed from: b */
        @RestrictTo
        public ArrayList<Action> f3179b = new ArrayList<>();

        /* renamed from: c */
        @NonNull
        @RestrictTo
        public ArrayList<Person> f3180c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<Action> f3181d = new ArrayList<>();

        /* renamed from: l */
        public boolean f3189l = true;

        /* renamed from: r */
        public boolean f3195r = false;

        /* renamed from: u */
        public int f3198u = 0;

        /* renamed from: v */
        public int f3199v = 0;

        public Builder(@NonNull Context context, @NonNull String str) {
            Notification notification = new Notification();
            this.f3203z = notification;
            this.f3178a = context;
            this.f3200w = str;
            notification.when = System.currentTimeMillis();
            this.f3203z.audioStreamType = -1;
            this.f3188k = 0;
            this.f3177A = new ArrayList<>();
            this.f3202y = true;
        }

        @Nullable
        /* renamed from: b */
        public static CharSequence m1607b(@Nullable CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @NonNull
        /* renamed from: a */
        public Notification m1608a() {
            Notification build;
            Bundle bundle;
            RemoteViews mo1618f;
            RemoteViews mo1616d;
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = notificationCompatBuilder.f3225c.f3190m;
            if (style != null) {
                style.mo1598b(notificationCompatBuilder);
            }
            RemoteViews mo1617e = style != null ? style.mo1617e(notificationCompatBuilder) : null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                build = notificationCompatBuilder.f3224b.build();
            } else if (i2 >= 24) {
                build = notificationCompatBuilder.f3224b.build();
            } else {
                notificationCompatBuilder.f3224b.setExtras(notificationCompatBuilder.f3227e);
                build = notificationCompatBuilder.f3224b.build();
            }
            if (mo1617e != null) {
                build.contentView = mo1617e;
            } else {
                Objects.requireNonNull(notificationCompatBuilder.f3225c);
            }
            if (style != null && (mo1616d = style.mo1616d(notificationCompatBuilder)) != null) {
                build.bigContentView = mo1616d;
            }
            if (style != null && (mo1618f = notificationCompatBuilder.f3225c.f3190m.mo1618f(notificationCompatBuilder)) != null) {
                build.headsUpContentView = mo1618f;
            }
            if (style != null && (bundle = build.extras) != null) {
                style.mo1605a(bundle);
            }
            return build;
        }

        @NonNull
        /* renamed from: c */
        public Builder m1609c(@Nullable CharSequence charSequence) {
            this.f3183f = m1607b(charSequence);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder m1610d(@Nullable CharSequence charSequence) {
            this.f3182e = m1607b(charSequence);
            return this;
        }

        /* renamed from: e */
        public final void m1611e(int i2, boolean z) {
            if (z) {
                Notification notification = this.f3203z;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.f3203z;
                notification2.flags = (~i2) & notification2.flags;
            }
        }

        @NonNull
        /* renamed from: f */
        public Builder m1612f(@Nullable Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f3178a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C2507R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C2507R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            this.f3185h = bitmap;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public Builder m1613g(@ColorInt int i2, int i3, int i4) {
            Notification notification = this.f3203z;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        /* renamed from: h */
        public Builder m1614h(@Nullable Uri uri) {
            Notification notification = this.f3203z;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @NonNull
        /* renamed from: i */
        public Builder m1615i(@Nullable CharSequence charSequence) {
            this.f3203z.tickerText = m1607b(charSequence);
            return this;
        }
    }

    public static final class CarExtender implements Extender {

        @Deprecated
        public static class UnreadConversation {

            public static class Builder {
            }
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b.setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
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

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: e */
        public RemoteViews mo1617e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
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

    public interface Extender {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {

        /* renamed from: b */
        public ArrayList<CharSequence> f3204b = new ArrayList<>();

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b).setBigContentTitle(null);
            Iterator<CharSequence> it = this.f3204b.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public static class MessagingStyle extends Style {

        /* renamed from: b */
        public final List<Message> f3205b = new ArrayList();

        /* renamed from: c */
        public final List<Message> f3206c = new ArrayList();

        /* renamed from: d */
        @Nullable
        public Boolean f3207d;

        public static final class Message {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* renamed from: a */
        public void mo1605a(@NonNull Bundle bundle) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$MessagingStyle");
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Boolean bool;
            Message message;
            Builder builder = this.f3208a;
            this.f3207d = Boolean.valueOf(((builder == null || builder.f3178a.getApplicationInfo().targetSdkVersion >= 28 || this.f3207d != null) && (bool = this.f3207d) != null) ? bool.booleanValue() : false);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                if (i2 < 28) {
                    throw null;
                }
                throw null;
            }
            int size = this.f3205b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    Objects.requireNonNull(this.f3205b.get(size));
                }
            }
            if (this.f3205b.isEmpty()) {
                message = null;
            } else {
                message = this.f3205b.get(r0.size() - 1);
            }
            if (message != null) {
                ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b.setContentTitle("");
            }
            if (message != null) {
                ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b.setContentText(null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int size2 = this.f3205b.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else {
                    Objects.requireNonNull(this.f3205b.get(size2));
                }
            }
            int size3 = this.f3205b.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f3224b).setBigContentTitle(null).bigText(spannableStringBuilder);
                    return;
                }
                Objects.requireNonNull(this.f3205b.get(size3));
                if (size3 != this.f3205b.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, (CharSequence) null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StreamType {
    }

    public static abstract class Style {

        /* renamed from: a */
        @RestrictTo
        public Builder f3208a;

        @RestrictTo
        /* renamed from: a */
        public void mo1605a(@NonNull Bundle bundle) {
            String mo1599c = mo1599c();
            if (mo1599c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo1599c);
            }
        }

        @RestrictTo
        /* renamed from: b */
        public void mo1598b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @Nullable
        @RestrictTo
        /* renamed from: c */
        public String mo1599c() {
            return null;
        }

        @RestrictTo
        /* renamed from: d */
        public RemoteViews mo1616d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo
        /* renamed from: e */
        public RemoteViews mo1617e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo
        /* renamed from: f */
        public RemoteViews mo1618f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* renamed from: g */
        public void m1619g(@Nullable Builder builder) {
            if (this.f3208a != builder) {
                this.f3208a = builder;
                if (builder.f3190m != this) {
                    builder.f3190m = this;
                    m1619g(builder);
                }
            }
        }
    }

    public static final class WearableExtender implements Extender {

        /* renamed from: c */
        public PendingIntent f3211c;

        /* renamed from: e */
        public Bitmap f3213e;

        /* renamed from: f */
        public int f3214f;

        /* renamed from: j */
        public int f3218j;

        /* renamed from: l */
        public int f3220l;

        /* renamed from: m */
        public String f3221m;

        /* renamed from: n */
        public String f3222n;

        /* renamed from: a */
        public ArrayList<Action> f3209a = new ArrayList<>();

        /* renamed from: b */
        public int f3210b = 1;

        /* renamed from: d */
        public ArrayList<Notification> f3212d = new ArrayList<>();

        /* renamed from: g */
        public int f3215g = 8388613;

        /* renamed from: h */
        public int f3216h = -1;

        /* renamed from: i */
        public int f3217i = 0;

        /* renamed from: k */
        public int f3219k = 80;

        @NonNull
        public Object clone() throws CloneNotSupportedException {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f3209a = new ArrayList<>(this.f3209a);
            wearableExtender.f3210b = this.f3210b;
            wearableExtender.f3211c = this.f3211c;
            wearableExtender.f3212d = new ArrayList<>(this.f3212d);
            wearableExtender.f3213e = this.f3213e;
            wearableExtender.f3214f = this.f3214f;
            wearableExtender.f3215g = this.f3215g;
            wearableExtender.f3216h = this.f3216h;
            wearableExtender.f3217i = this.f3217i;
            wearableExtender.f3218j = this.f3218j;
            wearableExtender.f3219k = this.f3219k;
            wearableExtender.f3220l = this.f3220l;
            wearableExtender.f3221m = this.f3221m;
            wearableExtender.f3222n = this.f3222n;
            return wearableExtender;
        }
    }

    @Deprecated
    public NotificationCompat() {
    }
}
