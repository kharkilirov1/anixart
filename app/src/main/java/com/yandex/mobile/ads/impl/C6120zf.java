package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5970wf;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.zf */
/* loaded from: classes3.dex */
public final class C6120zf implements InterfaceC4930cm {

    /* renamed from: a */
    private final InterfaceC5970wf f57126a;

    /* renamed from: b */
    private final long f57127b = 5242880;

    /* renamed from: c */
    private final int f57128c = 20480;

    /* renamed from: d */
    @Nullable
    private C5192hm f57129d;

    /* renamed from: e */
    private long f57130e;

    /* renamed from: f */
    @Nullable
    private File f57131f;

    /* renamed from: g */
    @Nullable
    private OutputStream f57132g;

    /* renamed from: h */
    private long f57133h;

    /* renamed from: i */
    private long f57134i;

    /* renamed from: j */
    private gx0 f57135j;

    /* renamed from: com.yandex.mobile.ads.impl.zf$a */
    public static final class a extends InterfaceC5970wf.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf$b */
    public static final class b {

        /* renamed from: a */
        private InterfaceC5970wf f57136a;

        /* renamed from: a */
        public final b m30166a(InterfaceC5970wf interfaceC5970wf) {
            this.f57136a = interfaceC5970wf;
            return this;
        }

        /* renamed from: a */
        public final C6120zf m30167a() {
            InterfaceC5970wf interfaceC5970wf = this.f57136a;
            Objects.requireNonNull(interfaceC5970wf);
            return new C6120zf(interfaceC5970wf);
        }
    }

    public C6120zf(InterfaceC5970wf interfaceC5970wf) {
        this.f57126a = (InterfaceC5970wf) C5220ia.m25469a(interfaceC5970wf);
    }

    /* renamed from: b */
    private void m30165b(C5192hm c5192hm) throws IOException {
        long j2 = c5192hm.f50973g;
        long min = j2 != -1 ? Math.min(j2 - this.f57134i, this.f57130e) : -1L;
        InterfaceC5970wf interfaceC5970wf = this.f57126a;
        String str = c5192hm.f50974h;
        int i2 = s91.f54530a;
        this.f57131f = interfaceC5970wf.mo22699a(str, c5192hm.f50972f + this.f57134i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f57131f);
        if (this.f57128c > 0) {
            gx0 gx0Var = this.f57135j;
            if (gx0Var == null) {
                this.f57135j = new gx0(fileOutputStream, this.f57128c);
            } else {
                gx0Var.m24994a(fileOutputStream);
            }
            this.f57132g = this.f57135j;
        } else {
            this.f57132g = fileOutputStream;
        }
        this.f57133h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4930cm
    /* renamed from: a */
    public final void mo23313a(C5192hm c5192hm) throws a {
        Objects.requireNonNull(c5192hm.f50974h);
        if (c5192hm.f50973g == -1 && c5192hm.m25236a(2)) {
            this.f57129d = null;
            return;
        }
        this.f57129d = c5192hm;
        this.f57130e = c5192hm.m25236a(4) ? this.f57127b : Long.MAX_VALUE;
        this.f57134i = 0L;
        try {
            m30165b(c5192hm);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4930cm
    public final void close() throws a {
        if (this.f57129d == null) {
            return;
        }
        try {
            OutputStream outputStream = this.f57132g;
            if (outputStream == null) {
                return;
            }
            try {
                outputStream.flush();
                s91.m28107a((Closeable) this.f57132g);
                this.f57132g = null;
                File file = this.f57131f;
                this.f57131f = null;
                this.f57126a.mo22701a(file, this.f57133h);
            } catch (Throwable th) {
                s91.m28107a((Closeable) this.f57132g);
                this.f57132g = null;
                File file2 = this.f57131f;
                this.f57131f = null;
                file2.delete();
                throw th;
            }
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4930cm
    public final void write(byte[] bArr, int i2, int i3) throws a {
        C5192hm c5192hm = this.f57129d;
        if (c5192hm == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f57133h == this.f57130e) {
                    OutputStream outputStream = this.f57132g;
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            s91.m28107a((Closeable) this.f57132g);
                            this.f57132g = null;
                            File file = this.f57131f;
                            this.f57131f = null;
                            this.f57126a.mo22701a(file, this.f57133h);
                        } finally {
                        }
                    }
                    m30165b(c5192hm);
                }
                int min = (int) Math.min(i3 - i4, this.f57130e - this.f57133h);
                OutputStream outputStream2 = this.f57132g;
                int i5 = s91.f54530a;
                outputStream2.write(bArr, i2 + i4, min);
                i4 += min;
                long j2 = min;
                this.f57133h += j2;
                this.f57134i += j2;
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
    }
}
