package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.qu */
/* loaded from: classes3.dex */
public final class C5657qu extends AbstractC6022xd {

    /* renamed from: e */
    @Nullable
    private RandomAccessFile f54132e;

    /* renamed from: f */
    @Nullable
    private Uri f54133f;

    /* renamed from: g */
    private long f54134g;

    /* renamed from: h */
    private boolean f54135h;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.qu$a */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static boolean m27786b(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qu$b */
    public static final class b implements InterfaceC4978dm.a {
        @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm.a
        /* renamed from: a */
        public final InterfaceC4978dm mo22497a() {
            return new C5657qu();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qu$c */
    public static class c extends C5035em {
        public c(Exception exc, int i2) {
            super(exc, i2);
        }

        public c(int i2, @Nullable String str, @Nullable FileNotFoundException fileNotFoundException) {
            super(i2, str, fileNotFoundException);
        }
    }

    public C5657qu() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws c {
        Uri uri = c5192hm.f50967a;
        this.f54133f = uri;
        m29738b(c5192hm);
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f54132e = randomAccessFile;
            try {
                randomAccessFile.seek(c5192hm.f50972f);
                long j2 = c5192hm.f50973g;
                if (j2 == -1) {
                    j2 = this.f54132e.length() - c5192hm.f50972f;
                }
                this.f54134g = j2;
                if (j2 < 0) {
                    throw new c(2008, null, null);
                }
                this.f54135h = true;
                m29740c(c5192hm);
                return this.f54134g;
            } catch (IOException e2) {
                throw new c(e2, 2000);
            }
        } catch (FileNotFoundException e3) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c(e3, (s91.f54530a < 21 || !a.m27786b(e3.getCause())) ? 2005 : 2006);
            }
            throw new c(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e3);
        } catch (SecurityException e4) {
            throw new c(e4, 2006);
        } catch (RuntimeException e5) {
            throw new c(e5, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws c {
        this.f54133f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f54132e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new c(e2, 2000);
            }
        } finally {
            this.f54132e = null;
            if (this.f54135h) {
                this.f54135h = false;
                m29741f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f54133f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws c {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f54134g;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f54132e;
            int i4 = s91.f54530a;
            int read = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.f54134g -= read;
                m29739c(read);
            }
            return read;
        } catch (IOException e2) {
            throw new c(e2, 2000);
        }
    }
}
