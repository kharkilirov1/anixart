package okio;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.SegmentedByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedByteString.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {

    /* renamed from: g */
    @NotNull
    public final transient byte[][] f68804g;

    /* renamed from: h */
    @NotNull
    public final transient int[] f68805h;

    public SegmentedByteString(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(ByteString.f68752e.f68756d);
        this.f68804g = bArr;
        this.f68805h = iArr;
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: a */
    public String mo34574a() {
        return m34620r().mo34574a();
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: b */
    public ByteString mo34575b(@NotNull String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f68804g.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f68805h;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            messageDigest.update(this.f68804g[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.m32178g(digest, "digest.digest()");
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    /* renamed from: d */
    public int mo34576d() {
        return this.f68805h[this.f68804g.length - 1];
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: e */
    public String mo34577e() {
        return m34620r().mo34577e();
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.mo34576d() == mo34576d() && mo34580j(0, byteString, 0, mo34576d())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: f */
    public byte[] getF68756d() {
        return mo34585o();
    }

    @Override // okio.ByteString
    /* renamed from: h */
    public byte mo34579h(int i2) {
        Util.m34510b(this.f68805h[this.f68804g.length - 1], i2, 1L);
        int m34627a = SegmentedByteStringKt.m34627a(this, i2);
        int i3 = m34627a == 0 ? 0 : this.f68805h[m34627a - 1];
        int[] iArr = this.f68805h;
        byte[][] bArr = this.f68804g;
        return bArr[m34627a][(i2 - i3) + iArr[bArr.length + m34627a]];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int i2 = this.f68754b;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f68804g.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f68805h;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr = this.f68804g[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f68754b = i4;
        return i4;
    }

    @Override // okio.ByteString
    /* renamed from: j */
    public boolean mo34580j(int i2, @NotNull ByteString other, int i3, int i4) {
        Intrinsics.m32179h(other, "other");
        if (i2 < 0 || i2 > mo34576d() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int m34627a = SegmentedByteStringKt.m34627a(this, i2);
        while (i2 < i5) {
            int i6 = m34627a == 0 ? 0 : this.f68805h[m34627a - 1];
            int[] iArr = this.f68805h;
            int i7 = iArr[m34627a] - i6;
            int i8 = iArr[this.f68804g.length + m34627a];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!other.mo34581k(i3, this.f68804g[m34627a], (i2 - i6) + i8, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            m34627a++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* renamed from: k */
    public boolean mo34581k(int i2, @NotNull byte[] other, int i3, int i4) {
        Intrinsics.m32179h(other, "other");
        if (i2 < 0 || i2 > mo34576d() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int m34627a = SegmentedByteStringKt.m34627a(this, i2);
        while (i2 < i5) {
            int i6 = m34627a == 0 ? 0 : this.f68805h[m34627a - 1];
            int[] iArr = this.f68805h;
            int i7 = iArr[m34627a] - i6;
            int i8 = iArr[this.f68804g.length + m34627a];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!Util.m34509a(this.f68804g[m34627a], (i2 - i6) + i8, other, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            m34627a++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: n */
    public ByteString mo34584n() {
        return m34620r().mo34584n();
    }

    @Override // okio.ByteString
    @NotNull
    /* renamed from: o */
    public byte[] mo34585o() {
        byte[] bArr = new byte[mo34576d()];
        int length = this.f68804g.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f68805h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            ArraysKt.m31967q(this.f68804g[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // okio.ByteString
    /* renamed from: q */
    public void mo34587q(@NotNull Buffer buffer, int i2, int i3) {
        int i4 = i3 + i2;
        int m34627a = SegmentedByteStringKt.m34627a(this, i2);
        while (i2 < i4) {
            int i5 = m34627a == 0 ? 0 : this.f68805h[m34627a - 1];
            int[] iArr = this.f68805h;
            int i6 = iArr[m34627a] - i5;
            int i7 = iArr[this.f68804g.length + m34627a];
            int min = Math.min(i4, i6 + i5) - i2;
            int i8 = (i2 - i5) + i7;
            Segment segment = new Segment(this.f68804g[m34627a], i8, i8 + min, true, false);
            Segment segment2 = buffer.f68741b;
            if (segment2 == null) {
                segment.f68799g = segment;
                segment.f68798f = segment;
                buffer.f68741b = segment;
            } else {
                Segment segment3 = segment2.f68799g;
                Intrinsics.m32176e(segment3);
                segment3.m34614b(segment);
            }
            i2 += min;
            m34627a++;
        }
        buffer.f68742c += mo34576d();
    }

    /* renamed from: r */
    public final ByteString m34620r() {
        return new ByteString(mo34585o());
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return m34620r().toString();
    }
}
