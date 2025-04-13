package io.grpc.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import javax.annotation.concurrent.NotThreadSafe;
import p000a.C0000a;

@NotThreadSafe
/* loaded from: classes3.dex */
class GzipInflatingBuffer implements Closeable {

    /* renamed from: f */
    public int f58683f;

    /* renamed from: g */
    public int f58684g;

    /* renamed from: h */
    public Inflater f58685h;

    /* renamed from: k */
    public int f58688k;

    /* renamed from: l */
    public int f58689l;

    /* renamed from: m */
    public long f58690m;

    /* renamed from: b */
    public final CompositeReadableBuffer f58679b = new CompositeReadableBuffer();

    /* renamed from: c */
    public final CRC32 f58680c = new CRC32();

    /* renamed from: d */
    public final GzipMetadataReader f58681d = new GzipMetadataReader(null);

    /* renamed from: e */
    public final byte[] f58682e = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];

    /* renamed from: i */
    public State f58686i = State.HEADER;

    /* renamed from: j */
    public boolean f58687j = false;

    /* renamed from: n */
    public int f58691n = 0;

    /* renamed from: o */
    public int f58692o = 0;

    /* renamed from: p */
    public boolean f58693p = true;

    /* renamed from: io.grpc.internal.GzipInflatingBuffer$1 */
    public static /* synthetic */ class C63961 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58694a;

        static {
            int[] iArr = new int[State.values().length];
            f58694a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58694a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58694a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58694a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58694a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58694a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58694a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58694a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f58694a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f58694a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public class GzipMetadataReader {
        public GzipMetadataReader(C63961 c63961) {
        }

        /* renamed from: a */
        public static void m31102a(GzipMetadataReader gzipMetadataReader, int i2) {
            int i3;
            GzipInflatingBuffer gzipInflatingBuffer = GzipInflatingBuffer.this;
            int i4 = gzipInflatingBuffer.f58684g - gzipInflatingBuffer.f58683f;
            if (i4 > 0) {
                int min = Math.min(i4, i2);
                GzipInflatingBuffer gzipInflatingBuffer2 = GzipInflatingBuffer.this;
                gzipInflatingBuffer2.f58680c.update(gzipInflatingBuffer2.f58682e, gzipInflatingBuffer2.f58683f, min);
                GzipInflatingBuffer.this.f58683f += min;
                i3 = i2 - min;
            } else {
                i3 = i2;
            }
            if (i3 > 0) {
                byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];
                int i5 = 0;
                while (i5 < i3) {
                    int min2 = Math.min(i3 - i5, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
                    GzipInflatingBuffer.this.f58679b.m31069g(CompositeReadableBuffer.f58524h, min2, bArr, 0);
                    GzipInflatingBuffer.this.f58680c.update(bArr, 0, min2);
                    i5 += min2;
                }
            }
            GzipInflatingBuffer.this.f58691n += i2;
        }

        /* renamed from: b */
        public static boolean m31103b(GzipMetadataReader gzipMetadataReader) {
            do {
                GzipInflatingBuffer gzipInflatingBuffer = GzipInflatingBuffer.this;
                if ((gzipInflatingBuffer.f58684g - gzipInflatingBuffer.f58683f) + gzipInflatingBuffer.f58679b.f58529d <= 0) {
                    return false;
                }
            } while (gzipMetadataReader.m31105d() != 0);
            return true;
        }

        /* renamed from: c */
        public static int m31104c(GzipMetadataReader gzipMetadataReader) {
            GzipInflatingBuffer gzipInflatingBuffer = GzipInflatingBuffer.this;
            return (gzipInflatingBuffer.f58684g - gzipInflatingBuffer.f58683f) + gzipInflatingBuffer.f58679b.f58529d;
        }

        /* renamed from: d */
        public final int m31105d() {
            int readUnsignedByte;
            GzipInflatingBuffer gzipInflatingBuffer = GzipInflatingBuffer.this;
            int i2 = gzipInflatingBuffer.f58684g;
            int i3 = gzipInflatingBuffer.f58683f;
            if (i2 - i3 > 0) {
                readUnsignedByte = gzipInflatingBuffer.f58682e[i3] & 255;
                gzipInflatingBuffer.f58683f = i3 + 1;
            } else {
                readUnsignedByte = gzipInflatingBuffer.f58679b.readUnsignedByte();
            }
            GzipInflatingBuffer.this.f58680c.update(readUnsignedByte);
            GzipInflatingBuffer.this.f58691n++;
            return readUnsignedByte;
        }

        /* renamed from: e */
        public final int m31106e() {
            return m31105d() | (m31105d() << 8);
        }
    }

    public enum State {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    /* renamed from: a */
    public int m31100a(byte[] bArr, int i2, int i3) throws DataFormatException, ZipException {
        int i4;
        State state = State.TRAILER;
        State state2 = State.INFLATING;
        State state3 = State.INFLATER_NEEDS_INPUT;
        State state4 = State.HEADER_NAME;
        boolean z = true;
        Preconditions.m11192p(!this.f58687j, "GzipInflatingBuffer is closed");
        boolean z2 = true;
        int i5 = 0;
        while (z2 && (i4 = i3 - i5) > 0) {
            switch (this.f58686i) {
                case HEADER:
                    if (GzipMetadataReader.m31104c(this.f58681d) < 10) {
                        z2 = false;
                    } else {
                        if (this.f58681d.m31106e() != 35615) {
                            throw new ZipException("Not in GZIP format");
                        }
                        if (this.f58681d.m31105d() != 8) {
                            throw new ZipException("Unsupported compression method");
                        }
                        this.f58688k = this.f58681d.m31105d();
                        GzipMetadataReader.m31102a(this.f58681d, 6);
                        this.f58686i = State.HEADER_EXTRA_LEN;
                    }
                case HEADER_EXTRA_LEN:
                    if ((this.f58688k & 4) != 4) {
                        this.f58686i = state4;
                    } else if (GzipMetadataReader.m31104c(this.f58681d) < 2) {
                        z2 = false;
                    } else {
                        this.f58689l = this.f58681d.m31106e();
                        this.f58686i = State.HEADER_EXTRA;
                    }
                case HEADER_EXTRA:
                    int m31104c = GzipMetadataReader.m31104c(this.f58681d);
                    int i6 = this.f58689l;
                    if (m31104c < i6) {
                        z2 = false;
                    } else {
                        GzipMetadataReader.m31102a(this.f58681d, i6);
                        this.f58686i = state4;
                    }
                case HEADER_NAME:
                    State state5 = State.HEADER_COMMENT;
                    if ((this.f58688k & 8) != 8) {
                        this.f58686i = state5;
                    } else if (GzipMetadataReader.m31103b(this.f58681d)) {
                        this.f58686i = state5;
                    } else {
                        z2 = false;
                    }
                case HEADER_COMMENT:
                    State state6 = State.HEADER_CRC;
                    if ((this.f58688k & 16) != 16) {
                        this.f58686i = state6;
                    } else if (GzipMetadataReader.m31103b(this.f58681d)) {
                        this.f58686i = state6;
                    } else {
                        z2 = false;
                    }
                case HEADER_CRC:
                    State state7 = State.INITIALIZE_INFLATER;
                    if ((this.f58688k & 2) != 2) {
                        this.f58686i = state7;
                    } else if (GzipMetadataReader.m31104c(this.f58681d) < 2) {
                        z2 = false;
                    } else {
                        if ((65535 & ((int) this.f58680c.getValue())) != this.f58681d.m31106e()) {
                            throw new ZipException("Corrupt GZIP header");
                        }
                        this.f58686i = state7;
                    }
                case INITIALIZE_INFLATER:
                    Inflater inflater = this.f58685h;
                    if (inflater == null) {
                        this.f58685h = new Inflater(true);
                    } else {
                        inflater.reset();
                    }
                    this.f58680c.reset();
                    int i7 = this.f58684g;
                    int i8 = this.f58683f;
                    int i9 = i7 - i8;
                    if (i9 > 0) {
                        this.f58685h.setInput(this.f58682e, i8, i9);
                        this.f58686i = state2;
                    } else {
                        this.f58686i = state3;
                    }
                case INFLATING:
                    int i10 = i2 + i5;
                    Preconditions.m11192p(this.f58685h != null, "inflater is null");
                    try {
                        int totalIn = this.f58685h.getTotalIn();
                        int inflate = this.f58685h.inflate(bArr, i10, i4);
                        int totalIn2 = this.f58685h.getTotalIn() - totalIn;
                        this.f58691n += totalIn2;
                        this.f58692o += totalIn2;
                        this.f58683f += totalIn2;
                        this.f58680c.update(bArr, i10, inflate);
                        if (this.f58685h.finished()) {
                            this.f58690m = this.f58685h.getBytesWritten() & 4294967295L;
                            this.f58686i = state;
                        } else if (this.f58685h.needsInput()) {
                            this.f58686i = state3;
                        }
                        i5 += inflate;
                        z2 = this.f58686i == state ? m31101b() : true;
                    } catch (DataFormatException e2) {
                        StringBuilder m24u = C0000a.m24u("Inflater data format exception: ");
                        m24u.append(e2.getMessage());
                        throw new DataFormatException(m24u.toString());
                    }
                case INFLATER_NEEDS_INPUT:
                    Preconditions.m11192p(this.f58685h != null, "inflater is null");
                    Preconditions.m11192p(this.f58683f == this.f58684g, "inflaterInput has unconsumed bytes");
                    int min = Math.min(this.f58679b.f58529d, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
                    if (min == 0) {
                        z2 = false;
                    } else {
                        this.f58683f = 0;
                        this.f58684g = min;
                        this.f58679b.m31069g(CompositeReadableBuffer.f58524h, min, this.f58682e, 0);
                        this.f58685h.setInput(this.f58682e, this.f58683f, min);
                        this.f58686i = state2;
                    }
                case TRAILER:
                    z2 = m31101b();
                default:
                    StringBuilder m24u2 = C0000a.m24u("Invalid state: ");
                    m24u2.append(this.f58686i);
                    throw new AssertionError(m24u2.toString());
            }
        }
        if (z2 && (this.f58686i != State.HEADER || GzipMetadataReader.m31104c(this.f58681d) >= 10)) {
            z = false;
        }
        this.f58693p = z;
        return i5;
    }

    /* renamed from: b */
    public final boolean m31101b() throws ZipException {
        if (this.f58685h != null && GzipMetadataReader.m31104c(this.f58681d) <= 18) {
            this.f58685h.end();
            this.f58685h = null;
        }
        if (GzipMetadataReader.m31104c(this.f58681d) < 8) {
            return false;
        }
        long value = this.f58680c.getValue();
        GzipMetadataReader gzipMetadataReader = this.f58681d;
        if (value == (gzipMetadataReader.m31106e() | (gzipMetadataReader.m31106e() << 16))) {
            long j2 = this.f58690m;
            GzipMetadataReader gzipMetadataReader2 = this.f58681d;
            if (j2 == ((gzipMetadataReader2.m31106e() << 16) | gzipMetadataReader2.m31106e())) {
                this.f58680c.reset();
                this.f58686i = State.HEADER;
                return true;
            }
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f58687j) {
            return;
        }
        this.f58687j = true;
        this.f58679b.close();
        Inflater inflater = this.f58685h;
        if (inflater != null) {
            inflater.end();
            this.f58685h = null;
        }
    }
}
