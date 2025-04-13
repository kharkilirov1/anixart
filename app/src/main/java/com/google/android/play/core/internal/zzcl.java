package com.google.android.play.core.internal;

import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzcl {
    /* renamed from: a */
    public static long m10893a(zzcm zzcmVar, InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new zzck(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new zzck(C0576a.m4111j(30, "Unexpected version=", read));
        }
        long j3 = 0;
        while (true) {
            long j4 = j2 - j3;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return j3;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        m10895c(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        m10895c(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m10894b(bArr, zzcmVar, outputStream, readUnsignedShort, read2, j4);
                        break;
                    case 250:
                        long readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readUnsignedShort();
                        m10894b(bArr, zzcmVar, outputStream, readUnsignedShort2, read2, j4);
                        break;
                    case 251:
                        long readUnsignedShort3 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readInt();
                        m10894b(bArr, zzcmVar, outputStream, readUnsignedShort3, read2, j4);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m10894b(bArr, zzcmVar, outputStream, readInt2, read2, j4);
                        break;
                    case 253:
                        long readInt3 = dataInputStream.readInt();
                        read2 = dataInputStream.readUnsignedShort();
                        m10894b(bArr, zzcmVar, outputStream, readInt3, read2, j4);
                        break;
                    case 254:
                        long readInt4 = dataInputStream.readInt();
                        read2 = dataInputStream.readInt();
                        m10894b(bArr, zzcmVar, outputStream, readInt4, read2, j4);
                        break;
                    case KotlinVersion.MAX_COMPONENT_VALUE /* 255 */:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        m10894b(bArr, zzcmVar, outputStream, readLong, read2, j4);
                        break;
                    default:
                        m10895c(bArr, dataInputStream, outputStream, read2, j4);
                        break;
                }
                j3 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    /* renamed from: b */
    public static void m10894b(byte[] bArr, zzcm zzcmVar, OutputStream outputStream, long j2, int i2, long j3) throws IOException {
        InputStream mo10750b;
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j2 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j4 = i3;
        if (j4 > j3) {
            throw new IOException("Output length overrun");
        }
        try {
            zzcn zzcnVar = new zzcn(zzcmVar, j2, j4);
            synchronized (zzcnVar) {
                mo10750b = zzcnVar.mo10750b(0L, zzcnVar.mo10749a());
            }
            while (i3 > 0) {
                try {
                    int min = Math.min(i3, 16384);
                    int i4 = 0;
                    while (i4 < min) {
                        int read = mo10750b.read(bArr, i4, min - i4);
                        if (read == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i4 += read;
                    }
                    outputStream.write(bArr, 0, min);
                    i3 -= min;
                } catch (Throwable th) {
                    try {
                        mo10750b.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            mo10750b.close();
        } catch (EOFException e2) {
            throw new IOException("patch underrun", e2);
        }
    }

    /* renamed from: c */
    public static void m10895c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) throws IOException {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i2 > j2) {
            throw new IOException("Output length overrun");
        }
        while (i2 > 0) {
            try {
                int min = Math.min(i2, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i2 -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
