package com.yandex.mobile.ads.impl;

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

/* loaded from: classes3.dex */
public final class s81 extends AbstractC6022xd {

    /* renamed from: e */
    private final int f54517e;

    /* renamed from: f */
    private final byte[] f54518f;

    /* renamed from: g */
    private final DatagramPacket f54519g;

    /* renamed from: h */
    @Nullable
    private Uri f54520h;

    /* renamed from: i */
    @Nullable
    private DatagramSocket f54521i;

    /* renamed from: j */
    @Nullable
    private MulticastSocket f54522j;

    /* renamed from: k */
    @Nullable
    private InetAddress f54523k;

    /* renamed from: l */
    private boolean f54524l;

    /* renamed from: m */
    private int f54525m;

    /* renamed from: com.yandex.mobile.ads.impl.s81$a */
    public static final class C5731a extends C5035em {
        public C5731a(Exception exc, int i2) {
            super(exc, i2);
        }
    }

    public s81(int i2) {
        super(true);
        this.f54517e = 8000;
        byte[] bArr = new byte[2000];
        this.f54518f = bArr;
        this.f54519g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws C5731a {
        Uri uri = c5192hm.f50967a;
        this.f54520h = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f54520h.getPort();
        m29738b(c5192hm);
        try {
            this.f54523k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f54523k, port);
            if (this.f54523k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f54522j = multicastSocket;
                multicastSocket.joinGroup(this.f54523k);
                this.f54521i = this.f54522j;
            } else {
                this.f54521i = new DatagramSocket(inetSocketAddress);
            }
            this.f54521i.setSoTimeout(this.f54517e);
            this.f54524l = true;
            m29740c(c5192hm);
            return -1L;
        } catch (IOException e2) {
            throw new C5731a(e2, 2001);
        } catch (SecurityException e3) {
            throw new C5731a(e3, 2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() {
        this.f54520h = null;
        MulticastSocket multicastSocket = this.f54522j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f54523k;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f54522j = null;
        }
        DatagramSocket datagramSocket = this.f54521i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f54521i = null;
        }
        this.f54523k = null;
        this.f54525m = 0;
        if (this.f54524l) {
            this.f54524l = false;
            m29741f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f54520h;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws C5731a {
        if (i3 == 0) {
            return 0;
        }
        if (this.f54525m == 0) {
            try {
                DatagramSocket datagramSocket = this.f54521i;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f54519g);
                int length = this.f54519g.getLength();
                this.f54525m = length;
                m29739c(length);
            } catch (SocketTimeoutException e2) {
                throw new C5731a(e2, 2002);
            } catch (IOException e3) {
                throw new C5731a(e3, 2001);
            }
        }
        int length2 = this.f54519g.getLength();
        int i4 = this.f54525m;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f54518f, length2 - i4, bArr, i2, min);
        this.f54525m -= min;
        return min;
    }
}
