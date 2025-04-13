package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.yandex.mobile.ads.impl.C6096yy;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d00 implements Closeable {

    /* renamed from: g */
    private static final Logger f49502g = Logger.getLogger(C5893uz.class.getName());

    /* renamed from: a */
    @NotNull
    private final BufferedSink f49503a;

    /* renamed from: b */
    private final boolean f49504b;

    /* renamed from: c */
    @NotNull
    private final Buffer f49505c;

    /* renamed from: d */
    private int f49506d;

    /* renamed from: e */
    private boolean f49507e;

    /* renamed from: f */
    @NotNull
    private final C6096yy.b f49508f;

    public d00(@NotNull BufferedSink sink, boolean z) {
        Intrinsics.m32179h(sink, "sink");
        this.f49503a = sink;
        this.f49504b = z;
        Buffer buffer = new Buffer();
        this.f49505c = buffer;
        this.f49506d = 16384;
        this.f49508f = new C6096yy.b(buffer);
    }

    /* renamed from: a */
    public final synchronized void m23735a() throws IOException {
        if (this.f49507e) {
            throw new IOException("closed");
        }
        if (this.f49504b) {
            Logger logger = f49502g;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder m26356a = l60.m26356a(">> CONNECTION ");
                m26356a.append(C5893uz.f55705b.mo34577e());
                logger.fine(t91.m28503a(m26356a.toString(), new Object[0]));
            }
            this.f49503a.mo34528T0(C5893uz.f55705b);
            this.f49503a.flush();
        }
    }

    /* renamed from: b */
    public final int m23744b() {
        return this.f49506d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f49507e = true;
        this.f49503a.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f49507e) {
            throw new IOException("closed");
        }
        this.f49503a.flush();
    }

    /* renamed from: b */
    public final synchronized void m23745b(@NotNull t01 settings) throws IOException {
        Intrinsics.m32179h(settings, "settings");
        if (this.f49507e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m23736a(0, settings.m28436d() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.m28435c(i2)) {
                this.f49503a.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                this.f49503a.writeInt(settings.m28429a(i2));
            }
            i2++;
        }
        this.f49503a.flush();
    }

    /* renamed from: a */
    public final synchronized void m23742a(@NotNull t01 peerSettings) throws IOException {
        Intrinsics.m32179h(peerSettings, "peerSettings");
        if (!this.f49507e) {
            this.f49506d = peerSettings.m28433b(this.f49506d);
            if (peerSettings.m28428a() != -1) {
                this.f49508f.m30000b(peerSettings.m28428a());
            }
            m23736a(0, 0, 4, 1);
            this.f49503a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m23739a(int i2, @NotNull EnumC5708rr errorCode) throws IOException {
        Intrinsics.m32179h(errorCode, "errorCode");
        if (!this.f49507e) {
            if (errorCode.m27978a() != -1) {
                m23736a(i2, 4, 3, 0);
                this.f49503a.writeInt(errorCode.m27978a());
                this.f49503a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m23743a(boolean z, int i2, @Nullable Buffer buffer, int i3) throws IOException {
        if (!this.f49507e) {
            m23736a(i2, i3, 0, z ? 1 : 0);
            if (i3 > 0) {
                BufferedSink bufferedSink = this.f49503a;
                Intrinsics.m32176e(buffer);
                bufferedSink.write(buffer, i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m23737a(int i2, int i3, boolean z) throws IOException {
        if (!this.f49507e) {
            m23736a(0, 8, 6, z ? 1 : 0);
            this.f49503a.writeInt(i2);
            this.f49503a.writeInt(i3);
            this.f49503a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m23740a(int i2, @NotNull EnumC5708rr errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.m32179h(errorCode, "errorCode");
        Intrinsics.m32179h(debugData, "debugData");
        if (!this.f49507e) {
            if (errorCode.m27978a() != -1) {
                m23736a(0, debugData.length + 8, 7, 0);
                this.f49503a.writeInt(i2);
                this.f49503a.writeInt(errorCode.m27978a());
                if (!(debugData.length == 0)) {
                    this.f49503a.write(debugData);
                }
                this.f49503a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m23738a(int i2, long j2) throws IOException {
        if (this.f49507e) {
            throw new IOException("closed");
        }
        if (j2 != 0 && j2 <= ParserMinimalBase.MAX_INT_L) {
            m23736a(i2, 4, 8, 0);
            this.f49503a.writeInt((int) j2);
            this.f49503a.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
    }

    /* renamed from: a */
    public final void m23736a(int i2, int i3, int i4, int i5) throws IOException {
        Logger logger = f49502g;
        if (logger.isLoggable(Level.FINE)) {
            Objects.requireNonNull(C5893uz.f55704a);
            logger.fine(C5893uz.m29149a(false, i2, i3, i4, i5));
        }
        if (!(i3 <= this.f49506d)) {
            StringBuilder m26356a = l60.m26356a("FRAME_SIZE_ERROR length > ");
            m26356a.append(this.f49506d);
            m26356a.append(": ");
            m26356a.append(i3);
            throw new IllegalArgumentException(m26356a.toString().toString());
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            t91.m28512a(this.f49503a, i3);
            this.f49503a.writeByte(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f49503a.writeByte(i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f49503a.writeInt(i2 & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(k60.m26036a("reserved bit set: ", i2).toString());
    }

    /* renamed from: a */
    public final synchronized void m23741a(int i2, @NotNull ArrayList headerBlock, boolean z) throws IOException {
        Intrinsics.m32179h(headerBlock, "headerBlock");
        if (!this.f49507e) {
            this.f49508f.m29998a(headerBlock);
            long j2 = this.f49505c.f68742c;
            long min = Math.min(this.f49506d, j2);
            int i3 = j2 == min ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            m23736a(i2, (int) min, 1, i3);
            this.f49503a.write(this.f49505c, min);
            if (j2 > min) {
                long j3 = j2 - min;
                while (j3 > 0) {
                    long min2 = Math.min(this.f49506d, j3);
                    j3 -= min2;
                    m23736a(i2, (int) min2, 9, j3 == 0 ? 4 : 0);
                    this.f49503a.write(this.f49505c, min2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }
}
