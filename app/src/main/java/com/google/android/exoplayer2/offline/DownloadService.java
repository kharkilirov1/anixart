package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public abstract class DownloadService extends Service {

    /* renamed from: g */
    public static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> f12172g = new HashMap<>();

    /* renamed from: b */
    public DownloadManagerHelper f12173b;

    /* renamed from: c */
    public int f12174c;

    /* renamed from: d */
    public boolean f12175d;

    /* renamed from: e */
    public boolean f12176e;

    /* renamed from: f */
    public boolean f12177f;

    public static final class DownloadManagerHelper implements DownloadManager.Listener {

        /* renamed from: a */
        public final Context f12178a;

        /* renamed from: b */
        public final DownloadManager f12179b;

        /* renamed from: c */
        public final boolean f12180c;

        /* renamed from: d */
        @Nullable
        public final Scheduler f12181d = null;

        /* renamed from: e */
        public final Class<? extends DownloadService> f12182e;

        /* renamed from: f */
        @Nullable
        public DownloadService f12183f;

        /* renamed from: g */
        public Requirements f12184g;

        public DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z, Scheduler scheduler, Class cls, C10751 c10751) {
            this.f12178a = context;
            this.f12179b = downloadManager;
            this.f12180c = z;
            this.f12182e = cls;
            throw null;
        }

        @RequiresNonNull({"scheduler"})
        /* renamed from: a */
        public final void m6748a() {
            Requirements requirements = new Requirements(0);
            if (!Util.m7728a(this.f12184g, requirements)) {
                this.f12181d.cancel();
                this.f12184g = requirements;
            }
        }

        /* renamed from: b */
        public boolean m6749b() {
            Objects.requireNonNull(this.f12179b);
            if (this.f12181d == null) {
                return true;
            }
            m6748a();
            return true;
        }
    }

    public final class ForegroundNotificationUpdater {
    }

    /* renamed from: a */
    public abstract DownloadManager m6747a();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        Class<?> cls = getClass();
        DownloadManagerHelper downloadManagerHelper = f12172g.get(cls);
        if (downloadManagerHelper != null) {
            this.f12173b = downloadManagerHelper;
            Assertions.m7516d(downloadManagerHelper.f12183f == null);
            downloadManagerHelper.f12183f = this;
            Objects.requireNonNull(downloadManagerHelper.f12179b);
            return;
        }
        int i2 = Util.f14736a;
        DownloadManager m6747a = m6747a();
        if (!m6747a.f12150b) {
            new DownloadManagerHelper(getApplicationContext(), m6747a, false, null, cls, null);
            throw null;
        }
        m6747a.f12150b = false;
        m6747a.f12149a++;
        throw null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        DownloadManagerHelper downloadManagerHelper = this.f12173b;
        Objects.requireNonNull(downloadManagerHelper);
        Assertions.m7516d(downloadManagerHelper.f12183f == this);
        downloadManagerHelper.f12183f = null;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i2, int i3) {
        String str;
        String str2;
        DownloadManager downloadManager;
        this.f12174c = i3;
        this.f12176e = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            this.f12175d |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(str);
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        DownloadManagerHelper downloadManagerHelper = this.f12173b;
        Objects.requireNonNull(downloadManagerHelper);
        downloadManager = downloadManagerHelper.f12179b;
        switch (str) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                Objects.requireNonNull(intent);
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f12149a++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                if (downloadManager.f12150b) {
                    downloadManager.f12150b = false;
                    downloadManager.f12149a++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.f12149a++;
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Objects.requireNonNull(intent);
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    Objects.requireNonNull(downloadManager);
                    throw null;
                }
                Log.e("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                if (!downloadManager.f12150b) {
                    downloadManager.f12150b = true;
                    downloadManager.f12149a++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                Objects.requireNonNull(intent);
                if (!intent.hasExtra("stop_reason")) {
                    Log.e("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f12149a++;
                    throw null;
                }
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 != null) {
                    downloadManager.f12149a++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
            default:
                Log.e("DownloadService", str.length() != 0 ? "Ignored unrecognized action: ".concat(str) : new String("Ignored unrecognized action: "));
                break;
        }
        int i4 = Util.f14736a;
        this.f12177f = false;
        if (downloadManager.f12149a == 0) {
            DownloadManagerHelper downloadManagerHelper2 = this.f12173b;
            Objects.requireNonNull(downloadManagerHelper2);
            downloadManagerHelper2.m6749b();
            if (i4 >= 28 || !this.f12176e) {
                this.f12177f |= stopSelfResult(this.f12174c);
            } else {
                stopSelf();
                this.f12177f = true;
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f12176e = true;
    }
}
