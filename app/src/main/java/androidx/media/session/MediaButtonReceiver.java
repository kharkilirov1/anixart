package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f4876a = 0;

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.ConnectionCallback {

        /* renamed from: c */
        public final Context f4877c;

        /* renamed from: d */
        public final Intent f4878d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f4879e;

        /* renamed from: f */
        public MediaBrowserCompat f4880f;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4877c = context;
            this.f4878d = intent;
            this.f4879e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        /* renamed from: a */
        public void mo70a() {
            new MediaControllerCompat(this.f4877c, this.f4880f.m66c()).m189a((KeyEvent) this.f4878d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m3320d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        /* renamed from: b */
        public void mo71b() {
            m3320d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        /* renamed from: c */
        public void mo72c() {
            m3320d();
        }

        /* renamed from: d */
        public final void m3320d() {
            this.f4880f.m65b();
            this.f4879e.finish();
        }
    }

    /* renamed from: a */
    public static ComponentName m3319a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder m28y = C0000a.m28y("Expected 1 service that handles ", str, ", found ");
        m28y.append(queryIntentServices.size());
        throw new IllegalStateException(m28y.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName m3319a = m3319a(context, "android.intent.action.MEDIA_BUTTON");
        if (m3319a != null) {
            intent.setComponent(m3319a);
            ContextCompat.m1677j(context, intent);
            return;
        }
        ComponentName m3319a2 = m3319a(context, "android.media.browse.MediaBrowserService");
        if (m3319a2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, m3319a2, mediaButtonConnectionCallback, null);
        mediaButtonConnectionCallback.f4880f = mediaBrowserCompat;
        mediaBrowserCompat.m64a();
    }
}
