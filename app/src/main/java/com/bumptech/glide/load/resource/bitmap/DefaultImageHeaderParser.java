package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.KotlinVersion;
import okhttp3.internal.http2.Settings;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f8526a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f8527b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class ByteBufferReader implements Reader {

        /* renamed from: a */
        public final ByteBuffer f8528a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f8528a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo5162a() {
            return ((mo5164c() << 8) & 65280) | (mo5164c() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo5163b(byte[] bArr, int i2) {
            int min = Math.min(i2, this.f8528a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f8528a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public int mo5164c() {
            if (this.f8528a.remaining() < 1) {
                return -1;
            }
            return this.f8528a.get();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j2) {
            int min = (int) Math.min(this.f8528a.remaining(), j2);
            ByteBuffer byteBuffer = this.f8528a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    public static final class RandomAccessReader {

        /* renamed from: a */
        public final ByteBuffer f8529a;

        public RandomAccessReader(byte[] bArr, int i2) {
            this.f8529a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        /* renamed from: a */
        public short m5165a(int i2) {
            if (this.f8529a.remaining() - i2 >= 2) {
                return this.f8529a.getShort(i2);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m5166b(int i2) {
            if (this.f8529a.remaining() - i2 >= 4) {
                return this.f8529a.getInt(i2);
            }
            return -1;
        }
    }

    public interface Reader {
        /* renamed from: a */
        int mo5162a() throws IOException;

        /* renamed from: b */
        int mo5163b(byte[] bArr, int i2) throws IOException;

        /* renamed from: c */
        int mo5164c() throws IOException;

        long skip(long j2) throws IOException;
    }

    public static final class StreamReader implements Reader {

        /* renamed from: a */
        public final InputStream f8530a;

        public StreamReader(InputStream inputStream) {
            this.f8530a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo5162a() throws IOException {
            return ((this.f8530a.read() << 8) & 65280) | (this.f8530a.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo5163b(byte[] bArr, int i2) throws IOException {
            int i3 = i2;
            while (i3 > 0) {
                int read = this.f8530a.read(bArr, i2 - i3, i3);
                if (read == -1) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public int mo5164c() throws IOException {
            return this.f8530a.read();
        }

        /* renamed from: d */
        public short m5167d() throws IOException {
            return (short) (this.f8530a.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.f8530a.skip(j3);
                if (skip <= 0) {
                    if (this.f8530a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo4951a(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m5160d(new ByteBufferReader(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo4952b(@NonNull InputStream inputStream) throws IOException {
        return m5160d(new StreamReader(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo4953c(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        int i2;
        StreamReader streamReader = new StreamReader(inputStream);
        Objects.requireNonNull(arrayPool, "Argument must not be null");
        int mo5162a = streamReader.mo5162a();
        int i3 = -1;
        if ((mo5162a & 65496) == 65496 || mo5162a == 19789 || mo5162a == 18761) {
            while (true) {
                short m5167d = streamReader.m5167d();
                if (m5167d == 255) {
                    short m5167d2 = streamReader.m5167d();
                    if (m5167d2 == 218) {
                        break;
                    }
                    if (m5167d2 != 217) {
                        i2 = streamReader.mo5162a() - 2;
                        if (m5167d2 == 225) {
                            break;
                        }
                        long j2 = i2;
                        long skip = streamReader.skip(j2);
                        if (skip != j2) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder m26w = C0000a.m26w("Unable to skip enough data, type: ", m5167d2, ", wanted to skip: ", i2, ", but actually skipped: ");
                                m26w.append(skip);
                                Log.d("DfltImageHeaderParser", m26w.toString());
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    C0000a.m0A("Unknown segmentId=", m5167d, "DfltImageHeaderParser");
                }
            }
            i2 = -1;
            if (i2 != -1) {
                byte[] bArr = (byte[]) arrayPool.mo5065d(i2, byte[].class);
                try {
                    i3 = m5161e(streamReader, bArr, i2);
                } finally {
                    arrayPool.put(bArr);
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            C0000a.m0A("Parser doesn't handle magic number: ", mo5162a, "DfltImageHeaderParser");
        }
        return i3;
    }

    @NonNull
    /* renamed from: d */
    public final ImageHeaderParser.ImageType m5160d(Reader reader) throws IOException {
        int mo5162a = reader.mo5162a();
        if (mo5162a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int mo5162a2 = ((mo5162a << 16) & (-65536)) | (reader.mo5162a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (mo5162a2 == -1991225785) {
            reader.skip(21L);
            return reader.mo5164c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((mo5162a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (mo5162a2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        reader.skip(4L);
        if ((((reader.mo5162a() << 16) & (-65536)) | (reader.mo5162a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo5162a3 = ((reader.mo5162a() << 16) & (-65536)) | (reader.mo5162a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if ((mo5162a3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i2 = mo5162a3 & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 == 88) {
            reader.skip(4L);
            return (reader.mo5164c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i2 != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        reader.skip(4L);
        return (reader.mo5164c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    /* renamed from: e */
    public final int m5161e(Reader reader, byte[] bArr, int i2) throws IOException {
        ByteOrder byteOrder;
        int mo5163b = reader.mo5163b(bArr, i2);
        if (mo5163b != i2) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + mo5163b);
            }
            return -1;
        }
        boolean z = bArr != null && i2 > f8526a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = f8526a;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        RandomAccessReader randomAccessReader = new RandomAccessReader(bArr, i2);
        short m5165a = randomAccessReader.m5165a(6);
        if (m5165a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (m5165a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                C0000a.m0A("Unknown endianness = ", m5165a, "DfltImageHeaderParser");
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.f8529a.order(byteOrder);
        int m5166b = randomAccessReader.m5166b(10) + 6;
        short m5165a2 = randomAccessReader.m5165a(m5166b);
        for (int i4 = 0; i4 < m5165a2; i4++) {
            int i5 = (i4 * 12) + m5166b + 2;
            short m5165a3 = randomAccessReader.m5165a(i5);
            if (m5165a3 == 274) {
                short m5165a4 = randomAccessReader.m5165a(i5 + 2);
                if (m5165a4 >= 1 && m5165a4 <= 12) {
                    int m5166b2 = randomAccessReader.m5166b(i5 + 4);
                    if (m5166b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder m26w = C0000a.m26w("Got tagIndex=", i4, " tagType=", m5165a3, " formatCode=");
                            m26w.append((int) m5165a4);
                            m26w.append(" componentCount=");
                            m26w.append(m5166b2);
                            Log.d("DfltImageHeaderParser", m26w.toString());
                        }
                        int i6 = m5166b2 + f8527b[m5165a4];
                        if (i6 <= 4) {
                            int i7 = i5 + 8;
                            if (i7 >= 0 && i7 <= randomAccessReader.f8529a.remaining()) {
                                if (i6 >= 0 && i6 + i7 <= randomAccessReader.f8529a.remaining()) {
                                    return randomAccessReader.m5165a(i7);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    C0000a.m0A("Illegal number of bytes for TI tag data tagType=", m5165a3, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i7 + " tagType=" + ((int) m5165a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            C0000a.m0A("Got byte count > 4, not orientation, continuing, formatCode=", m5165a4, "DfltImageHeaderParser");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    C0000a.m0A("Got invalid format code = ", m5165a4, "DfltImageHeaderParser");
                }
            }
        }
        return -1;
    }
}
