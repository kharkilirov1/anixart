package com.swiftsoft.anixartd.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestOptions;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.notification.handler.NotificationPayloadHandler;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnNotification;
import com.yandex.metrica.push.firebase.MetricaMessagingService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationService.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/notification/NotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationService extends FirebaseMessagingService {

    /* renamed from: b */
    @Inject
    public AuthRepository f25774b;

    /* renamed from: c */
    @NotNull
    public AtomicInteger f25775c = new AtomicInteger(0);

    @Override // android.app.Service
    public void onCreate() {
        App.f25340b.m14043a().mo14139o(this);
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Notification m1608a;
        Intrinsics.m32179h(remoteMessage, "remoteMessage");
        if (remoteMessage.m12679m().containsKey("yamp")) {
            new MetricaMessagingService().processPush(this, remoteMessage);
            return;
        }
        String string = getString(C2507R.string.default_notification_channel_id);
        Intrinsics.m32178g(string, "getString(R.string.defau…_notification_channel_id)");
        String string2 = getString(C2507R.string.default_notification_channel_name);
        Intrinsics.m32178g(string2, "getString(R.string.defau…otification_channel_name)");
        Map<String, String> m12679m = remoteMessage.m12679m();
        Intrinsics.m32178g(m12679m, "remoteMessage.data");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, string);
        builder.f3203z.icon = C2507R.drawable.ic_notify;
        builder.m1611e(16, true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 23) {
            builder.f3192o = string;
        }
        NotificationPayloadHandler.NotificationPayload m14172a = NotificationPayloadHandler.f25777a.m14172a(this, m12679m.get("action"), m12679m);
        if (m14172a == null) {
            m1608a = null;
        } else {
            CharSequence charSequence = m14172a.f25791a;
            CharSequence charSequence2 = m14172a.f25792b;
            String str = m14172a.f25793c;
            int i3 = m14172a.f25794d;
            Function1<Intent, Unit> function1 = m14172a.f25795e;
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(335560704);
            if (function1 != null) {
                function1.invoke(intent);
            }
            PendingIntent activity = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, i2 >= 31 ? 201326592 : 134217728);
            builder.m1610d(charSequence);
            builder.m1609c(charSequence2);
            builder.f3184g = activity;
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.m1606h(charSequence2);
            if (builder.f3190m != bigTextStyle) {
                builder.f3190m = bigTextStyle;
                bigTextStyle.m1619g(builder);
            }
            if (str != null) {
                try {
                    RequestBuilder<Bitmap> mo4897h = Glide.m4874e(this).mo4897h();
                    Intrinsics.m32178g(mo4897h, "with(this).asBitmap()");
                    mo4897h.mo4889M(new Common().m16298c(str, App.f25340b.m14044b().m14082y()));
                    if (i3 == 1) {
                        mo4897h.mo5265o(180, 180).mo4892a(RequestOptions.m5298E());
                        builder.m1612f((Bitmap) ((RequestFutureTarget) mo4897h.m4891O()).get());
                    } else if (i3 == 2) {
                        mo4897h.mo5264n(360);
                        if (i2 >= 31) {
                            NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                            bigPictureStyle.f3172b = (Bitmap) ((RequestFutureTarget) mo4897h.m4891O()).get();
                            bigPictureStyle.f3175e = true;
                            if (builder.f3190m != bigPictureStyle) {
                                builder.f3190m = bigPictureStyle;
                                bigPictureStyle.m1619g(builder);
                            }
                        } else {
                            builder.m1612f((Bitmap) ((RequestFutureTarget) mo4897h.m4891O()).get());
                            NotificationCompat.BigPictureStyle bigPictureStyle2 = new NotificationCompat.BigPictureStyle();
                            bigPictureStyle2.f3172b = (Bitmap) ((RequestFutureTarget) mo4897h.m4891O()).get();
                            if (builder.f3190m != bigPictureStyle2) {
                                builder.f3190m = bigPictureStyle2;
                                bigPictureStyle2.m1619g(builder);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            m1608a = builder.m1608a();
        }
        if (m1608a == null) {
            return;
        }
        Object systemService = getSystemService("notification");
        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(string, string2, 4));
        }
        EventBusKt.m16327a(new OnNotification());
        notificationManager.notify(this.f25775c.incrementAndGet(), m1608a);
        if (i4 > 23) {
            NotificationCompat.Builder builder2 = new NotificationCompat.Builder(this, string);
            builder2.f3203z.icon = C2507R.drawable.ic_notify;
            builder2.f3192o = string;
            builder2.f3193p = true;
            builder2.m1611e(16, true);
            Notification m1608a2 = builder2.m1608a();
            Intrinsics.m32178g(m1608a2, "Builder(this, channelId)…\n                .build()");
            notificationManager.notify(0, m1608a2);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String clientToken) {
        Intrinsics.m32179h(clientToken, "clientToken");
        AuthRepository authRepository = this.f25774b;
        if (authRepository != null) {
            authRepository.f27326b.m14080w();
        } else {
            Intrinsics.m32189r("authRepository");
            throw null;
        }
    }
}
