package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;
import okio.InflaterSource;
import p000a.C0000a;

/* loaded from: classes2.dex */
class NameValueBlockReader {

    /* renamed from: a */
    public final InflaterSource f25118a;

    /* renamed from: b */
    public int f25119b;

    /* renamed from: c */
    public final BufferedSource f25120c;

    /* renamed from: com.squareup.okhttp.internal.framed.NameValueBlockReader$1 */
    class C24921 extends ForwardingSource {

        /* renamed from: b */
        public final /* synthetic */ NameValueBlockReader f25121b;

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            int i2 = this.f25121b.f25119b;
            if (i2 == 0) {
                return -1L;
            }
            long read = super.read(buffer, Math.min(j2, i2));
            if (read == -1) {
                return -1L;
            }
            this.f25121b.f25119b = (int) (r8.f25119b - read);
            return read;
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.NameValueBlockReader$2 */
    class C24932 extends Inflater {
        @Override // java.util.zip.Inflater
        public int inflate(byte[] bArr, int i2, int i3) throws DataFormatException {
            int inflate = super.inflate(bArr, i2, i3);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(Spdy3.f25129a);
            return super.inflate(bArr, i2, i3);
        }
    }

    /* renamed from: a */
    public List<Header> m13994a(int i2) throws IOException {
        this.f25119b += i2;
        int readInt = this.f25120c.readInt();
        if (readInt < 0) {
            throw new IOException(C0000a.m7d("numberOfPairs < 0: ", readInt));
        }
        if (readInt > 1024) {
            throw new IOException(C0000a.m7d("numberOfPairs > 1024: ", readInt));
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            ByteString mo34584n = this.f25120c.mo34518G(this.f25120c.readInt()).mo34584n();
            ByteString mo34518G = this.f25120c.mo34518G(this.f25120c.readInt());
            if (mo34584n.mo34576d() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new Header(mo34584n, mo34518G));
        }
        if (this.f25119b > 0) {
            this.f25118a.m34598b();
            if (this.f25119b != 0) {
                StringBuilder m24u = C0000a.m24u("compressedLimit > 0: ");
                m24u.append(this.f25119b);
                throw new IOException(m24u.toString());
            }
        }
        return arrayList;
    }
}
