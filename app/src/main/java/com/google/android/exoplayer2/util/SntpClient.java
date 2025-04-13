package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.upstream.Loader;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class SntpClient {

    /* renamed from: a */
    public static final Object f14715a = new Object();

    /* renamed from: b */
    public static final Object f14716b = new Object();

    /* renamed from: c */
    @GuardedBy
    public static boolean f14717c;

    /* renamed from: d */
    @GuardedBy
    public static long f14718d;

    public interface InitializationCallback {
        /* renamed from: a */
        void mo7006a(IOException iOException);

        /* renamed from: b */
        void mo7007b();
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {

        /* renamed from: b */
        @Nullable
        public final InitializationCallback f14719b;

        public NtpTimeCallback(@Nullable InitializationCallback initializationCallback) {
            this.f14719b = initializationCallback;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: f */
        public void mo6852f(Loader.Loadable loadable, long j2, long j3, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: g */
        public void mo6853g(Loader.Loadable loadable, long j2, long j3) {
            boolean z;
            if (this.f14719b != null) {
                synchronized (SntpClient.f14716b) {
                    z = SntpClient.f14717c;
                }
                if (z) {
                    this.f14719b.mo7007b();
                } else {
                    this.f14719b.mo7006a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: o */
        public Loader.LoadErrorAction mo6858o(Loader.Loadable loadable, long j2, long j3, IOException iOException, int i2) {
            InitializationCallback initializationCallback = this.f14719b;
            if (initializationCallback != null) {
                initializationCallback.mo7006a(iOException);
            }
            return Loader.f14473e;
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        public NtpTimeLoadable() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: a */
        public void mo6865a() throws IOException {
            Object obj = SntpClient.f14715a;
            synchronized (SntpClient.f14715a) {
                Object obj2 = SntpClient.f14716b;
                synchronized (obj2) {
                    try {
                        if (SntpClient.f14717c) {
                            return;
                        }
                        long m7676a = SntpClient.m7676a();
                        synchronized (obj2) {
                            SntpClient.f14718d = m7676a;
                            SntpClient.f14717c = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: c */
        public void mo6866c() {
        }

        public NtpTimeLoadable(C11741 c11741) {
        }
    }

    /* renamed from: a */
    public static long m7676a() throws IOException {
        DatagramSocket datagramSocket;
        synchronized (f14716b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                bArr[40] = (byte) (j4 >> 24);
                datagramSocket = datagramSocket2;
                try {
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) (j4 >> 0);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    datagramSocket2 = datagramSocket;
                    Throwable th2 = th;
                    try {
                        datagramSocket2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket2 = datagramSocket;
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j6 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            byte b = (byte) ((bArr[0] >> 6) & 3);
            byte b2 = (byte) (bArr[0] & 7);
            int i2 = bArr[1] & 255;
            long m7680e = m7680e(bArr, 24);
            long m7680e2 = m7680e(bArr, 32);
            long m7680e3 = m7680e(bArr, 40);
            m7677b(b, b2, i2, m7680e3);
            long j7 = (j6 + (((m7680e3 - j6) + (m7680e2 - m7680e)) / 2)) - elapsedRealtime2;
            datagramSocket2.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: b */
    public static void m7677b(byte b, byte b2, int i2, long j2) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException(C0576a.m4111j(26, "SNTP: Untrusted mode: ", b2));
        }
        if (i2 == 0 || i2 > 15) {
            throw new IOException(C0576a.m4111j(36, "SNTP: Untrusted stratum: ", i2));
        }
        if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: c */
    public static void m7678c(@Nullable Loader loader, @Nullable InitializationCallback initializationCallback) {
        boolean z;
        synchronized (f14716b) {
            z = f14717c;
        }
        if (z) {
            initializationCallback.mo7007b();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.m7475h(new NtpTimeLoadable(null), new NtpTimeCallback(initializationCallback), 1);
    }

    /* renamed from: d */
    public static long m7679d(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    /* renamed from: e */
    public static long m7680e(byte[] bArr, int i2) {
        long m7679d = m7679d(bArr, i2);
        long m7679d2 = m7679d(bArr, i2 + 4);
        if (m7679d == 0 && m7679d2 == 0) {
            return 0L;
        }
        return ((m7679d2 * 1000) / 4294967296L) + ((m7679d - 2208988800L) * 1000);
    }
}
