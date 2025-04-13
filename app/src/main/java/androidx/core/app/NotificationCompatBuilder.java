package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a */
    public final Context f3223a;

    /* renamed from: b */
    public final Notification.Builder f3224b;

    /* renamed from: c */
    public final NotificationCompat.Builder f3225c;

    /* renamed from: d */
    public final List<Bundle> f3226d = new ArrayList();

    /* renamed from: e */
    public final Bundle f3227e = new Bundle();

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        this.f3225c = builder;
        this.f3223a = builder.f3178a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3224b = new Notification.Builder(builder.f3178a, builder.f3200w);
        } else {
            this.f3224b = new Notification.Builder(builder.f3178a);
        }
        Notification notification = builder.f3203z;
        int i2 = 0;
        this.f3224b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.f3182e).setContentText(builder.f3183f).setContentInfo(builder.f3186i).setContentIntent(builder.f3184g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(builder.f3185h).setNumber(builder.f3187j).setProgress(0, 0, false);
        this.f3224b.setSubText(builder.f3191n).setUsesChronometer(false).setPriority(builder.f3188k);
        Iterator<NotificationCompat.Action> it = builder.f3179b.iterator();
        while (it.hasNext()) {
            NotificationCompat.Action next = it.next();
            int i3 = Build.VERSION.SDK_INT;
            IconCompat m1597a = next.m1597a();
            Notification.Action.Builder builder2 = i3 >= 23 ? new Notification.Action.Builder(m1597a != null ? m1597a.m1873m() : null, next.f3155j, next.f3156k) : new Notification.Action.Builder(m1597a != null ? m1597a.m1868g() : 0, next.f3155j, next.f3156k);
            RemoteInput[] remoteInputArr = next.f3148c;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[length];
                while (i2 < remoteInputArr.length) {
                    remoteInputArr2[i2] = RemoteInput.m1644a(remoteInputArr[i2]);
                    i2++;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    builder2.addRemoteInput(remoteInputArr2[i4]);
                }
            }
            Bundle bundle = next.f3146a != null ? new Bundle(next.f3146a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", next.f3150e);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                builder2.setAllowGeneratedReplies(next.f3150e);
            }
            bundle.putInt("android.support.action.semanticAction", next.f3152g);
            if (i5 >= 28) {
                builder2.setSemanticAction(next.f3152g);
            }
            if (i5 >= 29) {
                builder2.setContextual(next.f3153h);
            }
            if (i5 >= 31) {
                builder2.setAuthenticationRequired(next.f3157l);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", next.f3151f);
            builder2.addExtras(bundle);
            this.f3224b.addAction(builder2.build());
            i2 = 0;
        }
        Bundle bundle2 = builder.f3197t;
        if (bundle2 != null) {
            this.f3227e.putAll(bundle2);
        }
        int i6 = Build.VERSION.SDK_INT;
        this.f3224b.setShowWhen(builder.f3189l);
        this.f3224b.setLocalOnly(builder.f3195r).setGroup(builder.f3192o).setGroupSummary(builder.f3193p).setSortKey(builder.f3194q);
        this.f3224b.setCategory(builder.f3196s).setColor(builder.f3198u).setVisibility(builder.f3199v).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        List m1620b = i6 < 28 ? m1620b(m1621c(builder.f3180c), builder.f3177A) : builder.f3177A;
        if (m1620b != null && !m1620b.isEmpty()) {
            Iterator it2 = m1620b.iterator();
            while (it2.hasNext()) {
                this.f3224b.addPerson((String) it2.next());
            }
        }
        if (builder.f3181d.size() > 0) {
            if (builder.f3197t == null) {
                builder.f3197t = new Bundle();
            }
            Bundle bundle3 = builder.f3197t.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i7 = 0; i7 < builder.f3181d.size(); i7++) {
                String num = Integer.toString(i7);
                NotificationCompat.Action action = builder.f3181d.get(i7);
                Object obj = NotificationCompatJellybean.f3228a;
                Bundle bundle6 = new Bundle();
                IconCompat m1597a2 = action.m1597a();
                bundle6.putInt("icon", m1597a2 != null ? m1597a2.m1868g() : 0);
                bundle6.putCharSequence("title", action.f3155j);
                bundle6.putParcelable("actionIntent", action.f3156k);
                Bundle bundle7 = action.f3146a != null ? new Bundle(action.f3146a) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action.f3150e);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", NotificationCompatJellybean.m1622a(action.f3148c));
                bundle6.putBoolean("showsUserInterface", action.f3151f);
                bundle6.putInt("semanticAction", action.f3152g);
                bundle5.putBundle(num, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (builder.f3197t == null) {
                builder.f3197t = new Bundle();
            }
            builder.f3197t.putBundle("android.car.EXTENSIONS", bundle3);
            this.f3227e.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            this.f3224b.setExtras(builder.f3197t).setRemoteInputHistory(null);
        }
        if (i8 >= 26) {
            this.f3224b.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(builder.f3201x).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(builder.f3200w)) {
                this.f3224b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator<Person> it3 = builder.f3180c.iterator();
            while (it3.hasNext()) {
                Person next2 = it3.next();
                Notification.Builder builder3 = this.f3224b;
                Objects.requireNonNull(next2);
                builder3.addPerson(Person.Api28Impl.m1634b(next2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3224b.setAllowSystemGeneratedContextualActions(builder.f3202y);
            this.f3224b.setBubbleMetadata(null);
        }
    }

    @Nullable
    /* renamed from: b */
    public static List<String> m1620b(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list2.size() + list.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    /* renamed from: c */
    public static List<String> m1621c(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            String str = person.f3252c;
            if (str == null) {
                if (person.f3250a != null) {
                    StringBuilder m24u = C0000a.m24u("name:");
                    m24u.append((Object) person.f3250a);
                    str = m24u.toString();
                } else {
                    str = "";
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    /* renamed from: a */
    public Notification.Builder mo1596a() {
        return this.f3224b;
    }
}
