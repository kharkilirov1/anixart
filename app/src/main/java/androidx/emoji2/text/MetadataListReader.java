package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class MetadataListReader {

    public static class ByteBufferReader implements OpenTypeReader {

        /* renamed from: a */
        @NonNull
        public final ByteBuffer f4062a;

        public ByteBufferReader(@NonNull ByteBuffer byteBuffer) {
            this.f4062a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public long m2837a() {
            return this.f4062a.position();
        }

        /* renamed from: b */
        public int m2838b() throws IOException {
            return this.f4062a.getInt();
        }

        /* renamed from: c */
        public long m2839c() throws IOException {
            return this.f4062a.getInt() & 4294967295L;
        }

        /* renamed from: d */
        public int m2840d() throws IOException {
            return this.f4062a.getShort() & 65535;
        }

        /* renamed from: e */
        public void m2841e(int i2) throws IOException {
            ByteBuffer byteBuffer = this.f4062a;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    public static class OffsetInfo {
    }

    public interface OpenTypeReader {
    }

    /* renamed from: a */
    public static MetadataList m2836a(ByteBuffer byteBuffer) throws IOException {
        long j2;
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(duplicate);
        byteBufferReader.m2841e(4);
        int m2840d = byteBufferReader.m2840d();
        if (m2840d > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferReader.m2841e(6);
        int i2 = 0;
        while (true) {
            if (i2 >= m2840d) {
                j2 = -1;
                break;
            }
            int m2838b = byteBufferReader.m2838b();
            byteBufferReader.m2841e(4);
            j2 = byteBufferReader.m2839c();
            byteBufferReader.m2841e(4);
            if (1835365473 == m2838b) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            byteBufferReader.m2841e((int) (j2 - byteBufferReader.m2837a()));
            byteBufferReader.m2841e(12);
            long m2839c = byteBufferReader.m2839c();
            for (int i3 = 0; i3 < m2839c; i3++) {
                int m2838b2 = byteBufferReader.m2838b();
                long m2839c2 = byteBufferReader.m2839c();
                byteBufferReader.m2839c();
                if (1164798569 == m2838b2 || 1701669481 == m2838b2) {
                    duplicate.position((int) (m2839c2 + j2));
                    MetadataList metadataList = new MetadataList();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    metadataList.m2865b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                    return metadataList;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
