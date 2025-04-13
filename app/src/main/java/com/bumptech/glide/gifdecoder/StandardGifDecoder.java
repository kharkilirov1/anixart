package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class StandardGifDecoder implements GifDecoder {

    /* renamed from: a */
    @ColorInt
    public int[] f8021a;

    /* renamed from: c */
    public final GifDecoder.BitmapProvider f8023c;

    /* renamed from: d */
    public ByteBuffer f8024d;

    /* renamed from: e */
    public byte[] f8025e;

    /* renamed from: f */
    public short[] f8026f;

    /* renamed from: g */
    public byte[] f8027g;

    /* renamed from: h */
    public byte[] f8028h;

    /* renamed from: i */
    public byte[] f8029i;

    /* renamed from: j */
    @ColorInt
    public int[] f8030j;

    /* renamed from: k */
    public int f8031k;

    /* renamed from: l */
    public GifHeader f8032l;

    /* renamed from: m */
    public Bitmap f8033m;

    /* renamed from: n */
    public boolean f8034n;

    /* renamed from: o */
    public int f8035o;

    /* renamed from: p */
    public int f8036p;

    /* renamed from: q */
    public int f8037q;

    /* renamed from: r */
    public int f8038r;

    /* renamed from: s */
    @Nullable
    public Boolean f8039s;

    /* renamed from: b */
    @ColorInt
    public final int[] f8022b = new int[256];

    /* renamed from: t */
    @NonNull
    public Bitmap.Config f8040t = Bitmap.Config.ARGB_8888;

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i2) {
        this.f8023c = bitmapProvider;
        this.f8032l = new GifHeader();
        synchronized (this) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
            int highestOneBit = Integer.highestOneBit(i2);
            this.f8035o = 0;
            this.f8032l = gifHeader;
            this.f8031k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f8024d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f8024d.order(ByteOrder.LITTLE_ENDIAN);
            this.f8034n = false;
            Iterator<GifFrame> it = gifHeader.f8010e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f8001g == 3) {
                    this.f8034n = true;
                    break;
                }
            }
            this.f8036p = highestOneBit;
            int i3 = gifHeader.f8011f;
            this.f8038r = i3 / highestOneBit;
            int i4 = gifHeader.f8012g;
            this.f8037q = i4 / highestOneBit;
            this.f8029i = this.f8023c.mo4938e(i3 * i4);
            this.f8030j = this.f8023c.mo4935b(this.f8038r * this.f8037q);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    /* renamed from: a */
    public ByteBuffer mo4927a() {
        return this.f8024d;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    /* renamed from: b */
    public synchronized Bitmap mo4928b() {
        if (this.f8032l.f8008c <= 0 || this.f8031k < 0) {
            if (Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "Unable to decode frame, frameCount=" + this.f8032l.f8008c + ", framePointer=" + this.f8031k);
            }
            this.f8035o = 1;
        }
        int i2 = this.f8035o;
        if (i2 != 1 && i2 != 2) {
            this.f8035o = 0;
            if (this.f8025e == null) {
                this.f8025e = this.f8023c.mo4938e(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            GifFrame gifFrame = this.f8032l.f8010e.get(this.f8031k);
            int i3 = this.f8031k - 1;
            GifFrame gifFrame2 = i3 >= 0 ? this.f8032l.f8010e.get(i3) : null;
            int[] iArr = gifFrame.f8005k;
            if (iArr == null) {
                iArr = this.f8032l.f8006a;
            }
            this.f8021a = iArr;
            if (iArr != null) {
                if (gifFrame.f8000f) {
                    System.arraycopy(iArr, 0, this.f8022b, 0, iArr.length);
                    int[] iArr2 = this.f8022b;
                    this.f8021a = iArr2;
                    iArr2[gifFrame.f8002h] = 0;
                }
                return m4949j(gifFrame, gifFrame2);
            }
            if (Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "No valid color table found for frame #" + this.f8031k);
            }
            this.f8035o = 1;
            return null;
        }
        if (Log.isLoggable("StandardGifDecoder", 3)) {
            Log.d("StandardGifDecoder", "Unable to decode frame, status=" + this.f8035o);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: c */
    public void mo4929c() {
        this.f8031k = (this.f8031k + 1) % this.f8032l.f8008c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.f8032l = null;
        byte[] bArr = this.f8029i;
        if (bArr != null) {
            this.f8023c.mo4937d(bArr);
        }
        int[] iArr = this.f8030j;
        if (iArr != null) {
            this.f8023c.mo4939f(iArr);
        }
        Bitmap bitmap = this.f8033m;
        if (bitmap != null) {
            this.f8023c.mo4936c(bitmap);
        }
        this.f8033m = null;
        this.f8024d = null;
        this.f8039s = null;
        byte[] bArr2 = this.f8025e;
        if (bArr2 != null) {
            this.f8023c.mo4937d(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: d */
    public int mo4930d() {
        return this.f8032l.f8008c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: e */
    public int mo4931e() {
        int i2;
        GifHeader gifHeader = this.f8032l;
        int i3 = gifHeader.f8008c;
        if (i3 <= 0 || (i2 = this.f8031k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return gifHeader.f8010e.get(i2).f8003i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: f */
    public int mo4932f() {
        return this.f8031k;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: g */
    public int mo4933g() {
        return (this.f8030j.length * 4) + this.f8024d.limit() + this.f8029i.length;
    }

    /* renamed from: h */
    public final Bitmap m4947h() {
        Boolean bool = this.f8039s;
        Bitmap mo4934a = this.f8023c.mo4934a(this.f8038r, this.f8037q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f8040t);
        mo4934a.setHasAlpha(true);
        return mo4934a;
    }

    /* renamed from: i */
    public void m4948i(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f8040t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3.f8015j == r34.f8002h) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m4949j(com.bumptech.glide.gifdecoder.GifFrame r34, com.bumptech.glide.gifdecoder.GifFrame r35) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.m4949j(com.bumptech.glide.gifdecoder.GifFrame, com.bumptech.glide.gifdecoder.GifFrame):android.graphics.Bitmap");
    }
}
