package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class f00 extends C5035em {

    /* renamed from: c */
    public final int f50081c;

    public f00(int i2) {
        super(m24287a(i2, 1));
        this.f50081c = 1;
    }

    /* renamed from: a */
    private static int m24287a(int i2, int i3) {
        if (i2 == 2000 && i3 == 1) {
            return 2001;
        }
        return i2;
    }

    /* renamed from: a */
    public static f00 m24288a(IOException iOException, int i2) {
        String message = iOException.getMessage();
        int i3 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C5114ga.m24832b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i3 == 2007 ? new e00(iOException) : new f00(iOException, i3, i2);
    }

    public f00(String str, int i2) {
        super(m24287a(i2, 1), str);
        this.f50081c = 1;
    }

    public f00(IOException iOException, int i2, int i3) {
        super(iOException, m24287a(i2, i3));
        this.f50081c = i3;
    }

    public f00(String str, @Nullable IOException iOException, int i2) {
        super(m24287a(i2, 1), str, iOException);
        this.f50081c = 1;
    }
}
