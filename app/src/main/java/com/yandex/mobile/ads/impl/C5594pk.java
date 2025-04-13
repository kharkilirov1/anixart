package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.yandex.mobile.ads.impl.pk */
/* loaded from: classes3.dex */
public final class C5594pk extends AbstractC6022xd {

    /* renamed from: e */
    private final ContentResolver f53565e;

    /* renamed from: f */
    @Nullable
    private Uri f53566f;

    /* renamed from: g */
    @Nullable
    private AssetFileDescriptor f53567g;

    /* renamed from: h */
    @Nullable
    private FileInputStream f53568h;

    /* renamed from: i */
    private long f53569i;

    /* renamed from: j */
    private boolean f53570j;

    /* renamed from: com.yandex.mobile.ads.impl.pk$a */
    public static class a extends C5035em {
        public a(@Nullable IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public C5594pk(Context context) {
        super(false);
        this.f53565e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = c5192hm.f50967a;
            this.f53566f = uri;
            m29738b(c5192hm);
            if ("content".equals(c5192hm.f50967a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f53565e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f53565e.openAssetFileDescriptor(uri, "r");
            }
            this.f53567g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f53568h = fileInputStream;
            if (length != -1 && c5192hm.f50972f > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c5192hm.f50972f + startOffset) - startOffset;
            if (skip != c5192hm.f50972f) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f53569i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f53569i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j2 = length - skip;
                this.f53569i = j2;
                if (j2 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j3 = c5192hm.f50973g;
            if (j3 != -1) {
                long j4 = this.f53569i;
                if (j4 != -1) {
                    j3 = Math.min(j4, j3);
                }
                this.f53569i = j3;
            }
            this.f53570j = true;
            m29740c(c5192hm);
            long j5 = c5192hm.f50973g;
            return j5 != -1 ? j5 : this.f53569i;
        } catch (a e2) {
            throw e2;
        } catch (IOException e3) {
            throw new a(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws a {
        this.f53566f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f53568h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f53568h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f53567g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f53567g = null;
                        if (this.f53570j) {
                            this.f53570j = false;
                            m29741f();
                        }
                    }
                } catch (IOException e2) {
                    throw new a(e2, 2000);
                }
            } catch (IOException e3) {
                throw new a(e3, 2000);
            }
        } catch (Throwable th) {
            this.f53568h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f53567g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f53567g = null;
                    if (this.f53570j) {
                        this.f53570j = false;
                        m29741f();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new a(e4, 2000);
                }
            } finally {
                this.f53567g = null;
                if (this.f53570j) {
                    this.f53570j = false;
                    m29741f();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f53566f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f53569i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f53568h;
        int i4 = s91.f54530a;
        int read = fileInputStream.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f53569i;
        if (j3 != -1) {
            this.f53569i = j3 - read;
        }
        m29739c(read);
        return read;
    }
}
