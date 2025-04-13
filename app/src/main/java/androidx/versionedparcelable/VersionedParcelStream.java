package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

@RestrictTo
/* loaded from: classes.dex */
class VersionedParcelStream extends VersionedParcel {

    /* renamed from: m */
    public static final Charset f6489m = Charset.forName("UTF-16");

    /* renamed from: d */
    public final DataInputStream f6490d;

    /* renamed from: e */
    public final DataOutputStream f6491e;

    /* renamed from: f */
    public DataInputStream f6492f;

    /* renamed from: g */
    public DataOutputStream f6493g;

    /* renamed from: h */
    public FieldBuffer f6494h;

    /* renamed from: i */
    public boolean f6495i;

    /* renamed from: j */
    public int f6496j;

    /* renamed from: k */
    public int f6497k;

    /* renamed from: l */
    public int f6498l;

    public static class FieldBuffer {

        /* renamed from: a */
        public final ByteArrayOutputStream f6500a;

        /* renamed from: b */
        public final DataOutputStream f6501b;

        /* renamed from: c */
        public final int f6502c;

        /* renamed from: d */
        public final DataOutputStream f6503d;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f6500a = byteArrayOutputStream;
            this.f6501b = new DataOutputStream(byteArrayOutputStream);
            this.f6502c = i2;
            this.f6503d = dataOutputStream;
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f6496j = 0;
        this.f6497k = -1;
        this.f6498l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f6498l;
                if (i2 != -1 && versionedParcelStream.f6496j >= i2) {
                    throw new IOException();
                }
                int read = super.read();
                VersionedParcelStream.this.f6496j++;
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.f6498l;
                if (i2 != -1 && versionedParcelStream.f6496j >= i2) {
                    throw new IOException();
                }
                long skip = super.skip(j2);
                if (skip > 0) {
                    VersionedParcelStream.this.f6496j += (int) skip;
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i4 = versionedParcelStream.f6498l;
                if (i4 != -1 && versionedParcelStream.f6496j >= i4) {
                    throw new IOException();
                }
                int read = super.read(bArr, i2, i3);
                if (read > 0) {
                    VersionedParcelStream.this.f6496j += read;
                }
                return read;
            }
        }) : null;
        this.f6490d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f6491e = dataOutputStream;
        this.f6492f = dataInputStream;
        this.f6493g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo4311a() {
        FieldBuffer fieldBuffer = this.f6494h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f6500a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.f6494h;
                    fieldBuffer2.f6501b.flush();
                    int size = fieldBuffer2.f6500a.size();
                    fieldBuffer2.f6503d.writeInt((fieldBuffer2.f6502c << 16) | (size >= 65535 ? Settings.DEFAULT_INITIAL_WINDOW_SIZE : size));
                    if (size >= 65535) {
                        fieldBuffer2.f6503d.writeInt(size);
                    }
                    fieldBuffer2.f6500a.writeTo(fieldBuffer2.f6503d);
                }
                this.f6494h = null;
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    public VersionedParcel mo4312b() {
        return new VersionedParcelStream(this.f6492f, this.f6493g, this.f6478a, this.f6479b, this.f6480c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo4317g() {
        try {
            return this.f6492f.readBoolean();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: h */
    public byte[] mo4318h() {
        try {
            int readInt = this.f6492f.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f6492f.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public CharSequence mo4319i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: j */
    public boolean mo4320j(int i2) {
        while (true) {
            try {
                int i3 = this.f6497k;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                if (this.f6496j < this.f6498l) {
                    this.f6490d.skip(r2 - r1);
                }
                this.f6498l = -1;
                int readInt = this.f6490d.readInt();
                this.f6496j = 0;
                int i4 = readInt & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i4 == 65535) {
                    i4 = this.f6490d.readInt();
                }
                this.f6497k = (readInt >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                this.f6498l = i4;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    public int mo4321k() {
        try {
            return this.f6492f.readInt();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public <T extends Parcelable> T mo4323m() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public String mo4325o() {
        try {
            int readInt = this.f6492f.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f6492f.readFully(bArr);
            return new String(bArr, f6489m);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public void mo4327q(int i2) {
        mo4311a();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.f6491e);
        this.f6494h = fieldBuffer;
        this.f6493g = fieldBuffer.f6501b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: r */
    public void mo4328r(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f6495i = z2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public void mo4329s(boolean z) {
        try {
            this.f6493g.writeBoolean(z);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: t */
    public void mo4330t(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f6493g.writeInt(bArr.length);
                this.f6493g.write(bArr);
            } else {
                this.f6493g.writeInt(-1);
            }
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: u */
    public void mo4331u(CharSequence charSequence) {
        if (!this.f6495i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: v */
    public void mo4332v(int i2) {
        try {
            this.f6493g.writeInt(i2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo4333w(Parcelable parcelable) {
        if (!this.f6495i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: x */
    public void mo4334x(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f6489m);
                this.f6493g.writeInt(bytes.length);
                this.f6493g.write(bytes);
            } else {
                this.f6493g.writeInt(-1);
            }
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }
}
