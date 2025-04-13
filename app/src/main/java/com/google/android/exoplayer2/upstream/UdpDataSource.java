package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class UdpDataSource extends BaseDataSource {

    /* renamed from: e */
    public final int f14528e;

    /* renamed from: f */
    public final byte[] f14529f;

    /* renamed from: g */
    public final DatagramPacket f14530g;

    /* renamed from: h */
    @Nullable
    public Uri f14531h;

    /* renamed from: i */
    @Nullable
    public DatagramSocket f14532i;

    /* renamed from: j */
    @Nullable
    public MulticastSocket f14533j;

    /* renamed from: k */
    @Nullable
    public InetAddress f14534k;

    /* renamed from: l */
    public boolean f14535l;

    /* renamed from: m */
    public int f14536m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f14528e = 8000;
        byte[] bArr = new byte[2000];
        this.f14529f = bArr;
        this.f14530g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f14362a;
        this.f14531h = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f14531h.getPort();
        m7429q(dataSpec);
        try {
            this.f14534k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14534k, port);
            if (this.f14534k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14533j = multicastSocket;
                multicastSocket.joinGroup(this.f14534k);
                this.f14532i = this.f14533j;
            } else {
                this.f14532i = new DatagramSocket(inetSocketAddress);
            }
            this.f14532i.setSoTimeout(this.f14528e);
            this.f14535l = true;
            m7430r(dataSpec);
            return -1L;
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2, 2001);
        } catch (SecurityException e3) {
            throw new UdpDataSourceException(e3, 2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14531h = null;
        MulticastSocket multicastSocket = this.f14533j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f14534k;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f14533j = null;
        }
        DatagramSocket datagramSocket = this.f14532i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14532i = null;
        }
        this.f14534k = null;
        this.f14536m = 0;
        if (this.f14535l) {
            this.f14535l = false;
            m7428p();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14531h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws UdpDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f14536m == 0) {
            try {
                DatagramSocket datagramSocket = this.f14532i;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f14530g);
                int length = this.f14530g.getLength();
                this.f14536m = length;
                m7427o(length);
            } catch (SocketTimeoutException e2) {
                throw new UdpDataSourceException(e2, 2002);
            } catch (IOException e3) {
                throw new UdpDataSourceException(e3, 2001);
            }
        }
        int length2 = this.f14530g.getLength();
        int i4 = this.f14536m;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f14529f, length2 - i4, bArr, i2, min);
        this.f14536m -= min;
        return min;
    }
}
