package com.yandex.metrica.impl.p023ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.p038ws.RealWebSocket;

/* renamed from: com.yandex.metrica.impl.ob.A0 */
/* loaded from: classes2.dex */
public class C3157A0 {

    /* renamed from: a */
    @NonNull
    private final Context f42520a;

    /* renamed from: b */
    @NonNull
    private final b f42521b;

    /* renamed from: com.yandex.metrica.impl.ob.A0$a */
    public static class a {

        /* renamed from: a */
        public final long f42522a;

        /* renamed from: b */
        public final long f42523b;

        public a(long j2, long j3) {
            this.f42522a = j2;
            this.f42523b = j3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A0$b */
    public static class b {
    }

    public C3157A0(@NonNull Context context) {
        this(context, new b());
    }

    @NonNull
    /* renamed from: a */
    public a m17809a() {
        long j2;
        long j3 = 0;
        if (!C3658U2.m19211a(26)) {
            if (C3658U2.m19211a(18)) {
                try {
                    Objects.requireNonNull(this.f42521b);
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    return new a((statFs.getBlockCountLong() * blockSizeLong) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, (statFs.getAvailableBlocksLong() * blockSizeLong) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                } catch (Throwable unused) {
                    return new a(0L, 0L);
                }
            }
            try {
                Objects.requireNonNull(this.f42521b);
                long blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
                return new a((r0.getBlockCount() * blockSize) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, (r0.getAvailableBlocks() * blockSize) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            } catch (Throwable unused2) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManager = (StorageStatsManager) this.f42520a.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) this.f42520a.getSystemService("storage");
        if (storageManager == null || storageStatsManager == null) {
            j2 = 0;
        } else {
            Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
            long j4 = 0;
            while (it.hasNext()) {
                try {
                    String uuid = it.next().getUuid();
                    UUID fromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    j3 += storageStatsManager.getTotalBytes(fromString);
                    j4 += storageStatsManager.getFreeBytes(fromString);
                } catch (Throwable unused3) {
                }
            }
            long j5 = j3;
            j3 = j4;
            j2 = j5;
        }
        return new a(j2 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, j3 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
    }

    @VisibleForTesting
    public C3157A0(@NonNull Context context, @NonNull b bVar) {
        this.f42520a = context;
        this.f42521b = bVar;
    }
}
